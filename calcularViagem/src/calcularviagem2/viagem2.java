/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calcularviagem2;

/**
 *
 * @author Etec-User
 */
public class viagem2 {
    private int tempoViagem;
    private double autonomia, valorComb, velocidade;
    String mensagemErro;
    boolean valoresOK = true;
    
    public int getTempoViagem() {
        return tempoViagem;
    }

    public void setTempoViagem(int tempoViagem) {
        this.tempoViagem = tempoViagem;
    }

    public double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }

    public double getValorComb() {
        return valorComb;
    }

    public void setValorComb(double valorComb) {
        this.valorComb = valorComb;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        
        if (velocidade <0 || velocidade > 300){
            this.mensagemErro = this.mensagemErro.concat("A velocidade deve estar entre 0 e 300km");
            this.valoresOK = false;
            
        }else{
            this.velocidade = velocidade;
        }
    }
    public String calcular(){
        if (this.valoresOK == false){
            return this.mensagemErro;
        }
                double distancia = (this.velocidade / 60) * this.tempoViagem;
        double litros = distancia / this.autonomia;
        double valorTotal = litros * this.valorComb;
        String resposta = 
    "distancia: " + distancia + "km" +
    "\n Litros: " + litros +
    "\nTotal: R$ " + String.format("%.2f", valorTotal);
        return resposta;
    }
}