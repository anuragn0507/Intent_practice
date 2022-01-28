package com.anurag.fragment_gfg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class secondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val text2 :TextView = findViewById(R.id.second_textView)

        val name2 = intent.extras?.get("EnteredText").toString()

        if (intent.hasExtra("EnteredText")){
           val text2 = "${intent.extras?.get("EnteredText").toString()}"

            Toast.makeText(this,text2.toString(),Toast.LENGTH_LONG).show()
        }
        text2.setText(name2)



            //Toast.makeText(this,"${TextValue.text}")
    }
}