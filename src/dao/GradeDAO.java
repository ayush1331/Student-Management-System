package dao;

import model.Grade;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GradeDAO {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/student_management";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "rootX@04";

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }

    public Grade getGradeById(int gradeId) {
        // Implement database logic
        return null;
    }

    public List<Grade> getAllGrades() {
        // Implement database logic
        return new ArrayList<>();
    }

    public void addGrade(Grade grade) {
        // Implement database logic
    }

    public void updateGrade(Grade grade) {
        // Implement database logic
    }

    public void deleteGrade(int gradeId) {
        // Implement database logic
    }

    private Grade mapResultSetToGrade(ResultSet rs) throws SQLException {
        Grade grade = new Grade();
        // Implement logic to map ResultSet
        return grade;
    }
}