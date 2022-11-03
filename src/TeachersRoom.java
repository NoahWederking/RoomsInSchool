public class TeachersRoom extends BasicRoom {

    private String gamingConsole;
    private String typeOfHotDrinkVendingMachine;

    public TeachersRoom(String gamingConsole, String typeOfHotDrinkVendingMachine){
        setGamingConsole(gamingConsole);
        setTypeOfHotDrinkVendingMachine(typeOfHotDrinkVendingMachine);
        System.out.println("Teachersroom is ");
    }

    public void setGamingConsole(String gamingConsole){
        this.gamingConsole = gamingConsole;
    }
    public void setTypeOfHotDrinkVendingMachine(String typeOfHotDrinkVendingMachine){
        this.typeOfHotDrinkVendingMachine = typeOfHotDrinkVendingMachine;
    }
    public String getGamingConsole(){
        return gamingConsole;
    }
    public String getTypeOfHotDrinkVendingMachine(){
        return typeOfHotDrinkVendingMachine;
    }




}
