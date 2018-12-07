package com.manuflowers.moviefinder.ui.detail

import com.manuflowers.moviefinder.ui.model.DetailOfMovie
import com.manuflowers.moviefinder.ui.model.Result

class DetailPresenter(
    private val viewInterface: DetailContract.View
): DetailContract.CallBack, DetailContract.Presenter {
    override fun requestResult(movie_id: String?) {
        DetailInteractor().makeRequest(movie_id,this)
    }

    override fun onErrorService(code: String) {
        viewInterface.showErrorService(code)
    }

    override fun onFailureService(failureMessage: String?) {
        viewInterface.showFailureMessage(failureMessage)
    }

    override fun onSuccessFul(detailOfMovie: DetailOfMovie) {
        viewInterface.onSuccesfull(detailOfMovie)
    }
}