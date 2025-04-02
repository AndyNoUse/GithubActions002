package user;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    @Test
    public void addUser() {
        User user = new User("Svensson", "Lösenord123");
        assertEquals("Svensson", user.getUsername());
        assertEquals("Lösenord123", user.getPassword());
    }

    @Test
    public void addUserFailure() {
        User user = new User("Svensson", "Lösenord123");
        assertEquals("Svensson", user.getUsername());
        assertEquals("Lösenord123", user.getPassword());
    }
    @Test
    public void getUsername() {
        User user = new User("URBAN", "Lösenord123");
        assertEquals("URBAN", user.getUsername());
    }
    @Test
    public void getPassword() {
        User user = new User("URBAN", "SUPERHARDPASSWORD!123");
        assertEquals("SUPERHARDPASSWORD!123", user.getPassword());
    }
    @Test
    public void changePassword() {
        User user = new User("URBAN", "SUPERHARDPASSWORD!123");
        user.changePassword("Lösenord123");
        assertEquals("Lösenord123", user.getPassword());
    }
}
