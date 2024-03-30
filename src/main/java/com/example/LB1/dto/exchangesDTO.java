package com.example.LB1.dto;

import java.util.ArrayList;
import java.util.List;

public class exchangesDTO {
    private String name;
    private Float score;
    private Float volume24h;
    private Integer markets;
    private Integer coins;
    private List<Float> last_volume = new ArrayList<>();
    public exchangesDTO(String name, Float score, Float volume24h, Integer markets, Integer coins, Float last_volume) {
        this.name = name;
        this.score = score;
        this.volume24h = volume24h;
        this.markets = markets;
        this.coins = coins;
        this.last_volume.add(last_volume);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public Float getVolume24h() {
        return volume24h;
    }

    public void setVolume24h(Float volume24h) {
        this.volume24h = volume24h;
    }

    public Integer getMarkets() {
        return markets;
    }

    public void setMarkets(Integer markets) {
        this.markets = markets;
    }

    public Integer getCoins() {
        return coins;
    }

    public void setCoins(Integer coins) {
        this.coins = coins;
    }

    public List<Float> getLast_volume() {
        return last_volume;
    }

    public void setLast_volume(List<Float> last_volume) {
        this.last_volume = last_volume;
    }
}
