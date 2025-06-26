package com.apoorva.caffeineappui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeFragment : Fragment() {

    private lateinit var forYouRecyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.activity_home, container, false)

        // RecyclerView setup inside fragment
        forYouRecyclerView = view.findViewById(R.id.forYouRecyclerView)

        val items = listOf(
            ForYouItem(R.drawable.sale, "Discount 75%", "Invite your friends to", "Download Kopi Apps"),
            ForYouItem(R.drawable.sale, "Discount 50%", "Refer & Earn", "Get Rewards"),
            ForYouItem(R.drawable.sale, "Flat ₹100 Off", "Use Promo Code", "FIRST100")
        )

        Log.d("FragmentCheck", "Items size: ${items.size}")

        forYouRecyclerView.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        forYouRecyclerView.adapter = ForYouAdapter(items)

        return view
    }
}