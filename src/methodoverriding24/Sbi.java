package methodoverriding24;

public class Sbi extends Bank {
    @Override
    public int getRateOfInterest() {
        return 8;
    }
}
