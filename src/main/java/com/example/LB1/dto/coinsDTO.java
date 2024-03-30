package com.example.LB1.dto;

import java.util.ArrayList;
import java.util.List;
import com.example.LB1.dto.trendsDTO;

public class coinsDTO {
    private String coin_name;
    private String coin_code;
    private Float price;
    private Float h1;
    private Float h24;
    private Float d7;
    private Float market_cap;
    private Float volume;
    private float[] last_price;
    public coinsDTO(String coin_name, String coin_code, Float price, Float h1, Float h24, Float d7, Float market_cap, Float volume, float[] last_price) {
        this.coin_name = coin_name;
        this.coin_code = coin_code;
        this.price = price;
        this.h1 = h1;
        this.h24 = h24;
        this.d7 = d7;
        this.market_cap = market_cap;
        this.volume = volume;
        this.last_price = last_price;
    }
    public float[] getLast_price() {
        return last_price;
    }
    public void setLast_price(float[] last_price) {
        this.last_price = last_price;
    }
    public String getCoin_name() {
        return coin_name;
    }

    public void setCoin_name(String coin_name) {
        this.coin_name = coin_name;
    }

    public String getCoin_code() {
        return coin_code;
    }

    public void setCoin_code(String coin_code) {
        this.coin_code = coin_code;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getH1() {
        return h1;
    }

    public void setH1(Float h1) {
        this.h1 = h1;
    }

    public Float getH24() {
        return h24;
    }

    public void setH24(Float h24) {
        this.h24 = h24;
    }

    public Float getD7() {
        return d7;
    }

    public void setD7(Float d7) {
        this.d7 = d7;
    }

    public Float getMarket_cap() {
        return market_cap;
    }

    public void setMarket_cap(Float market_cap) {
        this.market_cap = market_cap;
    }

    public Float getVolume() {
        return volume;
    }

    public void setVolume(Float volume) {
        this.volume = volume;
    }

}
