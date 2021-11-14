package com.example.porto.experienceporto

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Experience(
    val id: Int = 0,
    var title: String = "",
    var detail: String = "",
    var image: Int = 0
): Parcelable