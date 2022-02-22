package com.example.database.Dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.database.entitis.Book

@Dao
interface BookDao {
    @Query("SELECT * FROM Book")
    fun getAllBooks(): List<Book>

    @Query("SELECT * FROM Book WHERE id =  :bookId")
    fun getBookById(bookId: Int)

    @Insert
    fun addBook(vararg book: Book)

    @Delete
    fun deleteBook(book: Book)
}
