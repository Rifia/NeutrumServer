package com.jaspiersin.neutrum.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/neutrum")
public class EventController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String getNeutrum(ModelMap model){
        return "Neutrum";
    }
}
