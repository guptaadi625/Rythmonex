package com.project.rythmonex

import android.content.Intent
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.project.rythmonex.databinding.ActivitySignUpBinding

private lateinit var binding:ActivitySignUpBinding
private lateinit var firebaseAuth:FirebaseAuth
class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        firebaseAuth = FirebaseAuth.getInstance()

        binding.signupButton.setOnClickListener{
            val email = binding.signupEmail.text.toString()
            val password = binding.signupPass.text.toString()
            val confirmPassword = binding.signupConfirmPass.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty() && confirmPassword.isNotEmpty()){
                if (password==confirmPassword){
                    firebaseAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener{
                        if (it.isSuccessful){
                            val intent = Intent(this, LogInActivity::class.java)
                            startActivity(intent)
                        }
                        else{
                            Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()
                        }
                    }
                }
                else{
                    Toast.makeText(this, "Password doesn't match", Toast.LENGTH_SHORT).show()
                }
            }
            else{
                Toast.makeText(this, "Fields cannot be empty", Toast.LENGTH_SHORT).show()
            }
        }
        binding.loginRedirectText.setOnClickListener{
            val loginIntent = Intent(this,LogInActivity::class.java)
            startActivity(loginIntent)
        }
    }
}