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

data class Result(val vote_count: Int,
                  val id: Int,
                  val video: Boolean,
                  val vote_average: Float,
                  val title:String,
                  val popularity:Float,
                  val poster_path:String,
                  val original_language:String,
                  val original_title:String,
                  val genre_ids:List<Int>,
                  val backdrop_path:String,
                  val adult:Boolean,
                  val overview:String,
                  val release_date:String)