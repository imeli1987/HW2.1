public class Hogwarts {

    private int magicPower;
    private int transgressionDistance;
    private String name;

    public Hogwarts(int magicPower, int transgressionDistance) {
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }
    public String getName() {
        return name;
    }
    public int getMagycPower() {
        return magicPower + transgressionDistance;
    }
    public int getMagicPower() {
        return magicPower;
    }
    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }
    public int getTransgressionDistance() {
        return transgressionDistance;
    }
    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }
}
