import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Showroom showroom = new Showroom();
        Scanner scanner = new Scanner(System.in);

        while(true){
            //Output user available command
            System.out.println("Please enter 1, 2, 3 or 4 for following command or 'exit' to quit");
            System.out.println("1. Add any type of vehicle");
            System.out.println("2. Remove a vehicle");
            System.out.println("3. Show list of vehicles with current expected visitor count");
            System.out.println("4. Show list of vehicles with details");

            //Taking user command
            String command = scanner.next();
            if(command.equals("exit")){
                break;
            }
            else if(command.equals("1")){
                String vehicleType;
                String vehicleModel;
                String vehicleTireSize;
                float  vehiclEnginePower;
                float vehicleWeight;

                System.out.println("Please enter vehicle type [normal, sports, heavy]:");
                vehicleType = scanner.next();
                System.out.println("Please enter vehicle model:");
                vehicleModel = scanner.next();
                System.out.println("Please enter vehicle tire size:");
                vehicleTireSize = scanner.next();
                System.out.println("Please enter Engine power");
                try{
                    vehiclEnginePower = scanner.nextFloat();
                }catch(Exception e){
                    System.out.println(e.getMessage());
                    break;
                }

                if(vehicleType.toLowerCase().equals("normal") || vehicleType.toLowerCase().equals("sports")){
                    Vehicle vehicle = new Vehicle(vehicleType, vehicleModel, vehicleTireSize, vehiclEnginePower);
                    if(vehicleType.toLowerCase().equals("normal")){
                        System.out.println("Please enter Engine Type");
                        String engineType = scanner.next();
                        vehicle.setEngineType(engineType);
                    }
                    showroom.addVehicle(vehicle);
                }
                else if(vehicleType.toLowerCase().equals("heavy")){
                    System.out.println("Please enter vehicle weight:");
                    try{
                        vehicleWeight = scanner.nextFloat();
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                        break;
                    }
                    showroom.addVehicle(new Vehicle(vehicleType, vehicleModel, vehicleTireSize, vehiclEnginePower, vehicleWeight));
                }
                else{
                    System.out.println("Wrong vehicle type entered");
                }
            }
            else if(command.equals("2")){
                System.out.println("Enter vehicle number to remove");
                showroom.removeVehicle(scanner.nextInt()-1);
            }
            else if(command.equals("3")){
                Vector<Vehicle> vehicles = showroom.getVehicles();
                for(int i=0;i<vehicles.size();i++){
                    System.out.println("Vehicle "+(i+1)+ ". model: "+vehicles.get(i).getModelNumber());
                }
                System.out.println("Expected visitor: " + showroom.getVisitors());
            }
            else if(command.equals("4")){
                Vector<Vehicle> vehicles = showroom.getVehicles();
                for(int i=0;i<vehicles.size();i++){
                    System.out.println("Vehicle number: "+(i+1));
                    System.out.println("Vehicle type: "+ vehicles.get(i).getType());
                    System.out.println("Vehicle model: "+vehicles.get(i).getModelNumber());
                    System.out.println("Vehicle Tire size: "+vehicles.get(i).getTireSize());
                    System.out.println("Vehicle Engine type: "+vehicles.get(i).getEngineType());
                    System.out.println("Vehicle Engine power: "+vehicles.get(i).getEnginePower());
                    System.out.println("Vehicle Weight: "+vehicles.get(i).getWeight());
                    System.out.println("Vehicle Turbo: "+ (vehicles.get(i).TurboStatus() ? "Enable":"Disable"));
                    System.out.println();
                }
            }
        }

        scanner.close();
    }
}