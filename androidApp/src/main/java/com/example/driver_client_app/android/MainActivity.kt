package com.example.driver_client_app.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.driver_client_app.Platform
import com.example.driver_client_app.android.screens.AboutScreen
import com.example.driver_client_app.android.screens.ArticlesScreen
import com.example.driver_client_app.article.ArticlesViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val articlesViewModel: ArticlesViewModel by viewModels()

        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArticlesScreen(articlesViewModel = articlesViewModel)
                }
            }
        }
    }
}

// プレビュー
@Preview
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        AboutScreen()
    }
}
