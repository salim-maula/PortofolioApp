package com.example.porto.androidporto

import android.widget.ImageView
import android.widget.TextView
import coil.load
import androidx.databinding.BindingAdapter

@BindingAdapter("androidTitle")
fun TextView.setTitleAndroid(data: Portofolio?){
    data?.let {
        text = data.title
    }
}

@BindingAdapter("androidImage")
fun ImageView.setAndroidImage(data: Portofolio){
    load(data.poster){
        crossfade(1000)
    }
}