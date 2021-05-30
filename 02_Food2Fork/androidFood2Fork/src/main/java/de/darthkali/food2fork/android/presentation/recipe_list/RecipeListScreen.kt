package de.darthkali.food2fork.android.presentation.recipe_list

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import de.darthkali.food2fork.android.presentation.recipe_list.components.RecipeCard
import de.darthkali.food2fork.android.presentation.recipe_list.components.RecipeList
import de.darthkali.food2fork.android.presentation.theme.AppTheme
import de.darthkali.food2fork.presentation.recipe_list.RecipeListState


@ExperimentalMaterialApi
@ExperimentalComposeUiApi
@Composable
fun RecipeListScreen(
    state: RecipeListState,
    onClickRecipeListItem: (Int) -> Unit
) {
    AppTheme(displayProgressBar = state.isLoading) {
        RecipeList(loading = state.isLoading,
            recipes = state.recipes,
            onClickRecipeListItem = onClickRecipeListItem)
    }
}