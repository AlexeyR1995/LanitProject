import model.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik vasya = new Kotik();
        vasya.setKotik(6, 10.2, "vasya", "meeoowo", 0, 11);
        Kotik pyshok = new Kotik("Pyshok", 12.3, "meow", 8, 15, 15);
        pyshok.liveAnotherDay();
        System.out.println(pyshok.getName());
        System.out.println(pyshok.getWeight());
        System.out.println(pyshok.getMeow().equals(vasya.getMeow()));
        System.out.println(Kotik.getKotikCount());
    }
}
