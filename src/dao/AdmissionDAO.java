package dao;

import model.Admission;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AdmissionDAO {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/student_management";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "rootX@04";

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }

    public Admission getAdmissionById(int admissionId) {
        // Implement database logic
        return null;
    }

    public List<Admission> getAllAdmissions() {
        // Implement database logic
        return new ArrayList<>();
    }

    public void addAdmission(Admission admission) {
        // Implement database logic
    }

    public void updateAdmission(Admission admission) {
        // Implement database logic
    }

    public void deleteAdmission(int admissionId) {
        // Implement database logic
    }

    private Admission mapResultSetToAdmission(ResultSet rs) throws SQLException {
        Admission admission = new Admission();
        // Implement logic to map ResultSet
        return admission;
    }
}