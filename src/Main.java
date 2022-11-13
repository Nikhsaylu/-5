public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int ios = 0;
        int android = 1;
        int clientOs = 0;
        if (clientOs >= 1) {
            System.out.println("Скачайте приложение для андроид по ссылке");
            if (clientOs < 1) {
                System.out.println("Скачайте приложение для Ios по ссылке");
            }
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int ios = 0;
        int android = 1;
        int ClientDeviceyear = 2015;
        if (ClientDeviceyear >= 2015) {
            System.out.println("Установите приложение по ссылке");
            if (ClientDeviceyear < 2015) {
                System.out.println("Скачайте облегченное приложение по ссылке.");
            }
        }
    }
}