package ru.netology.sqr;

public class SQRService {
    public static void main(String[] args) {

    }

    public static int calculateSQR (int downRande, int upRange) {
        int counter = 0;
        for (int i = 10; i < 99; i++) {
            if (i * i >= downRande && i * i <= upRange) counter++;
        }
        return counter;
    }

}