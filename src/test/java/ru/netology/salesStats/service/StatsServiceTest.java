package ru.netology.salesStats.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void calcSumService() {
        StatsService service = new StatsService();
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.sumSales(month);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void calcAverageSales() {
        StatsService service = new StatsService();
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.averageSales(month);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcPeakSales() {
        StatsService service = new StatsService();
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.peakSales(month);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcMinSales() {
        StatsService service = new StatsService();
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minSales(month);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcMinMonths() {
        StatsService service = new StatsService();
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.minMonths(month);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcMaxMonths() {
        StatsService service = new StatsService();
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.maxMonths(month);

        Assertions.assertEquals(expected, actual);
    }
}

