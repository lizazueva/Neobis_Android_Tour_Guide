package com.example.neobis_android_tour_guide

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
@Parcelize

data class Place (val image: Int,
                  val name: String,
                  var address: String,
                  val opening: String,
                  val km: String,
                  val check: String,
                  val discription: String,
                  val fullDiscription: String):Parcelable{
}