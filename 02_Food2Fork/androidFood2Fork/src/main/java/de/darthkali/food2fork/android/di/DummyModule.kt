package de.darthkali.food2fork.android.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

interface Dummy {
    fun description(): String
}

class DummyImpl(private val dummyCapacity: Int) : Dummy {
    override fun description(): String {
        return "This is for $dummyCapacity dummies"
    }
}


@Module
@InstallIn(SingletonComponent::class)
object DummyModule {

    @Singleton
    @Provides
    fun provideDummyObject25(
        dummyCapacity: Int
    ): Dummy {
        return DummyImpl(dummyCapacity)
    }

    @Singleton
    @Provides
    fun provideDummy22Capafdghdfghcity(): String {
        return "500"
    }

//    @Singleton
//    @Provides
//    fun provideDummyCapacity(): Int {
//        return 600
//    }
}