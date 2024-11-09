public class Dog extends Animal {
    private static int dogCount = 0;

    public Dog(String name) {
        this.name = name;
        this.maxRunDistance = 500;
        this.maxSwimDistance = 10;
        dogCount++;
    }

    public static void getDogCount() {
        System.out.println("Количество собак: " + dogCount);
    }
}