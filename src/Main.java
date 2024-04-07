public class Main {
    public static void main(String[] args) {
        System.out.println("exercise 1");
        int age = 35;
        if (age >= 18) {
            System.out.printf("Если возраст человека равен %s то он совершеннолетний\n",age);}
        else {System.out.printf("Если возраст человека равен %s то он не достиг совершеннолетия, " +
                "нужно немного подождать\n",age);}

        System.out.println("exercise 2");
        double temperature = 3;
        if (temperature <= 5) {
            System.out.printf("На улице %s градусов, нужно надеть шапку\n",temperature);}
        else {System.out.printf("На улице %s градусов, можно идти без шапки\n",temperature);}

        System.out.println("exercise 3");
        double speed = 61.5;
        if (speed > 60) {System.out.printf("Если скорость %s километров в час, то придется заплатить штраф\n",speed);}
        else {System.out.printf("Если скорость %s километров в час, то можно ездить спокойно\n",speed);}

        System.out.println("exercise 4");
        int year = 9;
        switch (year) {
        case 0,1 -> System.out.println("");
        case 2,3,4,5,6 -> System.out.printf("Если возраст человека равен %s то нужно ходить в детский сад\n",year);
        case 7,8,9,10,11,12,1314,15,16,17 -> System.out.printf("Если возраст человека равен %s то нужно ходить в школу\n",year);
        case 18,19,20,21,22,24 -> System.out.printf("Если возраст человека равен %s то нужно ходить в университет\n",year);
        default -> System.out.printf("Если возраст человека равен %s то нужно ходить на работу\n",year);
        }

        System.out.println("exercise 5");
        int childAge = 11;
        if (childAge < 5) {
            System.out.printf("Если возраст ребенка равен %s то ему нельзя кататься на аттракцоне\n",childAge);}
        else if (childAge < 14) {
            System.out.printf("Если возраст ребенка равен %s ему можно кататься " +
                    "на аттракцине в сопровождении взрослого\n",childAge);}
        else {System.out.printf("Если возраст ребенка равен %s то ему можно кататься " +
                    "на аттракционе без сопровождения взрослого\n",childAge);}

        System.out.println("exercise 6");
        System.out.println("Вариант 1: При условии, что стоячие места начинаем заполнять после того, " +
                "как заполнены все сидячие");
        int placeAmount1 = 102;
        int sitPlaceAmount1 = 60;
        int occupiedPlaceAmount1 = 45;
        int freePlaceAmount1 = placeAmount1 - occupiedPlaceAmount1;
        if (occupiedPlaceAmount1 < placeAmount1) {
            System.out.println ("В вагоне есть свободные места;");}
        else {
            System.out.println ("В вагоне свободных мест нет");};
        if (occupiedPlaceAmount1 < sitPlaceAmount1){
            System.out.println ("сидячие и стоячие");}
        if (occupiedPlaceAmount1 >= sitPlaceAmount1 && occupiedPlaceAmount1 < placeAmount1) {
            System.out.println ("стоячие");}


        System.out.println("Вариант 2: При условии, что стоячие места заполняются " +
                "независимо от наличия свободных сидячих мест");
        int placeAmount2 = 102;
        int sitPlaceAmount2 = 60;
        int standPlaceAmount2 = placeAmount2 - sitPlaceAmount2;
        int occupiedSitPlaceAmount2 = 6;
        int occupiedStandPlaceAmount2 = 21;
        int freePlaceAmount2 = placeAmount2 - (occupiedSitPlaceAmount2 + occupiedStandPlaceAmount2);
        int freeSitPlaceAmount2 = sitPlaceAmount2 - occupiedSitPlaceAmount2;
        int freeStandPlaceAmount2 = standPlaceAmount2 - occupiedStandPlaceAmount2;

        if (freePlaceAmount2 < placeAmount2) {
            System.out.println ("В вагоне есть свободные места:");}
        else {
            System.out.println ("В вагоне свободных мест нет");};
        if (occupiedSitPlaceAmount2 < sitPlaceAmount2) {
            System.out.println (freeSitPlaceAmount2+" свободных сидячих места");}
        if (occupiedStandPlaceAmount2 < standPlaceAmount2) {
            System.out.println (freeStandPlaceAmount2+" свободных стоячих места");
        };
        System.out.println("exercise 7");
        int one = 45;
        int tow = 36;
        int three = 12;
        if (one == tow && one == three){
            System.out.println("Все три числа равны");}
        if (one==tow && one > three){
            System.out.println("первое число равно второму и это большее число");}
        if (one==tow && one < three){
            System.out.println("большее число - третье");}
        if (one==three && one > tow){
            System.out.println("первое число равно третьему и это большее число");}
        if (one==three && one < tow){
            System.out.println("большее число - второе");}
        if (tow==three && tow > one){
            System.out.println("второе число равно третьему и это большее число");}
        if (tow==three && tow < one){
            System.out.println("большее число - первое");}
        if (one > tow && one > three) {
            System.out.println("большее число - первое");}
        if (tow > one && tow > three) {
            System.out.println("большее число - второе");}
        if (three > one && three > tow) {
            System.out.println("большее число - третье");}
    }
}