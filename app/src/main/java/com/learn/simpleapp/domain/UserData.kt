package com.learn.simpleapp.domain

import com.learn.simpleapp.data.User

/**
created by Rachit on 4/5/2024.
 */
interface UserData {

    suspend fun insertUserData(userData: User)
}