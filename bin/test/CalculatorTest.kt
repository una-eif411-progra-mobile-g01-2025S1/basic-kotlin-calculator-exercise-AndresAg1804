import org.example.Calculator
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.BeforeEach

/**
 * Test class for the Calculator.
 *
 * This class contains unit tests for each arithmetic operation provided by the Calculator class.
 * It verifies both correct functionality for valid inputs and proper error handling for invalid cases.
 */
class CalculatorTest {

    /**
     * Instance of Calculator used in the tests.
     */
    private lateinit var calculator: Calculator

    /**
     * Initializes the Calculator instance before each test.
     */
    @BeforeEach
    fun setUp() {
        calculator = Calculator()
    }

    /**
     * Tests the addition operation.
     *
     * Verifies that adding 1.0 and 2.0 produces the correct result of 3.0.
     */
    @Test
    fun testAddition() {
        // Arrange: Define the test values.
        val a = 1.0
        val b = 2.0
        // Act: Perform the addition.
        val result = calculator.add(a, b)
        // Assert: Check that the result is as expected.
        assertEquals(3.0, result, "The sum of $a and $b should be 3.0")
    }

    /**
     * Tests the subtraction operation.
     *
     * Verifies that subtracting 2.0 from 4.0 produces the correct result of 2.0.
     */
    @Test
    fun testSubtraction() {
        // Arrange: Define the test values.
        val a = 4.0
        val b = 2.0
        // Act: Perform the subtraction.
        val result = calculator.subtract(a, b)
        // Assert: Check that the result is as expected.
        assertEquals(2.0, result, "The difference of $a and $b should be 2.0")
    }

    /**
     * Tests the multiplication operation.
     *
     * Verifies that multiplying 3.0 by 4.0 produces the correct result of 12.0.
     */
    @Test
    fun testMultiplication() {
        // Arrange: Define the test values.
        val a = 3.0
        val b = 4.0
        // Act: Perform the multiplication.
        val result = calculator.multiply(a, b)
        // Assert: Check that the result is as expected.
        assertEquals(12.0, result, "The product of $a and $b should be 12.0")
    }

    /**
     * Tests the division operation.
     *
     * Verifies that dividing 10.0 by 2.0 produces the correct result of 5.0.
     */
    @Test
    fun testDivision() {
        // Arrange: Define the test values.
        val a = 10.0
        val b = 2.0
        // Act: Perform the division.
        val result = calculator.divide(a, b)
        // Assert: Check that the result is as expected.
        assertEquals(5.0, result, "The quotient of $a and $b should be 5.0")
    }

    /**
     * Tests error cases for the arithmetic operations.
     *
     * Verifies that the Calculator correctly handles error conditions by returning Double.NaN
     * when given invalid inputs such as infinite values or division by zero.
     */
    @Test
    fun testErrorCases() {
        // Arrange: Define values that trigger error conditions.
        // Addition: Using an infinite value.
        val a1 = Double.POSITIVE_INFINITY
        val b1 = 1.0

        // Subtraction: Using an infinite value.
        val a2 = 1.0
        val b2 = Double.NEGATIVE_INFINITY

        // Multiplication: Infinite value multiplied by zero.
        val a3 = Double.POSITIVE_INFINITY
        val b3 = 0.0

        // Division: Division by zero.
        val a4 = 1.0
        val b4 = 0.0

        // Act: Perform operations expected to produce errors.
        val result1 = calculator.add(a1, b1)
        val result2 = calculator.subtract(a2, b2)
        val result3 = calculator.multiply(a3, b3)
        val result4 = calculator.divide(a4, b4)

        // Assert: Verify that each operation returns Double.NaN.
        assertEquals(Double.NaN, result1, "The sum of $a1 and $b1 should be Double.NaN")
        assertEquals(Double.NaN, result2, "The difference of $a2 and $b2 should be Double.NaN")
        assertEquals(Double.NaN, result3, "The product of $a3 and $b3 should be Double.NaN")
        assertEquals(Double.NaN, result4, "The quotient of $a4 and $b4 should be Double.NaN")
    }
}