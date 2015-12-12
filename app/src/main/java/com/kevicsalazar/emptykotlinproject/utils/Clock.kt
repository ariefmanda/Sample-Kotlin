package com.kevicsalazar.emptykotlinproject.utils

/**
 * @author Kevin Salazar
 * @link kevicsalazar.com
 */
interface Clock {

    fun millis(): Long

    fun nanos(): Long

    companion object {

        val REAL: Clock = object : Clock {
            override fun millis(): Long {
                return System.currentTimeMillis()
            }

            override fun nanos(): Long {
                return System.nanoTime()
            }
        }
    }

}
