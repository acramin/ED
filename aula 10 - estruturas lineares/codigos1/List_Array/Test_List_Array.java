package codigos1.List_Array;

public class Test_List_Array {
    public static void main(String[] args) {

        // Teste 1
        List_Array x = new List_Array(); 
        x.Imprime_Lista();
        x.imprime_Primeiro(); 
        x.imprime_Ultimo(); 
        x.insereItem_Inicio(7); 
        x.Imprime_Lista(); 
        x.imprime_Primeiro(); 
        x.imprime_Ultimo(); 
        x.insereItem_Fim(99); 
        x.Imprime_Lista(); 
        x.imprime_Primeiro(); 
        x.imprime_Ultimo(); 

        // Teste 2
        x = new List_Array(5); 
        x.insereItem_Fim(88); 
        x.Imprime_Lista(); 
        x.imprime_Primeiro(); 
        x.imprime_Ultimo(); 
        x.insereItem_Inicio(11); 
        x.Imprime_Lista();
        x.imprime_Primeiro(); 
        x.imprime_Ultimo(); 
        x.insereItem(44, 2); 
        x.Imprime_Lista();

        // Teste 3
        x = new List_Array(5); 
        x.altera_Primeiro(999999); 
        x.Imprime_Lista(); 
        x.altera_Ultimo(777777); 
        x.Imprime_Lista(); 
        x.alteraItem(1111, 0); 
        x.Imprime_Lista(); 
        x.alteraItem(2222, 1); 
        x.Imprime_Lista(); 
        x.alteraItem(3333, 2); 
        x.Imprime_Lista(); 
    } 
}