public class Team {
    private String city;
    private String mascot;
    private String sport;

    public Team(){
        this.city = "null";
        this.mascot = "null";
        this.sport = "null";
    }
    public void setCityAndMascotAndSport(String cityName, String mascotName, String sportName){
        this.city = cityName;
        this.mascot = mascotName;
        this.sport = sportName;
    }

    public String getCity(){
        return city;
    }
    public String getMascot(){
        return mascot;
    }
    public String getSport(){
        return sport;
    }
}
