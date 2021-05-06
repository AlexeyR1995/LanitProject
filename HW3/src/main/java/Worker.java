import MyExceptions.FoodException;
import animals.Animal;
import animals.Voice;
import food.Food;

public class Worker {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void feed(Animal animal, Food food) throws FoodException {
       try {
           animal.eat(food);
       }
       catch (FoodException e ) {
           System.out.println("ne ta eda!!");
       }
    }

    public String getVoice(Voice animal) {
        return animal.voice();
    }
}
