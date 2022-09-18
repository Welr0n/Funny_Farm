import java.util.Map;

public class FarmWorks {
    public static void main(String[] args) {
        Farm funnyFarm = new Farm();

        int workDays = 7;

        funnyFarm.addAnimal(new Cow("Ben", 250));
        funnyFarm.addAnimal(new Pig("Peppa", 90));
        funnyFarm.addAnimal(new Chicken("Rocky", 3));

        System.out.println();

        for (int i = 0; i < workDays; i++) {
            System.out.println("Current day: " + i + "\n");

            funnyFarm.feedAnimals();
            System.out.println();
            funnyFarm.pasture();
            System.out.println();
            funnyFarm.weightingAnimals();
            System.out.println();
        }

        System.out.println("Farm results for " + workDays + " days:");

        for (Map.Entry<String, Float> pair : funnyFarm.getMeatWeight().entrySet()) {
            System.out.println(pair.getKey() + " : " + pair.getValue() + " kg");
        }
    }
}
