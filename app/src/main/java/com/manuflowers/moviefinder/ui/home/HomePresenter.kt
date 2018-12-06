package com.manuflowers.moviefinder.ui.home

import com.manuflowers.moviefinder.ui.model.Result

class HomePresenter(
    private val viewInterface: HomeContract.View
) : HomeContract.Callback, HomeContract.Presenter {

    override fun requestDataMovie(query: String?) {
        viewInterface.showLoading()
        HomeInteractor().makeRequest(query, this)
    }

    override fun onErrorService(code: String) {
        viewInterface.hideLoading()
        viewInterface.showErrorService(code)
    }

    override fun onFailureService(failureMessage: String?) {
        viewInterface.hideLoading()
        viewInterface.showFailureMessage(failureMessage)
    }

    override fun onSuccessful(list: List<Result>) {
        viewInterface.hideLoading()
        viewInterface.onSuccesfull(list)
    }
}