//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int age = 20;
        if (age >= 18) {
            System.out.println("Если человеку исполнилось " + age + " ,он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если человеку " + age + " ,он не достиг совершеннолетия, нужно ещё немного подождать");
        }
        // Задача 2
        System.out.println("Задача 2");
        int temperature = -4;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + ", нужно надеть шапку");
        }
        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " ,можно идти без шапки");
        }
        // Задача 3
        System.out.println("Задача 3");
        int speed = 80;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + ", можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + ", придётся заплатить штраф");
        }
        // Задача 4
        System.out.println("Задача 4");
        int years = 10;
        if (years >= 2 && years <= 6) {
            System.out.println("Если возраст человека равен " + years + " ,то ему нужно ходить в детский сад");
        }
        if (years >= 7 && years <= 17) {
            System.out.println("Если возраст человека равен " + years + " ,то ему нужно ходить в школу");
        }
        if (years >= 18 && years <= 24) {
            System.out.println("Если возраст человека равен " + years + " ,то его место в университете");
        }
        if (years >= 24) {
            System.out.println("Если возраст равен " + years + " , то ему поря ходить на работу");
        }
        // Задача 5
        System.out.println("Задача 5");
        int childAge = 17;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то он не может кататься на атракционе");
        }
        if (childAge >= 5 && childAge <= 14) {
            System.out.println("Если возраст ребенка равен " + childAge + " , то он может кататься на атракционе в сопровождении");
        }
        if (childAge >= 14) {
            System.out.println("Если возраст ребенка равен " + childAge + " ,то он может кататься на атракционе без сопровождения");
        }
        // Задача 6
        System.out.println("Задача 6");
        int allPlaces = 102;
        int seating = 60;
        int peoples = 70;
        if (peoples >= allPlaces) {
            System.out.println("Вагон уже полностю забит");
        }
        if (peoples < allPlaces) {
            System.out.println("Места в вагоне есть");
        }
        if (peoples >= 60) {
            System.out.println("В вагоне остались только стоячие места");
        } else {
            System.out.println("В вагоне есть сидячие места");
        }
        // Задача 7
        System.out.println("Задача 7");
        int one = 15;
        int two = 30;
        int three = 20;
        boolean twoIsBiggerThanOne = three > one;
        boolean twoIsBiggestNumber = two > three;
        if (twoIsBiggerThanOne) {
            System.out.println("Самое большое число " + two);
        }


    }
}
