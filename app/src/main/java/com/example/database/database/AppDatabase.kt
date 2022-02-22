package com.example.database.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.database.Dao.BookDao
import com.example.database.Dao.GenreDao
import com.example.database.entitis.Book
import com.example.database.entitis.Genre

@Database(entities = [Book::class, Genre::class ],version = 2)
abstract class AppDatabase: RoomDatabase() {
    abstract fun bookDao(): BookDao
    abstract fun genreDao(): GenreDao
}