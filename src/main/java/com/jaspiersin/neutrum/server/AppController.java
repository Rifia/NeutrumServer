package com.jaspiersin.neutrum.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/incidents")
public class AppController {

    @Autowired
    IncidentRepository incidentRepository;

    @RequestMapping(value = "/page") //возврат страницы
    public ModelAndView index () {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("startpage");
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

    @RequestMapping(value = "/getIncident/{id}", method = RequestMethod.GET)
    public Optional getById (@PathVariable Long id) { //maybe this return type is a big mistake, but it works
        return incidentRepository.findById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteById (@PathVariable Long id) {
        incidentRepository.deleteById(id);
    }

}
