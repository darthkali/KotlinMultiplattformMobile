package de.darthkali.food2fork.android.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import de.darthkali.food2fork.datasource.cache.RecipeCache
import de.darthkali.food2fork.datasource.network.RecipeService
import de.darthkali.food2fork.interactors.recipe_detail.GetRecipe
import de.darthkali.food2fork.interactors.recipe_list.SearchRecipes
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object InteractorsModule {

    @Singleton
    @Provides
    fun provideSearchRecipes(
        recipeService: RecipeService,
        recipeCache: RecipeCache,
    ): SearchRecipes{
        return SearchRecipes(
            recipeService = recipeService,
            recipeCache = recipeCache)
    }

    @Singleton
    @Provides
    fun provideGetRecipe(
        recipeCache: RecipeCache,
    ): GetRecipe {
        return GetRecipe(recipeCache = recipeCache)
    }
}