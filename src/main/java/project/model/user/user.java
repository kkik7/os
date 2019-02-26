package project.model.user;

import com.sun.jndi.cosnaming.IiopUrl;
import com.sun.xml.internal.ws.wsdl.writer.document.http.Address;

import java.time.LocalDate;
import java.util.List;

public class User {

    private String name;
    private String phone;
    private String email;
    private LocalDate birth;


    public User(String name, String phone, String email, LocalDate birth) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.birth = birth;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }
}
