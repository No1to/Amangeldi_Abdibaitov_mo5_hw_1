package com.example.amangeldi_abdibaitov_mo5_hw_1.mvp

class Injector {

    companion object {
        fun getPresenter() = Presenter()
        fun getModel() = CounterModel()
    }

}