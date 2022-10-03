
package javacore;

 enum Month {
    JANUARY(Seasons.WINTER, 31), FEBRUARY(Seasons.WINTER, 28), 
    MARCH(Seasons.SPRING, 31), APRIL(Seasons.SPRING, 30), MAY(Seasons.SPRING, 31), 
    JUNE(Seasons.SUMMER, 30), JULY(Seasons.SUMMER, 31), AUGUST(Seasons.SUMMER, 31), 
    SEPTEMBER(Seasons.FALL, 30), OCTOBER(Seasons.FALL, 31), NOVEMBER(Seasons.FALL, 30), 
    DECEMBER(Seasons.WINTER, 31);
    
    Seasons season;
    int days;

    public Seasons getSeason() {
        return season;
    }

    public int getDays() {
        return days;
    }
    
     Month(Seasons season, int days){
        this.season = season;
        this.days = days;
    }
     
 
     
}
