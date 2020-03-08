package com.gildedrose;

import com.gildedrose.items.BackStagePasses;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {
    @Test
    public void shouldDoubleIncreaseBackstagePassesQualityQWhenGettingCloseToExpiration() {
        Item item = new BackStagePasses(11, 20);
        item.passOneDay();
        assertEquals(item.quality,21);
        item.passOneDay();
        assertEquals(item.quality,23);
    }

}
