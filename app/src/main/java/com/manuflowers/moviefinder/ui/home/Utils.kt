package com.manuflowers.moviefinder.ui.home

import android.widget.ImageView
import com.manuflowers.moviefinder.R
import com.squareup.picasso.Picasso

fun ImageView.loadUrl(url: String) =
    Picasso.get().load(url).placeholder(R.drawable.monsta_1).into(this)