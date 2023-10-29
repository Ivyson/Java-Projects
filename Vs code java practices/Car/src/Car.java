public class Car {
   public String brand;
   public int speed;
   public void displayDetails()
   {
    System.out.println("The brand of the car is "+brand+" \nThe Car travels at a max speed of "+speed+" Meters Per second");
   } 
    public static void main(String[] args) throws Exception {
        Car obj = new Car();
        obj.speed = 10;
        obj.brand = "Mercedez";
        obj.displayDetails();
    }
}
