package animals;

import food.Food;
import food.Meat;

public abstract class Carnivorous extends Animal {
    @Override
    public void eat(Food food) {
        if (food instanceof Meat) levelOfHungry += food.getSatiety();
        else
            System.out.println("дайте хищнику мяса!!");
    }
}
