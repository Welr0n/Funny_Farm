import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Farm {
    private ArrayList<Animals> listAnimals;
    private Map<String, Float> meatWeight;

    public Farm() {
        this.listAnimals = new ArrayList<>();
        this.meatWeight = new HashMap<>();

        System.out.println("Welcome to Funny Farm! \n");
    }

    public ArrayList<Animals> getListAnimals() {
        return listAnimals;
    }

    public void setListAnimals(ArrayList<Animals> listAnimals) {
        this.listAnimals = listAnimals;
    }

    public Map<String, Float> getMeatWeight() {
        return meatWeight;
    }

    public void setMeatWeight(HashMap<String, Float> meatWeight) {
        this.meatWeight = meatWeight;
    }

    public void feedAnimals() {
        System.out.println("Time to feed the animals:");

        for (Animals animal:
                listAnimals) {
            animal.eat();
        }
    }

    public void pasture() {
        System.out.println("Animals on pasture:");

        for (Animals animal:
                listAnimals) {
            animal.poop();
        }
    }

    public void weightingAnimals() {
        ArrayList<Animals> listSlaughter = new ArrayList<>();

        for (Animals animal:
             listAnimals) {
            System.out.println("Weighting the " + animal.getName() + "." + " The " + animal.getName() + " weighs " + animal.getWeight() + " kg");

            if (animal.readyForSlaughter()) {
                listSlaughter.add(animal);
            }
        }

        for (Animals animal: listSlaughter) {
            slaughter(animal);
        }
    }

    public void addAnimal(Animals animal) {
        listAnimals.add(animal);
        System.out.println("The farm has a new animal - " + animal.getClass().getName() + " " + animal.getName());
    }

    public void slaughter(Animals animal) {
        String meat = animal.getMeat();
        float curMeat = animal.getWeight();

        if (!getMeatWeight().isEmpty()) {
            if (meatWeight.containsKey(meat)) {
                curMeat = curMeat + meatWeight.get(meat);
                meatWeight.put(meat, curMeat);
            } else {
                meatWeight.put(meat, animal.getWeight());
            }
        } else {
            meatWeight.put(meat, animal.getWeight());
        }

        listAnimals.remove(animal);

        System.out.println("\n" + animal.getName() + " was slaughtered. :(");
        System.out.println(meat + " stocks are now " + curMeat + " kg");
    }
}
