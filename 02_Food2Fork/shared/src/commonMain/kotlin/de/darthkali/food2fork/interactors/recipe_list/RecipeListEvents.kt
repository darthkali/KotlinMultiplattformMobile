package de.darthkali.food2fork.interactors.recipe_list

import de.darthkali.food2fork.presentation.recipe_list.FoodCategory

sealed class RecipeListEvents {

    object LoadRecipes : RecipeListEvents()

    object NextPage : RecipeListEvents()

    object NewSearch : RecipeListEvents()

    data class OnUpdateQuery(val query: String): RecipeListEvents()

    data class OnSelectedCategory(val category: FoodCategory): RecipeListEvents()
}