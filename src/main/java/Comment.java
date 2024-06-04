import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class Comment {
    @Id
    @GeneratedValue
    long id;

    String text;

    Date posted;

    @ManyToOne(fetch = FetchType.LAZY)
    User author;

    @ManyToOne(fetch = FetchType.LAZY)
    Recipe associatedRecipie;

    public Comment(Recipe associatedRecipie, User author, Date posted, String text) {
        this.associatedRecipie = associatedRecipie;
        this.author = author;
        this.posted = posted;
        this.text = text;
    }
}
