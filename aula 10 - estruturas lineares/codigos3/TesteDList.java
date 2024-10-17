package codigos3;

public class TesteDList {
    public static void main(String[] args) { 
        TesteDList t = new TesteDList(); 
        //t.teste1(); 
        t.teste2();
    }
    
    public void teste1(){
        DList x = new DList(5); 
        x.imprimeFirst();
        x.imprimeLast();
    }

    public void teste2(){
        DList x = new DList(); 
        x.imprimeLista();
        x.insereInicio(4);
        x.insereInicio(2);
        x.insereInicio(3); 
        x.insereInicio(5);
        x.imprimeLista();
        x.imprimeLista2(); 
    }

    public void teste3(){
        DList listaDupLigada = new DList(); 
        listaDupLigada.imprimeLista();
        listaDupLigada.insereInicio(4);
        listaDupLigada.insereInicio(2);
        listaDupLigada.insereInicio(3); 
        listaDupLigada.insereInicio(5);
        listaDupLigada.imprimeLista();
        listaDupLigada.deleteFirst();
        listaDupLigada.imprimeLista();
        listaDupLigada.deleteFirst();
        listaDupLigada.imprimeLista();
        listaDupLigada.deleteFirst();
        listaDupLigada.imprimeLista();
        listaDupLigada.deleteFirst();
        listaDupLigada.imprimeLista();
    }
}

