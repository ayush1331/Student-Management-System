package service;

import model.User;
import dao.UserDAO;
import java.util.List;

public class UserService {

    private final UserDAO userDAO = new UserDAO();

    public User getUserById(int id) {
        return userDAO.getUserById(id);
    }

    public User getUserByUsername(String username) {
        return userDAO.getUserByUsername(username);
    }

    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    public void addUser(User user) {
        // Add business logic/validation (e.g., check if username exists)
        userDAO.addUser(user);
    }

    public void updateUser(User user) {
        // Add business logic/validation
        userDAO.updateUser(user);
    }

    public void deleteUser(int id) {
        // Add business rules if needed
        userDAO.deleteUser(id);
    }
}