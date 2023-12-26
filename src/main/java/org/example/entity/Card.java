package org.example.entity;

import org.example.enums.GenderEnum;

import java.time.LocalDate;

public abstract class Card {
    private String pin;
    private String name;
    private String surname;
    private GenderEnum gender;
    private String cardNumber;
    private String  citizenship;

    
    private Integer age;

    public String getPin() {
        return pin;
    }

    public Card setPin(String pin) {
        this.pin = pin;
        return this;
    }

    public String getName() {
        return name;
    }

    public Card setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Card setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public GenderEnum getGender() {
        return gender;
    }

    public Card setGender(GenderEnum gender) {
        this.gender = gender;
        return this;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public Card setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
        return this;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public Card setCitizenship(String citizenship) {
        this.citizenship = citizenship;
        return this;
    }

    @Override
    public String toString() {
        return "Card{" +
                "pin='" + pin + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", citizenship='" + citizenship + '\'' +
                '}';
    }
}
