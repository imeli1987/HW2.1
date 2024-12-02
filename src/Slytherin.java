public class Slytherin extends Hogwarts{

    private String name;
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String name, int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }
    public void studentInfo(){
        System.out.println(this.getName()
                + " студент факультета Слизерин; "
                + "сила магии: "
                + this.getMagicPower()
                + "; трансгрессия: "
                + this.getTransgressionDistance()
                + "; хитрость: "
                + this.getCunning()
                + "; решительность: "
                + this.getDetermination()
                + "; амбициозность: "
                + this.getAmbition()
                + "; находчивость: "
                + this.getResourcefulness()
                + "; жажда власти: "
                + this.getThirstForPower()
                + ";");
    }
    public int totalPoints (){
        return this.cunning
                + this.determination
                + this.ambition
                + this.resourcefulness
                + this.thirstForPower;
    }
    public static void compareStudents(Slytherin student1, Slytherin student2) {
        if (student1.totalPoints() > student2.totalPoints()) {
            System.out.println(student1.getName()
                    + "(" + student1.totalPoints() + ")"
                    + " лучший Слизеринец, чем "
                    + student2.getName()
                    + "(" + student2.totalPoints() + ")");
        } else if (student1.totalPoints() < student2.totalPoints()) {
            System.out.println(student2.getName()
                    + "(" + student2.totalPoints() + ")"
                    + " лучший Слизеринец, чем "
                    + student1.getName()
                    + "(" + student1.totalPoints() + ")");
        } else {
            System.out.println(student1.getName()
                    + "(" + student1.totalPoints() + ")"
                    + " и "
                    + student2.getName()
                    + "(" + student2.totalPoints() + ")"
                    + " равны по силе");
        }
    }
}
