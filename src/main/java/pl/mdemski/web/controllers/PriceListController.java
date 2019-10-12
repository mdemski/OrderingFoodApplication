package pl.mdemski.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.mdemski.dto.WindowDTO;
import pl.mdemski.services.WindowService;

import java.util.ArrayList;
import java.util.List;

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
        List<WindowDTO> windowDTOS = windowService.getAllPriceListWindows();
        List<byte[]> pictures = new ArrayList<>();
        for (int i = 0; i < windowDTOS.size(); i++) {
            pictures.add(windowDTOS.get(i).getPicture());
        }
        model.addAttribute("pictures", pictures);
        model.addAttribute("priceListWindows", windowDTOS);
        return "windowsPriceList";
    }
}
