package ru.netology.stats;

public class StatsService {
    public long calculateTotalSale(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long calculateAverageSale(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        long averageSale = totalSale / 12;
        return averageSale;
    }

    public int getMonthMaximumSale(long[] sales) {
        int monthMaximum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMaximum]) {
                monthMaximum = i;
            }

        }
        return monthMaximum + 1;
    }

    public int getMonthMinimumSale(long[] sales) {
        int monthMinimum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMinimum]) {
                monthMinimum = i;
            }

        }
        return monthMinimum + 1;
    }

    public int calculateMonthsBelowAverage(long[] sales) {
        int counter = 0;
        long averageSale = calculateAverageSale(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }

        }
        return counter;
    }

    public int calculateMonthsHigherAverage(long[] sales) {
        int counter = 0;
        long averageSale = calculateAverageSale(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }

        }
        return counter;
    }
}
