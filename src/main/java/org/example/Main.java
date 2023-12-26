package org.example;

import org.example.enums.OptionsEnum;
import org.example.strategy.AbstractCardStrategy;
import org.example.strategy.StrategyFactory;
import org.example.util.OptionsEnumUtil;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        while (true){
            OptionsEnumUtil.printOptions();
            OptionsEnum optionsEnum = OptionsEnumUtil.chooseOption();
            AbstractCardStrategy strategy = StrategyFactory.getStrategyByOption(optionsEnum);
            strategy.process();
        }
    }
}