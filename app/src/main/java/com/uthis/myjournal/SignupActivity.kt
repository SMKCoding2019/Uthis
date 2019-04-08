package com.uthis.myjournal

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.signup.*

class SignupActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup)
        signup_btnsignin.setOnClickListener {
            startActivity(Intent(this, SigninActivity::class.java))
        }
    }
}