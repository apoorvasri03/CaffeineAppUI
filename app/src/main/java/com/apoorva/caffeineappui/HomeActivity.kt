package com.apoorva.caffeineappui

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {

    private lateinit var forYouRecyclerView: RecyclerView
    private lateinit var bottomNav: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        Log.d("Check"," homwActivity");

        forYouRecyclerView = findViewById(R.id.forYouRecyclerView)
        bottomNav = findViewById(R.id.bottomNav)
        bottomNav.visibility = View.VISIBLE

        val items = listOf(
            ForYouItem(R.drawable.ic_offer, "Discount 75%", "Invite your friends to", "Download Kopi Apps"),
            ForYouItem(R.drawable.ic_offer, "Discount 50%", "Refer & Earn", "Get Rewards"),
            ForYouItem(R.drawable.ic_offer, "Flat ₹100 Off", "Use Promo Code", "FIRST100")
        )

        Log.d("ItemCount", "List size = ${items.size}")

        forYouRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        forYouRecyclerView.adapter = ForYouAdapter(items)
    }
}

