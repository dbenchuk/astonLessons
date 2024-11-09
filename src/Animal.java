public class Animal {
    protected String name;
    protected int maxRunDistance;
    protected int maxSwimDistance;
    private static int animalCount = 0;

    public Animal() {
        animalCount++;
    }

    public void run(int distance) {
        if (distance > 0 && distance <= maxRunDistance)
            System.out.println(name + " пробежал(а) " + distance + " м.");
        else if (distance > maxRunDistance)
            System.out.println(name + " не может пробежать больше " + maxRunDistance + " м.");
        else
            System.out.println("Дистанция не может быть отрицательной или равной нулю.");
    }

    public void swim(int distance) {
        if (distance > 0 && distance <= maxSwimDistance)
            System.out.println(name + " проплыл(а) " + distance + " м.");
        else if (distance > maxSwimDistance)
            System.out.println(name + " не может проплыть больше " + maxSwimDistance + " м.");
        else
            System.out.println("Дистанция не может быть отрицательной или равной нулю.");
    }

    public static void getAnimalCount() {
        System.out.println("Количество животных: " + animalCount);
    }
}