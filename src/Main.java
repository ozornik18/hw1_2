public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        byte cat = 40;
        System.out.println("Значение переменной cat с типом byte равно " + cat);
        short b = 200;
        System.out.println("Значение переменной b с типом short равно " + b);
        int cream = 500;
        System.out.println("Значение переменной cream с типом int равно " + cream);
        long people = 564789123L;
        System.out.println("Значение переменной people с типом long равно " + people);
        float home = 2.2f;
        System.out.println("Значение переменной home с типом byte равно " + home);
        double i = 7.8;
        System.out.println("Значение переменной i с типом double равно " + i);


        // Задача 2
        System.out.println("Задача 2");
        float x = 27.12F;
        long y = 987_678_965_549L;
        double v = 2.786;
        boolean a = false;
        char apple = 569;
        short temp = -159;
        int gramm = 27897;
        byte app = 67;

        // Задача 3
        System.out.println("Задача 3");
        int totalPaper = 480;
        int class1 = 23;
        int class2 = 27;
        int class3 = 30;
        int total = class1 + class2 + class3;
        System.out.println("На каждого ученика рассчитано " + totalPaper / total + " листов бумаги");

        // Задача 4
        System.out.println("Задача 4");
        int bottlse = 16;
        int time2 = 2;
        int time20 = 20;
        int BottlseOneMinutes = bottlse / time2;
        System.out.println("За " + time20 + " минут машина произвела бутылок " + BottlseOneMinutes * time20 + " штук");
        int minutesInDay = 60 * 24;
        System.out.println("За " + minutesInDay + " минут машина произвела бутылок " + BottlseOneMinutes * minutesInDay + " штук");
        int minutesInThreeDays = minutesInDay * 3;
        System.out.println("За " + minutesInThreeDays + " минут машина произвела бутылок " + BottlseOneMinutes * minutesInThreeDays + " штук");
        int minutesInMonth = minutesInDay * 30;
        System.out.println("За " + minutesInMonth + " минут машина произвела бутылок " + BottlseOneMinutes * minutesInMonth + " штук");

        // Задача 5
        System.out.println("Задача 5");
        int paint = 120;
        int white = 2;
        int brown = 4;
        int totalClass = paint / (white + brown);
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalClass * white + " банок белой краски и " + totalClass * brown + " банок коричневой краски");

        // Задача 6
        System.out.println("Задача 6");
        int banana = 5 * 80;
        int milk = 2 * 105;
        int iceCream = 2 * 100;
        int egg = 4 * 70;
        int totalWeight = banana + milk + iceCream + egg;
        System.out.println("Вес спорт-завтрака " + totalWeight + " грамм, или " + totalWeight * .001 + " кг.");

        // Задача 7
        System.out.println("Задача 7");
        float weightSportsman = 7 * 1000;
        int weight1 = 250;
        int weight2 = 500;
        int averageWeight = (weight1 + weight2) / 2;
        System.out.println("Если терять каждый день по " + weight1 + " грамм, то потребуется " + weightSportsman / weight1 + " дней");
        System.out.println("Если терять каждый день по " + weight2 + " грамм, то потребуется " + weightSportsman / weight2 + " дней");
        System.out.println("Если терять в день по " + averageWeight + " грамм в среднем, то потребуется " + weightSportsman / averageWeight + " дней");

        // Задача 8
        System.out.println("Задача 8");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        double mashaMonthNew = masha * 1.1;
        int mashaYearOld = masha * 12;
        double mashaYearNew = mashaMonthNew * 12;
        double masha1 = mashaYearNew - mashaYearOld;
        double denisMonthNew = denis * 1.1;
        int denisYearOld = denis * 12;
        double denisYearNew = denisMonthNew * 12;
        double denis1 = denisYearNew - denisYearOld;
        double kristinaMonthNew = kristina * 1.1;
        int kristinaYearOld = kristina * 12;
        double kristinaYearNew = kristinaMonthNew * 12;
        double kristina1 = kristinaYearNew - kristinaYearOld;
        System.out.println("Маша теперь получает " + mashaMonthNew + " рублей. Годовой доход вырос на " + masha1 + " рублей");
        System.out.println("Денис теперь получает " + denisMonthNew + " рублей. Годовой доход вырос на " + denis1 + " рублей");
        System.out.println("Кристина теперь получает " + kristinaMonthNew + " рублей. Годовой доход вырос на " + kristina1 + " рублей");

    }

}