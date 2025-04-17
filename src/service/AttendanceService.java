package service;

import model.Attendance;
import dao.AttendanceDAO;
import java.util.List;

public class AttendanceService {

    private final AttendanceDAO attendanceDAO = new AttendanceDAO();

    public Attendance getAttendanceById(int id) {
        return attendanceDAO.getAttendanceById(id);
    }

    public List<Attendance> getAllAttendance() {
        return attendanceDAO.getAllAttendance();
    }

    public void recordAttendance(Attendance attendance) {
        // Add business logic/validation if needed
        attendanceDAO.recordAttendance(attendance);
    }

    public void updateAttendance(Attendance attendance) {
        // Add business logic/validation if needed
        attendanceDAO.updateAttendance(attendance);
    }

    public void deleteAttendance(int id) {
        // Add business rules if needed
        attendanceDAO.deleteAttendance(id);
    }
}