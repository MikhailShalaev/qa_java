package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class FelineUnitTest {

    @Spy
    private Feline feline = new Feline();

    @Test
    public void testGetFamily() {
        String expFamily = "Кошачьи";
        String actFamily = feline.getFamily();
        assertEquals(expFamily, actFamily);
    }

    @Test
    public void testGetKittens() {
        int expKittens = 1;
        int actKittens = feline.getKittens();
        assertEquals(expKittens, actKittens);
    }

    @Test
    public void testEatMeat() throws Exception {
        List<String> expFood = Arrays.asList("Животные", "Птицы", "Рыба");
        when(feline.getFood("Хищник")).thenReturn(expFood);
        List<String> actFood = feline.eatMeat();
        assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", expFood, actFood);
    }
}
