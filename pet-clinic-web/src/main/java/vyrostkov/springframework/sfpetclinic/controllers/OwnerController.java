package vyrostkov.springframework.sfpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by @m.vyrostkov on 08.08.2022 18:05
 */
@RequestMapping("owners")
@Controller
public class OwnerController {

    @RequestMapping({"","/", "/index", "/index.html"})
    public String ListOwner(){
        return "owners/index";
    }
}
