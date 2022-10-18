package ie.atu.week5;

import java.util.Scanner;

public class StudentApp {

    public static void main(String[] args) {
        System.out.println("Please enter student name: ");
        Scanner input = new Scanner(System.in);
         String StuName = input.nextLine();
         Student studentNum = new Student();

        System.out.println("Please enter student email: ");
        String StuEmail = input.nextLine();
        studentNum.setStuEmail(StuEmail);

        System.out.println("Please enter student course: ");
        String StuCourse = input.nextLine();
        studentNum.setStuCourse(StuCourse);

        ///////////////////////////////////////////////////////////

        System.out.println("Please enter second student name: ");
        String StuName2 = input.nextLine();
        Student Student2 = new Student("" + StuName2);

        System.out.println("Please enter second student email: ");
        String StuEmail2 = input.nextLine();
        Student2.setStuEmail(StuEmail2);

        System.out.println("Please enter second student course: ");
        String StuCourse2 = input.nextLine();
        studentNum.setStuCourse(StuCourse2);

///////////////////////////////////////////////////////////////////
        System.out.println("Please enter third student name: ");
        String StuName3 = input.nextLine();

        System.out.println("Please enter third student email: ");
        String StuEmail3 = input.nextLine();

        System.out.println("Please enter third student course: ");
        String StuCourse3 = input.nextLine();

        Student Student3 = new Student(""+StuName3,""+StuEmail3,""+StuCourse3);

        System.out.println("Student 1 details: \n Name: " + studentNum.getStuName());
        System.out.println("Email: " + studentNum.getStuEmail());
        System.out.println("Course: " + studentNum.getStuCourse());
        System.out.println("Student 2 details: \n Name: " + Student2.getStuName());
        System.out.println("Email: " + Student2.getStuEmail());
        System.out.println("Course: " + Student2.getStuCourse());
        System.out.println("Student 3 details: \n Name: " + Student3.getStuName());
        System.out.println("Email: " + Student3.getStuEmail());
        System.out.println("Course: " + Student3.getStuCourse());
    }
}
