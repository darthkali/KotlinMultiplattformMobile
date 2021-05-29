package de.darthkali.food2fork.android.presentation.recipe_detail


import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import de.darthkali.food2fork.domain.model.Recipe

@Composable
fun RecipeDetailScreen(
    recipe: Recipe?
) {
    if(recipe == null){
        Text("ERROR")
    }else{
        Text(text = "RecipeDetailScreen: ${recipe.title}")
    }
}