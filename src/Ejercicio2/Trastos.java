
package Ejercicio2;


public class Trastos {
    private int platosC;
    private int cubiertos;

    public Trastos(int platosC, int cubiertos) {
        this.platosC = platosC;
        this.cubiertos = cubiertos;
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
