package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    @Test
    public void shouldReturnCorrectMinMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinMonth = 9;

        int actualMinMonth = service.minSales(sales);

        assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void shouldReturnCorrectMaxMonths() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        List<Integer> expectedMaxMonths = Arrays.asList(6, 8);

        List<Integer> actualMaxMonths = service.maxSales(sales);

        Assertions.assertIterableEquals(expectedMaxMonths, actualMaxMonths);
    }


    @Test
    public void shouldReturnTotalSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedTotalSales = 180;
        long actualTotalSales = service.calculateTotalSales(sales);
        Assertions.assertEquals(expectedTotalSales, actualTotalSales);
    }


    @Test
    void shouldCalculateAverageSalesCorrectly() {
        long[] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService statsService = new StatsService();
        double expectedAverageSales = 15.0;
        double actualAverageSales = statsService.averageSales(salesData);
        assertEquals(expectedAverageSales, actualAverageSales, 0.01);
    }

    @Test
    void shouldCountBelowAverageCorrectly() {
        long[] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService statsService = new StatsService();
        int expectedBelowAverageCount = 5;
        int actualBelowAverageCount = statsService.countBelowAverage(salesData);
        assertEquals(expectedBelowAverageCount, actualBelowAverageCount);
    }

    @Test
    void shouldCountAboveAverageCorrectly() {
        long[] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService statsService = new StatsService();
        int expectedAboveAverageCount = 5;
        int actualAboveAverageCount = statsService.countAboveAverage(salesData);
        assertEquals(expectedAboveAverageCount, actualAboveAverageCount);
    }
}





