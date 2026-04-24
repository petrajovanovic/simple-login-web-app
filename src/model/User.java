/**
 * @author Petra Jovanovic
 * @date Apr 24, 2026
 */
package model;

/**
 * Represents a system user with basic authentication data.
 */
public class User {
	
	private String username;
	private String password;
	
	public User() {}

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
