package com.learn.simpleapp.presentation.view

import android.os.Bundle
import android.text.TextUtils
import android.util.Patterns
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.learn.simpleapp.data.User
import com.learn.simpleapp.databinding.ActivityMainBinding
import com.learn.simpleapp.presentation.viewModel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    val viewModel: MainViewModel by viewModels<MainViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: View = binding.root
        setContentView(view)


        binding.add.setOnClickListener {
            if (binding.firstName.text?.length == 0) {

                binding.firstName.error = "Field Can not be empty"
            } else if (binding.lastName.text?.length == 0) {
                binding.lastName.error = "Field Can not be empty"

            } else if (binding.email.text?.length == 0 || isValidEmail(binding.email.text)) {
                binding.lastName.error = "Please check email"

            } else if (binding.city.text?.length == 0) {
                binding.lastName.error = "Field Can not be empty"

            } else {

                val dataToSned = User(
                    null,
                    binding.firstName.text.toString(),
                    binding.lastName.text.toString(),
                    binding.email.text.toString(),
                    binding.city.text.toString()
                )


                viewModel.insertData(dataToSned)
            }
        }


    }
}

fun isValidEmail(target: CharSequence?): Boolean {
    return !TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches()
}