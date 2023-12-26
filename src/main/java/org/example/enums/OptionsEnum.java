package org.example.enums;

public enum OptionsEnum {
    CREATE_ID_CARD (1,"Şəxsiyyət vəsiqəsi yarat"),
    CREATE_DRIVER_CARD (2,"Sürücülük vəsiqəsi yarat"),
    SHOW_ALL_ID_CARDS (3,"Bütün şəxsiyyət vəsiqələrini göstər"),
    SHOW_ALL_DRIVER_CARDS(4,"Bütün sürücülük vəsiqələrini göstər"),
    SHOW_ALL_CARDS(5,"Bütün vəsiqələri göstər"),
    EXIT(6, "Sistemdən çıxış et");

    private final String description;
    private final int index;

    OptionsEnum(int index, String description) {
        this.description = description;
        this.index = index;
    }

    public String getDescription() {
        return description;
    }

    public int getIndex() {
        return index;
    }

    public static OptionsEnum getEnumByIndex(int index){
        for (OptionsEnum optionsEnum : OptionsEnum.values()){
            if(optionsEnum.index == index){
                return optionsEnum;
            }
        }
        throw new IllegalArgumentException("Invalid option : "+index);
    }
}
