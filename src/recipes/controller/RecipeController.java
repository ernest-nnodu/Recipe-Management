package recipes.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import recipes.entity.Recipe;
import recipes.service.RecipeService;

@RestController
@RequestMapping("/api/recipe")
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @PostMapping
    public HttpStatus addRecipe(Recipe recipe) {
        recipeService.addRecipe(recipe);
        return HttpStatus.OK;
    }
}
