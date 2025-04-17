package service;

import model.Admission;
import dao.AdmissionDAO;
import java.util.List;

public class AdmissionService {

    private final AdmissionDAO admissionDAO = new AdmissionDAO();

    public Admission getAdmissionById(int id) {
        return admissionDAO.getAdmissionById(id);
    }

    public List<Admission> getAllAdmissions() {
        return admissionDAO.getAllAdmissions();
    }

    public void addAdmission(Admission admission) {
        // Add business logic/validation if needed
        admissionDAO.addAdmission(admission);
    }

    public void updateAdmission(Admission admission) {
        // Add business logic/validation if needed
        admissionDAO.updateAdmission(admission);
    }

    public void deleteAdmission(int id) {
        // Add business rules if needed
        admissionDAO.deleteAdmission(id);
    }
}