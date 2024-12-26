// Question 1
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println((x * (x + 1)) / 2);
    }
}

// Question 2
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int val1 = (int) Math.ceil(Math.sqrt(x));
        int val2 = x;
        boolean isPrime = true;

        for (int i = 2; i <= val1; i++) {
            if (val2 % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime && val2 != 1 || val2 == 2 || val2 == 3) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

// Question 3
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        for (int i = 0; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.print(i + "\t");
            }
        }
    }
}

// Question 4
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(x * x);
    }
}

// Question 5
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " X " + n + " = " + (i * n));
        }
    }
}

// Question 6
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println((int) Math.floor(Math.log10(x) + 1));
    }
}

// Question 7
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int rev = 0;

        while (x != 0) {
            int rem = x % 10;
            rev = rev * 10 + rem;
            x = x / 10;
        }
        System.out.println(rev);
    }
}

// Question 8
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long ans = -1;

        while (n != 0) {
            long val = n % 10;
            ans = ans == -1 ? val : Math.max(ans, val);
            n = n / 10;
        }
        System.out.println(ans);
    }
}

// Question 9
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int que = scanner.nextInt();
        int n = que;
        int rev = 0;

        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }

        if (rev == que) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}

// Question 10
import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;

        while (n != 0) {
            int a = n % 10;
            sum += a;
            n = n / 10;
        }
        System.out.println(sum);
    }
}

// Question 11
public class Question11 {
    public static void calculateArea(double radius) {
        System.out.println("Circle Area: " + (3.14159 * radius * radius));
    }

    public static void calculateArea(double length, double breadth) {
        System.out.println("Rectangle Area: " + (length * breadth));
    }

    public static void calculateArea(double base, double height, int triangle) {
        System.out.println("Triangle Area: " + (0.5 * base * height));
    }
}

// Question 12
public class Question12 {
    public static void calculateSalary(int stipend) {
        System.out.println("Intern Salary: " + stipend);
    }

    public static void calculateSalary(int baseSalary, int bonuses) {
        System.out.println("Employee Salary: " + (baseSalary + bonuses));
    }

    public static void calculateSalary(int baseSalary, int bonuses, int incentives) {
        System.out.println("Manager Salary: " + (baseSalary + bonuses + incentives));
    }
}

// Question 13
class Employee {
    private int id;
    private String name;
    private float salary;

    public void setDetails(int empId, String empName, float empSalary) {
        id = empId;
        name = empName;
        salary = empSalary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}

// Question 14
class Student {
    public int rollNumber;
    public String name;

    public void setStudentDetails(int r, String n) {
        rollNumber = r;
        name = n;
    }
}

class Result extends Student {
    private int[] marks = new int[3];

    public void setMarks(int m1, int m2, int m3) {
        marks[0] = m1;
        marks[1] = m2;
        marks[2] = m3;
    }

    public void calculateAndDisplay() {
        int total = marks[0] + marks[1] + marks[2];
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + (total / 3.0) + "%");
    }
}

// Question 15
abstract class Shape {
    public abstract void calculateArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double r) {
        radius = r;
    }

    @Override
    public void calculateArea() {
        System.out.println("Circle Area: " + (3.14159 * radius * radius));
    }
}

class Rectangle extends Shape {
    private double length, breadth;

    public Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    @Override
    public void calculateArea() {
        System.out.println("Rectangle Area: " + (length * breadth));
    }
}

class Triangle extends Shape {
    private double base, height;

    public Triangle(double b, double h) {
        base = b;
        height = h;
    }

    @Override
    public void calculateArea() {
        System.out.println("Triangle Area: " + (0.5 * base * height));
    }
}

// Question 17
class MatrixOperations {
    public static void operate(int[][] matA, int[][] matB, int operation) {
        int[][] result = new int[2][2];
        if (operation == 1) { // Addition
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    result[i][j] = matA[i][j] + matB[i][j];
                }
            }
        } else if (operation == 2) { // Multiplication
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    for (int k = 0; k < 2; k++) {
                        result[i][j] += matA[i][k] * matB[k][j];
                    }
                }
            }
        }
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// Question 19
class Book {
    protected String title, author;
    protected int isbn;

    public void setBookDetails(String t, String a, int i) {
        title = t;
        author = a;
        isbn = i;
    }
}

class Borrower {
    protected String name;
    protected int id;

    public void setBorrowerDetails(String n, int i) {
        name = n;
        id = i;
    }
}

class Library extends Book {
    Borrower borrower = new Borrower();

    public void borrowBook(String borrowerName, int borrowerId) {
        borrower.setBorrowerDetails(borrowerName, borrowerId);
        System.out.println(borrower.name + " (ID: " + borrower.id + ") has borrowed \"" + title + "\" by " + author + " (ISBN: " + isbn + ").");
    }

    public void returnBook() {
        System.out.println(borrower.name + " (ID: " + borrower.id + ") has returned \"" + title + "\" by " + author + " (ISBN: " + isbn + ").");
    }
}

// Question 20
abstract class Account {
    public abstract void calculateInterest();
}

class SavingsAccount extends Account {
    private double balance, rate, time;

    public SavingsAccount(double b, double r, double t) {
        balance = b;
        rate = r;
        time = t;
    }

    @Override
    public void calculateInterest() {
        System.out.println("Savings Account Interest: " + (balance * rate * time / 100));
    }
}

class CurrentAccount extends Account {
    private double balance, fee;

    public CurrentAccount(double b, double f) {
        balance = b;
        fee = f;
    }

    @Override
    public void calculateInterest() {
        System.out.println("Balance after fee deduction: " + (balance - fee));
    }
}

