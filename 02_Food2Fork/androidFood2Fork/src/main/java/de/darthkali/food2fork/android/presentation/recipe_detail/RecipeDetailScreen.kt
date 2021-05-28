package de.darthkali.food2fork.android.presentation.recipe_detail


import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun RecipeDetailScreen(
    recipeId: Int?
) {
    if(recipeId == null){
        Text("ERROR")
    }else{
        Text(text = "RecipeDetailScreen: $recipeId")
    }
}