package com.kevicsalazar.emptykotlinproject.base

/**
 * Created by Kevin Salazar
 */
public abstract class BasePresenter<T> {

    protected var view: T? = null

    public fun with(v: T): BasePresenter<T> {
        view = v
        return this
    }

    /**
     * This method will be executed on
     * [AppCompatActivity.onStart] in case presenter is attached to activity
     * [Fragment.onStart]  in case presenter is attached to fragment
     */
    abstract fun onStart()

    /**
     * This method will be executed on
     * [AppCompatActivity.onStop] in case presenter is attached to activity
     * [Fragment.onStop]  in case presenter is attached to fragment
     */
    abstract fun onStop()

}
