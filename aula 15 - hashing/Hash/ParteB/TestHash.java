package ParteB;

public class TestHash {
    
    public static void main(String[] args) {
        
        int qtdChaves = 100000; // exemplo: 20
        int qtdHash = 1000;   // exemplo: 10


        Integer[] tabKeys = new Integer[qtdChaves]; // 2
        for(int i = 1; i < qtdChaves; i++) {
            tabKeys[i] = i;
        }

        SList[] tabHash = new SList[qtdHash]; // 3
        for(int i = 0; i < qtdHash; i++) {
            tabHash[i] = new SList();
        }

        for (int i = 1; i < tabKeys.length; i++) { // 5
            int chave = tabKeys[i];
            int hashCode = hash(chave);
            tabHash[hashCode].insereInicio(chave);
        }

        for (int i = 0; i < tabHash.length; i++) { // 6
            System.out.print("Posição " + i);
            tabHash[i].imprimeLista();
        }

    }

    public static int hash(int key) { // 3
        return key % 10;
    }

}
