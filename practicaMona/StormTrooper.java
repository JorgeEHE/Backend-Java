package practicaMona;

public class StormTrooper extends Monacat {
    //deffinition of individual attributes
    private String tool;

    //definition of getter
    public String getTool(){  return tool;  }

    //definition of setter
    public boolean setTool(String tool){
        if(!tool.isEmpty()){
            this.tool = tool;
            return  true;
        }else
            return false;
    }

    //definition of Action method
    public void actions(){
        System.out.println("I use my " + getTool() + " to keep the order in The Galaxy.");
        System.out.println("\n************************************************************************************");
    }


}
