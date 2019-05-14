package com.gwazasoftwares.meetupregistrykt

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //customize toolbar
        setSupportActionBar(regtoolbar)
        getSupportActionBar()!!.setTitle(R.string.app_name)
    }

    override fun onStart() {
        super.onStart()
        submit.setOnClickListener{
            var firstname = firstName.text
            var lastName =  lastName.text
            var date = Date.text
            var regNumber = regNumber.text

            Toast.makeText(applicationContext, "first name : "+ firstname + " lastname "+lastName + " date "+date +"reg "+regNumber, Toast.LENGTH_LONG).show();
        }
    }
}
