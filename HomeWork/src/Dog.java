public class Dog extends Animal{

    Dog(String name){
        super(name);
    }

    @Override
    void greets() {
        System.out.println("Woof");
    }

    void greets(Dog another) {
        System.out.println("Woooof");
    }
}
