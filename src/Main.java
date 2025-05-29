public class Main {
    public static void main(String[] args) {
        System.out.println("задание 1");
        int clientOS = 0;
        if (clientOS==0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("");

        System.out.println("задание 2");
        int clientDeviceYear = 2015;
        if (clientDeviceYear >= 2015) {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
        System.out.println("");

        System.out.println("задание 3");
        int year = 2021;
        boolean a = year % 100 == 0 && year % 4 != 0 || year % 400 != 0;
        boolean b = year >= 1584;
        if (a && b) {
            System.out.println(year + " год не высокосный");
        } else if (!a && b) {
            System.out.println(year + " год высокосный");
        } else {
            System.out.println("Понятие 'высокосный год' появилось только после 1584 года");
        }
        System.out.println("");

        System.out.println("задание 4");
        int deliveryDistance = 95;
        int term = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + term);
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            term = term + 1;
            System.out.println("Потребуется дней: " + term);
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            term = term + 1 + 1;
            System.out.println("Потребуется дней: " + term);
        } else {
            System.out.println("Доставки нет");
        }
        System.out.println("");

        System.out.println("задание 5");
        char monthNumber = 12;
        switch (monthNumber) {
            case 12, 1, 2 -> System.out.println("зима");
            case 3, 4, 5 -> System.out.println("весна");
            case 6, 7, 8 -> System.out.println("лето");
            case 9, 10, 11 -> System.out.println("осень");
            default -> System.out.println("такого месяца нет");
        }
    }
}
