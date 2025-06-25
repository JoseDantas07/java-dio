package machine;

import pet.Pet;

public class PetMachine {
    private boolean clean = true;
    private int water = 30;
    private int shampoo = 10;
    private Pet  pet;


    public void takeshower(){
        if(this.pet == null){
            System.out.println("Coloque o pet na maquina para iniciar o banho");
            return;
        }

        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("o pet "+ pet.getName()+ "esta limpo");
    }

    public void addWater(){
        if(water == 30){
            System.out.println("a capacidade de agua da maquina esta no maximo");
            return;
        }
        water += 2;
    }
    public void addShampoo(){
        if(shampoo == 10){
            System.out.println("a capacidade de shampoo da maquina esta no maximo");
            return;
        }
        shampoo += 2;
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean haspet(){
        return pet != null;
    }

    public void setPet(Pet pet) {
        if(!this.clean){
            System.out.println("A maquina esta suja para colcoar o pet e necessario limpa-la");
            return;
        }
        if (haspet()){
            System.out.println("O pet "+ this.pet.getName() + " esta no banho nesse momento");
            return;
        }
        this.pet = pet;
        System.out.println("o pet " + pet.getName() + " foi colocado na maquina");
    }

    public void removePet(){
        this.clean = this.pet.isClean();


        System.out.println("O pet "+this.pet.getName()+" foi tirado da maquina");
        this.pet = null;
    }
    public void wash(){
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A maquina esta limpa");
    }
}


