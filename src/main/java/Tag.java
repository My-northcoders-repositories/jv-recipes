import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
class Tag {
    @Id
    @GeneratedValue
    int id;

    String name;

    public Tag(){

    }
    public Tag(String name) {
        this.name = name;
    }
}
