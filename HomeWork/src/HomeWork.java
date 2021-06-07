public class HomeWork {
    public static void main(String[] args) {
        Cat cat = new Cat("Nikol");
        cat.greets();

        Dog dog = new Dog("Chalo");
        dog.greets();
        Dog another = new Dog("Mariam");
        dog.greets(another);

        BigDod bigDod = new BigDod("Ashotik");
        bigDod.greets();
        bigDod.greets(another);
        BigDod anotherBigDog = new BigDod("Anna");
        bigDod.greets(anotherBigDog);
    }
}
