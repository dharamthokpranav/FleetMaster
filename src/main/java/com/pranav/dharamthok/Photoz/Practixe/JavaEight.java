//package com.pranav.dharamthok.Photoz.Practixe;
//
//import java.time.LocalDate;
//import java.time.LocalTime;
//import java.time.Month;
//import java.util.*;
//import java.util.concurrent.CompletableFuture;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//// Functional Interface example
//@FunctionalInterface
//interface JavaEight {
//    void sayHello(String name);
//
//    // Default method
//    default void sayGoodbye() {
//        System.out.println("Goodbye!");
//    }
//
//    // Static method
//    static void printMessage(String message) {
//        System.out.println(message);
//    }
//}
//
//// Java 8 and advanced features class
//public class JavaEight {
//
//    public static void main(String[] args) {
//
//        // Lambda Expression
//        JavaEight greeting = (name) -> System.out.println("Hello, " + name);
//        greeting.sayHello("John");
//        greeting.sayGoodbye();
//        JavaEight.printMessage("Welcome to Java 8 and Beyond!");
//
//        // Stream API
//        List<String> names = Arrays.asList("John", "Jane", "Jack", "Doe");
//        List<String> filteredNames = names.stream()
//                .filter(name -> name.startsWith("J"))
//                .map(String::toUpperCase)
//                .collect(Collectors.toList());
//        System.out.println("Filtered Names: " + filteredNames);
//
//        // Optional
//        Optional<String> optionalName = findNameById(1);
//        optionalName.ifPresent(name -> System.out.println("Found: " + name));
//
//        // Date and Time API
//        LocalDate dateOfBirth = LocalDate.of(1990, Month.JANUARY, 1);
//        LocalTime timeOfBirth = LocalTime.of(10, 30);
//        System.out.println("Date of Birth: " + dateOfBirth);
//        System.out.println("Time of Birth: " + timeOfBirth);
//
//        // CompletableFuture
//        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Hello from CompletableFuture!")
//                .thenApply(result -> result + " Processed!")
//                .thenApply(String::toUpperCase);
//        future.thenAccept(System.out::println);
//
//        // Method References
//        names.forEach(System.out::println);
//
//        // Parallel Array Sorting
//        int[] numbers = {5, 3, 7, 2, 8, 1};
//        Arrays.parallelSort(numbers);
//        System.out.println("Sorted Numbers: " + Arrays.toString(numbers));
//
//        // Local-Variable Type Inference (Java 10)
//        var inferredList = new ArrayList<>(filteredNames);
//        inferredList.add("New Name");
//        System.out.println("Inferred List: " + inferredList);
//
//        // Text Blocks (Java 13+)
//        String jsonString = """
//                {
//                    "name": "John",
//                    "age": 30
//                }
//                """;
//        System.out.println("JSON String: " + jsonString);
//
//        // Record (Java 14+)
//        Point point = new Point(10, 20);
//        System.out.println("Point: " + point);
//
//        // Sealed Classes (Java 17+)
//        Shape shape = new Circle(5);
//        System.out.println("Shape Area: " + shape.area());
//    }
//
//    // Method returning Optional
//    public static Optional<String> findNameById(int id) {
//        Map<Integer, String> nameMap = Map.of(1, "John", 2, "Jane", 3, "Jack");
//        return Optional.ofNullable(nameMap.get(id));
//    }
//}
//
//// Record example (Java 14+)
//record Point(int x, int y) {}
//
//// Sealed Classes (Java 17+)
//sealed interface Shape permits Circle, Square {
//    double area();
//}
//
//final class Circle implements Shape {
//    private final double radius;
//
//    Circle(double radius) {
//        this.radius = radius;
//    }
//
//    @Override
//    public double area() {
//        return Math.PI * radius * radius;
//    }
//}
//
//final class Square implements Shape {
//    private final double side;
//
//    Square(double side) {
//        this.side = side;
//    }
//
//    @Override
//    public double area() {
//        return side * side;
//    }
//}
