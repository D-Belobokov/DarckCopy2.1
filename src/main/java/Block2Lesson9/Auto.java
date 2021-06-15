package Block2Lesson9;

public class Auto implements Cloneable{
    String name = "default";
    String brand = "default";
    String modelAuto = "default";
    Engine engine = new Engine();

    @Override
    protected Auto clone() throws CloneNotSupportedException {
        return(Auto) super.clone();
    }

    @Override
    public String toString() {
        return "Auto{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", modelAuto='" + modelAuto + '\'' +
                ", engine=" + engine +
                '}';
    }
}
  class Engine implements Cloneable{
    String modelEngine;
    int volume;
     @Override
     protected Engine clone() throws CloneNotSupportedException {
         return(Engine) super.clone();
     }

     @Override
     public String toString() {
         return "Engine{" +
                 "modelEngine='" + modelEngine + '\'' +
                 ", volume=" + volume +
                 '}';
     }
 }
