package animals;


public class Lion extends Carnivorous implements Run, Voice {
    private String name;
    private int distance;

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
    public String voice() {
        return "ARGHHHHHHH";
    }
}
