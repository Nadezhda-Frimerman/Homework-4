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
        int placeAmount = 102;
        int sitPlaceAmount = 60;
        int occupiedPlaceAmount = 83;

    }
}