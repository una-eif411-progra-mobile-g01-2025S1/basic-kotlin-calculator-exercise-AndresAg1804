package org.example

/**
 * Calculator class providing safe arithmetic operations.
 *
 * This class supports basic arithmetic operations (addition, subtraction, multiplication,
 * and division) on Double values, with checks to prevent operations on infinite values
 * and to detect overflows.
 */
class Calculator {

    /**
     * Adds two Double values while ensuring safe arithmetic.
     *
     * @param a the first operand
     * @param b the second operand
     * @return the sum of a and b, or Double.NaN if either operand is infinite or if the result overflows
     */
    fun add(a: Double, b: Double): Double {
        if (a.isInfinite() || b.isInfinite()) {
            println("Cannot add infinite values")
            return Double.NaN
        }
        val result = a + b
        if (result.isInfinite()) {
            println("Addition resulted in an overflow")
            return Double.NaN
        }
        return result
    }

    /**
     * Subtracts the second Double value from the first while ensuring safe arithmetic.
     *
     * @param a the minuend
     * @param b the subtrahend
     * @return the difference between a and b, or Double.NaN if either operand is infinite or if the result overflows
     */
    fun subtract(a: Double, b: Double): Double {
        if (a.isInfinite() || b.isInfinite()) {
            println("Cannot subtract infinite values")
            return Double.NaN
        }
        val result = a - b
        if (result.isInfinite()) {
            println("Subtraction resulted in an overflow")
            return Double.NaN
        }
        return result
    }

    /**
     * Multiplies two Double values while ensuring safe arithmetic.
     *
     * @param a the first operand
     * @param b the second operand
     * @return the product of a and b, or Double.NaN if either operand is infinite or if the result overflows
     */
    fun multiply(a: Double, b: Double): Double {
        if (a.isInfinite() || b.isInfinite()) {
            println("Cannot multiply infinite values")
            return Double.NaN
        }
        val result = a * b
        if (result.isInfinite()) {
            println("Multiplication resulted in an overflow")
            return Double.NaN
        }
        return result
    }

    /**
     * Divides the first Double value by the second while ensuring safe arithmetic.
     *
     * Checks for infinite operands, division by zero, and result overflow.
     *
     * @param a the dividend
     * @param b the divisor
     * @return the quotient of a divided by b, or Double.NaN if either operand is infinite, if b is zero,
     *         or if the result overflows
     */
    fun divide(a: Double, b: Double): Double {
        if (a.isInfinite() || b.isInfinite()) {
            println("Cannot divide infinite values")
            return Double.NaN
        }
        if (b == 0.0) {
            println("Cannot divide by zero")
            return Double.NaN
        }
        val result = a / b
        if (result.isInfinite()) {
            println("Division resulted in an overflow")
            return Double.NaN
        }
        return result
    }
}