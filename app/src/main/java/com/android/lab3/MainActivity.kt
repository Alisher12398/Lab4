package com.android.lab3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.design.widget.FloatingActionButton
import android.support.v4.view.PagerAdapter
import android.support.v4.view.ViewPager
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_blank.*


class MainActivity : AppCompatActivity() {

    private var actors = ArrayList<NewsModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = PageAdapter(getSupportFragmentManager())
        pager.adapter = adapter
        tabs.setupWithViewPager(pager)

        val add_news_button = findViewById<FloatingActionButton>(R.id.add_news_button)

        add_news_button.setOnClickListener{
            Toast.makeText(BlankFragm, "A", Toast.LENGTH_LONG).show()
        }

        pager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {

            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
                position.inc()
            }

            override fun onPageSelected(position: Int) {

            }

        })

    }
}
