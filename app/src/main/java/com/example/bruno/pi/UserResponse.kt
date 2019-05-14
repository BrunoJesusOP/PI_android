package com.example.bruno.pi

interface UserResponse<T> {
    fun  success(response: T)
}