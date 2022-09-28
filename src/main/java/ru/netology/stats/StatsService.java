package ru.netology.stats;

public class StatsService {

    public long total(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
        return result;
    }

    public long average(long[] sales) {
        return total(sales) / 12;
    }

    public int maxMonth(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {

            if (sales[maxMonth] <= sales[i]) {
                maxMonth = i;
            }
        }

        return maxMonth;
    }

    public int minMonth(long[] sales) {

        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {

            if (sales[minMonth] >= sales[i]) {
                minMonth = i;
            }
        }

        return minMonth;
    }

    public long underAverage(long[] sales) {
        long average = average(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale < average) {
                counter++;
            }

        }
        return counter;
    }

    public long overAverage(long[] sales) {
        long average = average(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale > average) {
                counter++;
            }

        }
        return counter;
    }
}

















