package ParteC;

public class TestHash {
    
    public static void main(String[] args) {

        Integer[] tabChaves = new Integer[] {23, 45, 11, 33, 49, 10, 4, 89, 14};
        Integer[] tabHash = new Integer[10];

        for (int i = 0; i < tabChaves.length; i++) { 
            int chave = tabChaves[i];
            int hashCode = hash(chave);
            if (tabHash[hashCode] != null) {
                Integer newhashCode = rehashing(tabHash, chave);
                if (newhashCode != null)  tabHash[newhashCode] = chave;
            } else {
                tabHash[hashCode] = chave;
            }
        }

        for (int i = 0; i < tabHash.length; i++) { 
            System.out.print("Posição " + i + " = "
                            +  tabHash[i] + '\n');
        }

    }

    public static Integer hash(Integer key){
        return key % 10;
    }

    public static Integer rehashing(Integer[] tabHash, Integer indice){
        for(int i =  indice +1; i < tabHash.length; i++){
            if(tabHash[i] == null) return i;
        }
        for(int i = 0; i < indice; i ++){
            if(tabHash[i] == null) return i;
        }
        return null;
    }

}
