package com.kevicsalazar.emptykotlinproject.ui

import android.app.Activity
import com.kevicsalazar.emptykotlinproject.App
import com.kevicsalazar.emptykotlinproject.AppComponent
import com.kevicsalazar.emptykotlinproject.base.scopes.PerActivity
import com.kevicsalazar.emptykotlinproject.ui.mvp.views.MainActivity
import dagger.Component

/**
 * @author Kevin Salazar
 * @link kevicsalazar.com
 */
@PerActivity
@Component(dependencies = arrayOf(AppComponent::class), modules = arrayOf(ActivityModule::class))
public interface ActivityComponent {

    // Activities

    fun inject(activity: MainActivity)

    object Initializer {
        fun init(activity: Activity): ActivityComponent =
                DaggerActivityComponent.builder()
                        .appComponent((activity.application as App).appComponent)
                        .activityModule(ActivityModule()).build()
    }
}
