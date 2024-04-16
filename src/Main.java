public class Main {
    public static void main(String[] args) {
        // Задание 1
        int deposit = 15000;
        int annualSavings = 0;
        int i = 1;
        while (annualSavings < 2_459_000) {
            annualSavings = annualSavings + deposit;
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
        int month = 1;
        for (; deposit1 <= 12_000_000; month++) {
            deposit1 = (int) (deposit1 * 1.07);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений = " + deposit1);
            }
        }
        // Задание 6
        int deposit2 = 15000;
        int month1 = 1;
        for (; month1 <= 108; month1++) {
            deposit2 = (int) (deposit2 * 1.07);
            if (month1 % 6 == 0) {
                System.out.println("Месяц " + month1 + " сумма накоплений = " + deposit2);
            }
        }
        // Задание 7
        //В нашем месяце 31 день.
        int friday = 4;
        for (; friday <= 31; friday += 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо сделать отчет.");
        }
        // Задание 8
        //  Известно, что комета пролетает каждый 79-й год, начиная с нулевого.
        // В консоль нужно вывести все годы за последние 200 лет, когда появлялась комета, а также следующий год ее появления (ближайшие 100 лет).
        int currentYear = 2024;
        int begin = currentYear - 200;
        int end = currentYear + 100;
        for (int p = 0; p < end; p += 79) {
            if (p > begin) {
                System.out.println(p);
            }
        }
    }
}