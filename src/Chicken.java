public class Chicken extends Animals {
    private String name;
    private float weight;
    private String meat = "Chicken";

    public Chicken(String name, float weight) {
        this.name = name;
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeat() {
        return meat;
    }

    @Override
    public void eat() {
        System.out.println(getClass().getName() + " " + getName() + " eating");
        setWeight(getWeight() + 0.5f);
    }

    @Override
    public void poop() {
        setWeight(getWeight() - 0.2f);
        System.out.println(getClass().getName() + " " + getName() + " pooped");
    }

    @Override
    public boolean readyForSlaughter() {
        if (getWeight() >= 5) {
            System.out.println("Chicken is in the good condition for slaughtering!");
            return true;
        } else {
            System.out.println("Let the chicken grow.");
            return false;
        }
    }
}
