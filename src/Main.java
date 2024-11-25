public class Main {

    public static void compareStudents(Hogwarts student1, Hogwarts student2) {
        if (student1.getMagycPower() > student2.getMagycPower()) {
            System.out.println(student1.getName()
                    + "(" + student1.getMagycPower() + ")"
                    + " лучший ученик, чем "
                    + student2.getName()
                    + "(" + student2.getMagycPower() + ")");
        } else if (student1.getMagycPower() < student2.getMagycPower()) {
            System.out.println(student2.getName()
                    + "(" + student2.getMagycPower() + ")"
                    + " лучший ученик, чем "
                    + student1.getName()
                    + "(" + student1.getMagycPower() + ")");
        } else if (student1.getMagycPower() == student2.getMagycPower()){
            System.out.println(student1.getName()
                    + "(" + student1.getMagycPower() + ")"
                    + " и "
                    + student2.getName()
                    + "(" + student1.getMagycPower() + ")"
                    + " одинаково хорошие ученики");
        }
    }

    public static void main(String[] args) {

        Gryffindor harry = new Gryffindor("Гарри Поттер", 90, 80, 90, 90, 90);
        Gryffindor ron = new Gryffindor("Рон Уизли", 70, 80, 90, 50, 60);
        Gryffindor hermione = new Gryffindor("Гермиона Грейнджер",80, 80, 90, 40, 60);

        Ravenclaw cho = new Ravenclaw("Чжоу Чанг", 20, 30,90, 80, 90, 50);
        Ravenclaw padma = new Ravenclaw("Падма Патил", 90, 80, 90, 50, 80, 70);
        Ravenclaw markus = new Ravenclaw("Маркус Белби", 90, 80, 90, 50, 60, 70);

        Slytherin draco = new Slytherin("Драко Малфой", 90, 80, 90, 80, 60, 70, 80);
        Slytherin graham = new Slytherin("Грэхэм Монтегю", 90, 80, 90, 50, 60, 70, 80);
        Slytherin goyle = new Slytherin("Грегори Гойл", 90, 80, 90, 60, 60, 70, 80);

        Hufflepuff zachariah = new Hufflepuff("Захария Смит", 90, 80, 90, 50, 90);
        Hufflepuff sedrik = new Hufflepuff("Седрик Диггори", 90, 80, 90, 50, 60);
        Hufflepuff justin = new Hufflepuff("Джастин Финч-Флетчли", 90, 80, 100, 50, 60);

        Gryffindor.compareStudents(harry, ron);
        System.out.println();
        ron.setTransgressionDistance(100);
        ron.setMagicPower(70);
        compareStudents(ron, draco);
//        Gryffindor.compareStudents(ron, harry);
//        Gryffindor.compareStudents(hermione, ron);
//        Gryffindor.compareStudents(hermione, harry)
//        Slytherin.compareStudents(draco, graham);
//        Slytherin.compareStudents(goyle, graham);
//        Slytherin.compareStudents(draco, goyle);
//        Slytherin.compareStudents(goyle, draco);
//        Ravenclaw.compareStudents(cho, padma);
//        Ravenclaw.compareStudents(padma, markus);
//        Ravenclaw.compareStudents(cho, markus);
//        Ravenclaw.compareStudents(markus, cho);

//        Hufflepuff.compareStudents(zachariah, sedrik);
//        Hufflepuff.compareStudents(sedrik, justin);
//        Hufflepuff.compareStudents(justin, sedrik);
//        Hufflepuff.compareStudents(justin, zachariah);

//        System.out.println(harry.getMagicPower());
//        harry.studentInfo();
//        ron.studentInfo();
//        hermione.studentInfo();
//        System.out.println();
//        draco.studentInfo();
//        graham.studentInfo();
//        goyle.studentInfo();
//        System.out.println();
//        zachariah.studentInfo();
//        sedrik.studentInfo();
//        justin.studentInfo();
//        System.out.println();
//        cho.studentInfo();
//        padma.studentInfo();
//        markus.studentInfo();



    }
}