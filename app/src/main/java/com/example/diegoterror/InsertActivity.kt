package com.example.diegoterror

import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class InsertActivity : InsertFragment.OnFragmentInteractionListener,AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insert)


    }

    override fun onFragmentInteraction(uri: Uri) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
