package controller;

import entity.Conta;
import exception.ExcecaoElementoInex;

public interface IControlaConta {
    public void inserirConta(Conta conta); 
    public void mudarConta(String numero); 
    public void removerConta(String numero); 
    public Conta buscarConta(String numero) throws ExcecaoElementoInex;
    public boolean verificarExistenciaConta(String numero);
    public void mostrarContas();
}
