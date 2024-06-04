import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Date;
import java.util.List;


@Entity
@Table(name="User")
public class User {

    @Id
    @GeneratedValue
    int id;

    String username;

    String email;

    String password;

    List<Role> roles;

    Date registered;

    public User(String username) {
        this.username = username;
    }
}
