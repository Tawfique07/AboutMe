package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById<Button>(R.id.Done)

        button.setOnClickListener() {
            click();
            button.visibility = View.GONE
        }

    }

    private fun click() {

        val textBox = findViewById<EditText>(R.id.nickname_id)
        val viewResultBox = findViewById<TextView>(R.id.nickname_text)
        viewResultBox.text = textBox.text
        textBox.visibility = View.GONE
        viewResultBox.visibility = View.VISIBLE

    }
}