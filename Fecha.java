package aed;

public class Fecha {
    private Integer _dia;
    private Integer _mes; 

    public Fecha(int dia, int mes) {
        this._dia = dia;
        this._mes = mes;
    }

    public Fecha(Fecha fecha) {
        throw new UnsupportedOperationException("No implementada aun");
    }

    public Integer dia() {
        return this._dia;
    }

    public Integer mes() {
        return this._mes;
    }

    @Override
    public String toString() {
        StringBuffer sbuffer = new StringBuffer();

        sbuffer.append(this._dia.toString());
        sbuffer.append("/");
        sbuffer.append(this._mes.toString());

        return sbuffer.toString();
    }

    @Override
    public boolean equals(Object otra) {
        throw new UnsupportedOperationException("No implementada aun");
    }

    public void incrementarDia() {
        if (this._dia < diasEnMes(this._mes)) {
            
        };
    }

    private int diasEnMes(int mes) {
        int dias[] = {
                // ene, feb, mar, abr, may, jun
                31, 28, 31, 30, 31, 30,
                // jul, ago, sep, oct, nov, dic
                31, 31, 30, 31, 30, 31
        };
        return dias[mes - 1];
    }

}
