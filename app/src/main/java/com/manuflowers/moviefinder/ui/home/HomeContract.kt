package com.manuflowers.moviefinder.ui.home

import com.manuflowers.moviefinder.ui.model.Result

interface HomeContract {
    /**
     * BasePresenter layer.
     */

    interface View {

        fun showLoading()

        fun hideLoading()

        fun onSuccesfull(list: List<Result>)

        fun showErrorService(errorMessage: String)

        fun showFailureMessage(failureMessage: String?)
    }

    interface Presenter {
        fun requestDataMovie(query: String?)
    }

    interface Callback {
        fun onErrorService(code: String)

        fun onFailureService(failureMessage: String?)

        fun onSuccessful(list: List<Result>)
    }
}