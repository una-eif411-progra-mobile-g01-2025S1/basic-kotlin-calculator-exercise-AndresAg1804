package org.example

class Calculator {
    fun add(a: Double, b: Double): Double {
        if (a.isInfinite() || b.isInfinite()) {
            println("Cannot add infinite values")
            return Double.NaN
        }
        return a + b
    }

    fun subtract(a: Double, b: Double): Double {
        if (a.isInfinite() || b.isInfinite()) {
            println("Cannot subtract infinite values")
            return Double.NaN
        }
        return a - b
    }

    fun multiply(a: Double, b: Double): Double {
        if (a.isInfinite() || b.isInfinite()) {
            println("Cannot multiply infinite values")
            return Double.NaN
        }
        return a * b
    }

    fun divide(a: Double, b: Double): Double {
        if (a.isInfinite() || b.isInfinite()) {
            println("Cannot divide infinite values")
            return Double.NaN
        }
        if (b == 0.0) {
            println("Cannot divide by zero")
            return Double.NaN
        }
        return a / b
    }
}