package facade;

import entity.Conta;
import exception.ExcecaoElementoInex;
import controller.ControlaConta;
import controller.IControlaConta;

public class Fachada implements IFachada{
    private IControladorConta controConta;

    public Fachada(){
        this.controConta = new ControlaConta();
    }

    public void inserirConta(Conta c){
        this.controConta.inserirConta(c);
    }
    public void alterarConta(String numero){
        this.controConta.alterarConta(numero);
    }

    public void removerConta(String numero){
        this.controConta.removerConta(numero);
    }
    public Conta buscarConta(String numero) throws ExcecaoElementoInex {
        return this.controConta.buscarConta(numero);
    }
    public boolean verificarExistenciaConta(String numero){
        return this.controConta.verificarExistenciaConta(numero);
    }
    public void mostrarContas(){
        this.controConta.mostrarContas();
    }
}
