import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Date;

@Entity
class Comment{
    @Id
    @GeneratedValue
    long id;

    String text;

    Date posted;

    @ManyToOne(fetch = FetchType.LAZY)
    User author;

    @ManyToOne(fetch = FetchType.LAZY)
    Recipe associatedRecipe;

    public Comment(){

    }

    public Comment(Recipe associatedRecipie, User author, Date posted, String text) {
        this.associatedRecipe = associatedRecipie;
        this.author = author;
        this.posted = posted;
        this.text = text;
    }
}
