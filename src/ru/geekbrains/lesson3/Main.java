package ru.geekbrains.lesson3;

//1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число.
//При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
//После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).


import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("Будем играть? 1 – да / 0 – нет");
            int repeat = scanner.nextInt();
            if (repeat == 1) {
                playGame();
            } else {
                System.out.println("Конец!");
                scanner.close();
            }
        }
    }

    private static void playGame() {

        int number = (int)(Math.random() * 10);
        boolean winner = false;

        System.out.println("Ваша задача угадать число");
        for (int i = 0; i <= 2; i++) {
            System.out.println("Задайте число от 0 до 9");
            int input_number = scanner.nextInt();
            if (input_number == number) {
                System.out.println("Вы угадали!");
                winner = true;
                break;
            } else if (input_number > number) {
                System.out.println("Загаданное число меньше");
            } else {
                System.out.println("Загаданное число больше");
            }
        }
        if (winner == true) {
            System.out.println("Победа!");
        } else {
            System.out.println("Вы проиграли!");
        }
    }
}