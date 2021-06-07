public class BigDod extends Dog {
    BigDod(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.println("Wooow");
    }

    @Override
    void greets(Dog another) {
        System.out.println("Woooooow");
    }

    void greets(BigDod another) {
        System.out.println("Wooooooooow");
    }
}
