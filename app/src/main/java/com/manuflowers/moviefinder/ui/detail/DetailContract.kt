package com.manuflowers.moviefinder.ui.detail

import com.manuflowers.moviefinder.ui.model.DetailOfMovie
import com.manuflowers.moviefinder.ui.model.Result

interface DetailContract {

    interface View {
        fun onSuccesfull(detailOfMovie: DetailOfMovie)
        fun showErrorService(errorMessage: String)
        fun showFailureMessage(failureMessage: String?)
    }

    interface Presenter {
        fun requestResult(query:String?)
    }

    interface CallBack{
        fun onErrorService(code: String)
        fun onFailureService(failureMessage: String?)
        fun onSuccessFul(detailOfMovie: DetailOfMovie)
    }
}