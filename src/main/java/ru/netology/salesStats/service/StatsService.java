package ru.netology.salesStats.service;

public class StatsService {
  public long sumSales(long[] month) {
        int sum = 0;
        for (int i = 0; i < month.length; i++) {
            sum += month[i];
        }
        return sum;
    }

    public long averageSales(long[] sales) {
        long averageSum = sumSales(sales);
        return averageSum / 12;
    }

    public int peakSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int minMonths(long[] sales) {
        int sumMonth = 0;
        for (long sale : sales) {
            if (sale > averageSales(sales)) {
                sumMonth++;
            }
        }
        return sumMonth;
    }


    public int maxMonths(long[] sales) {
        int sumMonth = 0;
        for (long sale : sales) {
            if (sale < averageSales(sales)) {
                sumMonth++;
            }

        }
        return sumMonth;
    }
}


