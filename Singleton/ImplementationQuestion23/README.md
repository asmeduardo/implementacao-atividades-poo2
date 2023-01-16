Questão 23: Escreva, compile e execute o programa abaixo. Em seguida, troque sua implementação para que a classe Incremental seja Singleton. Execute novamente e veja os resultados.

Question 23: Write, compile and run the program below. Then change your implementation so that the Incremental class is Singleton. Run again and see the results.


class Incremental { 
    private static int count = 0; 
    private int number; 

    public Incremental() {
        number = ++count;
    } 
    
    public String toString() {
        return "Incremental " + number;
    }
}
    
public class TesteIncremental {
    public static void main(String[] args) {
        for (int i=0; i<10; i++){
            Incremental inc = new Incremental();
            System.out.println(inc);
        }
    }
} 
        
public class Incremental {
    private static int count = 0;
    private static Incremental singleton;

    private Incremental() {} 
            
    public static Incremental getInstancia() { 
        ++count; 
        if(singleton==null)singleton = new Incremental(); 
            return singleton;
        } 
            
        public String toString() {
            return "Incremental " + count;
        }
    } 
}
        
public class TesteIncremental { 
    public static void main(String[] args) {
        for(int i=0; i<10; i++) {
            Incremental inc = Incremental.getInstancia(); 
            System.out.println(inc);
        }
    }
}
