package com.anurag.fragment_gfg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val submitButton : Button = findViewById(R.id.button)
        val name: TextView = findViewById(R.id.editTextTextPersonName)
        val email : TextView = findViewById(R.id.editTextTextEmailAddress)
        val text2 : TextView = findViewById(R.id.textView2)
//       val secText: TextView= findViewById(R.id.second_textView)




        /*submitButton.setOnClickListener {
            text2.text = "${name.text} " + "${email.text}"
            Toast.makeText(this,"${name.text} ${email.text}",Toast.LENGTH_LONG).show()

        }*/

        submitButton.setOnClickListener {
             text2.text = "${name.text} ${email.text}"
            val toastText = text2.text
            val intent = Intent(this,secondActivity::class.java)
            intent.putExtra( "EnteredText",toastText)
            startActivity(intent)
        }

    }
}