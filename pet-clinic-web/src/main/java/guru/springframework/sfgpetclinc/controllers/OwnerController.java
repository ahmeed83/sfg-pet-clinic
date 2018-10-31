package guru.springframework.sfgpetclinc.controllers;

import guru.springframework.sfgpetclinc.service.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(final OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/", "/index", "/index.html"})
    public String listOwner(Model model){
        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }
}
