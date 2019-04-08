package com.uthis.myjournal

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.firstpage.*


class FirstPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.firstpage)
        Thread.sleep(1000)
        firstpage_btngetstarted.setVisibility(View.VISIBLE);
        firstpage_btngetstarted.setOnClickListener {
            firstpage_btngetstarted.setVisibility(View.GONE);
            firstpage_btnsignin.setVisibility(View.VISIBLE);
            firstpage_btnsignupwhite.setVisibility(View.VISIBLE);
        }
        firstpage_btnsignin.setOnClickListener {
            startActivity(Intent(this, SigninActivity::class.java))
        }
        firstpage_btnsignupwhite.setOnClickListener {
            startActivity(Intent(this, SignupActivity::class.java))
        }
    }
}