import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldcalculateSumOfSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calculateSumOfSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldcalculateAeverageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.calculateAverage(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldcalculateMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.calculateMinSales(sales);

        assertEquals(expected, actual);

    }

    @Test
    void shouldcalculateMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.calculateMaxSales(sales);

        assertEquals(expected, actual);

    }

    @Test
    void shouldcalculateMinAeverageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.calculateMinAverage(sales);

        assertEquals(expected, actual);

    }

    @Test
    void shouldcalculateMaxAeverageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.calculateMaxAverage(sales);

        assertEquals(expected, actual);

    }


}