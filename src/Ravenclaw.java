public class Ravenclaw extends Hogwarts{

    private String name;
    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    public Ravenclaw(String name, int magicPower, int transgressionDistance, int smart, int wise, int witty, int creativity) {
        super(magicPower, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
    public void studentInfo(){
        System.out.println(this.getName()
                + " студент факультета Слизерин; "
                + "сила магии: "
                + this.getMagicPower()
                + "; трансгрессия: "
                + this.getTransgressionDistance()
                + "; ум: "
                + this.getSmart()
                + "; мудрость: "
                + this.getWise()
                + "; остроумие: "
                + this.getWitty()
                + "; творчество: "
                + this.getCreativity()
                + ";");
    }
    public int totalPoints (){
        return this.smart
                + this.wise
                + this.witty
                + this.creativity;
    }
    public static void compareStudents(Ravenclaw student1, Ravenclaw student2) {
        if (student1.totalPoints() > student2.totalPoints()) {
            System.out.println(student1.getName()
                    + "(" + student1.totalPoints() + ")"
                    + " лучший Когтевранец, чем "
                    + student2.getName()
                    + "(" + student2.totalPoints() + ")");
        } else if (student1.totalPoints() < student2.totalPoints()) {
            System.out.println(student2.getName()
                    + "(" + student2.totalPoints() + ")"
                    + " лучший Когтевранец, чем "
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
