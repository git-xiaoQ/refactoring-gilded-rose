package com.gildedrose;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class GildedRoseTest {

    @Test
    public void should_return_an_app_with_a_both_quality_and_sellin_decreased_one_item_when_given_an_item() {
//        Item[] items = new Item[] { new Item("foo", 1, 5) };
        ArrayList<Item> items = new ArrayList<>( Arrays.asList(new Item("foo", 1, 5)));
        GildedRose app = new GildedRose(items);
        app.update_quality();
        assertEquals("foo", app.items.get(0).name);
        assertThat(app.items.get(0).quality, is(4));
        assertThat(app.items.get(0).sell_in, is(0));
    }

}
