package com.kevicsalazar.emptykotlinproject.base.ext

/**
 * Created by Kevin Salazar
 */
fun Double.format(digits: Int) = java.lang.String.format("%.${digits}f", this)