package com.nastyaanastasya.animation.presentation.recycler.utils

import android.view.View

fun View.rotateHorizontally(
    degree: Float,
    duration: Long = 200
) {
    animate()
        .setDuration(duration)
        .rotationY(degree)
        .start()
}
