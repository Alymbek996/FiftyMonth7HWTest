package com.geektech.fiftymonth7hwtest44

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geektech.fiftymonth7hwtest44.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initclicker()
    }

    private fun initclicker() {
        with(binding){
            val firstNum = etFirst.text.toString()
            val secondNum = etSecond.text.toString()
            val math = Math()
            btnPlus.setOnClickListener {
                tvResult.text = math.add(firstNum,secondNum)
            }
            btnDivide.setOnClickListener {
                tvResult.text = math.divide(firstNum,secondNum)
            }
        }
    }
    }
