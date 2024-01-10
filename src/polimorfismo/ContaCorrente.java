
package polimorfismo;


public class ContaCorrente extends Conta {
    
    @Override
    public void depositar(){
        
        
        System.out.println("conta corrente "+(this.saldo+100));
    }
}
