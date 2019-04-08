package com.uthis.myjournal

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.signin.*

class SigninActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signin)
        signin_btncreatenow.setOnClickListener {
            startActivity(Intent(this, SignupActivity::class.java))
        }
    }

}