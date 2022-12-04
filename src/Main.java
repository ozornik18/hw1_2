public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        byte cat = 40;
        System.out.println(cat);
        short b = 200;
        System.out.println(b);
        int c = 500;
        System.out.println(c);
        long d = 564789;
        System.out.println(d);
        float e = 2.2f;
        System.out.println(e);
        double i = 7.8;
        System.out.println(i);
        boolean car = cat <= b;
        System.out.println(cat);
        char bar = 35;
        System.out.println(bar);

        // Задача 2
        System.out.println("Задача 2");
        double x = 27.12;
        long y = 987678965;
        byte v = 2;
        int f = 786;
        boolean a = 30 < 5;
        int apple = 569;
        int temp = -159;
        int gramm = 27897;
        double app = 67.0;

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
        int bottle = 16;
        int time2 = 2;
        int time20 = 20;
        int totalBottle1 = bottle / time2;
        int totalBottle2 = totalBottle1 * time20;
        System.out.println("За " + time20 + " минут машина произвела бутылок " + totalBottle2 + " штук");

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