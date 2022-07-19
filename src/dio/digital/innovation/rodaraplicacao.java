package dio.digital.innovation;

/**Evolua o conceito do exercicio 3 criando objetos da classe "Carro. Use metodos set/get, quando aplicáveis, para definir os valores dos atributos e exibri estes valores 'get'.
 * Passe também uma mensagem para o calculo do total para preencher o tanque.*/



public class rodaraplicacao {
     public static void main (String[] args) {

          carro carro1 = new carro();

          carro1.setCor("Azul");
          carro1.setModelo("BMW serie3");
          carro1.setCapacidadeTanque(59);

          System.out.println(carro1.getModelo());
          System.out.println(carro1.getCor());
          System.out.println(carro1.getCapacidadeTanque());
          System.out.println(carro1.totalValorTanque(6.39));

         carro carro2 = new carro("zinza", "Mercedez Benz Classe C", 66);

          System.out.println(carro2.getModelo());
          System.out.println(carro2.getCor());
          System.out.println(carro2.getCapacidadeTanque());
          System.out.println(carro2.totalValorTanque(6.46));
     }

}
