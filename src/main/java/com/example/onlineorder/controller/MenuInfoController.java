package com.example.onlineorder.controller;


import com.example.onlineorder.entity.MenuItem;
import com.example.onlineorder.entity.Restaurant;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import com.example.onlineorder.service.MenuInfoService;
import org.springframework.beans.factory.annotation.Autowired;




import java.util.List;

@Controller
public class MenuInfoController {
//    @RequestMapping(value = "/restaurant/{restaurantId}/menu", method = RequestMethod.GET)
//    @ResponseBody
//    public List<MenuItem> getMenus(@PathVariable("restaurantId") int restaurantId) {
//        return new ArrayList<>();
//    }
//
//    @RequestMapping(value = "/restaurants", method = RequestMethod.GET)
//    @ResponseBody
//    public List<Restaurant> getRestaurants() {
//        return new ArrayList<>();
//    }
@Autowired
private MenuInfoService menuInfoService;

    @RequestMapping(value = "/restaurants", method = RequestMethod.GET)
    @ResponseBody
    public List<Restaurant> getRestaurants() {
        return menuInfoService.getRestaurants();
    }

    @RequestMapping(value = "/restaurant/{restaurantId}/menu", method = RequestMethod.GET)
    @ResponseBody
    public List<MenuItem> getMenus(@PathVariable(value = "restaurantId") int restaurantId) {
        return menuInfoService.getAllMenuItem(restaurantId);
    }

}




