package com.kevicsalazar.emptykotlinproject.base.ext

import android.app.Activity
import android.content.res.Configuration
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentActivity
import android.support.v7.app.AppCompatActivity

fun Activity.isLandscape(): Boolean {
    return resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE
}

fun FragmentActivity.addContentFragment(containerViewId: Int, fragment: Fragment?): Fragment? {
    val f: Fragment? = supportFragmentManager?.findFragmentById(containerViewId)
    f?.let { return@addContentFragment f }
    supportFragmentManager?.beginTransaction()?.add(containerViewId, fragment)?.commit()
    return fragment
}

fun FragmentActivity.replaceContentFragment(containerViewId: Int, fragment: Fragment?): Fragment? {
    supportFragmentManager?.beginTransaction()?.replace(containerViewId, fragment)?.commit()
    return fragment
}

fun AppCompatActivity.setDisplayHomeAsUpEnabled(value: Boolean) {
    supportActionBar?.setDisplayHomeAsUpEnabled(value)
}