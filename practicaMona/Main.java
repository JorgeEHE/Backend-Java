package practicaMona;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\n************************************************************************************");
        System.out.println("These are the chosen Octocats");
        showCharacters();
    }


    public static void showCharacters(){
        //troopercat object from StormTrooper class
        StormTrooper troopercat = new StormTrooper();
        troopercat.setName("Stormtoopcat.");
        troopercat.setCustom("A black & white iron armor.");
        troopercat.setProfession("Imperial Soldier");
        troopercat.setTool("Laser Gun");
        troopercat.setActivity("Fight as an elite shock troopers of the Galactic Empire.");
        troopercat.showMessage();
        troopercat.actions();

        //ironcat object from IronMan class
        IronMan ironcat = new IronMan();
        ironcat.setName("Ironcat.");
        ironcat.setCustom("A red & gold iron armor.");
        ironcat.setProfession("Avenger");
        ironcat.setActivity("Defend the Earth against the bad people and Alien invasions.");
        ironcat.showMessage();
        ironcat.actions();

        //adveturecat object from Finn class
        Finn adventurecat = new Finn();
        adventurecat.setName("Adventure-Cat.");
        adventurecat.setCustom("A light-blue shirt and a dark-blue short and a white ski mask with ears to cover my golden hair .");
        adventurecat.setProfession("Adventurer");
        adventurecat.setTool("Sword");
        adventurecat.setActivity("Have a lot of adventures with my fellow friend Jake.");
        adventurecat.showMessage();
        adventurecat.actions();

        //megacat object from Megaman class
        Megaman megacat = new Megaman();
        megacat.setName("Megacat.");
        megacat.setCustom("A light and a dark blue Armor.");
        megacat.setProfession("Robot created by Dr. Thomas Xavier Light");
        megacat.setTool("Proton Blaster Canion");
        megacat.setActivity("be the protector of the human specie, in favor of its coexistence with robots in society.");
        megacat.showMessage();
        megacat.actions();

        //heisencat object from Heisenberg class
        Heisenberg heisencat = new Heisenberg();
        heisencat.setName("(Walter Cat, a.k.a.) Heisencat.");
        heisencat.setCustom("Yellow overalls, protection Glasses and protection Gloves.");
        heisencat.setProfession("Chemistry Teacher in Albuquerque, also a Meth Dealer");
        heisencat.setTool("Chemistry Set and knowledge");
        heisencat.setActivity("Use my scientific knowledge and dedication to quality to produce methamphetamine at a level of purity that is second to none.");
        heisencat.showMessage();
        heisencat.actions();

        //ocdlm object from Catrina class
        Catrina ocdlm = new Catrina();
        ocdlm.setName("Octocat de los Muertos.");
        ocdlm.setCustom("Mexican Hat, colorful Zarape and colorful makeup in my skeleton-face.");
        ocdlm.setProfession("Dead Mariachi");
        ocdlm.setTool("Guitar");
        ocdlm.setActivity("Visit my relatives and closed family members on October 2nd to celebrate El Día de los Muertos.");
        ocdlm.showMessage();
        ocdlm.actions();
    }


}
