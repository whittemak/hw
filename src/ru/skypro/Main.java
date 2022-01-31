package ru.skypro;

public class Main {

    public static void main(String[] args) {
	int clientOs = 0;
    if (clientOs == 0) {
        System.out.println("Установите версию приложения для iOS по ссылке");
    } else {
        System.out.println("Установите версию приложения для Android по ссылке");
        int clientDeviceYear = 2015;
        if (clientDeviceYear >= 2015 && clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientDeviceYear < 2015 && clientOs == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOs != 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOs != 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");

            int year = 2021;
            boolean LeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
            if (LeapYear) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");

                int days;
                int deliveryDistance = 95;
                if(deliveryDistance <= 20) {
                    days = 1;
                    if (deliveryDistance >20 && deliveryDistance <= 60) {
                        days = days + 1;
                    }else if (deliveryDistance > 60 && deliveryDistance <= 100) {
                        days = days +1;
                        System.out.println("Потребуется дней " + days);}

                    int  monthNumber = 12;
                    switch (monthNumber) {
                        case 1:
                        case 2:
                        case 12:
                            System.out.printf("Зима");
                            break;
                        case 3:
                        case 4:
                        case 5:
                            System.out.println("Весна");
                            break;
                        case 6:
                        case 7:
                        case 8:
                            System.out.println("Лето");
                            break;
                        case 9:
                        case 10:
                        case 11:
                            System.out.println("Осень");
                            break;
                        default:
                            if(monthNumber >= 13) {
                                System.out.println("Нет такого месяца");
                            }
                }
            }
            }
    }
    }
}

