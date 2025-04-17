package dao;

import model.Student;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/student_management";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "rootX@04";

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }

    public Student getStudentById(int studentId) {
        Student student = null;
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM Students WHERE student_id = ?")) {
            pstmt.setInt(1, studentId);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                student = mapResultSetToStudent(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return student;
    }

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM Students")) {
            while (rs.next()) {
                students.add(mapResultSetToStudent(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }

    public void addStudent(Student student) {
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(
                     "INSERT INTO Students (first_name, last_name, date_of_birth, gender, email, phone_number, address, admission_date, course) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)")) {
            pstmt.setString(1, student.getFirstName());
            pstmt.setString(2, student.getLastName());
            pstmt.setDate(3, Date.valueOf(student.getDateOfBirth()));
            pstmt.setString(4, student.getGender());
            pstmt.setString(5, student.getEmail());
            pstmt.setString(6, student.getPhoneNumber());
            pstmt.setString(7, student.getAddress());
            pstmt.setDate(8, Date.valueOf(student.getAdmissionDate()));
            pstmt.setString(9, student.getCourse());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateStudent(Student student) {
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(
                     "UPDATE Students SET first_name = ?, last_name = ?, date_of_birth = ?, gender = ?, email = ?, phone_number = ?, address = ?, admission_date = ?, course = ? WHERE student_id = ?")) {
            pstmt.setString(1, student.getFirstName());
            pstmt.setString(2, student.getLastName());
            pstmt.setDate(3, Date.valueOf(student.getDateOfBirth()));
            pstmt.setString(4, student.getGender());
            pstmt.setString(5, student.getEmail());
            pstmt.setString(6, student.getPhoneNumber());
            pstmt.setString(7, student.getAddress());
            pstmt.setDate(8, Date.valueOf(student.getAdmissionDate()));
            pstmt.setString(9, student.getCourse());
            pstmt.setInt(10, student.getStudentId());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteStudent(int studentId) {
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement("DELETE FROM Students WHERE student_id = ?")) {
            pstmt.setInt(1, studentId);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Student mapResultSetToStudent(ResultSet rs) throws SQLException {
        Student student = new Student();
        student.setStudentId(rs.getInt("student_id"));
        student.setFirstName(rs.getString("first_name"));
        student.setLastName(rs.getString("last_name"));
        student.setDateOfBirth(rs.getDate("date_of_birth").toLocalDate());
        student.setGender(rs.getString("gender"));
        student.setEmail(rs.getString("email"));
        student.setPhoneNumber(rs.getString("phone_number"));
        student.setAddress(rs.getString("address"));
        student.setAdmissionDate(rs.getDate("admission_date").toLocalDate());
        student.setCourse(rs.getString("course"));
        return student;
    }
}