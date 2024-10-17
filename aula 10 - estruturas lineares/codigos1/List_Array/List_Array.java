package codigos1.List_Array;

public class List_Array {
    int[] lista; 
    int ultimo_item; 
    
    public List_Array() {
        lista = new int[0]; 
        ultimo_item = -1; 
    }

    public List_Array(int n) { 
        lista = new int[n]; 
        ultimo_item = -1; 
    }
    
    public void Imprime_Lista() { 
        Integer n = lista.length; 
        if (n == 0) 
            System.out.println("A lista está vazia..."); 
        else System.out.print("\nLista:");
            for (int i=0; i<n; i++){ 
                System.out.print("  " + lista[i]); 
            } 
        System.out.println(""); 
    }

    public void insereItem_Inicio(int novo_item) { 
        int[] nova_lista = new int[lista.length+1];
        for (int i=0; i<lista.length; i++)
            nova_lista[i+1]=lista[i]; 
        nova_lista[0] = novo_item; 
        lista = nova_lista; 
        ultimo_item = lista.length-1; 
    }
        
    public void insereItem_Fim(int novo_item) {
        int[] nova_lista = new int[lista.length+1];
        for(int i=0; i<lista.length; i++)
            nova_lista[i] = lista[i]; 
        nova_lista[lista.length] = novo_item; 
        lista = nova_lista; 
        ultimo_item = lista.length-1; 
    }

    public void insereItem(int novo_item, int localizacao) { 
        if (localizacao < 0 || localizacao > this.ultimo_item) 
            System.out.println("*** ERRO: localização inválida..."); 
        else { 
            int[] nova_lista = new int[lista.length+1]; 
            for (int i =0; i < localizacao ; i++ )
                nova_lista[i] = lista[i]; 
            for(int i=localizacao; i<lista.length; i++)
                nova_lista[i+1] = lista[i]; 
            nova_lista[localizacao] = novo_item; 
            lista = nova_lista; 
            ultimo_item = lista.length-1; 
        } 
    }
        
    public void altera_Ultimo(int novo_item){ 
        if (ultimo_item == -1) 
            System.out.println("A lista está vazia não há como alterar o último elemento"); 
        else lista[ultimo_item] = novo_item ; 
    }
        
    public void altera_Primeiro(int novo_item){ 
        if (ultimo_item == -1) 
            System.out.println("A lista está vazia não há como alterar o primeiro elemento"); 
        else lista[0] = novo_item ; 
    }
        
    public void alteraItem(int novo_item, int localizacao) { 
        if (localizacao < 0 || localizacao > this.ultimo_item) 
            System.out.println("*** ERRO: localização inválida..."); 
        else lista[localizacao] = novo_item; 
    }

    public void imprime_Primeiro() { 
        if (ultimo_item == -1) 
            System.out.println("A lista está vazia não há primeiro  elemento"); 
        else System.out.println ("Primeiro elemento da lista: " +  lista[0] ) ; 
    }

    public void imprime_Ultimo() { 
        if (ultimo_item == -1) 
            System.out.println("A lista está vazia não há último elemento"); 
        else System.out.println ("Último elemento da lista: " + lista[ultimo_item] ) ; 
    }
    
    
    public void imprimeItem(int localizacao) {
        if (localizacao < 0 || localizacao > this.ultimo_item) 
            System.out.println("*** ERRO: localização inválida..."); 
        else System.out.println ("Elemento da lista na posição " + localizacao + " é: " + lista[localizacao] ) ; 
    }
}