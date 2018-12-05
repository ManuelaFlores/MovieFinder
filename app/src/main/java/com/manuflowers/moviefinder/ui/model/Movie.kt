package com.manuflowers.moviefinder.ui.model


/**
 * Structure in the JSON Object.
 * {
 * page : integer
 * total_results : integer
 * total_pages : integer
 * results : list
 * }
 */

data class Movie (val page:Int,
                  val total_results:Int,
                  val total_pages:Int,
                  val results:List<Result> )