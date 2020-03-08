package com.gildedrose;

public class Item {

    public String name;

    public int sell_in;

    public int quality;

    public Item(String name, int sell_in, int quality) {
        this.name = name;
        this.sell_in = sell_in;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sell_in + ", " + this.quality;
    }

    public void passOneDay() {
        updateSellIn();
        updateQuality();
        if (isExpired()) {
            updateQualityAfterExpiration();
        }
    }

    public void updateQuality() {
        decreaseQuality();
    }

    public void updateQualityAfterExpiration() {
        decreaseQuality();
    }

    protected void decreaseQuality() {
        if (quality > 0) {
            quality = quality - 1;
        }
    }

    protected void increaseQuality() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }

    private boolean isExpired() {
        return sell_in < 0;
    }

    public void updateSellIn() {
        sell_in = sell_in - 1;
    }


}
