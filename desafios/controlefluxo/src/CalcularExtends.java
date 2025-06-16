public class CalcularExtends{
    public static class NumeroMaior extends Exception{}

    public static void contar(int n1,int n2) throws NumeroMaior{
        if (n1 > n2 ){
            throw new NumeroMaior();
        }
        int contagem = n2 - n1;
        for (int i = 1; i < contagem; i++){
            System.out.println(i);
        }
    }
}


