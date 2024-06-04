import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class Rating {
    @Id
    @GeneratedValue
    int id;

    Stars star;

    Date rated;

    @ManyToMany
    Recipe associatedRecipie;

    @OneToMany
    User rater;

    public Rating(Stars star, Date rated, Recipe associatedRecipie, User rater) {
        this.star = star;
        this.rated = rated;
        this.associatedRecipie = associatedRecipie;
        this.rater = rater;
    }
}
