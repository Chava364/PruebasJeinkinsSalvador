import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class EmailValidationTest {

    public boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        return email.matches(emailRegex);
    }

    @Test
    public void testValidEmail() {
        assertTrue(isValidEmail("user@example.com")); // Ejemplo real
    }

    @Test
    public void testInvalidEmail() {
        assertFalse(isValidEmail("user@com")); // Sin dominio válido
    }
}
