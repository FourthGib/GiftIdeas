package com.project134.giftideas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private var namesList = mutableListOf<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //populateList()

        val recView = findViewById<RecyclerView>(R.id.recView)
        recView.layoutManager = LinearLayoutManager(this)
        recView.adapter = RecyclerAdapter(namesList)

        val addNameButton = findViewById<Button>(R.id.add_name)
        val editTextView = findViewById<EditText>(R.id.edit_name)
        addNameButton.setOnClickListener{
            val input = editTextView.text.toString();
            namesList.add(input);

        }

    }


    //tester to add prepopulated list
    private fun populateList(){
        for (i in 1..10) {
            namesList.add("Name: $i")
        }
    }

}