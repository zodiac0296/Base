package com.example.database

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.room.Room
import com.example.database.database.AppDatabase
import com.example.database.databinding.FragmentFirstBinding
import com.example.database.entitis.Book


class FirstFragment : Fragment() {
    private var _binding: FragmentFirstBinding? = null

    private val binding get() = _binding!!

    private val db = App.instance?.getDatabase()?.bookDao()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val db = App.instance?.getDatabase()?.bookDao()
        binding.addBookBtn.setOnClickListener {
            val book = Book(0,
                binding.bookName.text.toString(),
                binding.bookAuthor.text.toString(),
                binding.bookPublicationDate.text.toString(),
                binding.bookAmountPage.text.toString().toInt(),
                binding.bookAmount.text.toString().toInt(),
                binding.bookPlace.text.toString(),
            1)

            db?.addBook(book)
            Log.i("GetAllBooks", "${db?.getAllBooks()}")
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}