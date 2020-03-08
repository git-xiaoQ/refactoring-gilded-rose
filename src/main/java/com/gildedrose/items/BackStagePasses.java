package com.gildedrose.items;

import com.gildedrose.Item;

public class BackStagePasses extends Item {
    public BackStagePasses(int sellIn,int quality) {
        super("Backstage passes to a TAFKAL80ETC concert",sellIn,quality);
    }

    @Override
    public boolean isBackstagePasses(){
        return true;
    }

    @Override
    public void updateQualityAfterExpiration() {
        quality = 0;
    }

    @Override
    public void updateQuality() {

        if (quality < 50) {
            quality = quality + 1;

            if (sell_in < 10) {
                if (quality < 50) {
                    quality = quality + 1;
                }
            }

            if (sell_in < 5) {
                if (quality < 50) {
                    quality = quality + 1;
                }
            }
        }
    }

}
