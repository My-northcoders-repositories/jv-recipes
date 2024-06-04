public class Main {
    public static void main(String[] args) {
        RecipeDatabase.getSessionFactory().getSchemaManager().exportMappedObjects(true);

//        RecipeRepository reciperepo = new RecipeRepository();
//        reciperepo.getRecipesHigerThan();


    }
}
