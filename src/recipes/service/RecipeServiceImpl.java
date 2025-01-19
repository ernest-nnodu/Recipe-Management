package recipes.service;

import org.springframework.stereotype.Service;
import recipes.entity.Recipe;
import recipes.repository.RecipeRepository;

@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public int addRecipe(Recipe recipe) {
        return recipeRepository.save(recipe);
    }

    @Override
    public Recipe getRecipe(int id) {
        return recipeRepository.getRecipe(id);
    }
}
