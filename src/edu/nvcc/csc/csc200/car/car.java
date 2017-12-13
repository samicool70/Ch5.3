package edu.nvcc.csc.csc200.car;

public class car {
    public String color;
    public int horsePower;
    public double engineSize;
    public String make;
    private static int count = 0;


    public car() {
        make = "Toyota";
        color = "White";
        engineSize = 4.5;
        horsePower = 500;
        count++;}

    public car(String make, String color, double engineSize, int horsePower) {
        this.make = make;
        this.color = color;
        this.engineSize = engineSize;
        this.horsePower = horsePower;
        count++;

    }
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    public void setHorsePower(int horsePower){
        this.horsePower=horsePower;
    }
    public int getHorsePower(){
        return horsePower;
    }
    public void setEngineSize(double engineSize){
        this.engineSize=engineSize;
    }
    public double getEngineSize(){
        return engineSize;
    }
    public void setMake(String make){
        this.make=make;
    }
    public String getMake(){
        return make;
    }
    public static int getCount() {
        return count;}


    private boolean equals(car obj) {
        boolean status = true;
        status = this.getColor().equals(obj.getColor()) && this.getEngineSize()==(obj.getEngineSize()) &&
                this.getHorsePower() == obj.getHorsePower()&& this.getMake()== obj.getMake();
        return status;
    }
}

