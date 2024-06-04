import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import static java.lang.Boolean.TRUE;
import static org.hibernate.cfg.JdbcSettings.*;


public class RecipeDatabase {
    public static SessionFactory getSessionFactory(){
        // TODO
        var sessionFactory = new Configuration()
                // use H2 in-memory database
                .setProperty(URL, "jdbc:h2:mem:db1")
                .setProperty("hibernate.agroal.maxSize", "20")
                // default username / password
                .setProperty(USER, "sa")
                .setProperty(PASS, "")
                //add entities
                .addAnnotatedClass(Category.class)
                .addAnnotatedClass(Comment.class)
                .addAnnotatedClass(Image.class)
                .addAnnotatedClass(Ingredient.class)
                .addAnnotatedClass(Rating.class)
                .addAnnotatedClass(Recipe.class)
                .addAnnotatedClass(Tag.class)
                .addAnnotatedClass(User.class)
                // options to display SQL in console
                .setProperty(SHOW_SQL, TRUE.toString())
                .setProperty(FORMAT_SQL, TRUE.toString())
                .setProperty(HIGHLIGHT_SQL, TRUE.toString())
                .buildSessionFactory();
        return sessionFactory;
    }

    static void seed(){
        var sessionFactory = getSessionFactory();
        sessionFactory.getSchemaManager().exportMappedObjects(true);
        sessionFactory.inTransaction(session -> {
            session.persist(new Ingredient(500, "Flour", "g"));
            session.flush();
            session.persist(new Recipe("Cake"));
            System.out.println("Hello");
        });
        sessionFactory.inTransaction(session ->{
            Ingredient ingredient = session.find(Ingredient.class, 500);
            System.out.println(ingredient.quantity);
        });

    }
}