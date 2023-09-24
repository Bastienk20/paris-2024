package bts.sio.paris2024.controllers;

import bts.sio.paris2024.models.Athlete;
import bts.sio.paris2024.services.AthleteService;
import bts.sio.paris2024.services.PaysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AthleteController {


    @Autowired
    private AthleteService athleteservice;

    @GetMapping("/")
    public String home(Model model) {
        Iterable<Athlete> listAthletes = athleteservice.getAthletes();
        model.addAttribute("athletes", listAthletes);
        return "/home";
    }
}
