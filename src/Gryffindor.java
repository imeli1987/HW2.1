public class Gryffindor extends Hogwarts{

    private String name;
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String  name, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public void studentInfo(){
        System.out.println(this.getName()
                + " студент факультета Гриффиндор; "
                + "сила магии: "
                + this.getMagicPower()
                + "; трансгрессия: "
                + this.getTransgressionDistance()
                + "; благородство: "
                + this.getNobility()
                + "; честь: "
                + this.getHonor()
                + "; храбрость: "
                + this.getBravery()
                + ";");
    }
    public int totalPoints (){
        return this.nobility
                + this.honor
                + this.bravery;
    }

    public static void compareStudents(Gryffindor student1, Gryffindor student2){
        if (student1.totalPoints() > student2.totalPoints()){
            System.out.println(student1.getName()
                    + "(" + student1.totalPoints() + ")"
                    + " лучший Гриффиндорец, чем "
                    + student2.getName()
                    + "(" + student2.totalPoints() + ")");
        } else if (student1.totalPoints() < student2.totalPoints()){
            System.out.println(student2.getName()
                    + "(" + student2.totalPoints() + ")"
                    + " лучший Гриффиндорец, чем "
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
