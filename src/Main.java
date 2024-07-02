public class Main {
    public static void main(String[] args) {
    //Задача 1
        //установим переменную, отвечающую за тип ОС клиента
        int clientOS =  1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //Задача 2
        //Добавим условие о годе выпуска устройства клиента, соединим оба пункта
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
                    System.out.println("Установите версию приложения для Android по ссылке");
        }
        //Задача 3
        //Составим уравнение, решающее, високосный ли заданный год, или нет
        int year = 2000;
        if (year <= 1584) {
            System.out.println("Високосные года еще не введены!");
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
                System.out.println(year + " год не является високосным");
        }
        //Задача 4
        //Задача на эффективный радиус доставки и время, затрачиваемое на неё
        int deliveryDistance = 95;
        short deliveryDuration = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryDuration);
        } else if (deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (deliveryDuration + 1));
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (deliveryDuration + 2));
        } else {
            System.out.println("Свыше 100 км доставки нет.");
        }
        //Задача 5
        //Применим функцию switch для сопоставления номера месяца в году и времени года
        short monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Это зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Это весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Это лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Это осень");
                break;
            default:
                System.out.println("Некорректный номер месяца");
        }
    }
}