package com.example.kotlinalertdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.kotlinalertdialog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        Toast.makeText(applicationContext,"Helloooo",Toast.LENGTH_LONG).show()

        binding.button.setOnClickListener {

            save(view)
        }
    }

    fun save(view : View){

        val alert = AlertDialog.Builder(this)
        alert.setTitle("Save")
        alert.setMessage("Eminsin mi?")
        alert.setPositiveButton("Yes"){dialog,which->
            Toast.makeText(applicationContext,"Evet dedin", Toast.LENGTH_LONG).show()
        }
        alert.setNegativeButton("No") {dialog,which ->
            Toast.makeText(applicationContext,"Hayır dedin",Toast.LENGTH_LONG).show()
        }
        alert.show()
    }
}













