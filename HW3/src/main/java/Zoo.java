import MyExceptions.FoodException;
import animals.*;
import aviaryTypes.AviaryType;
import food.*;


public class Zoo {
    public static void main(String[] args) throws FoodException {
        Food cabbage = new Cabbage();
        cabbage.setSatiety(2);
        Food pork = new Pork();
        pork.setSatiety(15);
        Duck duck = new Duck();
        duck.setAviarySize(AviaryType.MEDIUM);
        Duck duckling = new Duck();
        duckling.setAviarySize(AviaryType.SMALL);
        Fish fish = new Fish();
        Fish tadpole = new Fish();
        Lion lion = new Lion();
        lion.setAviarySize(AviaryType.BIG);
        lion.setName("Arnold");
        Elephant elephant = new Elephant();
        elephant.setAviarySize(AviaryType.VERY_BIG);
        elephant.setName("Jambo");
        Elephant elephantKid = new Elephant();
        elephantKid.setName("Jorj");
        elephantKid.setAviarySize(AviaryType.BIG);
        Worker worker = new Worker();
        worker.setName("Ivan");
        Aviary <Carnivorous> carnivoreAviary = new Aviary<>(AviaryType.VERY_BIG);
        Aviary <Herbivore> herbivoreAviary = new Aviary<>(AviaryType.BIG);
        System.out.println(worker.getVoice(elephant));
        worker.feed(elephant, pork);
        worker.feed(elephant, cabbage);
        worker.feed(lion, cabbage);
        worker.feed(lion, pork);
        Swim[] pool = {duck, fish, tadpole, duckling, elephant};
        for (int i = 0; i < 5; i++) {
            pool[i].swim();
        }
        carnivoreAviary.insertAnimal(lion);
        herbivoreAviary.insertAnimal(elephant);
        herbivoreAviary.insertAnimal(elephantKid);
        System.out.println(carnivoreAviary.getLink("Arnold"));
        System.out.println(herbivoreAviary.getLink("Jambo"));
        System.out.println(herbivoreAviary.getLink("Jorj"));
        carnivoreAviary.delete(lion);
        System.out.println(carnivoreAviary.getLink("Arnold"));
    }
}
