package com.roberto.drawer.ui.slideshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SlideshowViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Nosotros - Motocicletas Correcaminos"
    }
    val text: LiveData<String> = _text
}
