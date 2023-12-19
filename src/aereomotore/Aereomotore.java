package aereomotore;

import java.util.Objects;

public class Aereomotore extends Aeromobile {
    private double potenzaCV;

    public Aereomotore(String sigla, double potenzaCV) {
        super(sigla);
        this.potenzaCV = potenzaCV;
    }

    public double getPotenzaCV() {
        return this.potenzaCV;
    }

    protected boolean confrontaPrestazioni(Aeromobile altroAeromobile) {
        Aereomotore altroAereomotore = (Aereomotore)altroAeromobile;
        return this.potenzaCV > altroAereomotore.potenzaCV;
    }

    public boolean equals(Object o) {
        boolean ret = false;
        if (o instanceof Aereomotore) {
            Aereomotore aereomotore = (Aereomotore)o;
            if (super.equals(o) && this.potenzaCV == aereomotore.potenzaCV) {
                ret = true;
            }
        }

        return ret;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{super.hashCode(), this.potenzaCV});
    }

    public String toString() {
        return "Aereomotore{sigla='" + this.getSigla() + '\'' + ", potenzaCV=" + this.potenzaCV + '}';
    }
}
