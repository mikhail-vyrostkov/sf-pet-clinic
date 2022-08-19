package vyrostkov.springframework.sfpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import vyrostkov.springframework.sfpetclinic.services.OwnerService;

/**
 * Created by @m.vyrostkov on 08.08.2022 18:05
 */
@RequestMapping("owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }


    @RequestMapping({"", "/", "/index", "/index.html"})
    public String ListOwner(Model model) {
        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }
}
