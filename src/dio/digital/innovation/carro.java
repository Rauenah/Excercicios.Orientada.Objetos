package dio.digital.innovation;

/** Classe de exemplo para o exercicio da Aula 3 de Orientação a Objetos*/

public class carro {
    String cor;
    String modelo;
    int capacidadeTanque;

    carro() {

    }

    carro(String cor, String modelo, int capacidadeTanque) {
         this.cor= cor;
         this.modelo= modelo;
         this.capacidadeTanque =capacidadeTanque;
    }

    /**
     * Evolua o conceito do exercicio 2 e defina 1 método para calcular
     * o valor total para encher o tanque.Este deve receber como parametro o valor da gasolina.Faça também duas sobrecargas do
     * construtor
     */
    void setCor(String cor) {
        this.cor = cor;
    }

    String getCor() {
        return cor;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }
    String getModelo () {
        return  modelo;
    }
    //get e set tanque
    void setCapacidadeTanque (int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque ;
    }
    int getCapacidadeTanque () {
        return capacidadeTanque;
    }
//metodo do total para encher o tanque

    double totalValorTanque (double valorCombustivel) {
           return capacidadeTanque * valorCombustivel;
    }

}
