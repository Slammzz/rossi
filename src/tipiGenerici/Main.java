package tipiGenerici;

public class Main {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>(5);
        System.out.println(box.get());
        System.out.println(box.toString());
        System.out.println(box.tipo());
        System.out.println(Box.verificaTipo(box));
    }
}
