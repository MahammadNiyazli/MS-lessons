package org.example.strategy;

import org.example.entity.DriverCard;
import org.example.enums.OptionsEnum;

public class StrategyFactory {

    public static AbstractCardStrategy getStrategyByOption(OptionsEnum optionsEnum){
        return switch (optionsEnum){
            case CREATE_ID_CARD -> new CreateIDCardStrategy();
            case CREATE_DRIVER_CARD -> new CreateDriverCardStrategy();
            case SHOW_ALL_ID_CARDS -> new ShowAllIdCardStrategy();
            case EXIT ->  new ExitStrategy();
            default -> throw new IllegalArgumentException("Invalid option for strategy");
        };
    }
}
