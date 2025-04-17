package dao;

import model.Attendance;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AttendanceDAO {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/student_management";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "rootX@04";

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }

    public Attendance getAttendanceById(int attendanceId) {
        // Implement database logic
        return null;
    }

    public List<Attendance> getAllAttendance() {
        // Implement database logic
        return new ArrayList<>();
    }

    public void recordAttendance(Attendance attendance) {
        // Implement database logic
    }

    public void updateAttendance(Attendance attendance) {
        // Implement database logic
    }

    public void deleteAttendance(int attendanceId) {
        // Implement database logic
    }

    private Attendance mapResultSetToAttendance(ResultSet rs) throws SQLException {
        Attendance attendance = new Attendance();
        // Implement logic to map ResultSet
        return attendance;
    }
}