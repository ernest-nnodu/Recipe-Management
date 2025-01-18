package recipes.repository;

import org.springframework.stereotype.Repository;
import recipes.entity.Recipe;

@Repository
public class RecipeRepository {

    private Recipe recipe;

    public void save(Recipe recipe) {
        this.recipe = recipe;
    }
}
