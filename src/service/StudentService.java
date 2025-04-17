package service;

import model.Student;
import dao.StudentDAO;
import java.util.List;

public class StudentService {

    private final StudentDAO studentDAO = new StudentDAO();

    public Student getStudentById(int id) {
        return studentDAO.getStudentById(id);
    }

    public List<Student> getAllStudents() {
        return studentDAO.getAllStudents();
    }

    public void addStudent(Student student) {
        // You might add validation logic here before calling the DAO
        studentDAO.addStudent(student);
    }

    public void updateStudent(Student student) {
        // You might add validation logic here
        studentDAO.updateStudent(student);
    }

    public void deleteStudent(int id) {
        // You might add business rules here before deleting
        studentDAO.deleteStudent(id);
    }
}