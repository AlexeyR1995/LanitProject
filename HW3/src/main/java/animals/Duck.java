package animals;


import java.util.Objects;

public class Duck extends Herbivore implements Swim, Run, Fly, Voice {
    private String name;
    private int distance;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Duck duck = (Duck) o;
        return name.equals(duck.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public void fly() {
        distance++;

    }

    @Override
    public void run() {
        distance++;

    }

    @Override
    public void swim() {
        distance++;

    }

    @Override
    public String voice() {
        return "Wooahh";
    }
}
