package recipes.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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
    public Map<String, Integer> addRecipe(@RequestBody Recipe recipe) {
        Map<String, Integer> response = new HashMap<>();
        response.put("id", recipeService.addRecipe(recipe));
      return response;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Recipe> getRecipe(@PathVariable(name = "id") int id) {
        Recipe returnedRecipe = recipeService.getRecipe(id);

        return returnedRecipe == null ? new ResponseEntity<>(HttpStatus.NOT_FOUND) :
                new ResponseEntity<>(returnedRecipe, HttpStatus.OK);
    }
}
