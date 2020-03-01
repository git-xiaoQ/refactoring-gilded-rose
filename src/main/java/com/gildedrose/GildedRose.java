package com.gildedrose;

import java.util.ArrayList;

class GildedRose {
    ArrayList<Item> items;

    public GildedRose(ArrayList<Item> items) {
        this.items = items;
    }

    public void update_quality() {
        for (Item item:items) {
            switch (item.name) {
                case "Aged Brie":
                    item.sell_in = update_item_sell_in(item.sell_in);
                    item.quality = update_item_quality_case_aged_brie_by_quality_and_sell_in(item.quality, item.sell_in);

                case "Backstage passes to a TAFKAL80ETC concert":
                    item.sell_in = update_item_sell_in(item.sell_in);
                    item.quality = update_item_quality_case_bptatc_by_quality_and_sell_in(item.quality, item.sell_in);

                case "Sulfuras, Hand of Ragnaros":
                    continue;

                default:
                    item.sell_in = update_item_sell_in(item.sell_in);
                    item.quality = update_item_quality_case_default_by_quality_and_sell_in(item.quality, item.sell_in);
            }
        }
    }

    int update_item_sell_in(int sell_in) {
        sell_in -= 1;
        return sell_in;
    }

    int update_item_quality_case_aged_brie_by_quality_and_sell_in(int quality, int sell_in) {
        if (quality < 50) {
            quality += 1;
        }
        if (quality < 50 && sell_in < 0) {
            quality += 1;
        }
        return quality;
    }

    //bptatc means "Backstage passes to a TAFKAL80ETC concert"
    int update_item_quality_case_bptatc_by_quality_and_sell_in(int quality, int sell_in) {
        if (quality < 50) {
            quality = quality + 1;
        }
        if (quality < 50 && sell_in < 11) {
            quality = quality + 1;
        }

        if (quality < 50 && sell_in < 6) {
            quality = quality + 1;
        }

        if (sell_in < 0) {
            quality = quality - quality;
        }
        return quality;
    }

    int update_item_quality_case_default_by_quality_and_sell_in(int quality, int sell_in) {
        if (quality > 0) {
            quality = quality - 1;
        }

        if (quality > 0 && sell_in < 0) {
            quality = quality - 1;
        }
        return quality;
    }
}
