package com.gildedrose;

import com.gildedrose.items.AgedBrie;
import com.gildedrose.items.BackStagePasses;
import com.gildedrose.items.Sulfuras;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TextTestFixture {
    public static void main(String[] args) {

        String baseLine = getBaseLine();
        System.out.println(baseLine);
    }

    public static String getBaseLine() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(out);
        printStream.println("OMGHAI!");

        Item[] items = new Item[] {
                new Item("+5 Dexterity Vest", 10, 20), //
                new AgedBrie(2, 0), //
                new Item("Elixir of the Mongoose", 5, 7), //
                new Sulfuras(0, 80), //
                new Sulfuras(-1, 80),
                new BackStagePasses(15, 20),
                new BackStagePasses(10,49),
                new BackStagePasses(5, 49),
                new BackStagePasses(1, 20),
                // this conjured item does not work properly yet
                new Item("Conjured Mana Cake", 3, 6) };

        GildedRose app = new GildedRose(items);

        int days = 3;

        for (int i = 0; i < days; i++) {
            printStream.println("-------- day " + i + " --------");
            printStream.println("name, sellIn, quality");
            for (Item item : items) {
                printStream.println(item);
            }
            printStream.println();
            app.updateProduct();
        }
        return out.toString();
    }

}
