package aed;

import java.util.Arrays;

class ArregloRedimensionableDeRecordatorios implements SecuenciaDeRecordatorios {
    private Recordatorio _recordatorios[];
    private int _longitud;
    private int _capacidad;


    public ArregloRedimensionableDeRecordatorios() {
        this._recordatorios = new Recordatorio[0];
        this._longitud = 0;
        this._capacidad = 0;
    }

    public ArregloRedimensionableDeRecordatorios(ArregloRedimensionableDeRecordatorios vector) {
        throw new UnsupportedOperationException("No implementada aun");
    }

    public int longitud() {
        return this._longitud;
    }

    public void agregarAtras(Recordatorio i) {
        if (this._longitud < this._capacidad) {
            this._recordatorios[this._longitud - 1] = i;
        } else {
            Recordatorio[] nuevosRecordatorios = new Recordatorio[this._capacidad + 1];
            System.arraycopy(this._recordatorios, this._capacidad, nuevosRecordatorios, this._longitud + 1, this._capacidad + 1);
            this._capacidad++;
            this._longitud++;
            nuevosRecordatorios[this._longitud - 1] = i;
            this._recordatorios = nuevosRecordatorios;
        }
    }

    public Recordatorio obtener(int i) {
        return new Recordatorio(this._recordatorios[i].mensaje(), this._recordatorios[i].fecha(), this._recordatorios[i].horario());
    }

    public void quitarAtras() {
        Recordatorio[] nuevosRecordatorios = new Recordatorio[this._capacidad];
        nuevosRecordatorios = Arrays.copyOf(this._recordatorios, this._longitud - 1);
        this._recordatorios = nuevosRecordatorios;
    }

    public void modificarPosicion(int indice, Recordatorio valor) {
        throw new UnsupportedOperationException("No implementada aun");

    }

    public ArregloRedimensionableDeRecordatorios copiar() {
        throw new UnsupportedOperationException("No implementada aun");
    }

}
