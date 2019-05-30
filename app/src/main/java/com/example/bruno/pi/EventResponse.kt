package com.example.bruno.pi

interface EventResponse<T> {
    fun  success(response: T)
}