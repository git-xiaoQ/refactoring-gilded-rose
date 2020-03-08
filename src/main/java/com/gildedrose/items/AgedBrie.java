package com.gildedrose.items;

import com.gildedrose.Item;

public class AgedBrie extends Item {
    public AgedBrie(int selIn, int quality) {
        super("Aged Brie", selIn, quality);
    }

    @Override
    public boolean isAgedBrie() {
        return true;
    }

    @Override
    public void updateQualityAfterExpiration() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }

    @Override
    public void updateQuality() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }

}
