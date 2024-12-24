import ru.netology.stats.StatsService;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        long[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        // Минимум продаж
        int minMonthIndex = service.minSales(monthlySales);
        System.out.println("Минимальные продажи были в месяце: " + (minMonthIndex + 1));

        // Максимум продаж
        List<Integer> maxMonths = service.maxSales(monthlySales);
        StringBuilder monthsString = new StringBuilder();

        for (int month : maxMonths) {
            monthsString.append(month);
            if (month != maxMonths.get(maxMonths.size() - 1)) {
                monthsString.append(", ");
            }
        }

        System.out.println("Максимальные продажи были в месяцах: " + monthsString.toString());

        // Общая сумма продаж
        long totalSales = 0;
        for (long sale : monthlySales) {
            totalSales += sale;
        }

        System.out.println("Общая сумма всех продаж: " + totalSales);

        // Средняя сумма продаж
        double averageSales = (double) totalSales / monthlySales.length;
        System.out.printf("Средняя сумма продаж в месяц: %.2f\n", averageSales);

        // Количество месяцев, в которых продажи были ниже среднего
        int belowAverageCount = 0;
        for (long sale : monthlySales) {
            if (sale < averageSales) {
                belowAverageCount++;
            }
        }
        System.out.println("Количество месяцев, в которых продажи были ниже среднего: " + belowAverageCount);

        // Количество месяцев, в которых продажи были выше среднего
        int aboveAverageCount = 0;
        for (long sale : monthlySales) {
            if (sale > averageSales) {
                aboveAverageCount++;
            }
        }
        System.out.println("Количество месяцев, в которых продажи были выше среднего: " + aboveAverageCount);
    }
}
