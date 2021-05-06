import animals.Animal;
import aviaryTypes.AviaryType;

import java.util.HashMap;

public class Aviary <X extends Animal> {

    private HashMap <String,X> aviaryWithAnimals = new HashMap<>();
    AviaryType size;

    public Aviary(AviaryType size) {
        this.size = size;
    }

    public void insertAnimal (X animal) {
        if (animal.getAviarySize().ordinal() <= this.size.ordinal()){
            aviaryWithAnimals.put(animal.getName(),animal);
        }
        else {
            System.out.println("Этот вольер не подходит");
        }
    }

    public void delete (X animal){
        aviaryWithAnimals.remove(animal.getName());
    }

    public X getLink (String name){
        return aviaryWithAnimals.get(name);
    }
}
