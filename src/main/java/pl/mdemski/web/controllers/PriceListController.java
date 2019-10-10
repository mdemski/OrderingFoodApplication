package pl.mdemski.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.mdemski.services.WindowService;

@Controller
@RequestMapping("/cennik")
public class PriceListController {

    private WindowService windowService;

    public PriceListController(WindowService windowService) {
        this.windowService = windowService;
    }

    @GetMapping
    public String preparePriceListPage(){
        return "priceList";
    }

    @GetMapping("/okna-dachowe")
    public String prepareWindowsPriceListPage(Model model){
//        windowService.addWindowsToPriceList();
        model.addAttribute("priceListWindows", windowService.getAllPriceListWindows());
        return "windowsPriceList";
    }
}
