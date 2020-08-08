package com.natappsone.choicewheel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.natappsone.choicewheel.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.manageWheelsButton.setOnClickListener {
            Toast.makeText(this,"Manage clicked", Toast.LENGTH_SHORT).show()
        }

        binding.tutorialButton.setOnClickListener {
            Toast.makeText(this,"Tutorial clicked", Toast.LENGTH_SHORT).show()
        }

        binding.spinWheelButton.setOnClickListener {
            Toast.makeText(this,"SPIN!", Toast.LENGTH_SHORT).show()
        }

    }
}