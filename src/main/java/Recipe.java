import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.sql.Date;
import java.util.List;
import java.util.Set;

@Entity
public class Recipe {
    @Id
    long id;

    String title;
    String description;
    String instructions;
    int preparationTime;
    int cookingTime;
    int servings;
    DifficultyLevel difficultyLevel;
    Rating rating;
    Set<Ingredient> ingredients;
    Set<Category> categories;

    @ManyToOne(fetch = FetchType.LAZY)
    User creator;

    Date created;
    Date modified;

    public Recipe(String title) {
        this.title = title;
    }
}
