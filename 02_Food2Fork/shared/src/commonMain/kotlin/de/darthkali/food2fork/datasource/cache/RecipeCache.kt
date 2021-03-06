package de.darthkali.food2fork.datasource.cache

import de.darthkali.food2fork.domain.model.Recipe

interface RecipeCache {
    fun insert(recipe: Recipe)
    fun insert(recipes: List<Recipe>)
    fun search(query: String, page: Int): List<Recipe>
    fun getAll(page: Int): List<Recipe>
    fun get(recipeId: Int): Recipe?
}