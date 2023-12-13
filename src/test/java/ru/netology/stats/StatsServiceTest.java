package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void ShouldMonthlySales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSales = 180;
        int actualSales = service.calculateMonthlySales(sales);

        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void ShouldAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverage = 15;
        int actualAverage = service.calculateAverageSales(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void ShouldMaxSale() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxSale1 = 8;
        int actualMaxSale = service.calculateMaxSales(sales);

        Assertions.assertEquals(expectedMaxSale1, actualMaxSale);

    }

    @Test
    public void ShouldMinSale() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinSale1 = 9;
        int actualMinSale = service.calculateMinSales(sales);

        Assertions.assertEquals(expectedMinSale1, actualMinSale);
    }

    @Test
    public void ShouldMinAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinAverage = 5;
        int actualMinAverage = service.getMinAverageMonthlySale(sales);

        Assertions.assertEquals(expectedMinAverage, actualMinAverage);
    }

    @Test
    public void ShouldMaxAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxAverage = 5;
        int actualMaxAverage = service.calculateMaxAverageMonthlySale(sales);

        Assertions.assertEquals(expectedMaxAverage, actualMaxAverage);
    }
}
