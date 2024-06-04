import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

@Entity
class Rating implements Serializable {
    @Id
    @GeneratedValue
    int id;

    Stars star;

    Date rated;

    @ManyToMany(fetch = FetchType.LAZY)
    Set<Recipe> associatedRecipie;

    @OneToMany(fetch = FetchType.LAZY)
    Set<User> rater;

    public Rating(){

    }

    public Rating(Stars star, Date rated, Set<Recipe> associatedRecipie, Set<User> rater) {
        this.star = star;
        this.rated = rated;
        this.associatedRecipie = associatedRecipie;
        this.rater = rater;
    }
}
