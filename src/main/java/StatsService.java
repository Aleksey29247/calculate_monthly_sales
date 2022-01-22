public class StatsService {
    public int calculateSumOfSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;

    }


    // расчет среднего
    public int calculateAverage(int[] sales) {
        return calculateSumOfSales(sales) / sales.length;
    }

    // Номер месяца, в котором был минимум продаж
    public int calculateMinSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month++; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    // Номер месяца, в котором были максимальные продажи
    public int calculateMaxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month++; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int calculateMinAverage(int[] sales) {

        int Average = calculateSumOfSales(sales) / sales.length;
        int count = 0;
        for (long sale : sales) {
            if (sale < Average) {
                count++;
            }
        }
        return count;

    }

    public int calculateMaxAverage(int[] sales) {

        int Average = calculateSumOfSales(sales) / sales.length;
        int count = 0;
        for (long sale : sales) {
            if (sale > Average) {
                count++;
            }
        }
        return count;

    }

}












