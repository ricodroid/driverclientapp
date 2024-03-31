package com.example.driver_client_app

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope

actual open class BaseViewModel: ViewModel() {
    actual val scope = viewModelScope
}