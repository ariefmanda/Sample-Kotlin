package com.kevicsalazar.emptykotlinproject.base

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by Kevin Salazar
 */
abstract class BaseFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        setHasOptionsMenu(true)
        return inflater!!.inflate(fragmentLayout, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpComponent()
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
    protected abstract val fragmentLayout: Int

    /**
     * @return The presenter attached to the fragment. This must extends from [BasePresenter]
     */
    protected abstract val presenter: BasePresenter<*>?

    /**
     * This method will setup the injector and will commit the dependencies injections.
     */
    protected abstract fun setUpComponent()

}
