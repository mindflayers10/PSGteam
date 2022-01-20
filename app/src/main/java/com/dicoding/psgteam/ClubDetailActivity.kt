package com.dicoding.psgteam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class ClubDetailActivity : AppCompatActivity() {
    companion object {
        const val  EXTRA_NAME = "extra_name"
        const val  EXTRA_DETAIL = "extra_detail"
        const val EXTRA_PHOTO = "extra_photo"
    }




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_club_detail)
        supportActionBar?.title= "Nama Pemain"

        val tvItemJudulReceived: TextView = findViewById(R.id.tv_judul)
        val tvItemDeskripsiReceived: TextView = findViewById(R.id.tv_deskripsi)
        val imgItemPhotoReceived: ImageView = findViewById(R.id.img_item_photo)

        val name = intent.getStringExtra(EXTRA_NAME)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val photo = intent.getIntExtra(EXTRA_PHOTO, 0)

        tvItemJudulReceived.text = name
        tvItemDeskripsiReceived.text = detail
        imgItemPhotoReceived.setImageResource(photo)
    }
}