package com.learn.simpleapp.data

import androidx.room.Database
import androidx.room.RoomDatabase

/**
created by Rachit on 4/5/2024.
 */
@Database(entities = [User::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): Dao
}