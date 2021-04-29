package animals;

import food.Food;
import food.Grass;

public abstract class Herbivore extends Animal {
    @Override
    public void eat(Food food) {
        if (food instanceof Grass) levelOfHungry += food.getSatiety();
        else
            System.out.println("дайте травоядному овощей!!");
    }
}
