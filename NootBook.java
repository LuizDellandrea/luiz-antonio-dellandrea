public class NootBook implements Dispositivo{
    private boolean conectado;
    private int bateria;
    private String modelo;
    public NootBook(boolean conectado, int bateria, String modelo) {
        this.conectado = conectado;
        this.bateria = bateria;
        this.modelo = modelo;
    }
    public boolean isConectado() {
        return conectado;
    }
    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }
    public int getBateria() {
        return bateria;
    }
    public void setBateria(int bateria) {
        this.bateria = bateria;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    @Override
    public boolean ligar() {
   return bateria >= 10 || conectado;
      
    }
    @Override
    public boolean desligar() {
       return ligar();
    }
    @Override
    public String obterStatus() {
      if (conectado) {
         return " o NootBook de modelo " + modelo + " está com " + bateria + " Esta conectado";
      }
     return modelo;
    }
    
}
