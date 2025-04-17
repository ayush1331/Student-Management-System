package service;

import model.Grade;
import dao.GradeDAO;
import java.util.List;

public class GradeService {

    private final GradeDAO gradeDAO = new GradeDAO();

    public Grade getGradeById(int id) {
        return gradeDAO.getGradeById(id);
    }

    public List<Grade> getAllGrades() {
        return gradeDAO.getAllGrades();
    }

    public void addGrade(Grade grade) {
        // Add business logic/validation if needed (e.g., calculate grade based on marks)
        gradeDAO.addGrade(grade);
    }

    public void updateGrade(Grade grade) {
        // Add business logic/validation if needed
        gradeDAO.updateGrade(grade);
    }

    public void deleteGrade(int id) {
        // Add business rules if needed
        gradeDAO.deleteGrade(id);
    }
}