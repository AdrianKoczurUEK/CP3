import java.util.Arrays;
import java.util.Random;


class StudentGrades{

    String studentName;
    double[] grades;

    StudentGrades(String studentName, int numberOfGrades){
        this.studentName = studentName;
        Random randomGrades = new Random();
        this.grades=randomGrades.doubles(numberOfGrades,0,6).toArray();
    }

    int gradeNumber(){
        return this.grades.length;
    }

    double maxGrade(){
        return Arrays.stream(this.grades).max().getAsDouble();
    }

    double minGrade(){
        return Arrays.stream(this.grades).min().getAsDouble();
    }

    double avgGrade(){
        return Arrays.stream(this.grades).average().getAsDouble();
    }

    void displayStudentInfo(){
        System.out.println("Student: "+this.studentName);
        System.out.println("Grades : "+Arrays.toString(grades));
        System.out.println("Min grade: "+minGrade());
        System.out.println("Max grade: "+maxGrade());
        System.out.println("Avearge grade: "+avgGrade());

    }
    
    public static void main(String[] args) {
        StudentGrades s1 = new StudentGrades("Amanda",5);
        StudentGrades s2 = new StudentGrades("James", 2);
        s1.displayStudentInfo();
        System.out.println();
        s2.displayStudentInfo();
        
    }
}
