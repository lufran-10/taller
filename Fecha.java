package aed;

public class Fecha {
    private Integer _dia;
    private Integer _mes; 

    public Fecha(int dia, int mes) {
        this._dia = dia;
        this._mes = mes;
    }

    public Fecha(Fecha fecha) {
        this._dia = fecha._dia;
        this._mes = fecha._mes;
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

        sbuffer.append(this._dia);
        sbuffer.append("/");
        sbuffer.append(this._mes);

        return sbuffer.toString();
    }

    @Override
    public boolean equals(Object otra) {
        
        boolean claseDistinta = otra.getClass() != this.getClass();

        if (claseDistinta) {
            return false;
        }

        Fecha otraFecha = (Fecha) otra;

        return _dia == otraFecha._dia && _mes == otraFecha._mes;

    }

    public void incrementarDia() {
        if (this._dia < diasEnMes(this._mes)) {
            this._dia++;
        } else {
            this._dia = 1;
            if (this._mes < 12) {
                this._mes++;
            } else {
                this._mes = 1;
            }
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
