package com.learn.simpleapp.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy

/**
created by Rachit on 4/5/2024.
 */

@Dao
interface Dao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(user: User)
}