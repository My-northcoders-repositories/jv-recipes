import org.hibernate.boot.model.relational.Database;
import org.hibernate.query.Query;

import javax.xml.crypto.Data;
import java.util.List;

public class RecipeRepository {


    /*All recipes with a rating great than some parameter, e.g. Recipe[] findRecipesWithRatingAtLeast(int minRating){}
All recipes that include a given ingredient
All recipes with a given tag
All recipes in a given category*/
    public void getRecipesHigerThan() {
        RecipeDatabase.getSessionFactory().inTransaction(session -> {
            Query query = session.createQuery("FROM RecipeDatabase");
            List<Recipe> recipes = query.list();
            System.out.println(recipes);
            session.flush();
        });
    }
    public void getRecipesHigerThan2() {
        RecipeDatabase.getSessionFactory().inTransaction(session -> {
            Query query = session.createQuery("FROM RecipeDatabase");
            List<Recipe> recipes = query.list();
            System.out.println(recipes);
            session.flush();
        });
    }

}
