public class Main {
    public static void main(String[] args) {
        // Задание 1
        int deposit = 15000;
        int annualSavings = 0;
        int i = 1;
        while (annualSavings < 2_459_000) {
            annualSavings = annualSavings + deposit;
            annualSavings = annualSavings + annualSavings / 100;
            System.out.println("Месяц " + i++ + " Сумма накоплений равна  " + annualSavings);
        }
        // Задание 2
        int t = 0;
        while (t < 10) {
            t++;
            System.out.print(t + " ");
        }
        System.out.println();
        int a = 10;
        for (; a >= 1; a--) {
            System.out.print(a + " ");
        }
        System.out.println();
        // Задание 3
        int population = 12_000_000;
        int birthRate = 17;
        int mortalityRate = 8;
        int year = 1;
        while (year <= 10) {
            int birthYear = population / 1000 * birthRate;
            int mortalityYear = population / 1000 * mortalityRate;
            population = population + birthYear - mortalityYear;
            System.out.println("Год " + year++ + " численность населения составляет " + population);
        }
        // Задание 4 и 5
        int deposit1 = 15000;
        int amountSavings = 0;
        int month = 1;
        amountSavings = amountSavings + deposit1;
        for (; amountSavings <= 12_000_000; month++) {
            amountSavings = amountSavings + (amountSavings * 7 / 100);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений = " + amountSavings);
            }
        }
        // Задание 6
        for (; month <= 108; month++) {
            amountSavings = amountSavings + (amountSavings * 7 / 100);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений = " + amountSavings);
            }
        }
        // Задание 7
        int friday = 3;
        for (; friday <= 31; friday = friday + 7) {
            System.out.println("Сегодня пятнница, " + friday + "-е число. Необходимо подготовить отчет.");
        }
        // Задание 8
        int h = 0;
        for (; h < 2124; h = h + 79) {
            if (h > 1824) {
                System.out.println(h);
            }
        }
    }
}