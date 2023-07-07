/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade3;

import java.util.Scanner;

public class DVD extends Midia {
    private int nFaixas;

    public DVD() {
        super();
        nFaixas = 0;
    }

    public DVD(int codigo, double preco, String name, int nFaixas) {
        super(codigo, preco, name);
        this.nFaixas = (nFaixas > 0) ? nFaixas : 0;
    }

    @Override
    public String getTipo() {
        return "DVD: ";
    }

    @Override
    public String getDetalhes() {
        return super.getDetalhes() + "Numero de faixas: " + nFaixas + "\n";
    }

    public void setFaixas(int nFaixas) {
        this.nFaixas = (nFaixas > 0) ? nFaixas : 0;
    }

    @Override
    public void inserirDados() {
        super.inserirDados();
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o numero de faixas: ");
        int nFaixas = in.nextInt();
        setFaixas(nFaixas);
    }
}