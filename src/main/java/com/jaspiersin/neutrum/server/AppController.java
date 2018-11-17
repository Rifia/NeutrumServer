package com.jaspiersin.neutrum.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping(value = "/")
public class AppController {

    @Autowired
    IncidentRepository incidentRepository;

    @RequestMapping(value = "/page") //возврат страницы
    public ModelAndView index () {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello");
        return modelAndView;
    }
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public void Create(@RequestBody Incident incident){
        incidentRepository.save(incident);
    }
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Incident> showAll(){
        return incidentRepository.findAll();
    }


}
