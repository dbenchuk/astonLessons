public class Plate {
    private int foodCount;

    public Plate() {
        foodCount = 10;
    }

    public int getFoodCount() {
        return foodCount;
    }

    public void addFood(int count) {
        if (count > 0) {
            foodCount += count;
            System.out.println("В тарелку добавили " + count + " еды.");
        }
    }

    public void takeFood(int count) {
        if (foodCount >= count)
            foodCount -= count;
    }
}