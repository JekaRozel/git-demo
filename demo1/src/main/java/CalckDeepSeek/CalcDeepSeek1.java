package CalckDeepSeek;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcDeepSeek1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            try {
                System.out.print("Введите первое число: ");
                double num1 = scanner.nextDouble();

                System.out.print("Введите второе число: ");
                double num2 = scanner.nextDouble();

                System.out.print("Выберите операцию (+, -, *, /) или 'q' для выхода: ");
                char operation = scanner.next().charAt(0);

                if (operation == 'q') {
                    System.out.println("Выход из программы.");
                    running = false;
                    continue;
                }

                double result = calculate(num1, num2, operation);
                System.out.println("Результат: " + result);

            } catch (InputMismatchException e) {
                System.out.println("Ошибка: введено нечисловое значение. Пожалуйста, введите число.");
                scanner.next(); // Очистка буфера сканера
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }

    public static double calculate(double num1, double num2, char operation) {
        switch (operation) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("Ошибка: деление на ноль!");
                }
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Ошибка: неверная операция! Допустимые операции: +, -, *, /");
        }
    }
}
