package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val calculator = Calculator()
    val sum = calculator.add(-1.0, -3.0)      // Returns 8.0
    val difference = calculator.subtract(10.0, 4.0)  // Returns 6.0
    val product = calculator.multiply(2.0, 0.0)    // Returns 6.0
    val quotient = calculator.divide(10.0, 0.0)    // Returns 5.0

    println("Sum: $sum")
    println("Difference: $difference")
    println("Product: $product")
    println("Quotient: $quotient")
}