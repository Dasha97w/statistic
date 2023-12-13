package ru.netology.stats;

public class StatsService {
    public int calculateMonthlySales(int[] sales) { //Сумма всех продаж
        int monthlySales = 0;
        for (int i = 0; i < sales.length; i++) {
            monthlySales += sales[i];
        }
        return monthlySales;
    }

    public int calculateAverageSales(int[] sales) { //Средняя сумма продаж в месяц
        int average = calculateMonthlySales(sales) / 12;
        return average;
    }

    public int calculateMaxSales(int[] sales) { //Месяц с максимальной суммой продаж
        int maxSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxSales]) {
                maxSales = i;
            }
        }
        return maxSales + 1;
    }

    public int calculateMinSales(int[] sales) { //Месяц с минимальной суммой продаж
        int minSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minSales]) {
                minSales = i;
            }
        }
        return minSales + 1;
    }

    public int getMinAverageMonthlySale(int[] sales) { //Кол-во месяцев продажи ниже среднего
        int minAverageSales = 0;
        int months = 0;
        int averageSales = calculateAverageSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales) {
                months = 1;
                minAverageSales += months;
            }
        }
        return minAverageSales;
    }

    public int calculateMaxAverageMonthlySale(int[] sales) { //Кол-во месяцев продажи выше среднего
        int maxAverageSales = 0;
        int months = 0;
        int averageSales = calculateAverageSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales) {
                months = 1;
                maxAverageSales += months;
            }
        }
        return maxAverageSales;
    }
}
