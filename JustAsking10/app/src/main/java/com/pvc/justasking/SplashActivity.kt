package com.pvc.justasking

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.auth.FirebaseAuth

class SplashActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        auth = FirebaseAuth.getInstance()

        // Check if user is already logged in
        val currentUser = auth.currentUser
        if (currentUser != null && currentUser.isEmailVerified) {
            // User is logged in, go to MainActivity
            startActivity(Intent(this, MainActivity::class.java))
        } else {
            // No user is logged in, go to LoginActivity
            startActivity(Intent(this, LoginActivity::class.java))
        }
        finish() // Close SplashActivity
    }
}
