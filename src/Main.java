//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int a = 50000;
        byte b = 120;
        short c = 30000;
        long d = 12526357898l;
        float e = 1.89f;
        double f = 1.2;
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);



        float g = 27.12f;
        long h = 987678965549l;
        float i = 2.786f;
        short j = 569;
        short k = -159;
        short l = 27897;
        byte m = 67;
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);


        int allPaper = 480;
        int ludasStudents = 23;
        int annasStudents = 27;
        int katesStudents = 30;
        int numberOfStudents = ludasStudents + annasStudents + katesStudents;
        int paperForEachStudent = allPaper / numberOfStudents;
        System.out.println("На каждого ученика рассчитано " + paperForEachStudent + " листов бумаги");

        int bottlesForTwoMinutes = 16;
        int inTwoMinutesTime = 2;
        int bottlesForOneMinute = bottlesForTwoMinutes / inTwoMinutesTime;
        int bottlesForTwentyMinutes = 20 * bottlesForOneMinute;
        int bottlesForOneDay = 1440 * bottlesForOneMinute;
        int bottlesForThreeDays =  3 *  bottlesForOneDay;
        int bottlesForOneMonth = 30 * bottlesForOneDay;
        System.out.println("За 20 минут машина произвела " + bottlesForTwentyMinutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottlesForOneDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesForThreeDays + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + bottlesForOneMonth + " штук бутылок");



        int allBottles = 120;
        int whiteForOneClass = 2;
        int brownForOneClass = 4;
        int bottlesForOneClass = whiteForOneClass + brownForOneClass;
        int numberOfClasses = allBottles / bottlesForOneClass;
        int numberOfWhiteBottles = numberOfClasses * whiteForOneClass;
        int numberOfBrownBottles = numberOfClasses * brownForOneClass;
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + numberOfWhiteBottles + " банок белой краски и "  + numberOfBrownBottles + " банок коричневой краски.");


        int oneBanana = 80;
        int oneMilk = 105;
        int oneIceCream = 100;
        int oneEgg = 70;
        int Bananas = 5 * oneBanana;
        int Milk = 2 * oneMilk;
        int IceCream = 2 * oneIceCream;
        int Eggs = 4 * oneEgg;
        int weightOfBreakfastInGrammes = Bananas + Milk + IceCream + Eggs;
        System.out.println(weightOfBreakfastInGrammes);
        int grPerKg = 1000;
        float weightOfBreakfastInKg = weightOfBreakfastInGrammes / (float)grPerKg;
        System.out.println(weightOfBreakfastInKg);


        int needToLooseInKg = 7;
        int grPerKgm = 1000;
        int needToLooseInGr = needToLooseInKg * grPerKgm;
        int needToLoosePerDayFirstVariant = 250;
        int daysFirstVariant = needToLooseInGr / needToLoosePerDayFirstVariant;
        System.out.println(daysFirstVariant);
        int needToLoosePerDaySecondVariant = 500;
        int daysSecondVariant = needToLooseInGr / needToLoosePerDaySecondVariant;
        System.out.println(daysSecondVariant);



        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        int mashaYearSalary = mashaSalary * 12;
        int denisYearSalary = denisSalary * 12;
        int kristinaYearSalary = kristinaSalary * 12;

        float mashaSalaryNew = mashaSalary * (float)1.1;
        float denisSalaryNew = denisSalary * (float)1.1;
        float kristinaSalaryNew = kristinaSalary * (float)1.1;

        float mashaYearSalaryNew = mashaSalaryNew * (float)12;
        float denisYearSalaryNew = denisSalaryNew * (float)12;
        float kristinaYearSalaryNew = kristinaSalaryNew * (float)12;

        float differenceMasha = mashaYearSalaryNew - mashaYearSalary;
        float differenceDenis = denisYearSalaryNew - denisYearSalary;
        float differenceKristina = kristinaYearSalaryNew - kristinaYearSalary;
        System.out.println("Маша теперь получает " + mashaSalaryNew + " рублей. Годовой доход вырос на "+ differenceMasha + " рублей");
        System.out.println("Денис теперь получает " + denisSalaryNew + " рублей. Годовой доход вырос на "+ differenceDenis + " рублей");
        System.out.println("Кристина теперь получает " + kristinaSalaryNew + " рублей. Годовой доход вырос на "+ differenceKristina + " рублей");
    }
}