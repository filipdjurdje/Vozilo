
class Avtomobil extends Vozilo {
    private int brojVrata;

   
    public Avtomobil(int brzina, int kapacitetGoriva, int brojVrata) {
        super(brzina, kapacitetGoriva);
        this.brojVrata = brojVrata;
    }

   
    public int getBrojVrata() {
        return brojVrata;
    }

  
    public void zapali() {
        System.out.println("Avtomobil je zapaljen!");
    }
}
