public abstract class Animals {
    private String name;
    private float weight;
    private String meat;

    public abstract void eat();
    public abstract void poop();
    public abstract boolean readyForSlaughter();

    public float getWeight() {
        return weight;
    }

    public String getMeat() {
        return meat;
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
}
