package com.example.themoviedb.network

interface OnFinishedListener {
    fun <T> success(dataList: T)
    fun failure(errorMessage: String)
}