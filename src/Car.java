public abstract class Car {
    String model, color;
    int maxSpeed;

    protected void Gas() {
        System.out.println("Drive off!");
    }

    abstract void Brake();
}

