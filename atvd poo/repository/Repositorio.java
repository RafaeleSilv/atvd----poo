package repository;

import entity.Conta;
import exception.ExcecaoElementoInex;
import java.util.ArrayList;
import java.util.Scanner;

public class Repositorio implements IRepositorio{
    public ArrayList<Conta> contas;
    public int qtd_contas;
    public Scanner sc = new Scanner(System.in);

    public Repositorio(){
        this.contas = new ArrayList<Conta>();
        this.qtd_contas = contas.size();
    }

    public void inserirConta(Conta c){
        this.contas.add(c);
    }

    public void alterarConta(String numero){
        for (Conta c : contas){
            if (c.getNumero().equals(numero)) {
                System.out.print("Novo nome de Titular: ");
                c.setTitular(sc.nextLine());
                break;
            }
        }
    }
    public void removerConta(String numero){
        if (this.verificarExistenciaConta(numero)) {
            for (Conta c : contas){
                if (c.getNumero().equals(numero)){
                    this.contas.remove(c);
                }
        }
        }
    }

    public Conta buscarConta(String numero) throws ExcecaoElementoInex{
        for (Conta c : contas){
            if (c.getNumero().equals(numero)){
                return c;
            }
        }
        throw new ExcecaoElementoInexe("Conta Não Encontrada");
    }
    public boolean verificarExistenciaConta(String numero){
        for (Conta c : contas){
            if (c.getNumero().equals(numero)){
                return true;
            }
        }
        return false;
        
    }

    public void mostrarContas(){
        for (Conta c : contas){
            System.out.println(c);
        }
    }
}
