package org.example.strategy;

import org.example.DB.DB;
import org.example.entity.IDCard;

public class ShowAllIdCardStrategy implements AbstractCardStrategy{
    @Override
    public void process() {
        IDCard[] idCards = DB.getIdCardList();
        for (int i=0; i<idCards.length; i++){
            System.out.println(idCards[i]);
        }
    }
}
