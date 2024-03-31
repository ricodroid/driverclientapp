package com.example.driver_client_app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform