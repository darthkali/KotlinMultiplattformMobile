package de.darthkali.food2fork.datasource.network

import de.darthkali.food2fork.domain.model.Recipe

interface RecipeService {

    suspend fun search(
        page: Int,
        query: String,
    ): List<Recipe>


    suspend fun get(
        id: Int,
    ): Recipe
}