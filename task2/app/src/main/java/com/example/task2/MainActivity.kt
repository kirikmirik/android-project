package com.example.task2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

public class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSendEmail = findViewById<View>(R.id.button_send_email) as Button
        btnSendEmail.setOnClickListener {
            sendEmailActivity()
            //Toast.makeText(MainActivity.this, "Send email button pressed", Toast.LENGTH_LONG).show();
        }

        val btnOpenProfile = findViewById<View>(R.id.button_open_profile) as Button
        btnOpenProfile.setOnClickListener {
            Toast.makeText(this@MainActivity, "Open profile button pressed", Toast.LENGTH_LONG).show()
            openProfileActivity()
        }
    }

    fun sendEmailActivity() {
        /* Create the Intent */
        val emailIntent = Intent(android.content.Intent.ACTION_SEND)
        /* Fill it with Data */
        emailIntent.type = "plain/text"
        emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, arrayOf("to@email.com"))
        emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject")
        emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, "Отправлено из ...")
        /* Send it off to the Activity-Chooser */
        startActivity(emailIntent)
    }

    fun openProfileActivity() {
        val intent = Intent(this, ProfileActivity::class.java)
        startActivity(intent)
    }

}
