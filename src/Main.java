public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }


        public static void task1() {
            System.out.println("Задача 1");
        int money = 1000000;
        System.out.println("Значение переменной с типом int равно " + money);
        byte apples = 126;
        System.out.println("Значение переменной с типом byte равно " + apples);
        short worldPeople = 32111;
        System.out.println("Значение переменной с типом short равно " + worldPeople);
        long atoms = 7111222;
        System.out.println("Значение переменной с типом long равно " + atoms);
        float wheight = 3.4f;
        System.out.println("Значение переменной с типом float равно " + wheight);
        double temperature = -38.5;
        System.out.println("Значение переменной с типом double равно " + temperature);
    }
    public static void task2() {
        System.out.println("Задача 2");
        double a = 27.12;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        double c = 2.786;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        float e = -159;
        System.out.println(e);
        int f = 27897;
        System.out.println(f);
        byte g = 67;
        System.out.println(g);
    }
    public static void task3() {
        System.out.println("Задача 3");
        byte classLudmila = 23;
        byte classAnna = 27;
        byte classEkaterina = 30;
        int allPaper = 480;
        int oneStudent = allPaper / (classLudmila + classAnna + classEkaterina);
        System.out.println("На каждого ученика рассчитано " + oneStudent + " листов бумаги");
    }
    public static void task4() {
        System.out.println("Задача 4");
        byte production2min = 16;
        int production20min = production2min * 10;
        System.out.println("За 20 минут машина произвела " + production20min + " штук бутылок");
        int productionDay = production20min * 3 * 24;
        System.out.println("За сутки машина произвела " + productionDay + " штук бутылок");
        int production3day = productionDay * 3;
        System.out.println("За 3 дня машина произвела " + production3day + " штук бутылок");
        long productionMoth = productionDay * 31;
        System.out.println("За месяц машина произвела " + productionMoth + " штук бутылок");
    }
    public static void task5() {
        System.out.println("Задача 5");
        byte allPoint = 120;
        byte whitePoint = 2;
        byte brownPoint = 4;
        int oneClassPoint = whitePoint + brownPoint;
        int allClass = allPoint / oneClassPoint;
        int allWhitePoint = allClass * whitePoint;
        int allBrownPoint = allClass * brownPoint;
        System.out.println("В школе, где " + allClass + " классов, нужно " + allWhitePoint + " банок белой краски и " + allBrownPoint + " банок коричневой краски");
    }

    public static void task6() {
        System.out.println("Задача 6");
        byte onePortionBanana = 80;
        byte onePortionMilk = 105;
        byte onePortionIceCream = 100;
        byte onePortionEgg = 70;
        int allFood = (onePortionBanana * 5 + onePortionMilk * 2 + onePortionIceCream * 2 + onePortionEgg * 4) / 1000;
        System.out.println("Вес завтрака спортсмена составляет " + allFood + " кг");
    }
    public static void task7() {
        System.out.println("Задача 7");
        float excessWeight = 7;
        int weightEveryDay = 250;
        float day = excessWeight / (weightEveryDay / 1000F);
        System.out.println("Если спортсмен ежедневно будет терять по 250 грамм веса, ему понадобится " + day + " дней");
        int newWeightEveryDay = 500;
        float day2 = excessWeight / (newWeightEveryDay / 1000F);
        System.out.println("Если спортсмен ежедневно будет терять по 500 грамм веса, ему понадобится " + day2 + " дней");
    }
    public static void task8() {
        System.out.println("Задача 8");
    int salaryMaria = 67760;
    int salaryDenis = 83690;
    int salaryKristina = 76230;
    float newSalaryMaria = salaryMaria + salaryMaria * (10 / 100F);
    long yearSalaryMaria = salaryMaria * 12L;
    float newYearSalaryMaria = newSalaryMaria * 12;
    System.out.println("Маша теперь получает " + newSalaryMaria + " рублей. Годовой доход вырос на " + (newYearSalaryMaria - yearSalaryMaria));
    float newSalaryDenis = salaryDenis + salaryDenis * (10 / 100F);
    System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + (newSalaryDenis * 12 - salaryDenis * 12));
    float newSalaryKristina = salaryKristina + salaryKristina * (10 / 100F);
    System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + (newSalaryKristina * 12 - salaryKristina * 12));
    long salaryLastYear = (salaryMaria + salaryDenis + salaryKristina) * 12L;
    float salaryThisYear = (newSalaryMaria + newSalaryDenis + newSalaryKristina) * 12F;
    System.out.println("Разница между зарплатами предыдущего года и этого составляет " + (salaryThisYear - salaryLastYear) + " рублей");


    }
}




