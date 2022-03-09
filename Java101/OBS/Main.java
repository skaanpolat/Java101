package Java101.OBS;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "+90 555 55 55", "TRH");
        Teacher t2 = new Teacher("Graham Bell", "539", "FZK");
        Teacher t3 = new Teacher("Külyutmaz", "850", "BIO");


        Course tarih = new Course("Tarih", "101", "TRH");
        Course fizik = new Course("Fizik", "102", "FZK");
        Course biyoloji = new Course("Biyoloji", "103", "BIO");


        tarih.addTeacher(t1);
        fizik.addTeacher(t2);
        biyoloji.addTeacher(t3);


        Student s1 = new Student("İnek Şaban", "123", "4", tarih, fizik, biyoloji);
        Student s2 = new Student("Güdük Necmi", "456", "4", tarih, fizik, biyoloji);
        Student s3 = new Student("Tulum Hayri", "789", "4", tarih, fizik, biyoloji);


        s1.addBulkExamNote(90, 78, 50);
        s1.addBulkVnote(60,70,66);
        s1.isPass();

        s2.addBulkExamNote(100, 30, 70);
        s2.addBulkVnote(2,45,58);
        s2.isPass();

        s3.addBulkExamNote(45, 74, 20);
        s3.addBulkVnote(91,86,95);
        s3.isPass();

    }
}
