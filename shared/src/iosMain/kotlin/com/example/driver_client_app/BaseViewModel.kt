package com.example.driver_client_app

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.cancel

actual open class BaseViewModel {

    actual val scope: CoroutineScope = CoroutineScope(Dispatchers.IO)

    // iOSでは、Coroutineを使用したらclearメソッドを必ず呼び出すこと
    fun clear() {
        scope.cancel()
    }
}