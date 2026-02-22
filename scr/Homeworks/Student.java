package Homeworks;

public class Student {

    double mathGrade;
    double bioGrade;
    double langGrade;
    String name;
    String surname;
    int ticketNum;

    Student(String studentName, String studentSurname, int numOfStudentTicket, double bio, double math, double lang){

        name = studentName;
        surname = studentSurname;
        ticketNum = numOfStudentTicket;
        langGrade = lang;
        mathGrade = math;
        bioGrade = bio;

    }

    double calcAverageGrade(Student st){

        double averageGradeValue = (st.langGrade + st.mathGrade + st.bioGrade) / 3;
        return averageGradeValue;

    }

    void showInfo(Student st){

        System.out.println("Number of ticket: " + st.ticketNum);
        System.out.println("Student info: " + st.name + " " + st.surname);
        System.out.println("Average arithmetic grade: " + calcAverageGrade(st));

    }

}

class StudentTest {

    public static void main(String[] args) {

        Student myStudent = new Student("Pavel", "Novikevich", 17, 8, 7, 8);
        myStudent.showInfo(myStudent);

    }

}