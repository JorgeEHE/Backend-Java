package practicaMona;

public class Finn extends Monacat{
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
            System.out.println("I use my " + getTool() + " to defend the Princess BubbleGum and all the other princes in the Kingdom");
            System.out.println("\n************************************************************************************");
        }

}
