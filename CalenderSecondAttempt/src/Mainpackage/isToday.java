/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mainpackage;

import main.ToDay;

/**
 *
 * @author Sam
 */
public class isToday {

    private int day;
    //int month, year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    private int month;
    //int year;

    public int getMonth() {
        return month;
    }

    public isToday(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.month = month;
        this.year = year;
    }

    public isToday() {
    }

    public void setMonth(int month) {
        this.month = month;
    }
    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
   public boolean isToday(ToDay date) {
    return day == date.getDay() && month == date.getMonth() && year == date.getYear();
}

    
}
