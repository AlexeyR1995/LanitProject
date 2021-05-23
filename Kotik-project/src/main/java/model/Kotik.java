package model;

import java.util.Random;

public class Kotik {

    final Random random = new Random();
    private String name;
    private double weight;
    private String meow;
    private int prettiness;
    private int distance;
    private int levelOfHungry;
    private static long kotikCount;

    public Kotik() {
        kotikCount++;
    }

    public Kotik(String name, double weight, String meow, int prettiness, int levelOfHungry, int distance) {
        this.name = name;
        this.weight = weight;
        this.meow = meow;
        this.prettiness = prettiness;
        this.distance = distance;
        this.levelOfHungry = levelOfHungry;
        kotikCount++;
    }

    public static long getKotikCount() {
        return kotikCount;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public String getMeow() {
        return meow;
    }

    public int getPrettiness() {
        return prettiness;
    }

    public int getDistance() {
        return distance;
    }


    public void setKotik(int prettiness, double weight, String name, String meow, int levelOfHungry, int distance) {
        this.prettiness = prettiness;
        this.weight = weight;
        this.name = name;
        this.meow = meow;
        this.levelOfHungry = levelOfHungry;
        this.distance = distance;
    }


    public boolean run() {

        if (levelOfHungry > 0) {
            levelOfHungry--;
            distance++;
            System.out.println("котик побегал");
            return true;
        } else {
            System.out.println("котик голоден");
            return false;
        }
    }

    public boolean play() {

        if (levelOfHungry > 0) {
            levelOfHungry--;
            prettiness++;
            System.out.println("котик поиграл");
            return true;
        } else {
            System.out.println("котик голоден");
            return false;
        }
    }

    public boolean sleep() {

        if (levelOfHungry > 0) {
            levelOfHungry--;
            System.out.println("котик поспал");
            return true;
        } else {
            System.out.println("котик голоден");
            return false;
        }
    }

    public boolean chaseMouse() {
        if (levelOfHungry > 0) {
            levelOfHungry--;
            System.out.println("котик догнал мышь");
            return true;
        } else {
            System.out.println("котик голоден");
            return false;
        }
    }

    public boolean meow() {
        if (levelOfHungry > 0) {
            levelOfHungry--;
            switch (random.nextInt(3)) {
                case 0:
                    System.out.println(meow.concat("meow"));
                    break;
                case 1:
                    System.out.println(meow.concat("aaargh"));
                    break;
                case 2:
                    System.out.println(meow.concat("meeeoow"));
                    break;

            }
            return true;
        } else {
            System.out.println("котик голоден");
            return false;
        }
    }

    public int eat(int foodIncome) {
        return levelOfHungry += foodIncome;
    }

    public int eat(int foodIncome, String food) {
        return levelOfHungry += foodIncome;
    }

    public void eat() {
        eat(12, "fish");
    }

    public void liveAnotherDay() {
        for (int i = 0; i < 24; i++) {
            switch (random.nextInt(4)) {
                case 0 -> play();
                case 1 -> chaseMouse();
                case 2 -> sleep();
                case 3 -> meow();
                case 4 -> run();
            }
        }

    }
}
