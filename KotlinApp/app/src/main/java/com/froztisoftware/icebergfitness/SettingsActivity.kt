package com.froztisoftware.icebergfitness

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.preference.PreferenceFragmentCompat
import com.google.android.material.appbar.MaterialToolbar

class SettingsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.settings_activity)

        val appBar: MaterialToolbar = findViewById(R.id.settingsAppBar)

        appBar.setNavigationOnClickListener {
            finish()
        }
    }
}