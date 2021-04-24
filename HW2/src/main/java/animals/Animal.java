package animals;


import food.Food;

public abstract class Animal {
    protected int levelOfHungry;

    public int getLevelOfHungry() {
        return levelOfHungry;
    }

    public void setLevelOfHungry(int levelOfHungry) {
        this.levelOfHungry = levelOfHungry;
    }

    public abstract void eat(Food food);
}
