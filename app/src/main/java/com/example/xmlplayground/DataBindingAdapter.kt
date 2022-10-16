package com.example.xmlplayground

import android.view.View
import android.widget.TextView
import androidx.databinding.BindingAdapter

@BindingAdapter("enableTextByNullableValue")
fun textVisibility(textView:TextView, subTitle:String?){
    textView.visibility = if (subTitle.isNullOrBlank()) View.GONE else View.VISIBLE
}