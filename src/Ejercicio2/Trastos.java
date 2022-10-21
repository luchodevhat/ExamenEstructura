
package Ejercicio2;


public class Trastos {
    private int platosC;
    private int cubiertos;

    public Trastos() {
        this.platosC = 0;
        this.cubiertos = 0;
    }

    public int getPlatosC() {
        return platosC;
    }

    public void setPlatosC(int platosC) {
        this.platosC = platosC;
    }


    public int getCubiertos() {
        return cubiertos;
    }

    public void setCubiertos(int cubiertos) {
        this.cubiertos = cubiertos;
    }

    @Override
    public String toString() {
        return "Trastos{" + "platosC=" + platosC + ", cubiertos=" + cubiertos + '}';
    }
}
