package com.froztisoftware.icebergfitness

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Log.INFO
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import android.widget.Toolbar
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.froztisoftware.icebergfitness.util.DBHandler
import com.froztisoftware.icebergfitness.util.models.Exercise
import com.froztisoftware.icebergfitness.util.models.User
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView
import com.google.android.material.snackbar.Snackbar
import java.util.logging.Level.INFO

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    private lateinit var toolbar: CollapsingToolbarLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpNavigation()

        val dbHandler = DBHandler(this)
        val dbRead = dbHandler.readableDatabase
        val dbWrite = dbHandler.writableDatabase
        dbRead.version
    }

    private fun setUpNavigation(){
        val settings = Intent(this, SettingsActivity::class.java)
        toolbar = findViewById(R.id.collapsingAppBar)
        val appBar: MaterialToolbar = findViewById(R.id.topAppBar)
        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottom_navigation)
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController

        bottomNavigationView.menu.findItem(R.id.workouts).isChecked = true

        bottomNavigationView.setOnNavigationItemSelectedListener() { item ->
            when(item.itemId) {
                R.id.profile -> {
                    navigate(item)
                }
                R.id.history -> {
                    navigate(item)
                }
                R.id.workouts -> {
                    navigate(item)
                }
                R.id.plans -> {
                    navigate(item)
                }
                R.id.exercises -> {
                    navigate(item)
                }
            }
            true
        }

        appBar.setOnMenuItemClickListener { item ->
            when (item.itemId)
            {
                R.id.settings -> {
                    startActivity(settings)
                }
            }
            true
        }
    }

    private fun toast(text: String){
        Toast.makeText(this, text, Toast.LENGTH_LONG).show()
    }

    @SuppressLint("ResourceType")
    fun navigate(item: MenuItem)
    {
        val text = item.toString()
        toolbar.isTitleEnabled = false
        toolbar.title = text
        toolbar.isTitleEnabled = true
        NavigationUI.onNavDestinationSelected(item, navController)
    }
}