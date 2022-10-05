package thinking_in_objects;

public class Tneb {

    public void givePower(ISocket socket){
        if(socket.isPlugged()){
            String power = this.getPowerFromNuclearPlant();
            socket.plug(power);
        }
    }

    private String getPowerFromNuclearPlant(){
        return  "Power from nuclear plant";
    }

    private String getPowerFromThermalPlant(){
        return  "Power from thermal plant";
    }
}
