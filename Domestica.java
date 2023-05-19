/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mirian.tarea3;

/**
 *
 * @author Alumnado
 */
public final class Domestica extends Maquinaria{
    //Campos
    enum Tipo {Lavadora, Secadora, Frigorifico, Horno, Microondas}
    private Tipo categoria;
    
    //Constructor
    public Domestica(){
        super();
    }
    
    public Domestica(int numeroSerial, String model, int workingTime, String category){
        super(numeroSerial, model, workingTime);
        asignarCategoria(category);
    }

    public Tipo getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        asignarCategoria(categoria);    
    }
    
    public void asignarCategoria(String a){
        switch(a.toLowerCase()){
            case "lavadora"-> categoria = Domestica.Tipo.Lavadora;
            case "secadora"-> categoria = Domestica.Tipo.Secadora;
            case "frigorifico"-> categoria = Domestica.Tipo.Frigorifico;
            case "horno"-> categoria = Domestica.Tipo.Horno;
            case "microondas"-> categoria = Domestica.Tipo.Microondas;
            default-> categoria= Tipo.Frigorifico;
        }     
    }
    
    @Override
    public String mostrarInfo(){
        return super.mostrarInfo()+"\nCategoria: "+this.getCategoria();
    }
    
   @Override
    public void encerder(){
        System.out.println("Encendiendo "+categoria+"\n");
    }
    
    @Override
    public void apagar(){
        System.out.println("Apagando "+categoria+"\n");
    }
    
    
}
