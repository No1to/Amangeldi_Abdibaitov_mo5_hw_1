package com.example.amangeldi_abdibaitov_mo5_hw_1.mvp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.example.amangeldi_abdibaitov_mo5_hw_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), CounterView {

    private lateinit var binding: ActivityMainBinding
    private val presenter = Injector.getPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.attachView(this)
        initListener()
    }

    private fun initListener() {
        with(binding) {
            incBtn.setOnClickListener {
                presenter.increment()
                presenter.checkNumber()
            }
            decBtn.setOnClickListener {
                presenter.decrement()
                presenter.checkNumber()
            }
            visibilityChangeBtn.setOnClickListener {
                presenter.changeVisible()
            }
            clearBtn.setOnClickListener {
                presenter.clear()
            }
        }
    }

    override fun showCount(count: Int) {
        binding.resultTv.text = count.toString()
    }

    override fun changedVisible(isVisible: Boolean) {
        binding.resultTv.isVisible = isVisible
    }

    override fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun changeTextColor() {
        binding.resultTv.setTextColor(resources.getColor(android.R.color.holo_green_dark))
    }
}