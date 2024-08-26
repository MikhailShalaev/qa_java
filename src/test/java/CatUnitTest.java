package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class CatUnitTest {
    @Spy
    private Feline feline = new Feline();

    private Cat cat;

    @Test
    public void testGetSound(){
        cat = new Cat(feline);
        assertEquals("Not equal","Мяу", cat.getSound());
    }

    @Test
    public void testGetFood() throws Exception{
        cat = new Cat(feline);
        List<String> predatorFood = Arrays.asList("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(predatorFood);
        List<String> catFood = cat.getFood();
        assertEquals("Not equal",predatorFood,catFood);

    }
}