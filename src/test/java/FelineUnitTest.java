package com.example;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;
public class FelineUnitTest {

@Test
    public void testGetFamily() {
        String expFamily = "Кошачьи";
        String actFamily = new Feline().getFamily();
        assertEquals(expFamily, actFamily);
    }

    @Test
    public void testGetKittens() {
        int expKittens = 1;
        int actKittens = new Feline().getKittens();
        assertEquals(expKittens, actKittens);
    }

    @Test
    public void testEatMeat() throws Exception {
    Feline feline = new Feline();
        List<String> expFood = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", expFood, feline.eatMeat());
    }
}
