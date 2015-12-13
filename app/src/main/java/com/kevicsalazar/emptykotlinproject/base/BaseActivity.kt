package com.kevicsalazar.emptykotlinproject.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.kevicsalazar.emptykotlinproject.ui.ActivityComponent

/**
 * @author Kevin Salazar
 * @link kevicsalazar.com
 */

public abstract class BaseActivity : AppCompatActivity() {

    /**
     * The onCreate base will set the view specified in [.getLayout] and will
     * inject dependencies and views.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupComponent(ActivityComponent.Initializer.init(this))
        setContentView(layout)
        presenter
    }

    override fun onStart() {
        super.onStart()
        presenter?.onStart()
    }

    override fun onStop() {
        super.onStop()
        presenter?.onStop()
    }

    /**
     * @return The layout that's gonna be the activity view.
     */
    protected abstract val layout: Int

    /**
     * @return The presenter attached to the activity. This must extends from [BasePresenter]
     */
    protected abstract val presenter: BasePresenter<*>?

    /**
     * Setup Component
     */
    protected abstract fun setupComponent(component: ActivityComponent)

}