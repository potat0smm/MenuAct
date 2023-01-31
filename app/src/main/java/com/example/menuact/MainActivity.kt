package com.example.menuact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.menuact.databinding.ActivityMainBinding
import com.example.menuact.databinding.BottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var taskViewModel: TaskViewModel
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        taskViewModel = ViewModelProvider(this).get(TaskViewModel::class.java)
        binding.fab.setOnClickListener {
            SheetFragment().show(supportFragmentManager, "NewTaskTag")
        }
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )


        binding.bottomNavigation.setOnItemReselectedListener {

            when(it.itemId){
                R.id.menu->{
                    val recyclerView =findViewById<RecyclerView>(R.id.recycler_view)
                    
                }
            }
        }



        //val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        //recyclerView

    }


}
