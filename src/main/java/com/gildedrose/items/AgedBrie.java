package com.gildedrose.items;

import com.gildedrose.Item;

public class AgedBrie extends Item {
    public AgedBrie(int selIn, int quality) {
        super("Aged Brie", selIn, quality);
    }

    @Override
    public void updateQualityAfterExpiration() {
        increaseQuality();
    }

    @Override
    public void updateQuality() {
        increaseQuality();
    }

}
