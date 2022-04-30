package com.example.m4l6t2.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


import android.content.Context

import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.m4l6t2.MainAdapter
import com.example.m4l6t2.R


class MainActivity : AppCompatActivity() {

    private lateinit var context: Context
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

        refreshAdapter(13)

    }

    private fun initViews() {
        context = this
        recyclerView = findViewById(R.id.rv_main_recycler_view)
        recyclerView.layoutManager = GridLayoutManager(context, 2)
    }

    private fun refreshAdapter(size: Int) {
        val adapter = MainAdapter(size)
        recyclerView.adapter = adapter
    }

}