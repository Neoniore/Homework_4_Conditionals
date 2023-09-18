public class Main {
    public static void main(String[] args) {
        task1();  // Задача 1
        task2();  // Задача 2
        task3();  // Задача 3
        task4();  // Задача 4
        task5();  // Задача 5
        task6();  // Задача 6
        task7();  // Задача 7
    }
    public static void task1 () {
        System.out.println("Задание 1");
        byte age = 17;
        boolean adult = age >= 18;
        if (adult) {
            System.out.printf("Если возраст человека равен %d, то он совершеннолетний \n", age);
        } else {
            System.out.printf("Если возраст человека равен %d, то он не достиг совершеннолетия, нужно немного подождать \n", age);
        }
        System.out.println();
    }
    public static void task2 () {
        System.out.println("Задание 2");
        byte tempreture = 5;
        boolean itsColdToday = tempreture < 5;
        if (itsColdToday) {
            System.out.printf("На улице %d градусов, нужно надеть шапку \n", tempreture);
        } else {
            System.out.printf("На улице %d градусов, можно идти без шапки \n", tempreture);
        }
        System.out.println();
    }
    public static void task3 () {
        System.out.println("Задание 3");
        short speed = 180;
        boolean speedExceeded = speed > 60;
        if (speedExceeded) {
            System.out.printf("Если скорость %d, то придется заплатить штраф \n", speed);
        } else {
            System.out.printf("Если скорость %d, то можно ездить спокойно \n", speed);
        }
        System.out.println();
    }
    public static void task4 () {
        System.out.println("Задание 4");
        byte age = 90; // про пенсию забыли)
        boolean goToKindergarten = age > 2 && age < 7, goToSchool = age >= 7 && age < 18, goToColledge = age >= 18 && age < 25, goToWork = age >=25;
        if (goToKindergarten) {
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в детский сад \n", age);
        } else if (goToSchool) {
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в школу \n", age);
        } else if (goToColledge) {
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в университет \n", age);
        } else if (goToWork) {
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить на работу \n", age);
        }
        System.out.println();
    }
    public static void task5 () {
        System.out.println("Задание 5");
        byte age = 14;
        boolean lessThanFive = age < 5, moreThanFiveAndLessThanFourteen = age >= 5 && age < 14, moreThanFourteen = age >= 14;
        if (lessThanFive) {
            System.out.printf("Если возраст ребенка равен %d, то ему нельзя кататься на аттракционе \n", age);
        } else if (moreThanFiveAndLessThanFourteen) {
            System.out.printf("Если возраст ребенка равен %d, то ему можно кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя \n", age);
        } else if (moreThanFourteen) {
            System.out.printf("Если возраст ребенка равен %d, то ему можно кататься без сопровождения взрослого \n", age);
        }
        System.out.println();
    }
    public static void task6 () {
        System.out.println("Задание 6");
        short occupied = 102;
        boolean stillAvailableSeats = occupied < 60, stillAvailableStandingPlaces = occupied >= 60 && occupied <102;
        if (stillAvailableSeats) {
            System.out.println("В вагоне остались сидячие места");
        } else if (stillAvailableStandingPlaces) {
            System.out.println("В вагоне остались стоячие места");
        } else {
            System.out.println("В вагоне не осталось мест");
        }
        System.out.println();
    }
    public static void task7 () {
        System.out.println("Задание 7");
        int one = 11;
        int two = 12;
        int three = 10;
        if (one > two) {
            if (one > three) {
                System.out.printf("Большее число %d \n", one);
            } else {
                System.out.printf("Большее число %d \n", three);
            }
        } else if (two > three) {
            System.out.printf("Большее число %d \n", two);
        } else {
                System.out.printf("Большее число %d \n", three);
        }
    }
}