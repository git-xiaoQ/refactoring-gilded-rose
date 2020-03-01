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
                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;
                    }
                    items[i].sell_in = items[i].sell_in - 1;
                    if (items[i].sell_in < 0) {
                        if (items[i].quality < 50) {
                            items[i].quality = items[i].quality + 1;
                        }
                    }

                case "Backstage passes to a TAFKAL80ETC concert"  :
                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;

                        if (items[i].sell_in < 11) {
                            items[i].quality = items[i].quality + 1;
                        }

                        if (items[i].sell_in < 6) {
                            items[i].quality = items[i].quality + 1;
                        }

                    }
                    items[i].sell_in = items[i].sell_in - 1;
                    if (items[i].sell_in < 0) {
                        items[i].quality = items[i].quality - items[i].quality;
                    }

                case "Sulfuras, Hand of Ragnaros":
                    continue;

                default:
                    if (items[i].quality > 0) {
                        items[i].quality = items[i].quality - 1;
                    }
                    items[i].sell_in = items[i].sell_in - 1;
                    if (items[i].sell_in < 0) {
                        if (items[i].quality > 0) {
                            items[i].quality = items[i].quality - 1;
                        }
                    }
            }
        }
    }
}
