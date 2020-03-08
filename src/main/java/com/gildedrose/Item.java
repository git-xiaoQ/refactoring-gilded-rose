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

    public boolean isBackstagePasses(){
        return false;
    }

    public boolean isSulfuras() {
        return false;
    }

    public boolean isAgedBrie() {
        return false;
    }

    public void passOneDay() {
        updateSellIn();
        updateQuality();
        if (isExpired()) {
            updateQualityAfterExpiration();
        }
    }

    public void updateQuality() {
        if (quality >0) {
            quality = quality - 1;
        }
    }

    public void updateQualityAfterExpiration() {
        if (quality > 0) {
            quality = quality - 1;;
        }
    }

    private boolean isExpired() {
        return sell_in < 0;
    }

    public void updateSellIn() {
        sell_in = sell_in - 1;
    }
}
