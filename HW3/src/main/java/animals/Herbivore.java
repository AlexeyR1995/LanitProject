package animals;

import MyExceptions.FoodException;
import food.Food;
import food.Grass;

public abstract class  Herbivore extends Animal {
    @Override
    public void eat(Food food) throws FoodException {
        if (food instanceof Grass) levelOfHungry += food.getSatiety();
        else
            throw  new  FoodException();
            //System.out.println("дайте травоядному овощей!!");
    }
}
