package com.example.foo.baz;

import com.example.foo.bar.FooBar;

public final class Main {
  public static void main(String... args) {
    String platform = new FooBar().platform();
    System.out.println("Hello, " + platform + "!");
  }
}
