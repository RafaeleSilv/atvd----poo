package controller;

import entity.Conta;
import repository.IRepositorio;
import repository.Repositorio;
import exception.ExcecaoElementoInex;

public class ControladorConta implements IControlaConta {
    private IRepositorio repos;

    public ControlaConta() {
        inicializarRepositorio();
    }

    private void inicializarRepositorio() {
        this.reposConta = new RepositorioConta();
    }

    public void inserirConta(Conta c) {
        this.reposConta.inserirConta(c);
    }

    public void alterarConta(String numero) {
        this.reposConta.alterarConta(numero);
    }

    public void removerConta(String numero) {
        reposConta.removerConta(numero);
    }

    public Conta buscarConta(String numero) throws ExcecaoElementoInex {
        return reposConta.buscarConta(numero);
    }

    public boolean verificarExistenciaConta(String numero) {
        return repos.verificarExistenciaConta(numero);
    }

    public void mostrarContas() {
        this.reposConta.mostrarContas();
    }
}
