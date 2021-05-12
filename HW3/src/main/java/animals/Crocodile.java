package animals;


import java.util.Objects;

public class Crocodile extends Carnivorous implements Run, Swim, Voice {
    private String name;
    private int distance;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Crocodile crocodile = (Crocodile) o;
        return name.equals(crocodile.name);
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
    public void run() {
        distance++;
    }

    @Override
    public void swim() {
        distance++;
    }

    @Override
    public String voice() {
        return "arghhhh";
    }
}

