package com.example.porto.androidporto

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Portofolio(
    val id: Int = 0,
    var title: String = "",
    var poster: Int = 0,
    var link: String = ""
) : Parcelable
