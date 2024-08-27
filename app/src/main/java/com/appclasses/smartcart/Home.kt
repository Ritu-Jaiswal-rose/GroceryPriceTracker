package com.appclasses.smartcart

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ActionMenuView
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.search.SearchBar
import com.google.android.material.search.SearchView

class Home : AppCompatActivity() {

    lateinit var icon:ImageView
    lateinit var profile:ImageView
    lateinit var searchBar: EditText
    lateinit var searchView: ImageView
    lateinit var pick1:Button
    lateinit var pick2:Button
    lateinit var pick3:Button
    lateinit var chatbar:EditText
    lateinit var filteric:ImageView
    lateinit var filtericon:ImageView
    lateinit var rectangle:View
    lateinit var ratingBar: RatingBar
    lateinit var product:TextView
    lateinit var sharebutton:Button
    lateinit var reportbutton:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_home)

        icon= findViewById(R.id.icon)
        profile=findViewById(R.id.profile)
        searchBar=findViewById(R.id.search_bar)
        ratingBar = findViewById(R.id.rating_bar)
        searchView=findViewById(R.id.search_button)
        pick1=findViewById(R.id.pick_1)
        pick2=findViewById(R.id.pick_2)
        pick3=findViewById(R.id.pick_3)
        chatbar=findViewById(R.id.chat_bar)
        filteric=findViewById(R.id.filter_ic)
        filtericon=findViewById(R.id.filter_icon)
        rectangle=findViewById(R.id.rectangle)
        product=findViewById(R.id.product)
        sharebutton=findViewById(R.id.share_button)
        reportbutton=findViewById(R.id.report_button)

        // Setting listeners
        profile.setOnClickListener {
            Toast.makeText(applicationContext, "Mobile App Still Is Still Been Improved On.", Toast.LENGTH_SHORT).show()
        }


        rectangle.setOnClickListener{
            val intent= Intent(this,Product::class.java)
            startActivity(intent)




        }

    }
}