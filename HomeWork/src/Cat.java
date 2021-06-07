public class Cat extends Animal{

    Cat(String name){
        super(name);
    }

    @Override
    void greets() {
        System.out.println("Meow");
    }
}
