package com.parkjh.covidproject.controller;

import com.parkjh.covidproject.dto.CovidDto;
import com.parkjh.covidproject.repository.CovidRepository;
import com.parkjh.covidproject.service.CovidService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

    CovidService covidService;

    @Qualifier("covidRepository")
    CovidRepository covidRepository;

    @GetMapping("/api/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String Dashboard() {
        return "/index";
    }

    @GetMapping("/api/getStockCodeList")
    public void getStockCodeList() {
        Exception ex = null;
        try {
            // StockCodeDto play = stockCodeService.getStockCodeList("054450");
            List<CovidDto> stockCodeList = covidService.findAll();
            System.out.println(stockCodeList);
        } catch (Exception exception) {
            ex = exception;
        }
    }
}
