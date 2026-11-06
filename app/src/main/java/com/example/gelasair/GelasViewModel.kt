package com.example.gelasair

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.map

class GelasViewModel : ViewModel() {

    val target = 8

    private val _jumlah = MutableLiveData(0)
    val jumlah: LiveData<Int> = _jumlah

    val targetTercapai: LiveData<Boolean> = jumlah.map { it >= target }
    val persentase: LiveData<Int> = jumlah.map { nilai ->
        (nilai * 100) / target
    }

    init {
        Log.d("GelasViewModel", "GelasViewModel dibuat")
    }

    fun tambah() {
        _jumlah.value = (_jumlah.value ?: 0) + 1
    }
    fun kurangi() {
        val nilaiSekarang = _jumlah.value ?: 0

        if (nilaiSekarang > 0) {
            _jumlah.value = nilaiSekarang - 1
        }
    }

    fun reset() {
        _jumlah.value = 0
    }

    override fun onCleared() {
        super.onCleared()
        Log.d("GelasViewModel", "GelasViewModel dihapus (onCleared)")
    }
}