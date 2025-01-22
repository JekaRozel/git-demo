package CalckDeepSeek;

import java.util.*;

public class CalcDeepSeek2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите выражение (или 'q' для выхода): ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("q")) {
                System.out.println("Выход из программы.");
                break;
            }

            try {
                double result = evaluateExpression(input);
                System.out.println("Результат: " + result);
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }

        scanner.close();
    }

    // Основной метод для вычисления выражения
    public static double evaluateExpression(String expression) {
        List<String> tokens = tokenize(expression); // Разбиваем выражение на токены
        List<String> rpn = convertToRPN(tokens); // Преобразуем в обратную польскую запись
        return evaluateRPN(rpn); // Вычисляем результат
    }

    // Разбиение выражения на токены (числа, операторы, скобки)
    private static List<String> tokenize(String expression) {
        List<String> tokens = new ArrayList<>();
        StringBuilder numberBuffer = new StringBuilder();

        for (char ch : expression.toCharArray()) {
            if (Character.isDigit(ch) || ch == '.') {
                numberBuffer.append(ch); // Собираем число
            } else {
                if (numberBuffer.length() > 0) {
                    tokens.add(numberBuffer.toString()); // Добавляем число в токены
                    numberBuffer.setLength(0); // Очищаем буфер
                }
                if (!Character.isWhitespace(ch)) {
                    tokens.add(String.valueOf(ch)); // Добавляем оператор или скобку
                }
            }
        }

        if (numberBuffer.length() > 0) {
            tokens.add(numberBuffer.toString()); // Добавляем последнее число
        }

        return tokens;
    }

    // Преобразование в обратную польскую запись (ОПЗ)
    private static List<String> convertToRPN(List<String> tokens) {
        List<String> output = new ArrayList<>();
        Stack<String> operators = new Stack<>();

        for (String token : tokens) {
            if (isNumber(token)) {
                output.add(token); // Числа сразу добавляем в выходной список
            } else if (isOperator(token)) {
                // Обрабатываем приоритет операторов
                while (!operators.isEmpty() && isOperator(operators.peek()) &&
                        getPrecedence(operators.peek()) >= getPrecedence(token)) {
                    output.add(operators.pop());
                }
                operators.push(token);
            } else if (token.equals("(")) {
                operators.push(token); // Открывающую скобку добавляем в стек
            } else if (token.equals(")")) {
                // Выталкиваем операторы из стека до открывающей скобки
                while (!operators.isEmpty() && !operators.peek().equals("(")) {
                    output.add(operators.pop());
                }
                if (operators.isEmpty()) {
                    throw new IllegalArgumentException("Несогласованные скобки");
                }
                operators.pop(); // Удаляем открывающую скобку
            }
        }

        // Выталкиваем оставшиеся операторы из стека
        while (!operators.isEmpty()) {
            if (operators.peek().equals("(")) {
                throw new IllegalArgumentException("Несогласованные скобки");
            }
            output.add(operators.pop());
        }

        return output;
    }

    // Вычисление результата из ОПЗ
    private static double evaluateRPN(List<String> rpn) {
        Stack<Double> stack = new Stack<>();

        for (String token : rpn) {
            if (isNumber(token)) {
                stack.push(Double.parseDouble(token)); // Числа добавляем в стек
            } else if (isOperator(token)) {
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("Недостаточно операндов для операции " + token);
                }
                double b = stack.pop();
                double a = stack.pop();
                stack.push(applyOperation(a, b, token)); // Выполняем операцию
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException("Ошибка в выражении");
        }

        return stack.pop();
    }

    // Проверка, является ли токен числом
    private static boolean isNumber(String token) {
        try {
            Double.parseDouble(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Проверка, является ли токен оператором
    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    // Получение приоритета оператора
    private static int getPrecedence(String operator) {
        switch (operator) {
            case "+":
            case "-":
                return 1;
            case "*":
            case "/":
                return 2;
            default:
                return 0;
        }
    }

    // Выполнение операции
    private static double applyOperation(double a, double b, String operator) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) {
                    throw new ArithmeticException("Деление на ноль");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Неизвестный оператор: " + operator);
        }
    }
}
