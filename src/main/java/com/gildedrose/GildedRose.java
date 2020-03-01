package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void update_quality() {
        for (int i = 0; i < items.length; i++) {
            switch (items[i].name){
                case "Aged Brie":
                    items[i].sell_in = update_item_sell_in(items[i].sell_in);

                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;
                    }

                    if (items[i].sell_in < 0) {
                        if (items[i].quality < 50) {
                            items[i].quality = items[i].quality + 2;
                        }else {
                            items[i].quality = items[i].quality + 1;

                        }
                    }

                case "Backstage passes to a TAFKAL80ETC concert"  :
                    items[i].sell_in = update_item_sell_in(items[i].sell_in);

                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;

                        if (items[i].sell_in < 11) {
                            items[i].quality = items[i].quality + 1;
                        }

                        if (items[i].sell_in < 6) {
                            items[i].quality = items[i].quality + 1;
                        }
                    }

                    if (items[i].sell_in < 0) {
                        items[i].quality = items[i].quality - items[i].quality;
                    }

                case "Sulfuras, Hand of Ragnaros":
                    continue;

                default:
                    items[i].sell_in = update_item_sell_in(items[i].sell_in);

                    if (items[i].quality > 0) {
                        items[i].quality = items[i].quality - 1;
                    }

                    if (items[i].sell_in < 0) {
                        if (items[i].quality > 0) {
                            items[i].quality = items[i].quality - 1;
                        }
                    }
            }
        }
    }

    int update_item_sell_in(int sell_in){
        sell_in -= 1;
        return sell_in;
    }
}
