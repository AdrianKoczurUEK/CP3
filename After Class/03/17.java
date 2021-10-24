import java.util.Arrays;


class StudentGrades{

    String studentName;
    double[] grades;

    StudentGrades(String studentName, double[] grades){
        this.studentName = studentName;
        this.grades=grades;
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
        double[] amandaGrades = {3.5, 4.5, 4.0, 2.0, 5.0, 3.5, 3.5};
        double[] jamesGrades = {2.0, 3.0, 2.0, 4.5, 4.5};
        StudentGrades s1 = new StudentGrades("Amanda",amandaGrades);
        StudentGrades s2 = new StudentGrades("James", jamesGrades);
        s1.displayStudentInfo();
        System.out.println();
        s2.displayStudentInfo();
    }
}
