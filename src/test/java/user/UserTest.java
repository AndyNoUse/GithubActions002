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
        User user = new User("Svensson", "Lösenord1234");
        assertEquals("Svensson", user.getUsername());
        assertEquals("Lösenord123", user.getPassword());
    }
}
