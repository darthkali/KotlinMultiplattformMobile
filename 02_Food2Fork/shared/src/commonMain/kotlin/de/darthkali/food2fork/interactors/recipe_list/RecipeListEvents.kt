package de.darthkali.food2fork.interactors.recipe_list

sealed class RecipeListEvents {

    object LoadRecipes : RecipeListEvents()

    object NextPage: RecipeListEvents()
}