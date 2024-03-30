package com.example.LB1.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import com.example.LB1.dto.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    List<coinsDTO> coins = new ArrayList<>();
    List<trendsDTO> trends = new ArrayList<>();
    List<exchangesDTO> exchanges = new ArrayList<>();
    portfolioDTO portfolio = new portfolioDTO();
    public MainController() {
        coins.add(new coinsDTO("Bitcoin", "BTC", 50000f, -25f, 23f, 56f, 230f, 54f, new float[]{54f, 43f}));
        trends.add(new trendsDTO("Bitcoin", "BTC", 23f));
        exchanges.add(new exchangesDTO("Binance", 9.0f, 354578658725f, 67, 45, 324f));
        portfolio.addCoin("Bitcoin", "BTC", 50000f, -25f, 23f, 56f, 230f, 439f, new float[]{54f, 43f});
        dealDTO deal = new dealDTO("2024", "sell", 345f, 3f,"Bitcoin","BTC");
        portfolio.addDeal(deal);
    }


    @GetMapping("/coins")
    public List<coinsDTO> getCoins() {
        return coins;
    }
    @GetMapping("/trends")
    public List<trendsDTO> getTrends() {
        return trends;
    }
    @GetMapping("/exchanges")
    public List<exchangesDTO> getExchanges() {
        return exchanges;
    }
    @GetMapping("/portfolio")
    public portfolioDTO getPortfolio() {
        return portfolio;
    }
    @PostMapping("/add-deal")
    public dealDTO setDeal(@RequestBody dealDTO dealDTO) {
        portfolio.addDeal(dealDTO);
        return portfolio.deals.getLast();
    }

}
