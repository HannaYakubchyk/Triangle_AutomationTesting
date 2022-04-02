
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.Assert.*;

public class TriangleTest {

    static Triangle[] sidesForEquilateralTriangle(){
        return new Triangle[]{
                new Triangle(1,1,1),
                new Triangle(1000, 1000, 1000),
                new Triangle(1000000000,1000000000,1000000000)};
    }

    static Triangle[] sidesForIsoscelesTriangle(){
        return new Triangle[]{
                new Triangle(1,2,2),
                new Triangle(2,2,1),
                new Triangle(2,1,2),
                new Triangle(900, 1000, 1000),
                new Triangle(1000, 1000, 900),
                new Triangle(1000, 900, 1000),
                new Triangle(1000000000,1000000000,900000000),
                new Triangle(900000000,1000000000,1000000000),
                new Triangle(1000000000,900000000,1000000000),};
    }

    static Triangle[] sidesForScaleneTriangle(){
        return new Triangle[]{
                new Triangle(4,2,3),
                new Triangle(4,3,2),
                new Triangle(2,3,4),
                new Triangle(2, 4, 3),
                new Triangle(3, 2, 4),
                new Triangle(3, 4, 2),};
    }

    static Triangle[] sidesOutOfBoundaries(){
        return new Triangle[]{
                new Triangle(1, 1, 0),
                new Triangle(1, 0, 1),
                new Triangle(0, 1, 1),
                new Triangle(1, 1, -1),
                new Triangle(1, -1,1),
                new Triangle(-1,1, 1),
        };
    }
    static Triangle[] sidesForNotTriangle(){
        return new Triangle[]{
                new Triangle(1, 1, 3),
                new Triangle(1, 3, 1),
                new Triangle(3, 1, 1),
        };
    }

    @ParameterizedTest
    @MethodSource("sidesForEquilateralTriangle")
    public void isTriangle1(Triangle triangle) {
        assertEquals("Это равносторонний треугольник", triangle.isTriangle(triangle));
    }

    @ParameterizedTest
    @MethodSource("sidesForIsoscelesTriangle")
    public void isTriangle2(Triangle triangle) {
        assertEquals("Это равнобедренный треугольник", triangle.isTriangle(triangle));
    }

    @ParameterizedTest
    @MethodSource("sidesForScaleneTriangle")
    public void isTriangle3(Triangle triangle) {
        assertEquals("Это разносторонний треугольник", triangle.isTriangle(triangle));
    }

    @ParameterizedTest
    @MethodSource("sidesOutOfBoundaries")
    public void isTriangle4(Triangle triangle) {
        assertEquals("Любое из вводимых значений не может быть равно 0 или быть меньше 0", triangle.isTriangle(triangle));
    }

    @ParameterizedTest
    @MethodSource("sidesForNotTriangle")
    public void isTriangle5(Triangle triangle) {
        assertEquals("Это не треугольник", triangle.isTriangle(triangle));
    }}

