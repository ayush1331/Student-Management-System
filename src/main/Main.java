package main;

import model.Student;
import service.StudentService;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentService studentService = new StudentService();

        System.out.println("--- Add New Student ---");
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Date of Birth (YYYY-MM-DD): ");
        LocalDate dateOfBirth = LocalDate.parse(scanner.nextLine());

        System.out.print("Enter Gender: ");
        String gender = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter Phone Number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        System.out.print("Enter Admission Date (YYYY-MM-DD): ");
        LocalDate admissionDate = LocalDate.parse(scanner.nextLine());
        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        Student newStudent = new Student(
                firstName, lastName, dateOfBirth, gender, email, phoneNumber, address, admissionDate, course
        );
        studentService.addStudent(newStudent);
        System.out.println("Student added successfully: " + newStudent);

        System.out.println("\n--- All Students ---");
        List<Student> allStudents = studentService.getAllStudents();
        if (allStudents.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student student : allStudents) {
                System.out.println(student);
            }
        }

        scanner.close();
    }
}