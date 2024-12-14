package com.project.rythmonex

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.project.rythmonex.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {

    lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(MainActivity.currentThemeNav[MainActivity.themeIndex])
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title = "About"
        binding.aboutText.text = aboutText()
    }
    private fun aboutText(): String{
        return "Developed By: \n Aditya 21BCS2314 \n Divyam 21BCS1394 \n Yashika 21BCS2479" +
                "\n\nIf you want to provide feedback, We will love to hear that."
    }
}