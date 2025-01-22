package CalckGPT;

import java.util.Scanner;

public class CalckGPT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в калькулятор!");
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите операцию (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Ошибка: деление на ноль!");
                    return;
                }
                break;
            default:
                System.out.println("Ошибка: недопустимая операция!");
                return;
        }

        System.out.println("Результат: " + result);
        scanner.close();
    }
}
