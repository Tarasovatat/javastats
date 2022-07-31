package ru.netology.stats;

import java.sql.SQLOutput;

public class StatsService {

    public int sumSales(long[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    public int averageSumSales(long[] sales) {
        int averageSum = sumSales(sales) / sales.length;
        return averageSum;
    }

    public long maxMonth(long[] sales) {
        long maxMonth = sales[0];
        for (long m : sales) {
            if (m > maxMonth) {
                maxMonth = m;
            }
        }
        return maxMonth;
    }

    public long minMonth(long[] sales) {
        long minMonth = sales[0];
        for (long m : sales) {
            if (m < minMonth) {
                minMonth = m;
            }
        }
        return minMonth;
    }

    public long bellowTheAverage(long[] sales) {
        long bellowAverage = averageSumSales(sales) / 2;
        long bellowAverageMonth = sales[0];
        for (long s : sales) {
            if (s < bellowAverage) {
                bellowAverageMonth = s;
            }
        }
        return bellowAverageMonth;
    }

    public long aboveTheAverage(long[] sales) {
        long aboveAverage = averageSumSales(sales);
        long aboveAverageMonth = sales[0];
        for (long s : sales) {
            if (s > aboveAverage) {
                aboveAverageMonth = s;
            }
        }
        return aboveAverageMonth;
    }


}
