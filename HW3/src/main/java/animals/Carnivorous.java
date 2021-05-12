package animals;

import MyExceptions.FoodException;
import food.Food;
import food.Meat;

public abstract class Carnivorous extends Animal {
    @Override
    public void eat(Food food) throws FoodException {
        if (food instanceof Meat) levelOfHungry += food.getSatiety();
        else
           throw  new  FoodException();
           // System.out.println("дайте хищнику мяса!!");
    }
}
