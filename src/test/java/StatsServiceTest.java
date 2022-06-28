import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {
    @Test
    void countSum() {
        StatsService service = new StatsService();
        //long[] sales = {14,99,13,4};
        //long expected = 130;
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.countSum(sales);

        assertEquals(expected, actual);
    }


    @Test
    void countAverageSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = service.countAverageSale(sales);

        assertEquals(expected, actual);
    }
    @Test
    void minSum() {

        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = service.minSum(sales);

        assertEquals(expected, actual);
    }

    @Test
    void maxSum() {

        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.maxSum(sales);

        assertEquals(expected, actual);
    }



    @Test
    void lowerAverage() {

        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.lowerAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    void upperAverage() {

        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.upperAverage(sales);
        assertEquals(expected, actual);
    }
}


