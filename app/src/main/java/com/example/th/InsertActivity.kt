package com.example.th

import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class InsertActivity : InsertFragment.OnFragmentInteractionListener,AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insert)

        val susertype: Spinner? = findViewById(R.id.user_type) as Spinner;
        setupUserType(susertype);

    }
    private fun setupUserType(susertype: Spinner?) {
        ArrayAdapter.createFromResource(this.applicationContext,  R.array.user_type,android.R.layout.simple_spinner_item).
            also { adapter ->
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
                susertype?.adapter = adapter;
            }

    }


    override fun onFragmentInteraction(uri: Uri) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
