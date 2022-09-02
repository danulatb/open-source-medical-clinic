package lk.ijse.dep9.clinic.security;

public class User {

    private String username;
    private UserRole role;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }


    public User(String username, UserRole role) {
        this.username = username;
        this.role = role;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", role=" + role +
                '}';
    }
}
