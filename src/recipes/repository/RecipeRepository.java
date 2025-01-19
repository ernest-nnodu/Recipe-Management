package recipes.repository;

import org.springframework.stereotype.Repository;
import recipes.entity.Recipe;

import java.util.Map;

@Repository
public class RecipeRepository {

    private final Map<Integer, Recipe> recipes;
    private int currentId;

    public RecipeRepository(Map<Integer, Recipe> recipes) {
        this.recipes = recipes;
        currentId = 0;
    }


    public int save(Recipe recipe) {
        currentId++;
        recipes.put(currentId, recipe);
        return currentId;
    }

    public Recipe getRecipe() {
        return recipes.get(1);
    }
}
