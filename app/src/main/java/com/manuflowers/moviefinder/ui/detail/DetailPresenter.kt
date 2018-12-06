package com.manuflowers.moviefinder.ui.detail

import com.manuflowers.moviefinder.ui.model.Result

class DetailPresenter(
    private val viewInterface: DetailContract.View
): DetailContract.CallBack, DetailContract.Presenter {
    override fun requestResult(query: String?) {
        DetailInteractor().makeRequest(query!!,this)
    }

    override fun onErrorService(code: String) {
        viewInterface.showErrorService(code)
    }

    override fun onFailureService(failureMessage: String?) {
        viewInterface.showFailureMessage(failureMessage)
    }

    override fun onSuccessFul(result: Result) {
        viewInterface.onSuccesfull(result)
    }


}