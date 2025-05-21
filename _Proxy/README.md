# Proxy Design Pattern Example

This example demonstrates the Proxy design pattern.

## What is the Proxy Pattern?

The Proxy pattern provides a surrogate or placeholder for another object to control access to it. This is useful when an object is resource-intensive to create, or when you want to add some behavior before or after accessing the original object.

There are several types of proxies:
- **Remote Proxy:** Represents an object in a different address space.
- **Virtual Proxy:** Creates expensive objects on demand. (This example demonstrates a Virtual Proxy)
- **Protection Proxy:** Controls access to the original object. Protection proxies are useful when objects should have different access rights.
- **Smart Proxy:** Performs additional actions when an object is accessed, such as reference counting.

## How this Example Works

This example uses a Virtual Proxy.

1.  **`Image` Interface:** Defines the common interface for `RealImage` and `ProxyImage`. It has a `display()` method.
2.  **`RealImage` Class:** This is the "real" object that we want to control access to. It simulates loading an image from disk (an expensive operation) in its constructor.
3.  **`ProxyImage` Class:** This is the proxy. It holds a reference to a `RealImage` object.
    *   When `display()` is called on the `ProxyImage` for the first time, it creates an instance of `RealImage` (simulating the expensive loading) and then calls `display()` on the `RealImage`.
    *   On subsequent calls to `display()` on the `ProxyImage`, it simply delegates the call to the already existing `RealImage` object, without creating it again.
4.  **`Main` Class:** Demonstrates the behavior.
    *   It creates a `ProxyImage`.
    *   The first time `image.display()` is called, "Loading test_10mb.jpg" and "Displaying test_10mb.jpg" are printed.
    *   The second time `image.display()` is called, only "Displaying test_10mb.jpg" is printed, because the `RealImage` was already loaded.

## How to Compile and Run

Navigate to the `_Proxy/src` directory and compile the Java files:
```bash
javac proxy/*.java
```

Then, from the `_Proxy/src` directory, run the `Main` class:
```bash
java proxy.Main
```

You should see output similar to this:
```
Loading test_10mb.jpg
Displaying test_10mb.jpg

Displaying test_10mb.jpg
```
