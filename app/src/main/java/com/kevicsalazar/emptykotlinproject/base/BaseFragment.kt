package com.kevicsalazar.emptykotlinproject.base

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kevicsalazar.emptykotlinproject.ui.ActivityComponent

/**
 * Created by Kevin Salazar
 */
abstract class BaseFragment : Fragment() {

    /**
     * The onCreateView base will set the view specified in [layout].
     */
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        setHasOptionsMenu(true)
        return inflater!!.inflate(layout, container, false)
    }

    /**
     * The onViewCreated base  will inject dependencies and views.
     */
    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupComponent(ActivityComponent.Initializer.init(activity))
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
     * Specify the layout of the fragment to be inflated in the [BaseFragment.onCreateView]
     */
    protected abstract val layout: Int

    /**
     * @return The presenter attached to the fragment. This must extends from [BasePresenter]
     */
    protected abstract val presenter: BasePresenter<*>?

    /**
     * This method will setup the injector and will commit the dependencies injections.
     */
    protected abstract fun setupComponent(component: ActivityComponent)

}
