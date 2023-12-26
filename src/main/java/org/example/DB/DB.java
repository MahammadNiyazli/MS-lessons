package org.example.DB;

import org.example.entity.IDCard;

public class DB {
    private static IDCard[] idCardList = new IDCard[0];


    public static void addIdCard(IDCard idCard){
        IDCard[] copyIdCardList = new IDCard[idCardList.length+1];
        for (int i = 0; i<idCardList.length; i++){
            copyIdCardList[i] = idCardList[i];
        }
        copyIdCardList[idCardList.length] = idCard;
        idCardList = copyIdCardList;
    }

    public static IDCard[] getIdCardList() {
        return idCardList;
    }

}
