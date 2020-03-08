package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateProduct() {
        for (Item item : items) {
            item.passOneDay();
        }
    }

}
