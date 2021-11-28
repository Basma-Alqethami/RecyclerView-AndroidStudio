package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var myRV: RecyclerView
    private lateinit var submitButton: Button
    private lateinit var messageText: TextView
    private val messages = arrayListOf<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myRV = findViewById<RecyclerView>(R.id.rvMain)
        submitButton = findViewById<Button>(R.id.submitButton)
        messageText = findViewById<TextView>(R.id.messageText)

        submitButton.setOnClickListener { AddTOList() }
    }

    private fun AddTOList(){
        var message = messageText.text.toString()
        messages.add(message)
        myRV.adapter = RecyclerViewAdapter(messages)
        myRV.layoutManager = LinearLayoutManager(this)
        messageText.text = ""
    }
}