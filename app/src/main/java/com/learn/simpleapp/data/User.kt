package com.learn.simpleapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
created by Rachit on 4/5/2024.
 */
@Entity(tableName = "user")
data class User (
    @PrimaryKey(autoGenerate = true)
    val id:Int?,
    val firstName:String,
    val secondName:String,
    val email:String,
    val city:String)