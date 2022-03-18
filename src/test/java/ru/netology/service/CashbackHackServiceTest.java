package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {

    @Test
    public void shouldReturn100() {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }



    @Test
    public void shouldReturn1000() {
        CashbackHackService service = new CashbackHackService();

        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn300() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1700;
        int expected = 300;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn0IfAmount1000() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn1000IfAmount3000() {
        CashbackHackService service = new CashbackHackService();

        int amount = 3000;
        int expected = 1000;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

}