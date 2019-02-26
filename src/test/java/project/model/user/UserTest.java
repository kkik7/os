package project.model.user;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class UserTest {

    String name;
    String phone;
    String email;
    LocalDate birth;
    User user = new User();

    @Test
    public void testGetters() {
        name = "Pedro";
        phone = "919888777";
        email = "pedro@gmail.com";
        birth = LocalDate.of(1990, 01, 01);
        User user1 = new User(name, phone, email, birth);
        assertEquals(name ,user1.getName());
        assertEquals(phone ,user1.getPhone());
        assertEquals(email ,user1.getEmail());
        assertEquals(birth ,user1.getBirth());
    }

    @Test
    public void testSetters() {
        name = "Ricardo";
        phone = "92244455";
        email = "ricardo@gmail.com";
        birth = LocalDate.of(1990, 06, 01);
        user.setName(name);
        user.setPhone(phone);
        user.setEmail(email);
        user.setBirth(birth);
        assertEquals(name ,user.getName());
        assertEquals(phone ,user.getPhone());
        assertEquals(email ,user.getEmail());
        assertEquals(birth ,user.getBirth());
    }



}
