package org.example.entity;

public class DriverCard extends Card{
    private String category;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "DriverCard{" +
                "category='" + category + '\'' +
                '}' + " " + super.toString();
    }
}
