package com.example.a19_menu_options_inflate

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.PopupMenu
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageButton.setOnClickListener {

            var popupmenu = PopupMenu(this,it)
            popupmenu.inflate(R.menu.menuitems)
            popupmenu.show()

            popupmenu.setOnMenuItemClickListener{ item ->
                when(item.itemId){
                    R.id.red ->  { nameTV.setTextColor(Color.RED)
                        true }
                    R.id.green-> { nameTV.setTextColor(Color.GREEN)
                    true
                    }
                    R.id.blue-> {nameTV.setTextColor(Color.BLUE)
                    true }

                else -> false
                }

            }

        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menuitems,menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.red -> nameTV.setTextColor(Color.RED)
            R.id.green -> nameTV.setTextColor(Color.GREEN)
            R.id.blue -> nameTV.setTextColor(Color.BLUE)

        }
        return super.onOptionsItemSelected(item)
    }
}