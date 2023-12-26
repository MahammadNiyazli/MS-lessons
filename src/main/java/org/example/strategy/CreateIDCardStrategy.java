package org.example.strategy;

import org.example.DB.DB;
import org.example.entity.IDCard;

import java.awt.*;
import java.util.Scanner;

public class CreateIDCardStrategy implements AbstractCardStrategy{
    @Override
    public void process() {
        System.out.println("Sexsiyyet veqiqesi yaratmaq ucun qeyd olunan addimlari atin");
        IDCard idCard = new IDCard();
        System.out.print("Adı daxil edin :");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        System.out.print("Soyadi daxil edin :");
        String surname = scanner.next();

        System.out.print("fini daxil edin :");
        String pin = scanner.next();

        System.out.print("Vesiqe nomresini daxil edin :");
        String cardNumber = scanner.next();

        idCard.setName(name)
                .setSurname(surname)
                .setPin(pin)
                .setCardNumber(cardNumber);

        DB.addIdCard(idCard);
        System.err.println("Yeni sexsiyyet vesiqesi yaradildi");
        System.err.println("Just change");
    }
}
