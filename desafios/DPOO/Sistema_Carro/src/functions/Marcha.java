package functions;

public class Marcha {
    private boolean march01 = false;
    private boolean march02 = false;
    private boolean march03 = false;
    private boolean march04 = false;
    private boolean march05 = false;
    private boolean march06 = false;

    private int contador = 0;

    public int accelerate(){
       return this.contador++;
    }
    public int brake(){
        return  this.contador--;
    }

    public void verifyMarch(){
        if (contador == 1){
            onMarch01();

            offMarch02();
            System.out.println("01");
        } else if (contador == 2){
            offMarch01();

            onMarch02();

            offMarch03();
            System.out.println("02");
        }else if (contador == 3){
            offMarch02();

            onMarch03();

            offMarch04();
            System.out.println("03");
        }else if (contador == 4){
            offMarch03();

            onMarch04();

            offMarch05();
            System.out.println("04");
        }else if (contador == 5){
            offMarch04();

            onMarch05();

            offMarch06();
            System.out.println("05");
        }else if (contador == 6){
            offMarch05();

            onMarch06();
            System.out.println("06");
        }
    }

    public boolean onMarch01(){
        return this.march01 = true;
    }
    public boolean onMarch02(){
        return this.march02 = true;
    }
    public boolean onMarch03(){
        return this.march03 = true;
    }
    public boolean onMarch04(){
        return this.march04 = true;
    }
    public boolean onMarch05(){
        return this.march05 = true;
    }
    public boolean onMarch06(){
        return this.march06 = true;
    }

    public boolean offMarch01(){
        return  this.march01 = false;
    }
    public boolean offMarch02(){
        return this.march02 = false;
    }
    public boolean offMarch03(){
        return this.march03 = false;
    }
    public boolean offMarch04(){
        return this.march04 = false;
    }
    public boolean offMarch05(){
        return this.march05 = false;
    }
    public boolean offMarch06(){
        return this.march06 = false;
    }
}
