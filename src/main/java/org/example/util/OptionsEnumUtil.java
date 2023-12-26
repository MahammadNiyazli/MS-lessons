package org.example.util;

import org.example.enums.OptionsEnum;

import java.util.Scanner;

public class OptionsEnumUtil {

    public static void printOptions(){
        OptionsEnum[] optionsEnums = OptionsEnum.values();
        System.err.println("******************************");
        for (OptionsEnum optionsEnum : optionsEnums){
            System.out.println(optionsEnum.getIndex()+"."+optionsEnum.getDescription());
        }
        System.err.println("******************************");
    }

    public static OptionsEnum chooseOption(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zəhmət olmasa seçim edin :");
        int index = scanner.nextInt();
        return OptionsEnum.getEnumByIndex(index);
    }
}
