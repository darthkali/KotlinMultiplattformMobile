package de.darthkali.food2fork.android.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
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
        recipeService: RecipeService
    ): SearchRecipes{
        return SearchRecipes(recipeService = recipeService)
    }

    @Singleton
    @Provides
    fun provideGetRecipe(
        recipeService: RecipeService
    ): GetRecipe {
        return GetRecipe(recipeService = recipeService)
    }
}