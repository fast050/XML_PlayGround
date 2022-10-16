package com.example.xmlplayground

import androidx.lifecycle.MutableLiveData

object DataProvider {

    val _mainData = MainScreen(
        "White Curve Table",
        "Prime Item", 2850.00, "AED"
    )

    val mainData = MutableLiveData(_mainData)
    var enable= true

    fun enableDisable(condition: Boolean) {
        mainData.value = if
                (condition) _mainData.copy(subTitle = null)
        else
            _mainData.copy(subTitle = "Prime Item")
    }
}

data class MainScreen(
    val title: String,
    val subTitle: String?,
    val value: Double,
    val valueUnit: String,
)