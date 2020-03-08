package com.gildedrose;

import com.google.common.io.Files;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static com.google.common.base.Charsets.UTF_8;
import static org.junit.Assert.assertEquals;

public class GildedRoseSafetyNet {
    @Test
    public void shouldGetAStringWhichEqualWithBaseline() throws IOException {
        String output = TextTestFixture.getBaseLine();
        String baseLine = Files.toString(new File("src/test/baseLine.txt"),UTF_8);
        assertEquals(baseLine,output);
    }

}
