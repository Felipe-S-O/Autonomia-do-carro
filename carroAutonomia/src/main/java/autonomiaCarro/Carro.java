
package autonomiaCarro;

/**
 *
 * @author felipe
 */
public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double copCombustivel;
    double consumoCombustivel; 
    
    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " + copCombustivel * consumoCombustivel + "km");
           
    }
    double obterAutonomia(){
        System.out.println("méto obterAutonomia foi chamando");
        
        return copCombustivel * consumoCombustivel;
    }
    
    double calcularCombustivel(double km){
        
        double qtdCombustivel = km/consumoCombustivel;
        
        return qtdCombustivel;
    }
}
