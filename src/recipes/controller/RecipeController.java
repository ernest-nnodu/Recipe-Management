package recipes.controller;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import recipes.dto.RecipeDTO;
import recipes.entity.Recipe;
import recipes.service.RecipeService;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/recipe")
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @PostMapping("/new")
    public Map<String, Long> addRecipe(@Valid @RequestBody Recipe recipe) {
        Map<String, Long> response = new HashMap<>();
        response.put("id", recipeService.addRecipe(recipe));
      return response;
    }

    @GetMapping("/{id}")
    public RecipeDTO getRecipe(@PathVariable(name = "id") long id) {
        return recipeService.getRecipe(id);
    }
}
