package com.example;

import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

public class LionUnitTest {
    @Mock
    private Feline feline;
    private Lion lion;

    @Before
    public void setUp() throws Exception {
        initMocks(this);
        lion = new Lion("Самка", feline);
    }

    @Test
    public void testGetKittens(){
        when(feline.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void testGetFood() throws Exception {
        when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }

    @Test
    public void isExceptionThrownWhenSexIncorrect(){
        Exception exception = assertThrows(Exception.class, () -> new Lion("Нечто", feline));
        assertEquals("Используйте допустимые значения пола животного - самей или самка",
                exception.getMessage());
    }

   }