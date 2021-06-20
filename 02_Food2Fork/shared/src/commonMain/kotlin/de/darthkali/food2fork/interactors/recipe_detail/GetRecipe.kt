package de.darthkali.food2fork.interactors.recipe_detail

import de.darthkali.food2fork.datasource.cache.RecipeCache
import de.darthkali.food2fork.datasource.network.RecipeService
import de.darthkali.food2fork.domain.model.Recipe
import de.darthkali.food2fork.domain.util.DataState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GetRecipe(
    private val recipeCache: RecipeCache,
) {
    fun execute(
        recipeId: Int,

        ): Flow<DataState<Recipe>> = flow {
        emit(DataState.loading())

        try {
            val recipe = recipeCache.get(recipeId)
            emit(DataState.data(data = recipe))
        } catch (e: Exception) {
            emit(DataState.error<Recipe>(message = e.message ?: "Unknown error"))
        }
    }
}