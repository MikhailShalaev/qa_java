package com.example;

import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LionUnitTest {
    private Feline feline;
    private Lion lion;

    @Before
    public void setUp() throws Exception {
        feline = mock(Feline.class);
        lion = new Lion("Самка");
    }

    @Test
    public void testGetKittens() throws Exception {
        when(feline.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void testGetFood() throws Exception {
        List<String> expFood = Arrays.asList("Животные", "Птицы", "Рыба");
        when(feline.getFood("Хищник")).thenReturn(expFood);
        List<String> actFood = lion.getFood();
        assertEquals(expFood, actFood);
    }

   }