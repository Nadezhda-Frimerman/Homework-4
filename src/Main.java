public class Main {
    public static void main(String[] args) {
        System.out.println("exercise 1");
        int agg1 = 35;
        if (agg1 >= 18) {
            System.out.println("Если возраст человека равен "+agg1+
                    ", то он совершеннолетний");}
        else {System.out.println("Если возраст человека равен "+agg1+
                ", то он не достиг совершеннолетия, нужно немного подождать");}
        System.out.println("exercise 2");
        double temperature = 3;
        if (temperature <= 5) {
            System.out.println("На улице "+temperature+
                    " градусов, нужно надеть шапку");}
        else {System.out.println("На улице "+temperature+
                " градусов, можно идти без шапки");}
        System.out.println("exercise 3");
        double speed = 61.5;
        if (speed > 60) {
            System.out.println("Если скорость "+speed+
                    " километров в час, то придется заплатить штраф");}
        else {System.out.println("Если скорость "+speed+
                " километров в час, то можно ездить спокойно");}
        System.out.println("exercise 4");
        int agg = 21;
        if (agg >= 2 && agg <= 6) {
            System.out.println(" Если возраст человека равен "+agg+
                    ", то нужно ходить в детский сад");}
        if (agg >= 7 && agg <= 17) {
            System.out.println(" Если возраст человека равен "+agg+
                    ", то нужно ходить в школу");}
        if (agg >= 18 && agg <= 24) {
            System.out.println(" Если возраст человека равен "+agg+
                    ", то нужно ходить в универсиет");}
        if (agg >24) {
            System.out.println(" Если возраст человека равен "+agg+
                    ", то нужно ходить на работу");}
        System.out.println("exercise 5");
        int childAgg = 9;
        if (childAgg < 5) {
            System.out.println(" Если возраст ребенка равен "+childAgg+
                    ", то ему нельзя кататься на аттракцоне");}
        if (childAgg >= 5 && childAgg < 14) {
            System.out.println(" Если возраст ребенка равен "+childAgg+
                    ", то ему можно кататься на аттракцине в сопровождении взрослого");}
        if (childAgg >= 14) {
            System.out.println(" Если возраст ребенка равен "+childAgg+
                    ", то ему можно кататься на аттракционе без сопровождения взрослого");}
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
        }
    }
}