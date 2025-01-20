package recipes.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecipeDTO {

    @NotBlank
    private String name;

    @NotBlank
    private String description;

    @Size(min = 1)
    private String[] ingredients;

    @Size(min = 1)
    private String[] directions;
}
