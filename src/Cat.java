public class Cat extends Animal {
    private static int catCount = 0;
    private boolean isHungry;
    private int foodPortion;

    public Cat(String name) {
        this.name = name;
        this.maxRunDistance = 200;
        this.isHungry = true;
        this.foodPortion = 4;
        catCount++;
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public static void getCatCount() {
        System.out.println("Количество котов: " + catCount);
    }

    public void eat(Plate somePlate) {
        if (somePlate.getFoodCount() - foodPortion >= 0) {
            somePlate.takeFood(foodPortion);
            isHungry = false;
            System.out.println("Кот " + name + " съел(а) " + foodPortion + " еды.");
            System.out.println("В тарелке осталось: " + somePlate.getFoodCount() + " еды.");
        } else
            System.out.println("Коту " + name + " не хватило еды.");
    }

    public void getHungerInfo() {
        String str = isHungry == false ? "Кот " + name + " сыт." : "Кот " + name + " голоден.";
        System.out.println(str);
    }
}