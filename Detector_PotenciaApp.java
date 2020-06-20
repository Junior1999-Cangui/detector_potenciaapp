
package detector_potenciaapp;

/**
 *
 * @author Junior
 */
class Detector_Potencia{
    /*Atributos*/
    private int codigo;
    private String medida;
    private String potencia;
    private int numPotencia;
    
    /*Constructor*/
    
    public Detector_Potencia(int pCodigo,String pMedida,String pPotencia,int pNumPotencia){
        
        codigo=pCodigo;
        medida=pMedida;
        potencia=pPotencia;
        numPotencia=pNumPotencia;
    }
    
    /*Metodos*/
    
    public int getCodigo(){
        return codigo;
    }
    
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    
    public String getMedida(){
        return medida;
    }
    
    public void setMedida(String medida){
        this.medida=medida;
    }
    
    public String getPotencia(){
        return potencia;
    }
    
    public void setPotencia(String potencia){
        this.potencia=potencia;
    }
    
    public int getNumPotencia(){
        return numPotencia;
    }
    
    public void setNumPotencia(int numPotencia){
        this.numPotencia=numPotencia;
    }
    
       @Override
    public String toString(){
        return "El Detector de Potencia" + medida+" con CODIGO: "+codigo+"-->"
                + "Inspeccionado por el Sensor de " +potencia+
                 " tiene registradas: " +numPotencia+ " faltas de potencia";
    }
}

public class Detector_PotenciaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         System.out.println("    Paper:  DETECCIÓN DE FALTAS EN MOTORES ELECTRICOS CON BASE EN ÍNDICES DE "
                 + "POTENCIAS Y REDES NEURONALES\n");
          System.out.println("Autor: Junior Cangui\n");
        // TODO code application logic here
        // Creamos los objetos
        
        Detector_Potencia senial1=new  Detector_Potencia(777," Medida1"," Potencia1", 4);
        Detector_Potencia senial2=new  Detector_Potencia(778," Medida2"," Potencia2", 6);
        
        //Mostramos su estado
        System.out.println(senial1.toString());
        System.out.println(senial2.toString());
        
        //Modificamos el Atributo NumPotencia de la senial 11
        senial1.setNumPotencia(7);
        
        //Comparamos quien tiene mas faltas de potencia
        
        if(senial1.getNumPotencia()<senial2.getNumPotencia()){
            System.out.println(senial1.getPotencia()+ " tiene mas faltas de potencia");
            }else{
              System.out.println(senial2.getPotencia()+ " tiene mas faltas de potencia");
            }
        }
    }
    
}
