class Sedan extends Car {
   String model,color;

    public Sedan(String model,String color,int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    public void GetInfo(){
        System.out.println("Sedan model " +model+ " has a "+color+" color and its max speed "+maxSpeed);
    }
    @Override
    void Brake() {
        System.out.println("sedan is braking!");
    }
}
