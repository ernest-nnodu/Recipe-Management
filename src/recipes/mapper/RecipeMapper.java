package recipes.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import recipes.dto.RecipeDTO;
import recipes.entity.Recipe;

@Component
public class RecipeMapper {

    private final ModelMapper modelMapper;

    public RecipeMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public RecipeDTO recipeToDTO(Recipe recipe) {
        return modelMapper.map(recipe, RecipeDTO.class);
    }
}
