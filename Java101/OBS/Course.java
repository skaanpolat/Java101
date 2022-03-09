package Java101.OBS;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int vNote;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
        int vnote = 0;
    }

    void addTeacher(Teacher teacher) {
        if(teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
//            printTeacher(teacher);
        }
        else{
            System.out.println("Eğitmen ve ders bölümleri uyuşmuyor!!!");
        }

    }

    void printTeacher(Teacher teacher) {
        this.teacher.print();
    }
}
