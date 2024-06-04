import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import javax.annotation.processing.Generated;

@Entity
public class Category {
    @GeneratedValue
    @Id
    int id;

    String name;

    public Category(String name) {
        this.name = name;
    }
}
