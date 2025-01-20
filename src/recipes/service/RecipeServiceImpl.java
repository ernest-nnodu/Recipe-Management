package recipes.service;

import org.springframework.stereotype.Service;
import recipes.dto.RecipeDTO;
import recipes.entity.Recipe;
import recipes.mapper.RecipeMapper;
import recipes.repository.RecipeRepository;

import java.util.Optional;

@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;
    private final RecipeMapper recipeMapper;

    public RecipeServiceImpl(RecipeRepository recipeRepository, RecipeMapper recipeMapper) {
        this.recipeRepository = recipeRepository;
        this.recipeMapper = recipeMapper;
    }

    @Override
    public long addRecipe(Recipe recipe) {
        return recipeRepository.save(recipe).getId();
    }

    @Override
    public RecipeDTO getRecipe(long id) {
        return recipeRepository.findById(id)
                .map(recipeMapper::recipeToDTO)
                .orElseThrow(IllegalArgumentException::new);
    }

    @Override
    public void deleteRecipe(long id) {
        Optional<Recipe> existingRecipe = recipeRepository.findById(id);

        recipeRepository.delete(existingRecipe
                .orElseThrow(IllegalArgumentException::new));
    }
}
