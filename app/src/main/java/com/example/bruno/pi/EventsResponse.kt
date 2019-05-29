package com.example.bruno.pi

interface EventsResponse<T> {
    fun  success(response: T)
}