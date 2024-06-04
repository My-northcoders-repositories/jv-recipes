import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class Comment {
    @Id
    @GeneratedValue
    int id;

    String text;

    Date posted;

    @ManyToOne
    User author;

    @OneToMany
    Recipe associatedRecipie;

    public Comment(Recipe associatedRecipie, User author, Date posted, String text) {
        this.associatedRecipie = associatedRecipie;
        this.author = author;
        this.posted = posted;
        this.text = text;
    }
}
