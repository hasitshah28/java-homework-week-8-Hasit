package methodoverriding24;

public class Icici extends Bank{
    @Override
    public int getRateOfInterest() {
        return 7;
    }
}
