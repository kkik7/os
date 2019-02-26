package project.model.user;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


public class UserTest {

    String name;
    String phone;
    String email;
    LocalDate birth;
    User user1, user2;

    @Before
    public void initialize() {

        name = "Pedro";
        phone = "919888777";
        email = "pedro@gmail.com";
        birth = LocalDate.of(1990, 01, 01);

        User user1 = new User();
        user1.setName(name);
        user1.setPhone(phone);
        user1.setEmail(email);
        user1.setBirth(birth);
        User user2 = new User("Ricardo", "923444555", "ricardo@gmail.com", LocalDate.of(1990,02, 01));
    }

    @Test
    public void testGetName() {
        assertEquals(name ,user1.getName());
    }



}
