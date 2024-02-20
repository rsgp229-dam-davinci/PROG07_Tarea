package model;

import java.util.Optional;

public abstract class CuentaCorriente extends CuentaBancaria{
    private final int MAX_AUTORIDADES_AUTORIZADAS = 100;
    private EntidadAutorizada[] entidadesAutorizadasAlCobro = new EntidadAutorizada[MAX_AUTORIDADES_AUTORIZADAS];

    /**
     * Este método indica si una entidad está autorizada o no a cobrar
     * @param entidadInteresada La entidad que trata de realizar el cobro
     * @return Indica si la entidad puede o no realizar el cobro
     */
    public boolean puedeCobrar(EntidadAutorizada entidadInteresada){
        if(entidadInteresada != null) {
            for (EntidadAutorizada entidad : entidadesAutorizadasAlCobro) {
                if (entidad.getNombreEntidad().equalsIgnoreCase(entidadInteresada.getNombreEntidad()))
                    return true;
            }
        }
        return false;
    }

    /**
     * Este método añade una nueva entidad autorizada al cobro en el registro de la cuenta.
     * Simula una estructura de datos muy simple.
     *
     * @param entidadInteresada La nueva entidad autorizada a añadir
     * @return Devuelve si se ha podido añadir la entidad o no
     */
    public boolean añadirEntidadAutorizada (EntidadAutorizada entidadInteresada){
        if (entidadInteresada != null) {
            for (int i = 0; i < entidadesAutorizadasAlCobro.length; i++) {
                if (entidadesAutorizadasAlCobro[i]==null){
                    entidadesAutorizadasAlCobro[i] = entidadInteresada;
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Este método elimina una entidad autorizada al cobro
     * Al igual que el método anterior, trata de emular una estructura de datos muy sencilla
     * @param entidadAutorizada La entidad autorizada a eliminar
     * @return Si la entidad ha sido o no eliminada
     */
    public boolean eliminarEntidadAutorizada (EntidadAutorizada entidadAutorizada){
        if (entidadAutorizada != null){
            for (int i = 0; i < entidadesAutorizadasAlCobro.length; i++) {
                if (entidadesAutorizadasAlCobro[i] != null) {
                    if (entidadesAutorizadasAlCobro[i].getNombreEntidad().equalsIgnoreCase(entidadAutorizada.getNombreEntidad()))
                        entidadesAutorizadasAlCobro[i] = entidadAutorizada;
                }
            }
        }
        return false;
    }
}