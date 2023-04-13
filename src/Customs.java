import java.util.ArrayList;
import java.util.List;

public class Customs {
    private List<Ship> shipList;

    public Customs() {
        this.shipList = new ArrayList<>();
    }

    public void addToShipList(Ship s){
        this.shipList.add(s);
    }

    public boolean logCheck(){
        for(Ship s: shipList){
            if(!s.isReadyForDeparture()){
                return false;
            }
        }
        return true;
    }

}
