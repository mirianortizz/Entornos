/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mirian.tarea3;

/**
 *
 * @author Alumnado
 */
public class Maquinaria implements Funcionamiento {
     //Campos
    protected int numSerie;
    protected String modelo;
    protected int horasFuncionamiento;
    
    
    //Constructor
    public Maquinaria(){}
    
    public Maquinaria(int numeroSerial, String model, int workingTime){
        this.numSerie= numeroSerial;
        this.modelo= model;
        this.horasFuncionamiento=workingTime;
    }
    
    //Métodos

    public int getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getHorasFuncionamiento() {
        return horasFuncionamiento;
    }

    public void setHorasFuncionamiento(int horasFuncionamiento) {
        this.horasFuncionamiento = horasFuncionamiento;
    }
    
    @Override
    public void encerder(){
        System.out.println("Encendiendo maquinaria\n");
    }
    
    @Override
    public void apagar(){
        System.out.println("Apagando maquinaria\n");
    }
    
    public String mostrarInfo(){
        return this.getClass().getSimpleName()+"\nNúmero de serie: " +this.numSerie+
                "\nModelo: " +this.modelo+ 
                "\nHoras de funcionamiento: "+this.horasFuncionamiento;
    
    }
    
    
    
    
    
    
    
    
    
}
