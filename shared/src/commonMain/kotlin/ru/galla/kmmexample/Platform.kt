package ru.galla.kmmexample

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform