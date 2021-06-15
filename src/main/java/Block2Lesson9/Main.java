package Block2Lesson9;

public class Main {
    public static void main (String[] args) {
        Auto auto1 = new Auto();
        Auto auto2 = null;
        try {auto2 = auto1.clone();
            auto2.engine = auto1.engine.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        auto1.brand = "ford";
        auto1.modelAuto = "focus";
        auto1.name = "Dima";
        auto1.engine.modelEngine = "Duratec";
        auto1.engine.volume = 2;
        System.out.println(auto1);
        System.out.println(auto2);

    }
}
