package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatisticsTest {

    @Test
    public void testSum() {
        Statistics service = new Statistics();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        long actual = service.sum(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testAverage() {
        Statistics service = new Statistics();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        long actual = service.average(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMaxSales() {
        Statistics service = new Statistics();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        long actual = service.maxSales(sales);
        long expected = 7;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinSales() {
        Statistics service = new Statistics();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        long actual = service.minSales(sales);
        long expected = 8;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testLowAverage() {
        Statistics service = new Statistics();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        long actual = service.lowAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAboveAverage() {
        Statistics service = new Statistics();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        long actual = service.lowAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);

    }
}