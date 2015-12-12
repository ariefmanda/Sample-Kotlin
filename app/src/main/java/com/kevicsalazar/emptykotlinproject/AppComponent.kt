package com.kevicsalazar.emptykotlinproject

import com.kevicsalazar.emptykotlinproject.base.scopes.PerApp
import dagger.Component

/**
 * @author Kevin Salazar
 * @link kevicsalazar.com
 */
@PerApp
@Component(modules = arrayOf(AppModule::class))
public interface AppComponent {

    fun inject(app: App)

    object Initializer {
        fun init(app: App): AppComponent =
                DaggerAppComponent.builder()
                        .appModule(AppModule(app))
                        .build()
    }

}