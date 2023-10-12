package com.nastyaanastasya.animation.data

object Repository {
    private val data = mutableListOf<DataItem>()

    init {
        obtainData()
    }

    fun getData() = data

    private fun obtainData() {
        for (i in 0..100) {
            data.add(
                DataItem(i, "Lorem Ipsum - $i")
            )
        }
    }
}

data class DataItem(
    val id: Int,
    val desc: String
)
