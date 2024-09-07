package abstractinterfacepoly.phonesmartphone;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        System.out.println("Вас приветствует виртуальная АТС!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш номер телефона:");
        String number = scanner.next();
        System.out.println("Введите номер пользователя, которому хотите позвонить:");
        String friendNumber = scanner.next();
        System.out.println("Выберите модель телефона собеседника, 1 - стационарный телефон, 2 - мобильный телефон, 3 - смартфон:");
        int type = scanner.nextInt();

        if (type < 1 || type > 3) {
            System.out.println("Введена неверная модель телефона");
            return;
        }

        Phone friendPhone = getPhone(type, friendNumber);
        friendPhone.makeCall(friendNumber);

        // Дополнительные функции в зависимости от типа телефона
        if (friendPhone instanceof MobilePhone) {
            ((MobilePhone) friendPhone).sendSms(friendNumber, "Привет!");
        }
        if (friendPhone instanceof Smartphone) {
            ((Smartphone) friendPhone).sendEmail("friend@example.com", "Привет по email!");
        }
    }

    public static Phone getPhone(int type, String number) {
        if (type == 1) {
            return new CellularPhone(number);
        } else if (type == 2) {
            return new MobilePhone(number);
        } else {
            return new Smartphone(number, "WhatsApp");
        }
    }
}
