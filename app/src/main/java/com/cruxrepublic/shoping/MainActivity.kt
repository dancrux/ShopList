package com.cruxrepublic.shoping

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
   private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var  viewManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this,"new fragment", Toast.LENGTH_SHORT).show()
        viewManager = LinearLayoutManager(this)
                viewAdapter =ShopRecyclerAdapter(this)

         recyclerView = findViewById<RecyclerView>(R.id.recycler_view).apply{
//             if changes in content does not change layout size
             setHasFixedSize(true)
//             the linear layoutmanager
             layoutManager = viewManager

//             the adapter
             adapter = viewAdapter


         }




    }
   }
