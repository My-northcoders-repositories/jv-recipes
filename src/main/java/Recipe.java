import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.sql.Date;
import java.util.List;

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
    List<Ingredient> ingredientsList;
    List<Category> categoriesList;

    @ManyToOne
    User creator;

    Date created;
    Date modified;

    public Recipe(String title) {
        this.title = title;
    }
}
