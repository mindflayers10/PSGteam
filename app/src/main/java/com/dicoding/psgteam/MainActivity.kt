package com.dicoding.psgteam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvClub: RecyclerView
    private var list: ArrayList<Club> = arrayListOf()
    private var title: String = "ModeList"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvClub = findViewById(R.id.rv_club)
        rvClub.setHasFixedSize(true)

        list.addAll(ClubData.listData)
        showRecyclerList()
    }
    private fun showRecyclerList() {
        rvClub.layoutManager = LinearLayoutManager(this)
        val listClubAdapter = ListClubAdapter(list)
        rvClub.adapter = listClubAdapter

        listClubAdapter.setOnItemClickCallback(object : ListClubAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Club) {
                showSelectedClub(data)
            }
        })
    }

//    private fun setMode(selectedMode: Int) {
//        when (selectedMode) {
//
//            R.id.action_about -> {
//                title = "About"
//                showRecyclerList()
//            }
//        }
//        setActionBarTitle(title)
//    }


    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    private fun showSelectedClub(club: Club) {
        val moveWithDataIntent = Intent(this@MainActivity, ClubDetailActivity::class.java)
        moveWithDataIntent.putExtra(ClubDetailActivity.EXTRA_NAME,club.name)
        moveWithDataIntent.putExtra(ClubDetailActivity.EXTRA_DETAIL,club.detail)
        moveWithDataIntent.putExtra(ClubDetailActivity.EXTRA_PHOTO,club.photo)
        startActivity(moveWithDataIntent)
    //    Toast.makeText(this, "Kamu memilih " + club.name, Toast.LENGTH_SHORT).show()
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)

        }

    private fun setMode(selectedMode: Int) {

        fun aboutClicked(){
            val moveAbout = Intent(this@MainActivity,AboutActivity::class.java)
            startActivity(moveAbout)
        }
        when (selectedMode) {
            R.id.action_about -> {
                title = "about"
                aboutClicked()

            }
        }
    }
}