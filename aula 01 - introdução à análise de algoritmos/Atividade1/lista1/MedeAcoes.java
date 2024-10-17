class MedeAcoes {
    public static void main(String args[]){
        long compar = 0;
        long aritOp = 0;
        /* Início do código a ser medido*/
        int i = 0, multip10 =0;
        do{
            compar +=1;
            if(i % 10 == 0){
                aritOp+=1;
                multip10+=1;
            }
            aritOp+=1;
            i+=1;
            compar+=1; 
        }while(i < 1000);
        /*fim do código a ser medido*/
        System.out.println("Quantidade de Ciclos Executados...: " + i);
        System.out.println("Quantidade de Multiplos de 10.....: " + multip10);
        System.out.println("Quantidade de Comparacoes.........: " + compar);
        System.out.println("Quantidade de Operacoes Aritmetica: " + aritOp);
    }
}