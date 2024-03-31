package com.example.driver_client_app.article

/**
 * 記事取得APIの状態データクラス
 */
data class ArticlesState (
    val articles: List<Article> = listOf(),
    val loading: Boolean = false,
    val error: String? = null,
)
