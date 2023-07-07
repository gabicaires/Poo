/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade3;

import java.util.Scanner;

public class Midia {
    private int codigo;
    private double preco;
    private String name;

    public Midia() {
        codigo = 0;
        preco = 0.0;
        name = "Nenhum";
    }

    public Midia(int codigo, double preco, String name) {
        this.codigo = codigo;
        this.preco = preco;
        this.name = name;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public String getName() {
        return name;
    }

    public String getTipo() {
        return "Midia: ";
    }

    public String getDetalhes() {
        return "Codigo: " + getCodigo() + "\n" +
                "Preco: " + getPreco() + "\n" +
                "Nome: " + getName() + "\n";
    }

    public void printDados() {
        String s = getTipo() + "\n" + getDetalhes() + "\n";
        System.out.println(s);
    }

    public void inserirDados() {
        Scanner in = new Scanner(System.in);

        System.out.printf("\n Digite o codigo: ");
        codigo = in.nextInt();
        System.out.printf("\n Digite o preco: ");
        preco = in.nextDouble();
        in.nextLine();
        System.out.printf("\n Digite o nome: ");
        name = in.nextLine();
    }
}