package com.nastyaanastasya.animation.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nastyaanastasya.animation.data.Repository
import com.nastyaanastasya.animation.databinding.ActivityMainBinding
import com.nastyaanastasya.animation.presentation.recycler.DataAdapter

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    private val dataAdapter by lazy {
        DataAdapter()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecycler()
        setAdapterData()
    }

    private fun initRecycler() {
        binding.dataRv.run {
            adapter = dataAdapter
        }
    }

    private fun setAdapterData() {
        dataAdapter.submitList(Repository.getData())
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }
}
