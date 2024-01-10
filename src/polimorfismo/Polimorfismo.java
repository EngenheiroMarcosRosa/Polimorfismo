
package polimorfismo;

public class Polimorfismo {

    public static void main(String[] args) {
        // TODO code application logic here
        Conta c;
        c = new Conta();
        c.depositar();
        
        c = new ContaCorrente();
        c.depositar();
        
        c = new ContaPoupanca();
        c.depositar();
    }
    
}
