package com.gildedrose.items;

import com.gildedrose.Item;

public class BackStagePasses extends Item {
    public BackStagePasses(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    public void updateQualityAfterExpiration() {
        quality = 0;
    }

    @Override
    public void updateQuality() {
        increaseQuality();

        if (sell_in < 10) {
            increaseQuality();
        }

        if (sell_in < 5) {
            increaseQuality();
        }
    }

}
