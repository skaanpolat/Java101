package Java101.OBS;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    public Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;

        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;

        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;

        }
    }

    void addBulkVnote(int vnote1, int vnote2, int vnote3) {
        if (vnote1 >= 0 && vnote1 <= 100) {
            this.c1.vNote = vnote1;

        }
        if (vnote2 >= 0 && vnote2 <= 100) {
            this.c2.vNote = vnote2;

        }
        if (vnote3 >= 0 && vnote3 <= 100) {
            this.c3.vNote = vnote3;

        }
    }

    void isPass() {
        this.average = ((this.c1.note * 0.6) + (this.c1.vNote * 0.4) + ((this.c2.note * 0.7) + this.c2.vNote * 0.3) + ((this.c3.note * 0.8) + (this.c3.vNote * 0.2))) / (3.0);
        if (this.average > 55) {
            System.out.println("Hababam sınıfı uyanıyor!");

            this.isPass = true;
        } else {
            System.out.println("Hababam sınıfı, sınıfta kaldı!");

            this.isPass = false;
        }
        printNote();
    }

    void printNote() {

        System.out.println(this.c1.name + " notu = " + this.c1.note);
        System.out.println(this.c2.name + " notu = " + this.c2.note);
        System.out.println(this.c3.name + " notu = " + this.c3.note);
        System.out.println();
        System.out.println(this.c1.name +" dersinin sözlü notu : "+this.c1.vNote + " ve ortalamaya etkisi %40");
        System.out.println(this.c2.name +" dersinin sözlü notu : "+this.c2.vNote + " ve ortalamaya etkisi %30");
        System.out.println(this.c3.name +" dersinin sözlü notu : "+this.c3.vNote + " ve ortalamaya etkisi %20");
        System.out.println("Ortalamanız = " + this.average);
        System.out.println("************************************************\n");
    }

}

