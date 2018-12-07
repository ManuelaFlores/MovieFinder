package com.manuflowers.moviefinder.ui.model


/**Structure in the JSON Object.
 * {
 * original_title: String
 * overview: String
 * homepage: String
 * title: String
 * }
 * */
data class DetailOfMovie (
    val adult: Boolean,
    val backdrop_path: String,
    val belongs_to_collection:Boolean?,
    val budget:Int,
    val genres: List<Genres>,
    val homepage:String,
    val id: Int,
    val imdb_id: String,
    val original_language: String,
    val original_title: String,
    val overview: String,
    val popularity: Double,



    val title: String
)