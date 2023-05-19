/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package mirian.tarea3;
import java.util.Scanner;
/**
 *
 * @author Alumnado
 */
public class Principal {

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        
        
        //Maquinaria maq = new Maquinaria(1000, "Advanced", 20);
        //Industrial ind = new Industrial(500, "Super", 30, "Conserva", 2000);
        //Domestica dom = new Domestica(800, "Home", 10, "Frigorifico");
        String respuesta;
        do{
        System.out.println("Indique los datos de la maquinaria: ");
        System.out.print("Número de serie: ");
        int nSerie = sc.nextInt();
        System.out.print("Modelo: ");
        String modelo = sc.next();
        System.out.print("Horas de funcionamiento: ");
        int hFunc = sc.nextInt();
        System.out.println("Indique el tipo de maquinaria(1 o 2): \n1. Industrial"+"\n2. Doméstica");
        int tipo =sc.nextInt();
        Maquinaria m = new Maquinaria();
        
        switch (tipo) {
            case 1 -> {
                // tipo industrial
                System.out.print("Potencia: ");
                int potencia = sc.nextInt();
                System.out.print("Ámbito (conserva, química, agricultura, ganadería): ");
                String ambito = sc.next();
                m = new Industrial(nSerie, modelo, hFunc, ambito, potencia);
            }
            case 2 -> {
                // tipo doméstico
                System.out.print("Categoría(Lavadora, Secadora, Frigorifica, Horno, Microondas):");
                String categoria = sc.next();
                m = new Domestica(nSerie, modelo, hFunc, categoria);
            }
            default -> System.out.println("El tipo indicado no es válido.");
        }
        /**maq.encerder();
        ind.encerder();
        dom.encerder();*/
        m.encerder();
        
        /**System.out.println(maq.mostrarInfo()+"\n");
        System.out.println(ind.mostrarInfo()+"\n");
        System.out.println(dom.mostrarInfo()+"\n");*/
        System.out.println(m.mostrarInfo()+"\n");
        
        /**maq.apagar();
        ind.apagar();
        dom.apagar();*/
        m.apagar();
        System.out.print("¿Desea introducir una nueva máquina? (s/n): ");
        respuesta= sc.next();
        }while(respuesta.equals("s"));
       
        System.out.println("Fin del programa.");
        /**Domestica d1 = new Domestica();
        d1.setNumSerie(24589);
        d1.setModelo("AEG");
        d1.setHorasFuncionamiento(451);
        d1.asignarCategoria("Lavadora");
        System.out.println(d1.mostrarInfo()); 
        d1.encerder();
        
        Domestica d2 = new Domestica(9587, "Balay", 59, "Horno");
        System.out.println(d2.mostrarInfo());
        d2.apagar();
        
        Industrial i1 = new Industrial();
        i1.setNumSerie(30274);
        i1.setModelo("STILL");
        i1.setHorasFuncionamiento(9541);
        i1.asignarAmbito("CONSERVA");
        i1.setPotenciaConsumo(50);
        System.out.println(i1.mostrarInfo());
        i1.apagar();
        
        Industrial i2 = new Industrial();*/

    }
}
