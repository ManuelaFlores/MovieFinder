package com.manuflowers.moviefinder.ui.model

/**
 * Structure in the JSON Object.
 * {
 * vote_count : integer
 * id : integer
 * video : boolean
 * vote_average : float
 * title : string
 * popularity : integer
 * poster_path : string
 * original_language : string
 * original_title : string
 * genre_ids : List
 * backdrop_path : string
 * adult : boolean
 * overview : string
 * release_date : string
 * }
 */

data class Result(val id: Int,
                  val title:String,
                  val original_title:String,
                  val release_date:String,
                  val overview: String,
                  val poster_path: String)