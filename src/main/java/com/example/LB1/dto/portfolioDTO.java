package com.example.LB1.dto;

import java.util.ArrayList;
import java.util.List;

public class portfolioDTO {
    private List<coinsDTO> coins = new ArrayList<>();
    public List<dealDTO> deals = new ArrayList<>();
    private List<Float> profile_volume_usd = new ArrayList<>();
    private List<Float> profile_volume_btc = new ArrayList<>();
    private Float current_volume_usd;
    private Float current_volume_btc;
    public void addCoin(String coin_name, String coin_code, Float price, Float h1, Float h24, Float d7, Float market_cap, Float volume, float[] last_price)
    {
        this.coins.add(new coinsDTO(coin_name, coin_code, price, h1, h24, d7, market_cap, volume, last_price));
    }
    public void addDeal(dealDTO newDeal) {
        this.deals.add(newDeal);
    }
    public portfolioDTO() {
        this.current_volume_usd = 0f;
        this.current_volume_btc = 0f;
        this.profile_volume_usd.add(current_volume_usd);
        this.profile_volume_btc.add(current_volume_btc);
    }




    public List<coinsDTO> getCoins() {
        return coins;
    }

    public void setCoins(List<coinsDTO> coins) {
        this.coins = coins;
    }

    public List<dealDTO> getDeals() {
        return deals;
    }

    public void setDeals(List<dealDTO> deals) {
        this.deals = deals;
    }

    public List<Float> getProfile_volume_usd() {
        return profile_volume_usd;
    }

    public void setProfile_volume_usd(List<Float> profile_volume_usd) {
        this.profile_volume_usd = profile_volume_usd;
    }

    public List<Float> getProfile_volume_btc() {
        return profile_volume_btc;
    }

    public void setProfile_volume_btc(List<Float> profile_volume_btc) {
        this.profile_volume_btc = profile_volume_btc;
    }

    public Float getCurrent_volume_usd() {
        return current_volume_usd;
    }

    public void setCurrent_volume_usd(Float current_volume_usd) {
        this.current_volume_usd = current_volume_usd;
    }

    public Float getCurrent_volume_btc() {
        return current_volume_btc;
    }

    public void setCurrent_volume_btc(Float current_volume_btc) {
        this.current_volume_btc = current_volume_btc;
    }
}
