package com.kevicsalazar.emptykotlinproject

import android.support.multidex.MultiDexApplication

/**
 * @author Kevin Salazar
 * @link kevicsalazar.com
 */
public open class App : MultiDexApplication() {

    val appComponent: AppComponent by lazy { AppComponent.Initializer.init(this) }

    override fun onCreate() {
        super.onCreate()
        setupComponent()
    }

    fun setupComponent() = appComponent.inject(this)

}