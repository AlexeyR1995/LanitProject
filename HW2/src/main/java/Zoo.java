import animals.*;
import food.*;


public class Zoo {
    public static void main(String[] args) {
        Food cabbage = new Cabbage();
        cabbage.setSatiety(2);
        Food pork = new Pork();
        pork.setSatiety(15);
        Duck duck = new Duck();
        Duck duckling = new Duck();
        Fish fish = new Fish();
        Fish tadpole = new Fish();
        Lion lion = new Lion();
        lion.setName("Arnold");
        Elephant elephant = new Elephant();
        elephant.setName("Jambo");
        Worker worker = new Worker();
        worker.setName("Ivan");
        System.out.println(worker.getVoice(elephant));
        worker.feed(elephant, pork);
        worker.feed(elephant, cabbage);
        worker.feed(lion, cabbage);
        worker.feed(lion, pork);
        Swim[] pool = {duck, fish, tadpole, duckling, elephant};
        for (int i = 0; i < 5; i++) {
            pool[i].swim();
        }
    }
}
