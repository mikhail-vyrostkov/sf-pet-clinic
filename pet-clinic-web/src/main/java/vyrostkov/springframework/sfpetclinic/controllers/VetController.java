package vyrostkov.springframework.sfpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import vyrostkov.springframework.sfpetclinic.services.VetService;

/**
 * Created by @m.vyrostkov on 08.08.2022 17:40
 */
@Controller
public class VetController {

    public final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
    public String listVets(Model model) {
        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }
}
