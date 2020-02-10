public class Audi extends car {
    @Override
    void applyBreaks() {
        System.out.println("Applying breaks to audi");
    }

    @Override
    void accelerate(){
        System.out.println("Accelerating audi");
    }
}
