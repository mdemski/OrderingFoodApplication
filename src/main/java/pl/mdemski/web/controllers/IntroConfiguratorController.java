package pl.mdemski.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/konfigurator")
public class IntroConfiguratorController {

    @GetMapping
    public String prepareConfiguratorPage() {
        return "introConfig";
    }

}
