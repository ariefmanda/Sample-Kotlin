package com.kevicsalazar.emptykotlinproject.ui

import com.kevicsalazar.emptykotlinproject.ui.mvp.presenters.MainPresenter
import dagger.Module
import dagger.Provides

/**
 * @author Kevin Salazar
 * @link kevicsalazar.com
 */
@Module
public class ActivityModule {

    @Provides fun provideMainPresenter(): MainPresenter = MainPresenter()

}
