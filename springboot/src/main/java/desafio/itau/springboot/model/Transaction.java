/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio.itau.springboot.model;

import java.time.OffsetDateTime;

/**
 *
 * @author cesar
 */
public class Transaction {
    private double valor;
    private OffsetDateTime dataHora;
    
    public Transaction (final double valor, final OffsetDateTime dataHora) {
        this.valor = valor;
        this.dataHora = dataHora;
    }

    public double getValor() {
        return valor;
    }

    public OffsetDateTime getDataHora() {
        return dataHora;
    }
    
}
