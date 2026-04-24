/**
 * @author Petra Jovanovic
 * @date Apr 25, 2026
 */
package service;

import java.util.ArrayList;

import model.User;

/**
 * Service class responsible for user-related operations
 * such as registration and login.
 */
public class UserService {
	private ArrayList<User> users= new ArrayList<User>();
	
	/**
     * Registers a new user if the username is not already taken.
     *
     * @param username the username
     * @param password the password
     * @return true if registration successful, false otherwise
     */
    public boolean register(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return false; // user already exists
            }
        }

        users.add(new User(username, password));
        return true;
    }
    
    /**
     * Attempts to log in a user.
     *
     * @param username the username
     * @param password the password
     * @return true if login successful, false otherwise
     */
    public boolean login(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) &&
                user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}
