package w2_animal;

public class C_hippo extends A_animal{
    // overrided method 
    public void makeNoise(){
        System.out.println("Hippo : sorry i dont know how hippos growl...");
    }
    public void eat(){
        System.out.println("Hippo eats watermelon");
    }
    // constructor
    public C_hippo (String F, String L, String S){
        food = F;
        location = L;
        status = S;
    }
}