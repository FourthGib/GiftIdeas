package com.project134.giftideas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private var namesList = mutableListOf<String>()
    private var imagesList = mutableListOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        populateList()

        val recView = findViewById<RecyclerView>(R.id.recView)
        recView.layoutManager = LinearLayoutManager(this)
        recView.adapter = RecyclerAdapter(namesList, imagesList)

        val fab: View = findViewById(R.id.add_button)
        //set on click listener for fab here... create a dialog
        fab.setOnClickListener{
            var dialog = DialogFragment()

            dialog.show(supportFragmentManager, "addDialogFragment")
        }

    }

    private fun addToList(name: String, image: Int){
        namesList.add(name)
        imagesList.add(image)
    }

    //tester to add prepopulated list
    private fun populateList(){
        for (i in 1..10) {
            addToList("Name: $i", R.drawable.gift_card)
        }
    }


    fun addButtonClick(view: View) {

    }
}