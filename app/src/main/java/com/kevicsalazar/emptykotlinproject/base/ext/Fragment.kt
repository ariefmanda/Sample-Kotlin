package com.kevicsalazar.emptykotlinproject.base.ext

import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar


/**
 * @author Kevin Salazar
 * @link kevicsalazar.com
 */

fun Fragment.getAppCompatActivity(): AppCompatActivity? {
    return if (activity is AppCompatActivity) activity as AppCompatActivity else null
}

fun Fragment.setupActionBar(toolbar: Toolbar, showHomeButton: Boolean = false) {
    getAppCompatActivity()?.setSupportActionBar(toolbar);
    getAppCompatActivity()?.supportActionBar?.setDisplayHomeAsUpEnabled(showHomeButton);
}

fun Fragment.setTitle(resId: Int) {
    getAppCompatActivity()?.supportActionBar?.setTitle(resId)
}