package com.optic.deliverykotlinudemy.activities.client.address.list

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.optic.deliverykotlinudemy.R
import com.optic.deliverykotlinudemy.activities.client.address.create.ClientAddressCreateActivity

class ClientAddressListActivity : AppCompatActivity() {

    var fabCreateAddress: FloatingActionButton? = null
    var toolbar: Toolbar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_client_address_list)

        fabCreateAddress = findViewById(R.id.fab_address_create)
        toolbar = findViewById(R.id.toolbar)
        toolbar?.setTitleTextColor(ContextCompat.getColor(this, R.color.black))
        toolbar?.title = "Mis direcciones"
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        fabCreateAddress?.setOnClickListener { goToAddressCreate() }
    }

    private fun goToAddressCreate() {
        val i = Intent(this, ClientAddressCreateActivity::class.java)
        startActivity(i)
    }
}