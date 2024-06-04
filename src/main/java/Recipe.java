import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import java.util.Set;

@Entity
class Recipe{
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

    @OneToMany
    Set<Ingredient> ingredients;

    @OneToMany(mappedBy = "recipe")
    Set<Category> categories;

    @ManyToOne(fetch = FetchType.LAZY)
    User creator;

    Date created;
    Date modified;

    public Recipe(){

    }
    public Recipe(String title) {
        this.title = title;
    }
}
