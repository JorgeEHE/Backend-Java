package practicaHarry;

public class Character {
    //Atributes
    private String name;
    private String house;
    private String specie;
    private String bloodStatus;
    private String boggart;
    private String patronus;

    //Constructors
    public Character() {
    }

    public Character(String name, String house, String specie, String bloodStatus, String boggart, String patronus){
        this.name = name;
        this.house = house;
        this.specie = specie;
        this.bloodStatus = bloodStatus;
        this.boggart = boggart;
        this.patronus = patronus;
    }

    //Getters
    public String getName(){  return name;  }
    public String getHouse() { return house;  }
    public String getSpecie() {  return specie;  }
    public String getBloodStatus() {  return bloodStatus;  }
    public String getBoggart() {  return boggart;  }
    public String getPatronus() {  return patronus;  }

    //Setters
    public boolean setName(String name){
        if (!name.isEmpty()){
            this.name = name;
            return true;
        }else
            return false;
    }

    public boolean setHouse(String house){
        if (!house.isEmpty()){
            this.house = house;
            return true;
        }else
            return false;
    }

    public boolean setSpecie(String specie){
        if (!specie.isEmpty()){
            this.specie = specie;
            return true;
        }else
            return false;
    }

    public boolean setBloodStatus(String bloodStatus){
        if (!bloodStatus.isEmpty()){
            this.bloodStatus = bloodStatus;
            return true;
        }else
            return false;
    }

    public boolean setBoggart(String boggart){
        if (!boggart.isEmpty()){
            this.boggart = boggart;
            return true;
        }else
            return false;
    }

    public boolean setPatronus(String patronus){
        if (!patronus.isEmpty()){
            this.patronus = patronus;
            return true;
        }else
            return false;
    }

    //showMessage method to "print" on screen the Character data
    public String showMessage(){
        return
                "Name: " + name
                        +"\nHouse: " + house
                        +"\nSpecie:" + specie
                        +"\nBlood Status: " + bloodStatus
                        +"\nBoggart: " + boggart
                        +"\nPatronus: " + patronus+ "\n";
    }
}
