package animals;

import MyExceptions.FoodException;
import aviaryTypes.AviaryType;
import food.Food;

public abstract class Animal {
    protected int levelOfHungry;
    protected String name;
     public AviaryType aviarySize;

    public void setAviarySize(AviaryType aviarySize) {
        this.aviarySize = aviarySize;
    }

    public String getName() {
        return name;
    }

    public AviaryType getAviarySize() {
        return aviarySize;
    }

    public int getLevelOfHungry() {
        return levelOfHungry;
    }

    public void setLevelOfHungry(int levelOfHungry) {
        this.levelOfHungry = levelOfHungry;
    }

    public abstract void eat(Food food) throws FoodException;
}
