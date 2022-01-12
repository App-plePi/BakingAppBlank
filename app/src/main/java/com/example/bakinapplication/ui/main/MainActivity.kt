package com.example.bakinapplication.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat.startActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.DataBindingUtil.setContentView
import androidx.lifecycle.ViewModelProvider
import com.example.bakinapplication.R
import com.example.bakinapplication.databinding.ActivityMainBinding
import com.example.bakinapplication.ui.profile.ProfileActivity
import com.example.bakinapplication.viewmodel.MainViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val viewModel by lazy {
        ViewModelProvider(this).get(MainViewModel::class.java)
    }
    private val adapter = RecipeAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.mainRecipeCreateButton.__________________ { //클릭 이벤트를 실행하는 코드
            _____________________________________________________________//RecipeCreateActivity로 화면을 전환하는 코드
        }

        binding.mainProfileImage.__________________ {//클릭 이벤트를 실행하는 코드
            ________________________________________________________//ProfileActivity로 화면을 전환하는 코드
        }
    }

    override fun onResume() {
        super.onResume()
        binding.mainRecycler.adapter = adapter
        adapter.removeAll()
        CoroutineScope(Dispatchers.Main).launch {
            adapter.addItem(viewModel.getList()!!)
        }
    }
}
