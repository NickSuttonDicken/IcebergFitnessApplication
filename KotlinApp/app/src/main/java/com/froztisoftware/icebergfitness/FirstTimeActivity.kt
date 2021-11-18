package com.froztisoftware.icebergfitness

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import com.google.android.material.textfield.TextInputLayout
import java.util.regex.Pattern

class FirstTimeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_time)
        setUpView()

    }

    fun setUpView() {
        val heightItems = listOf("cm", "ft")
        val weightItems = listOf("kg", "lbs")
        val heightUnits: TextInputLayout = findViewById(R.id.heightUnits)
        val weightUnits: TextInputLayout = findViewById(R.id.weightUnits)
        val heightAdapter = ArrayAdapter(this, R.layout.dropdown_item, heightItems)
        (heightUnits.editText as? AutoCompleteTextView)?.setAdapter(heightAdapter)
        val weightAdapter = ArrayAdapter(this, R.layout.dropdown_item, weightItems)
        (weightUnits.editText as? AutoCompleteTextView)?.setAdapter(weightAdapter)
    }

    fun submitClick(view: View) {
        val nameField: TextInputLayout = findViewById(R.id.nameField)
        val ageField: TextInputLayout = findViewById(R.id.ageField)
        val heightField: TextInputLayout = findViewById(R.id.heightField)
        val weightField: TextInputLayout = findViewById(R.id.weightField)

        val regex = Pattern.compile("[a-zA-Z- ]+")
        var validName = regex.matcher(nameField.editText!!.text).matches()
        var validAge: Boolean
        var validHeight: Boolean
        var validWeight: Boolean
        if (!validName)
        {
            nameField.error = "Invalid Name"
        } else {
            nameField.error = null
        }
        /*if (!validAge)
        {
            ageField.error = "Invalid Age"
        } else {
            ageField.error = null
        }
        if (!validHeight)
        {
            heightField.error = "Invalid Height"
        } else {
            heightField.error = null
        }
        if (!validWeight)
        {
            weightField.error = "Invalid Weight"
        } else {
            weightField.error = null
        }*/
    }
}