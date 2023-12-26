package org.example.entity;

import java.time.LocalDate;

public class IDCard extends Card{
    private String maritalStatus;
    private String militaryStatus;
    private String bloodGroup;
    private LocalDate expireDate;

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public IDCard setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
        return this;
    }

    public String getMilitaryStatus() {
        return militaryStatus;
    }

    public IDCard setMilitaryStatus(String militaryStatus) {
        this.militaryStatus = militaryStatus;
        return this;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public IDCard setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
        return this;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public IDCard setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
        return this;
    }

    @Override
    public String toString() {
        return "IDCard{" +
                "maritalStatus='" + maritalStatus + '\'' +
                ", militaryStatus='" + militaryStatus + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", expireDate=" + expireDate +
                '}' + " " + super.toString();
    }
}
