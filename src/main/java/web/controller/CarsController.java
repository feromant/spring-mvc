package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarsService;

@Controller
public class CarsController {
    private final CarsService carsService;

    public CarsController(CarsService carsService) {
        this.carsService = carsService;
    }

    @GetMapping(value = "/cars")
    public String showCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        model.addAttribute("count", count);
        model.addAttribute("cars", carsService.listCars(count));
        return "cars";
    }
}
