import java.util.Vector;

public class Showroom{
    private Vector<Vehicle> vehicles = new Vector<Vehicle>();
    private int visitors;

    public Showroom(){
        visitors = 30;
    }

    public void addVehicle(Vehicle vehicle){
        if(vehicle.getType().toLowerCase().equals("sports")){
            visitors+=20;
        }
        vehicles.add(vehicle);
    }

    public void removeVehicle(int number){
        try{
            if(vehicles.get(number).getType().toLowerCase().equals("sports")){
                visitors-=20;
            }
            vehicles.remove(number);
        }catch(Exception e){
            System.out.println("Remove failed! " + e.getMessage());
        }
    }

    public int getVisitors(){
        return visitors;
    }

    public Vector<Vehicle> getVehicles(){
        return vehicles;
    }
}