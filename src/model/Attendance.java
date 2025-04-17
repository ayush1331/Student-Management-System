package model;

import java.time.LocalDate;

public class Attendance {
    private int attendanceId;
    private int studentId;
    private LocalDate date;
    private String status;

    // Constructors
    public Attendance() {
    }

    public Attendance(int studentId, LocalDate date, String status) {
        this.studentId = studentId;
        this.date = date;
        this.status = status;
    }

    // Getters and Setters
    public int getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(int attendanceId) {
        this.attendanceId = attendanceId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "attendanceId=" + attendanceId +
                ", studentId=" + studentId +
                ", date=" + date +
                ", status='" + status + '\'' +
                '}';
    }
}