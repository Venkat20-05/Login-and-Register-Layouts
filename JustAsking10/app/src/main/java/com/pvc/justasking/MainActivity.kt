package com.pvc.justasking

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    private lateinit var userEmailTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize FirebaseAuth
        auth = FirebaseAuth.getInstance()

        val welcomeTextView = findViewById<TextView>(R.id.welcomeTextView)
        userEmailTextView = findViewById(R.id.userEmailTextView)
        val logoutButton = findViewById<Button>(R.id.logoutButton)

        // Get the current user
        val user = auth.currentUser

        // Display the user's email if logged in
        if (user != null) {
            val email = user.email
            userEmailTextView.text = "$email"
        } else {
            userEmailTextView.text = "No user logged in"
        }

        // Logout button functionality
        logoutButton.setOnClickListener {
            auth.signOut()
            Toast.makeText(this, "Logged out", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, LoginActivity::class.java))
            finish() // Close the current activity
        }
    }
}
