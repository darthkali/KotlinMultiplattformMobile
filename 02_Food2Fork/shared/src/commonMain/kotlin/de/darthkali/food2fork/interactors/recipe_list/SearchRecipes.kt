package de.darthkali.food2fork.interactors.recipe_list

import de.darthkali.food2fork.datasource.network.RecipeService
import de.darthkali.food2fork.domain.model.Recipe
import de.darthkali.food2fork.domain.util.DataState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class SearchRecipes(
    private val recipeService: RecipeService,
) {
    fun execute(
        page: Int,
        query: String,
    ): Flow<DataState<List<Recipe>>> = flow {

        emit(DataState.loading())

        try {
            val recipes = recipeService.search(
                page = page,
                query = query
            )
            emit(DataState.data(data = recipes))
        } catch (e: Exception) {
            emit(DataState.error<List<Recipe>>(message = e.message?: "Unknown Error"))
        }
    }
}