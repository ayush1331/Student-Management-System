package model;

import java.time.LocalDate;

public class Admission {
    private int admissionId;
    private int studentId;
    private LocalDate admissionDate;
    private String course;
    private double feePaid;

    // Constructors
    public Admission() {
    }

    public Admission(int studentId, LocalDate admissionDate, String course, double feePaid) {
        this.studentId = studentId;
        this.admissionDate = admissionDate;
        this.course = course;
        this.feePaid = feePaid;
    }

    // Getters and Setters
    public int getAdmissionId() {
        return admissionId;
    }

    public void setAdmissionId(int admissionId) {
        this.admissionId = admissionId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public LocalDate getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(LocalDate admissionDate) {
        this.admissionDate = admissionDate;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getFeePaid() {
        return feePaid;
    }

    public void setFeePaid(double feePaid) {
        this.feePaid = feePaid;
    }

    @Override
    public String toString() {
        return "Admission{" +
                "admissionId=" + admissionId +
                ", studentId=" + studentId +
                ", admissionDate=" + admissionDate +
                ", course='" + course + '\'' +
                ", feePaid=" + feePaid +
                '}';
    }
}