package com.kevicsalazar.emptykotlinproject

import android.app.Application
import android.content.Context
import com.kevicsalazar.emptykotlinproject.base.scopes.PerApp

import dagger.Module
import dagger.Provides

/**
 * @author Kevin Salazar
 * @link kevicsalazar.com
 */
@Module
class AppModule(private val app: App) {

    @Provides @PerApp fun provideContext(): Context = app

    @Provides @PerApp fun provideApplication(): Application = app

}
