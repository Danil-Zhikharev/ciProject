package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax_1() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;
        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
        System.out.println("Ожидаемое: " + expected);
        System.out.println("Фактическое: " + actual);
    }

    @Test
    void findMax_2() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {0, -1, 3, -3, -4, -5, -6, -7, -8, -9, -10};
        long expected = 3;
        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
        System.out.println("Ожидаемое: " + expected);
        System.out.println("Фактическое: " + actual);
    }
}