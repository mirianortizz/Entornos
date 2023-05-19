/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mirian.tarea3;

/**
 *
 * @author Alumnado
 */
public final class Industrial extends Maquinaria {
     //Campos
    enum Tipo {Conserva, Química, Agricultura, Ganaderia}
    private Tipo ambito;
    private int potenciaConsumo;
    
    
    //Constructor
    public Industrial(){
        super();
    }
    
    public Industrial(int numeroSerial, String model, int workingTime, String scope, int potencia){
        super(numeroSerial, model, workingTime);
        asignarAmbito(scope);
        this.potenciaConsumo = potencia;
        
    }

    public Tipo getAmbito() {
        return ambito;
    }

    public void setAmbito(String ambito) {
        asignarAmbito(ambito);
    }

    public int getPotenciaConsumo() {
        return potenciaConsumo;
    }

    public void setPotenciaConsumo(int potenciaConsumo) {
        this.potenciaConsumo = potenciaConsumo;
    }
    
    public void asignarAmbito(String a){
        switch(a.toLowerCase()){
            case "conserva"-> ambito = Tipo.Conserva;
            case "quimica"-> ambito = Tipo.Química;
            case "agricultura"-> ambito = Tipo.Agricultura;
            case "ganaderia"-> ambito = Tipo.Ganaderia;  
            default-> ambito= Tipo.Conserva;
        } 
    }
    
   @Override
    public String mostrarInfo(){
        return super.mostrarInfo()+"\nPotencia de Consumo: "+this.getPotenciaConsumo()
                +"\nCategoria: "+this.getAmbito();
    }  
    
    @Override
    public void encerder(){
        System.out.println("Encendiendo máquina de "+ambito+"\n");
    }
    
    @Override
    public void apagar(){
        System.out.println("Apagando máquina de "+ambito+"\n");
    }
    
    
}
