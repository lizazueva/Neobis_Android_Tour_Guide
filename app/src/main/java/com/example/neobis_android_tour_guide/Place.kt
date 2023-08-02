package com.example.neobis_android_tour_guide

import android.graphics.drawable.Drawable
import android.os.Parcelable
import kotlinx.parcelize.Parcelize
@Parcelize

data class Place (val image: Int,
                  val name: String,
                  val address: String,
                  val opening: String,
                  val km: String,
                  val check: String,
                  val kitchen: String,
                  val fullDiscription: String):Parcelable{
}