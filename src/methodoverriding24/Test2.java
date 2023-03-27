package methodoverriding24;

public class Test2 {
    public static void main(String[] args) {
        Sbi s = new Sbi();
        Icici i = new Icici();
        Axis a = new Axis();
        System.out.println("Sbi Rate of interest: " +s.getRateOfInterest());
        System.out.println("Icici Rate of interest: " +i.getRateOfInterest());
        System.out.println("Axis Rate of interest: " +a.getRateOfInterest());

    }
}
