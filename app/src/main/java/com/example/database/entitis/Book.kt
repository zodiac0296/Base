package com.example.database.entitis

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(foreignKeys = [ForeignKey(entity = Genre::class,
        parentColumns = arrayOf("id"),
        childColumns = arrayOf("gendeID"))]
)
data class Book(
    @PrimaryKey(autoGenerate = true) var id: Int,
    @ColumnInfo(name = "bookName") var bookName: String,
    @ColumnInfo(name = "author") var author: String,
    @ColumnInfo(name = "publicationDate") var publicationDate: String,
    @ColumnInfo(name = "pageAmount") var pageAmount: Int,
    @ColumnInfo(name = "amount") var amount: Int,
    @ColumnInfo(name = "place") var place: String,
    @ColumnInfo(name = "genderID") var gendeID: Int
)
data class  Genre (
    @PrimaryKey(autoGenerate = true) var id: Int,
    @ColumnInfo(name = "genderName") var name: String
        )
