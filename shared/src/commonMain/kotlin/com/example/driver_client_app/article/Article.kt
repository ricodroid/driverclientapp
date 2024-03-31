package com.example.driver_client_app.article

/**
 * 記事取得APIレスポンスデータクラス
 */
data class Article(
    val title: String,
    val desc: String,
    val date: String,
    val imageUrl: String
)