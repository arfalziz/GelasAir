package com.example.gelasair

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.gelasair.databinding.ActivityMainBinding

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    private val viewModel: GelasViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        Log.d(TAG, "onCreate dipanggil")
    }

    override fun onStart() { super.onStart(); Log.d(TAG, "onStart dipanggil") }
    override fun onResume() { super.onResume(); Log.d(TAG, "onResume dipanggil") }
    override fun onPause() { super.onPause(); Log.d(TAG, "onPause dipanggil") }
    override fun onStop() { super.onStop(); Log.d(TAG, "onStop dipanggil") }
    override fun onRestart() { super.onRestart(); Log.d(TAG, "onRestart dipanggil") }
    override fun onDestroy() { super.onDestroy(); Log.d(TAG, "onDestroy dipanggil") }
}