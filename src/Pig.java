public class Pig extends Animals {
    private String name;
    private float weight;
    private String meat = "Pork";

    public Pig(String name, float weight) {
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
        setWeight(getWeight() + 2);
    }

    @Override
    public void poop() {
        if (Math.random()*10 <= 5) {
            setWeight(getWeight() - 1);
            System.out.println(getClass().getName() + " " + getName() + " pooped");
        }
    }

    @Override
    public boolean readyForSlaughter() {
        if (getWeight() >= 100) {
            System.out.println("Pig is in the good condition for slaughtering!");
            return true;
        } else {
            System.out.println("Let the pig grow.");
            return false;
        }
    }
}
