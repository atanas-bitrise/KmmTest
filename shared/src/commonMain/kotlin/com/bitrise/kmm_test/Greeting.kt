package com.bitrise.kmm_test

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}