public class Main {
    public static void main(String[] args) {
        Cat[] catsArray = new Cat[3];
        Dog dogBobik = new Dog("Бобик");
        Plate somePlate = new Plate();

        catsArray[0] = new Cat("Барсик");
        catsArray[1] = new Cat("Кузя");
        catsArray[2] = new Cat("Лютик");

        catsArray[0].run(40);
        catsArray[0].swim(2);
        dogBobik.run(50);
        dogBobik.swim(8);

        Animal.getAnimalCount();
        Cat.getCatCount();
        Dog.getDogCount();

        System.out.println("Количество еды в тарелке: " + somePlate.getFoodCount());

        for (int i = 0; i < catsArray.length; i++) {
            catsArray[i].eat(somePlate);
            catsArray[i].getHungerInfo();
        }

        somePlate.addFood(2);

        catsArray[2].eat(somePlate);
        catsArray[2].getHungerInfo();
    }
}