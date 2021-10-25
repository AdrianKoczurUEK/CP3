import java.util.Arrays;
import java.util.Scanner;


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
        Scanner scanner = new Scanner(System.in); //define scanner
        System.out.println("How many grades?");
        int numOfGrades = scanner.nextInt();    //read how many grades to input
        double[] grades = new double[numOfGrades];        //create new double array in order to store grades
        for(int i=0;i<numOfGrades;i++){            //loop reading line, numOfGrades times
            System.out.println("Enter your grade: ");
            grades[i]=scanner.nextDouble();
        }
        StudentGrades s1 = new StudentGrades("Adam",grades);
        s1.displayStudentInfo();
        
    }
}
