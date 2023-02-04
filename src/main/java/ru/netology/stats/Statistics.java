package ru.netology.stats;

public class Statistics {

    public long sum(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
        return result;
    }

    public long average(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
        return result / 12;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        long maxSales = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxSales) {
                maxSales = sales[i];
                maxMonth = i;
            }

        }
        return maxMonth;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        long minSales = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minSales) {
                minSales = sales[i];
                minMonth = i;
            }

        }
        return minMonth;

    }

    public int lowAverage(long[] sales) {
        long averageSales = average(sales);
        int counter = 0;

        for (long sale : sales) {
            if (sale < averageSales) {
                counter++;

            }

        }
        return counter;

    }

    public int aboveAverage(long[] sales) {
        long averageSales = average(sales);
        int counter = 0;

        for (long sale : sales) {
            if (sale > averageSales) {
                counter++;

            }

        }
        return counter;

    }
}

