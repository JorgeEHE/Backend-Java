package practicaHarry;

public class WizardingWorld {
    public static void main(String[] args) {
        System.out.println("Harry Potter´s Wizarding World Characters");
        System.out.println("\n******************************");
        harry();
        lupin();
        //dobby();
        sirius();
        mortifagos();
    }

    public static void harry(){
        Character harry = new Character();
        harry.setName("Harry James Potter");
        harry.setHouse("Griffindor");
        harry.setSpecie("Human");
        harry.setBloodStatus("Half-Blood");
        harry.setBoggart("Dementor");
        harry.setPatronus("Stag (Deer)");
        System.out.println(harry.showMessage());
        System.out.println("\n******************************");
    }

    public static void lupin(){
        Character lupin = new Character(
                "Remus John Lupin","Griffindor","Half-Blood",
                "Human/Werewolf","Wolf","Full Moon");
        System.out.println(lupin.showMessage());
        System.out.println("\n******************************");
    }

    /*
    public static void dobby(){
        Character dobby = new Character();
        dobby.setName("Dobby");
        dobby.setHouse("Malfoy Family's House");
        dobby.setSpecie("House-Elf");
        dobby.setBloodStatus("Magic Blood");
        dobby.setBoggart("Lord Voldemort");
        dobby.setPatronus("Not Specified");
        System.out.println(dobby.showMessage());
        System.out.println("\n******************************");
    }
    */

    public static void sirius(){
        Character sirius = new Character(
                "Sirius Black III", "Griffindor","Human",
                "Pure-Blood","Lord Voldemort","Non-corporeal");
        System.out.println(sirius.showMessage());
        System.out.println("\n******************************");
    }

    public static void mortifagos(){
        Character snape = new Character();
        snape.setName("Severus Snape");
        snape.setHouse("Slytherin");
        snape.setSpecie("Human");
        snape.setBloodStatus("Half-blood");
        snape.setBoggart("Lord Voldemort");
        snape.setPatronus("Doe");
        System.out.println(snape.showMessage());
        System.out.println("\n******************************");

        Character bella = new Character(
                "Bellatrix Lestrange (née Black)", "Slytherin", "Human",
                "Pure-Blood","Not Specified", "None");
        System.out.println(bella.showMessage());
        System.out.println("\n******************************");
    }

}
