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

    public void onMarch01(){
         this.march01 = true;
    }
    public void onMarch02(){
         this.march02 = true;
    }
    public void onMarch03(){
         this.march03 = true;
    }
    public void onMarch04(){
         this.march04 = true;
    }
    public void onMarch05(){
         this.march05 = true;
    }
    public void onMarch06(){
         this.march06 = true;
    }

    public void offMarch01(){
          this.march01 = false;
    }
    public void offMarch02(){
         this.march02 = false;
    }
    public void offMarch03(){
        this.march03 = false;
    }
    public void offMarch04(){
         this.march04 = false;
    }
    public void offMarch05(){
         this.march05 = false;
    }
    public void offMarch06(){
         this.march06 = false;
    }
}
