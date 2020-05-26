
package autonomiaCarro;

/**
 *
 * @author felipe
 */
public class CalcularAutonomia {
    
 public static void main(String[] args){
        
        Carro van = new Carro(); 
       
        van.marca = "fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.copCombustivel = 50;
        van.consumoCombustivel = 1.6;
        
        System.out.println(van.marca);
        System.out.println(van.modelo);
        System.out.println(van.numPassageiros);
        System.out.println(van.copCombustivel);
        System.out.println(van.consumoCombustivel);
        
        van.exibirAutonomia();
        
        System.out.println();
        
        double autonomia = van.obterAutonomia();
        System.out.println("A autonomia do carro é: " + autonomia);
        System.out.println();
        System.out.println(van.obterAutonomia());
        
       double qtd10km = van.calcularCombustivel(10);
        
        System.out.println("qtdCombustivel10 = " + qtd10km);
    }
    
    
}
