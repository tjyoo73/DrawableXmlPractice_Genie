package com.tjlab.drawablexmlpractice_genie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar
import androidx.appcompat.app.ActionBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        setSupportActionBar(findViewById(R.id.toolbar))

//        val defaultActionBar = supportActionBar!!
//        defaultActionBar.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
//        defaultActionBar.setCustomView(R.layout.my_custom_actionbar)
//
//        val toolbar = defaultActionBar.customView.parent as Toolbar
//        toolbar.setContentInsetsAbsolute(0,0)
    }
}