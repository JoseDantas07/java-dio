package visual;

public class Car {
    private int counterCar = 0;

    public void advanceCar(){
        this.counterCar++;
        visualCarCenter();
    }
    public void backCar(){
        this.counterCar--;
        visualCarCenter();
    }

    public void visualCarCenter(){
        if (counterCar == 0){
            carFirstCenter();
        } else if (counterCar == 1) {
            carSecondCenter();
        } else if (counterCar == 4) {
            carThirdCenter();
        } else if (counterCar == 6) {
            carFourthCenter();
        }
    }
    public void visualCarRight(){
        if (counterCar == 0){
            carFirstRight();
        } else if (counterCar == 1){
            carSecondRight();
        } else if (counterCar == 4){
            carThirdRight();
        } else if (counterCar == 6) {
            carFourthRight();
        }
    }
    public void visualCarLeft(){
        if (counterCar == 0){
           carFirstleft();
        } else if (counterCar == 1){
            carSecondLeft();
        } else if (counterCar == 4){
           carThirdLeft();
        } else if (counterCar == 6) {
            carFourthLeft();
        }
    }
    public void carFirstCenter(){
        System.out.println("| || | || | || | ");
        System.out.println("| || | || | || | ");
        System.out.println("| || | || | || | ");
        System.out.println("| || | CC | || | ");
    }
    public void carFirstleft(){
        System.out.println("| || | || | || | ");
        System.out.println("| || | || | || | ");
        System.out.println("| || | || | || | ");
        System.out.println("| CC | || | || | ");
    }
    public void carFirstRight(){
        System.out.println("| || | || | || | ");
        System.out.println("| || | || | || | ");
        System.out.println("| || | || | || | ");
        System.out.println("| || | || | CC | ");
    }
    public void carSecondCenter(){
        System.out.println("| || | || | || | ");
        System.out.println("| || | || | || | ");
        System.out.println("| || | CC | || | ");
        System.out.println("| || | || | || | ");
    }
    public void carSecondLeft(){
        System.out.println("| || | || | || | ");
        System.out.println("| || | || | || | ");
        System.out.println("| CC | || | || | ");
        System.out.println("| || | || | || | ");
    }
    public void carSecondRight(){
        System.out.println("| || | || | || | ");
        System.out.println("| || | || | || | ");
        System.out.println("| || | || | CC | ");
        System.out.println("| || | || | || | ");
    }
    public void carThirdCenter(){
        System.out.println("| || | || | || | ");
        System.out.println("| || | CC | || | ");
        System.out.println("| || | || | || | ");
        System.out.println("| || | || | || | ");
    }
    public void carThirdLeft(){
        System.out.println("| || | || | || | ");
        System.out.println("| CC | || | || | ");
        System.out.println("| || | || | || | ");
        System.out.println("| || | || | || | ");
    }
    public void carThirdRight(){
        System.out.println("| || | || | || | ");
        System.out.println("| || | || | CC | ");
        System.out.println("| || | || | || | ");
        System.out.println("| || | || | || | ");
    }
    public void carFourthCenter(){
        System.out.println("| || | CC | || | ");
        System.out.println("| || | || | || | ");
        System.out.println("| || | || | || | ");
        System.out.println("| || | || | || | ");
    }
    public void carFourthLeft(){
        System.out.println("| CC | || | || | ");
        System.out.println("| || | || | || | ");
        System.out.println("| || | || | || | ");
        System.out.println("| || | || | || | ");
    }
    public void carFourthRight(){
        System.out.println("| || | || | CC | ");
        System.out.println("| || | || | || | ");
        System.out.println("| || | || | || | ");
        System.out.println("| || | || | || | ");
    }
}
