import jakarta.persistence.*;

import javax.annotation.processing.Generated;
import java.io.Serializable;

@Entity
@Table(name = "categories")
 class Category {

    @Id
    @GeneratedValue
    long id;

    @Column(name = "name", nullable = false)
    String name;

    @ManyToOne
    Recipe recipe;

    public Category() {

    }

    public Category(String name) {
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
