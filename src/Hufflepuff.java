public class Hufflepuff extends Hogwarts {

    private String name;
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, int magicPower, int transgressionDistance, int hardworking, int loyal, int honest) {
        super(magicPower, transgressionDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    public void studentInfo() {
        System.out.println(this.getName()
                + " студент факультета Слизерин; "
                + "сила магии: "
                + this.getMagicPower()
                + "; трансгрессия: "
                + this.getTransgressionDistance()
                + "; трудолюбие: "
                + this.getHardworking()
                + "; верность: "
                + this.getLoyal()
                + "; честность: "
                + this.getHonest()
                + ";");
    }
    public int totalPoints (){
        return this.hardworking
                + this.loyal
                + this.honest;
    }
    public static void compareStudents(Hufflepuff student1, Hufflepuff student2) {
        if (student1.totalPoints() > student2.totalPoints()) {
            System.out.println(student1.getName()
                    + "(" + student1.totalPoints() + ")"
                    + " лучший Пуффендуец, чем "
                    + student2.getName()
                    + "(" + student2.totalPoints() + ")");
        } else if (student1.totalPoints() < student2.totalPoints()) {
            System.out.println(student2.getName()
                    + "(" + student2.totalPoints() + ")"
                    + " лучший Пуффендуец, чем "
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