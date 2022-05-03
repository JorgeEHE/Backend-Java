package practicaMona;

public class Monacat {
    //definition of attributes
    private String name;
    private String custom;
    private String profession;
    private String activity;

    //definition of getters
    public String getName() {  return name;  }
    public String getCustom() {  return custom;  }
    public String getProfession() {  return profession;  }
    public String getActivity() {  return activity; }

    //definition of setters
    public boolean setName(String name){
        if(!name.isEmpty()){
            this.name = name;
            return true;
        }else
            return false;
    }

    public boolean setCustom(String custom){
        if(!custom.isEmpty()){
            this.custom = custom;
            return true;
        }else
            return false;
    }

    public boolean setProfession(String profession){
        if(!profession.isEmpty()){
            this.profession = profession;
            return true;
        }else
            return false;
    }

    public boolean setActivity(String activity){
        if(!activity.isEmpty()){
            this.activity = activity;
            return true;
        }else
            return false;
    }

    //definition of method showMessage
    public void showMessage(){
        //System.out.println("\n******************************************");
        System.out.println("\nHi! I´m the Octocat: " + getName());
        System.out.println("And use to dress: " + getCustom());
        System.out.println("I am a(n): " + getProfession());
        System.out.println("And I like to: " + getActivity());
        //System.out.println("\n******************************************");
    }
}
