package ru.netology.stats;

public class StatsService {
    public long countSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) { 
            sum += sale; 
        }
        return sum;
    }

    public long countAverageSale(long[] sales) {
        long average = 0;
        long sum = countSum(sales);
        average = sum / sales.length; 
        return average;
    }


    public int maxSum(long[] sales) { 
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

    public int minSum(long[] sales) { 
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


    public long lowerAverage(long[] sales) {  
        long average = countAverageSale(sales);
        int numberMonth = 0;
        for (long sale : sales) {
            if (sale < average) {
                numberMonth++; 
            }
        }
        return numberMonth;
    }
    public long upperAverage(long[] sales) {  
        long average = countAverageSale(sales);
        int numberMonth = 0;
        for (long sale : sales) {
            if (sale > average) {
                numberMonth++;
            }
        }
        return numberMonth;
    }
}
