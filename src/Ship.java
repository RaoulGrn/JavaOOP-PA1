import java.util.ArrayList;
import java.util.List;

public abstract class Ship {

    private List<Container> cargoList;

    public Ship() {
        this.cargoList = new ArrayList<>();
    }

    public void addToCargoList(Container c){
        this.cargoList.add(c);
    }

    public List<Container> getCargoList() {
        return cargoList;
    }

    public abstract boolean isReadyForDeparture();
    public boolean hasValidContainers(){
        for(Container c : cargoList){
            if(!c.isValid()){
                return false;
            }
        }
        return true;
    }
}
