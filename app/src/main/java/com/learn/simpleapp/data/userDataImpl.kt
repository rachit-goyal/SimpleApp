package com.learn.simpleapp.data

import com.learn.simpleapp.domain.UserData
import javax.inject.Inject

/**
created by Rachit on 4/5/2024.
 */
class userDataImpl @Inject constructor(private val dao: Dao):UserData {
    override suspend fun insertUserData(userData: User) {
        dao.insert(userData)
    }

}
