package com.roberto.drawer

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class IngresoActivity : AppCompatActivity() {

    private lateinit var email: EditText
    private lateinit var password: EditText
    private lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingreso)

        email = findViewById(R.id.edtCorreo)
        password = findViewById(R.id.edtContrasena)
        btnLogin = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener {
            if (validateCredentials(email.text.toString(), password.text.toString())) {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish() // Cierra la actividad para que no se pueda volver atrás al login
            } else {
                Toast.makeText(this, "Correo o contraseña incorrecto.", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun validateCredentials(email: String, password: String): Boolean {
        // Cambiar "usr" y "12345" por las credenciales correctas
        return email == "usr" && password == "12345"
    }
}
