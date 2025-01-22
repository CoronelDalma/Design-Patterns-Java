public interface IObserver {
    // diferentes acciones que un obsevador puede tener.
    // ej. resurtir bodega, generar facturas
    void notification(String message);
}
