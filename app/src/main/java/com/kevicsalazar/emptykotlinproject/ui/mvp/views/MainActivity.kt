package com.kevicsalazar.emptykotlinproject.ui.mvp.views

import android.os.Bundle
import com.kevicsalazar.emptykotlinproject.R
import com.kevicsalazar.emptykotlinproject.base.BaseActivity
import com.kevicsalazar.emptykotlinproject.base.BasePresenter
import com.kevicsalazar.emptykotlinproject.ui.ActivityComponent
import com.kevicsalazar.emptykotlinproject.ui.mvp.presenters.MainPresenter
import javax.inject.Inject

class MainActivity : BaseActivity(), MainPresenter.View {

    @Inject lateinit var mainPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Here your code
    }

    override val layout: Int get() = R.layout.activity_main

    override val presenter: BasePresenter<MainPresenter.View>?  get() = mainPresenter.with(this)

    override fun setupComponent(component: ActivityComponent) = component.inject(this)

}
