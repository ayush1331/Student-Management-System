package model;

public class Grade {
    private int gradeId;
    private int studentId;
    private String course;
    private String testName;
    private double marksObtained;
    private double totalMarks;
    private String grade;

    // Constructors
    public Grade() {
    }

    public Grade(int studentId, String course, String testName, double marksObtained, double totalMarks, String grade) {
        this.studentId = studentId;
        this.course = course;
        this.testName = testName;
        this.marksObtained = marksObtained;
        this.totalMarks = totalMarks;
        this.grade = grade;
    }

    // Getters and Setters
    public int getGradeId() {
        return gradeId;
    }

    public void setGradeId(int gradeId) {
        this.gradeId = gradeId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public double getMarksObtained() {
        return marksObtained;
    }

    public void setMarksObtained(double marksObtained) {
        this.marksObtained = marksObtained;
    }

    public double getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(double totalMarks) {
        this.totalMarks = totalMarks;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "gradeId=" + gradeId +
                ", studentId=" + studentId +
                ", course='" + course + '\'' +
                ", testName='" + testName + '\'' +
                ", marksObtained=" + marksObtained +
                ", totalMarks=" + totalMarks +
                ", grade='" + grade + '\'' +
                '}';
    }
}