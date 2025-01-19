package recipes.service;

import recipes.entity.Recipe;

public interface RecipeService {
    int addRecipe(Recipe recipe);

    Recipe getRecipe(int id);
}
