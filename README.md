📱 Android Authentication App with Firebase (Kotlin)


🌟 Project Overview
This Android app is a fully functional authentication system built using Kotlin and Firebase Authentication. It features user registration, email verification, login, and password reset functionality. The app also ensures users remain logged in even after closing the app, providing a smooth and seamless user experience.


✨ Features
User Registration: Create a new account with email and password.
Email Verification: Users receive a verification email upon registration to confirm their account.
User Login: Secure login with email and password.
Persistent Login Session: Users stay logged in even after closing the app unless they explicitly log out.
Forgot Password: Users can reset their password via email.
Logout Functionality: Easily log out from the app with a single click.


🛠️ Technologies Used
Kotlin: For building the Android app.
Firebase Authentication: For managing user authentication, including registration, login, and email verification.
Android Studio: IDE used for app development.


📂 Project Structure
bash
Copy code
app
├── java/com/example/myapp
│   ├── SplashActivity.kt        # Checks user authentication status
│   ├── RegisterActivity.kt      # Handles user registration and email verification
│   ├── LoginActivity.kt         # Manages user login and session persistence
│   ├── ForgotPasswordActivity.kt # Handles password reset functionality
│   └── MainActivity.kt          # Displays user email and logout functionality
├── res
│   ├── layout
│   │   ├── activity_splash.xml
│   │   ├── activity_register.xml
│   │   ├── activity_login.xml
│   │   ├── activity_forgot_password.xml
│   │   └── activity_main.xml
│   └── values
│       ├── strings.xml
│       └── colors.xml
├── AndroidManifest.xml
└── google-services.json        # Firebase configuration file


🚀 Getting Started
1. Prerequisites
Android Studio installed on your machine.
A Firebase account.


3. Setting Up Firebase
Go to the Firebase Console.
Create a new project.
Register your Android app with your package name.
Download the google-services.json file and place it in the app directory.
Add Firebase SDK dependencies in your build.gradle files.
