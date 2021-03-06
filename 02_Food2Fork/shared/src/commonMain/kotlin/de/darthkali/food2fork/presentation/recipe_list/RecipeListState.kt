package de.darthkali.food2fork.presentation.recipe_list

import de.darthkali.food2fork.domain.model.Recipe

data class RecipeListState(
    val isLoading: Boolean = false,
    val page: Int = 1,
    val query: String = "",
    val selectedCategory: FoodCategory? = null ,
    val recipes: List<Recipe> = listOf(),
)
