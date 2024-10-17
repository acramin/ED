package codigos3;

public class Test_CList {
    public static void main(String[] args) { 
        CList listaCircular = new CList(); 
        listaCircular.imprimeFirst();
        listaCircular.imprimeLast();
    }

    public void teste1(){
        CList listaCircular = new CList(); 
        listaCircular.imprimeFirst();
        listaCircular.imprimeLast();
    }

    public void teste2(){
        CList listaCircular = new CList(); 
        listaCircular.imprimeFirst();
        listaCircular.imprimeLast();
        listaCircular.insereFirst(4);
        listaCircular.imprimeFirst();
        listaCircular.imprimeLast();
        listaCircular.insereFirst(2);
        listaCircular.imprimeFirst();
        listaCircular.imprimeLast();
        listaCircular.insereFirst(3);
        listaCircular.imprimeFirst();
        listaCircular.imprimeLast();
        listaCircular.insereFirst(5);
        listaCircular.imprimeFirst();
        listaCircular.imprimeLast();
        listaCircular.insereFirst(8);
        listaCircular.imprimeFirst();
        listaCircular.imprimeLast();
    }

    public void teste3(){
        CList listaCircular = new CList(); 
        listaCircular.imprimeFirst();
        listaCircular.imprimeLast();
        listaCircular.insereLast(5);
        listaCircular.imprimeFirst();
        listaCircular.imprimeLast();
        listaCircular.insereLast(3);
        listaCircular.imprimeFirst();
        listaCircular.imprimeLast();
        listaCircular.insereLast(2);
        listaCircular.imprimeFirst();
        listaCircular.imprimeLast();
        listaCircular.insereLast(4);
        listaCircular.imprimeFirst();
        listaCircular.imprimeLast();
        listaCircular.insereLast(8);
        listaCircular.imprimeFirst();
        listaCircular.imprimeLast();
    }

    public void teste4(){
        CList listaCircular = new CList(); 
        listaCircular.insereLast(5);
        listaCircular.insereLast(3);
        listaCircular.insereLast(2);
        listaCircular.insereLast(4);
        listaCircular.insereLast(8);
        listaCircular.imprimeLista();
        listaCircular.deleteLast();
        listaCircular.imprimeLista();
        listaCircular.deleteLast();
        listaCircular.imprimeLista();
        listaCircular.deleteLast();
        listaCircular.imprimeLista();
        listaCircular.deleteLast();
        listaCircular.imprimeLista();
        listaCircular.deleteLast();
        listaCircular.imprimeLista();
        listaCircular.deleteLast();
        listaCircular.imprimeLista();
    }
}