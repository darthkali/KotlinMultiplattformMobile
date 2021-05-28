package de.darthkali.food2fork.android.presentation.recipe_list

import android.view.AbsSavedState
import androidx.lifecycle.SavedStateHandle
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RecipeListViewModel

@Inject
constructor(
    private val savedStateHandle: SavedStateHandle
) {

}