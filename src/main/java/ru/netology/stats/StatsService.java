package ru.netology.stats;

public class StatsService {
    public long countSum(long[] sales) { //сумма всех продаж
        long sum = 0;
        for (long sale : sales) { //цикл прочтения массива
            sum += sale; //поэлементная запись
        }
        return sum;
    }

    public long countAverageSale(long[] sales) {//средняя сумма продаж в месяц
        long average = 0;
        long sum = countSum(sales);
        average = sum / sales.length; //сумма продаж деленная на количество записей/месяцев
        return average;
    }


    public int maxSum(long[] sales) { //Номер месяца, в котором был максимум продаж
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) { //поиск максимума
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSum(long[] sales) { //Номер месяца, в котором был минимум продаж
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) { //поиск максимума
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }


    public long lowerAverage(long[] sales) {  // Кол-во месяцев, в которых продажи были ниже среднего
        long average = countAverageSale(sales);
        int numberMonth = 0;
        for (long sale : sales) {
            if (sale < average) {
                numberMonth++; //счетчик
            }
        }
        return numberMonth;
    }
    public long upperAverage(long[] sales) {  //Кол-во месяцев, в которых продажи были выше среднего
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