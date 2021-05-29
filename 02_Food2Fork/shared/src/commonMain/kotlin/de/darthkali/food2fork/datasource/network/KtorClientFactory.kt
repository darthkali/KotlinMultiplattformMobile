package de.darthkali.food2fork.datasource.network

import de.darthkali.food2fork.datasource.network.model.RecipeDTO
import de.darthkali.food2fork.domain.model.Recipe
import de.darthkali.food2fork.domain.util.DatetimeUtil
import io.ktor.client.*
import kotlinx.datetime.LocalDateTime

expect class KtorClientFactory() {
    fun build(): HttpClient
}

fun RecipeDTO.toRecipe(): Recipe {
    val datetimeUtil = DatetimeUtil()
    return Recipe(
        id = pk,
        title = title,
        publisher = publisher,
        featuredImage = featuredImage,
        rating = rating,
        sourceUrl = sourceUrl,
        ingredients = ingredients,
        dateAdded = datetimeUtil.toLocalDate(dateAdded.toDouble()),
        dateUpdated = datetimeUtil.toLocalDate(dateUpdated.toDouble()),
    )
}

fun List<RecipeDTO>.toRecipeList():List<Recipe>{
    return map { it.toRecipe() }
}