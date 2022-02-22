package com.example.database.Dao

import androidx.room.Query
import com.example.database.entitis.Genre

interface GenreDao {
    @Query("SELECT * FROM Genre")
    fun getAllGenre(): List<Genre>

}