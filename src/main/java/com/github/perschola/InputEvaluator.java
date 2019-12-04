package com.github.perschola;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputEvaluator {
    private int sum, number;
    private boolean exc;

    public InputEvaluator(){exc = true; sum = 0;}

    private boolean isExc() {
        return exc;
    }

    private void setExc(boolean exc) {
        this.exc = exc;
    }

    private int getNumber() {
        return number;
    }

    private void setNumber(int number) {
        this.number = number;
    }

    private int getSum() {
        return sum;
    }

    private void setSum(int sum) {
        this.sum = sum;
    }

    private void readInputFromUser(Scanner scanner) {
        while (isExc()) {
            setExc(false);
            try {
                setNumber(scanner.nextInt());
            } catch (InputMismatchException ime) {
                System.out.println("Please, enter an integer");
                setExc(true);
                scanner.nextLine();
            }
        }
    }

    private int calculateSumOfInput()
    {
        for (int i = getNumber(); i >=0; i--)
            setSum(getSum() + i);
        return getSum();
    }

    protected void run() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter an integer");

        readInputFromUser(scanner);
        System.out.println("The cumulative sum of " + number + " is " + calculateSumOfInput());
    }
}


