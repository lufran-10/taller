package aed;

public class Horario {
    private Integer _hora;
    private Integer _minutos;

    public Horario(int hora, int minutos) {
        this._hora = hora;
        this._minutos = minutos;
    }

    public int hora() {
        return this._hora;
    }

    public int minutos() {
        return this._minutos;
    }

    @Override
    public String toString() {
        StringBuffer sbuffer = new StringBuffer();

        sbuffer.append(this._hora);
        sbuffer.append(":");
        sbuffer.append(this._minutos);

        return sbuffer.toString();
    }

    @Override
    public boolean equals(Object otro) {
        
        boolean claseDistinta = otro.getClass() != this.getClass();

        if (claseDistinta) {
            return false;
        }

        Horario otroHorario = (Horario) otro;

        return _hora == otroHorario._hora && _minutos == otroHorario._minutos;
    }

}
