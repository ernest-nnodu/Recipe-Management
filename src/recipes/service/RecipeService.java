package recipes.service;

import recipes.dto.RecipeDTO;
import recipes.entity.Recipe;

public interface RecipeService {
    long addRecipe(Recipe recipe);

    RecipeDTO getRecipe(long id);
}
