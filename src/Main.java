public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int month = 0;
        do {
            month++;
            total = total + salary;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
        } while (total <= 2_459_000);

        // Задание 2
        System.out.println("Задача 2");
        int number = 1;
        while (number <= 10) {
            System.out.print(number + " ");
            number = number + 1;
        }
        System.out.println();
        int numbers = 10;
        while (numbers > 0) {
            System.out.print(numbers + "");
            numbers = numbers - 1;
        }
        System.out.println();

        // Задание 3
        System.out.println("Задача 3");
        int population = 12_000_000;
        int populationMortality = 8;
        int birthRate = 17;
        int growthRate = birthRate - populationMortality;
        int year = 0;
        while (year < 10) {
            population = population + (population / 1000 * (growthRate));
            year = year + 1;
            System.out.println("Год " + year + ": численность населения составляет " + population);
        }

        // Задание 4
        System.out.println("Задача 4");
        int pay = 15000;
        int totals = 0;
        int months = 0;
        do {
            months++;
            totals = (int) (totals + (totals * 0.07));
            totals = totals + pay;
            System.out.println("Месяц " + months + " сумма накоплений равна " + totals + " рублей");
        } while (totals <= 12_000_000);

        // Задание 5
        System.out.println("Задача 5");
        int pays = 15000;
        int total1 = 0;
        int month1 = 0;
        for (; total1 < 12_000_000; month1++) {
            total1 = (int) (total1 + (total1 * 0.07));
            total1 = total1 + pays;
            if (month1 % 6 == 0) {
                System.out.println("Месяц " + month1 + " сумма накоплений равна " + total1 + " рублей");
            }
        }
        System.out.println(total1);


        // Задание 8
        System.out.println("Задача 8");
        int beginningYear = 1817;
        int endYear = 2117;
        int years = 0;
        int period = endYear - beginningYear;
        for (; beginningYear < endYear; ) {
            beginningYear = beginningYear + 79;
            System.out.println(beginningYear);
        }

        // Задание 7
        System.out.println("Задача 7");
        int dayNumber = 1;
        for (; dayNumber <= 31; dayNumber++) {
            if (dayNumber % 7 == 0) {
                System.out.println("Сегодня пятница!" + dayNumber + " число");
            }



            // Задание 6
            System.out.println("Задача 6");
            int salarys = 15000;
            int totalss = 0;
            int monthNumber = 0;
            int numb = 9 * 12;
            for (; totalss < 12_000_000; monthNumber++) {
                totalss = (int) (totalss + (totalss * 0.07));
                totalss = totalss + salarys;
                if (monthNumber % 6 == 0 && monthNumber <= numb) {
                    System.out.println(monthNumber + " сумма накоплений за пол года " + totalss + " рублей");
                }
            }


        }

    }
}