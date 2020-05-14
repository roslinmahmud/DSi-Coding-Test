public class Vehicle implements Engine{
    private String Type;
    private String modelNumber;
    private String tireSize;
    private float Weight;

    private String engineType;
    private float enginePower;
    private boolean turbo;

    //Defalut constructor
    public Vehicle(){}
    //Parameterized constructor
    public Vehicle(String Type, String modelNumber, String tireSize, float enginePower){
        this.Type = Type;
        this.modelNumber = modelNumber;
        this.tireSize = tireSize;
        this.enginePower = enginePower;

        if(Type.toLowerCase().equals("sports")){
            turbo = true;
            engineType = "Oil";
        }
        else if(Type.toLowerCase().equals("heavy")){
            engineType = "Diesel";
        }
    }
    //Constructor overloading
    public Vehicle(String Type, String modelNumber, String tireSize, float enginePower, float Weight){
        this.Type = Type;
        this.modelNumber = modelNumber;
        this.tireSize = tireSize;
        this.enginePower = enginePower;

        engineType = "Diesel";
        this.Weight = Weight;
    }

    //Vehicle methods implementation
    public void setType(String Type){
        this.Type = Type;
    }
    public String getType(){
        return Type;
    }

    public void setModelNumber(String modelNumber){
        this.modelNumber = modelNumber;
    }
    public String getModelNumber(){
        return modelNumber;
    }

    public void setTireSize(String tireSize){
        this.tireSize = tireSize;
    }
    public String getTireSize(){
        return tireSize;
    }

    public void setWeight(float Weight){
        if(Type.toLowerCase().equals("heavy")){
            this.Weight = Weight;
        }
        else{
            System.out.println(Type + " Vehicle does not support Wieght Property");
        }
    }
    public String getWeight(){
        if(Type.toLowerCase().equals("heavy")){
            return String.valueOf(Weight);
        }
        else{
            return "Not supported";
        }
    }


    // Engine interface methods implementation
    public void setEngineType(String engineType){
        if(Type.toLowerCase().equals("normal")){
            this.engineType = engineType;
        }
        else{
            System.out.println(Type + " Vehicle does not support multiple Engine Type");
        }
    }
    public String getEngineType(){
        return engineType;
    }

    public void setEnginePower(float enginePower){
        this.enginePower = enginePower;
    }
    public float getEnginePower(){
        return enginePower;
    }

    public void setTurboStatus(boolean turbo){
        if(Type.toLowerCase().equals("sports")){
            this.turbo = turbo;
        }
        else{
            System.out.println(Type + " Vehicle does not support Turbo Engine");
        }
    }
    public boolean TurboStatus(){
        return turbo;
    }
}