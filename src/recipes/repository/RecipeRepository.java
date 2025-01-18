package recipes.repository;

import org.springframework.stereotype.Repository;
import recipes.entity.Recipe;

import java.util.Map;

@Repository
public class RecipeRepository {

    private final Map<Integer, Recipe> recipes;

    public RecipeRepository(Map<Integer, Recipe> recipes) {
        this.recipes = recipes;
    }


    public void save(Recipe recipe) {
        recipes.put(1, recipe);
    }

    public Recipe getRecipe() {
        return recipes.get(1);
    }
}
