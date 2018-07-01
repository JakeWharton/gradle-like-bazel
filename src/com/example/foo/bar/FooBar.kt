package com.example.foo.bar

internal const val JVM = "JVM"

expect class FooBar {
  fun platform(): String
}
