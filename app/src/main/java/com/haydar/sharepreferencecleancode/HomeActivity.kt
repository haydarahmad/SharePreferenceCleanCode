package com.haydar.sharepreferencecleancode

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.haydar.sharepreferencecleancode.databinding.ActivityHomeBinding
import com.haydar.sharepreferencecleancode.databinding.ActivityMainBinding
import com.haydar.sharepreferencecleancode.helper.Constant
import com.haydar.sharepreferencecleancode.helper.Constant.Companion.PREF_EMAIL
import com.haydar.sharepreferencecleancode.helper.PreferenceHelper

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding
    private lateinit var preferenceHelper: PreferenceHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        preferenceHelper = PreferenceHelper(this)

         val email = preferenceHelper.getString(Constant.PREF_EMAIL)
         binding.textViewEmail.text = email

        binding.btnLogout.setOnClickListener {
            preferenceHelper.clear()
            finish()
        }
    }



}