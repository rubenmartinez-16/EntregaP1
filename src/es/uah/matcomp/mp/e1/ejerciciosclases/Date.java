package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Date {
    private int day;
    private int month;
    private int year;
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;

    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    public void setDay(int day){
        this.day = day;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public String toString(){
        if (day <= 9){
            if(month <= 9){
                return "0"+day+"/0"+month+"/"+year;
            }
            else{
                return "0"+day+"/"+month+"/"+year;
            }
        }
        else{
            if(month <= 9){
                return day+"/0"+month+"/"+year;
            }
            else{
                return day+"/"+month+"/"+year;
            }

        }
    }
}
