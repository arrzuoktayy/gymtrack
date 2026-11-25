package com.example.gymtrack.controller;

import com.example.gymtrack.model.Antrenman;
import com.example.gymtrack.service.AntrenmanService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AntrenmanController {

    private final AntrenmanService service;

    public AntrenmanController(AntrenmanService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String anaSayfa(Model model) {
        model.addAttribute("antrenmanlar", service.listele());
        model.addAttribute("antrenman", new Antrenman());
        return "index";
    }

    @PostMapping("/kaydet")
    public String kaydet(@ModelAttribute Antrenman antrenman) {
        service.kaydet(antrenman);
        return "redirect:/";
    }

    @PostMapping("/sil/{id}")
    public String sil(@PathVariable("id") Long id) {
        service.sil(id);
        return "redirect:/";
    }
}