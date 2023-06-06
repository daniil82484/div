package com.example.dif

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView


class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val poster_res: RecyclerView = findViewById(R.id.rec_view)
        poster_res.adapter = Pos_adapter(this, PosList().list)
    }

    fun go(view: View) {
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }
}