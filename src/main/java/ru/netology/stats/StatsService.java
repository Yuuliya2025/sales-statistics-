package ru.netology.stats;

import java.util.ArrayList;
import java.util.List;

public class StatsService {

    public int minSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public List<Integer> maxSales(long[] sales) {
        List<Integer> maxMonths = new ArrayList<>();
        long maxSale = Long.MIN_VALUE;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > maxSale) {
                maxSale = sales[i];
                maxMonths.clear();
                maxMonths.add(i + 1);
            } else if (sales[i] == maxSale) {
                maxMonths.add(i + 1);
            }
        }

        return maxMonths;
    }

    public long calculateTotalSales(long[] sales) {
        long totalSales = 0;
        for (long sale : sales) {
            totalSales += sale;
        }
        return totalSales;
    }

    public double averageSales(long[] sales) {
        if (sales == null || sales.length == 0) {
            throw new IllegalArgumentException("Массив продаж не может быть пустым.");
        }

        long totalSales = calculateTotalSales(sales);
        return (double) totalSales / sales.length;
    }

    public int countBelowAverage(long[] sales) {
        if (sales == null || sales.length == 0) {
            throw new IllegalArgumentException("Массив продаж не может быть пустым.");
        }

        double average = averageSales(sales);
        int count = 0;

        for (long sale : sales) {
            if (sale < average) {
                count++;
            }
        }

        return count;
    }

    public int countAboveAverage(long[] sales) {
        if (sales == null || sales.length == 0) {
            throw new IllegalArgumentException("Массив продаж не может быть пустым.");
        }

        double average = averageSales(sales);
        int count = 0;

        for (long sale : sales) {
            if (sale > average) {
                count++;
            }
        }

        return count;
    }
}
