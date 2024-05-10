package aed;

public class Recordatorio {
    private String _mensaje;
    private Fecha _fecha;
    private Horario _horario;

    public Recordatorio(String mensaje, Fecha fecha, Horario horario) {
        this._mensaje = mensaje;
        this._fecha = new Fecha(fecha);
        this._horario = new Horario(horario.hora(), horario.minutos());
    }

    public Horario horario() {
        return new Horario(this._horario.hora(), this._horario.minutos());
    }

    public Fecha fecha() {
        return new Fecha(this._fecha);
    }

    public String mensaje() {
        return this._mensaje;
    }

    @Override
    public String toString() {
        StringBuffer sbuffer = new StringBuffer();

        sbuffer.append(this._mensaje);
        sbuffer.append(" @ ");
        sbuffer.append(this._fecha + " ");
        sbuffer.append(this._horario);

        return sbuffer.toString();
    }

    @Override
    public boolean equals(Object otro) {

        boolean claseDistinta = otro.getClass() != this.getClass();


        if (claseDistinta) {
            return false;
        }

        Recordatorio otroRecordatorio = (Recordatorio) otro;

        return _mensaje == otroRecordatorio._mensaje && _fecha == otroRecordatorio._fecha && _horario == otroRecordatorio._horario;
    }

}
