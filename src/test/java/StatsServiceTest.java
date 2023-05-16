import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

import java.util.Arrays;

public class StatsServiceTest {

    @Test
    public void shouldCalcSumArray() {
        StatsService service = new StatsService();

        int[] array = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,};

        int expectedSum = 12;
        int actualSum = StatsService.sumArray(array);

        Assertions.assertArrayEquals(new int[]{expectedSum}, new int[]{actualSum});
        System.out.println("Метод-1 - Сумма. В массиве " + Arrays.toString(array) + " сумма всех чисел массива равна " + actualSum);
    }

    @Test
    public void shouldCalcMidleSumArray() {
        StatsService service = new StatsService();

        int[] array = {2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7,};

        double expected = 4.5;
        double actual = StatsService.midleSumArray(array);

        Assertions.assertArrayEquals(new double[]{expected}, new double[]{actual});
        System.out.println("Метод-2 - Средняя сумма. Средняя сумма всех чисел массива " + Arrays.toString(array) + " равна " + actual);
    }

    @Test
    public void shouldShowMaxMonthArray() {
        StatsService service = new StatsService();

        int[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = StatsService.maxSaleMonth(array);

        Assertions.assertArrayEquals(new int[]{expected}, new int[]{actual});
        System.out.println("Метод-3 - Ячейка с максимальным числом в массиве. Номер месяца с пиком продаж из массива " + Arrays.toString(array) + ") равен " + actual);
    }

    @Test
    public void shouldShowMinMonthArray() {
        StatsService service = new StatsService();

        int[] array = {4, 2, 3, 2, 5, 1, 23, 2, 4, 1, 2, 2,};

        int expected = 10;
        int actual = StatsService.minSaleMonth(array);

        Assertions.assertArrayEquals(new int[]{expected}, new int[]{actual});
        System.out.println("Метод-4 - Ячейка с минимальным числом в массиве. Номер месяца с минимальными продажами из массива " + Arrays.toString(array) + ") равен " + actual);
    }

    @Test
    public void shouldShowLessMidleSumArray() {
        StatsService service = new StatsService();

        int[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = StatsService.lessMidleSumArray(array);

        Assertions.assertArrayEquals(new int[]{expected}, new int[]{actual});
        System.out.println("Метод-5 - Количество чисел ниже среднего в массиве. Количество месяцев с продажами ниже среднего из массива " + Arrays.toString(array) + ") равно " + actual);
    }

    @Test
    public void shouldShowMoreMidleSumArray() {
        StatsService service = new StatsService();

        int[] array = {8, 16, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 6;
        int actual = StatsService.moreMidleSumArray(array);

        Assertions.assertArrayEquals(new int[]{expected}, new int[]{actual});
        System.out.println("Метод-6 - Количество чисел выше среднего в массиве. Количество месяцев с продажами выше среднего из массива " + Arrays.toString(array) + ") равно " + actual);
    }

}