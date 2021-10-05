package com.company;


import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(metodAdInfo(generateRandomAge(),generateRandomTemp()));
        System.out.println(metodAdInfo(generateRandomAge(),generateRandomTemp()));
        System.out.println(metodAdInfo(generateRandomAge(),generateRandomTemp()));
        System.out.println(metodAdInfo(generateRandomAge(),generateRandomTemp()));
        System.out.println(metodAdInfo(generateRandomAge(),generateRandomTemp()));

    }

    public static String metodAdInfo(int age, int temp) {
        if (age >= 20 && age <= 45 && temp >= -20 && temp <= 30)
            return "Можно идти гулять";
        else if (age < 20 && temp > 0 && temp < 28)
            return "Можно идти прогуляться";
        else if (age > 45 && temp > -10 && temp < 25)
            return "Иди гуляй";
        else
            return "Оставайся дома"; }

    public static int generateRandomAge(){
        Random random = new Random();
        int age = random.nextInt(100);
        System.out.println(age);
        return age;

    }

    public static int generateRandomTemp(){
        Random random = new Random();
        int temp = random.nextInt(35+1) -15;
        System.out.println(temp);
        return temp;

    }




    }




