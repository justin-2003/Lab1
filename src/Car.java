public class Car extends Vehicle{
    String brand;
    public void honk(){
        System.out.println(" honk honk");
    }

    public void displayinfo(String brand){
        System.out.println("Brand: " + brand + " ,Color:  " + getColor() +" ,FuelType: " +getFuelType() + " ,Engine size: " +getEngineSize() + " ,Number of Wheels: " +getNumberOfWheels());
    }
}
