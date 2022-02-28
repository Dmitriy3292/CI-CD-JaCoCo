package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 100};
        long expected = 100;

        long actual = service.findMax(incomesInBillions);
    }
/*    @Test
    void should() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {10, 5, 8, 4, 5, 6, 12, 13,15,99,100};
        long expected = 100;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }*/
}