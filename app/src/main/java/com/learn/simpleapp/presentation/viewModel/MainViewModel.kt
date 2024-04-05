package com.learn.simpleapp.presentation.viewModel

import android.service.autofill.UserData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.learn.simpleapp.data.User
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
created by Rachit on 4/5/2024.
 */

@HiltViewModel
class MainViewModel @Inject constructor(private val userData: com.learn.simpleapp.domain.UserData):ViewModel() {

    fun insertData(user: User){

        viewModelScope.launch {

            userData.insertUserData(user)
        }
    }
}