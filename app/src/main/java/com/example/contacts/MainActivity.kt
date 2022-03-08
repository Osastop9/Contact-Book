package com.example.contacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()


        val contacts = createContacts()
        val recyclerView: RecyclerView = findViewById(R.id.contactList)
        recyclerView.adapter = ContactAdapter(this, contacts)
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    private fun createContacts(): List<Contact> {
        return generateContacts(15)
    }

    fun generateContacts(num: Int): List<Contact> {
        val contacts = mutableListOf<Contact>()

        for(i in 1..num) {
            contacts.add(Contact(name = names.random(), pictures = pictures.random()))
        }
        return contacts
    }

    val names : List<String> = listOf("Jane", "Isaac", "noel", "Smith", "Ekene", "Matt", "Kunle","Olaolu", "Obami", "Theo", "Mary", "Abigail")
    val pictures : List<Int> = listOf(
        R.drawable.ellipse,
        R.drawable.ellipse,
        R.drawable.ellipse,
        R.drawable.ellipse,
        R.drawable.ellipse,
        R.drawable.ellipse,
        R.drawable.ellipse,
        R.drawable.ellipse,
        R.drawable.ellipse,
        R.drawable.ellipse,
        R.drawable.ellipse,
        R.drawable.ellipse,
    )
}