
package polimorfismo;


public class ContaPoupanca extends Conta{
    
    @Override
    public void depositar(){
        System.out.println("Conta Poupança "+(this.saldo+500));
    }
}
