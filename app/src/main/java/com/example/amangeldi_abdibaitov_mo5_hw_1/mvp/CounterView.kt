package com.example.amangeldi_abdibaitov_mo5_hw_1.mvp

interface CounterView {
    fun showCount(count: Int)
    fun changedVisible(isVisible: Boolean)
    fun showToast(message: String)
    fun changeTextColor()
}