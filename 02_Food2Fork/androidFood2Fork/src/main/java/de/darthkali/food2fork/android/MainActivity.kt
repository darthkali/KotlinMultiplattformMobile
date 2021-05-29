package de.darthkali.food2fork.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import dagger.hilt.android.AndroidEntryPoint
import de.darthkali.food2fork.android.presentation.navigation.Navigation
import de.darthkali.food2fork.datasource.network.KtorClientFactory
import de.darthkali.food2fork.datasource.network.RecipeService
import de.darthkali.food2fork.datasource.network.model.RecipeDTO
import de.darthkali.food2fork.datasource.network.model.RecipeServiceImpl
import de.darthkali.food2fork.datasource.network.toRecipe
import de.darthkali.food2fork.domain.util.DatetimeUtil
import io.ktor.client.request.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch

const val TOKEN = "Token 9c8b06d329136da358c2d00e76946b0111ce2c48"
const val BASE_URL = "https://food2fork.ca/api/recipe"


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @ExperimentalStdlibApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Navigation()
        }
    }
}
