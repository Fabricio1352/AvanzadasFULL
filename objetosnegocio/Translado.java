/**
 * Translado.java
 * 
 * 
 */
package objetosNegocio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;


/**
 * Clase que rempresaProductoraresenta un translado de residuos
 *
 * @author fabricio01352
 */
public class Translado implements Serializable {
    
    @BsonId
    private ObjectId idTranslado;
    private Date fechaEnviado;
    private Date fechaRecibido;
    private String origen;
    private String destino;   
    private ArrayList<EmpresaTransporte> empresasTransporte;    
    private Residuo residuo;
    private EmpresaProductora empresaProductora;

    public Translado() {
    }

    /**
     * Constructor de la clase Translado
     *
     * @param _id   ID del translado
     * @param fechaEnviado  Fecha en la que se envio el translado
     * @param fechaRecibido Fecha en la que se recibio el translado
     * @param origen        Origen del translado
     * @param destino       Destino del translado
     * @param residuo       Residuo del translado
     * @param empresasTransporte
     * @param empresaProductora  Empresa productora del translado
     */
    
    
    public Translado(ObjectId _id, Date fechaEnviado, Date fechaRecibido, String origen, String destino, Residuo residuo,  ArrayList<EmpresaTransporte> empresasTransporte, EmpresaProductora empresaProductora) {
        this.idTranslado = _id;
        this.fechaEnviado = fechaEnviado;
        this.fechaRecibido = fechaRecibido;
        this.origen = origen;
        this.destino = destino;
        this.empresasTransporte = empresasTransporte;
        this.residuo = residuo;
        this.empresaProductora = empresaProductora;
    }

    /**
     * Obtiene el ID del translado
     *
     * @return ID del translado
     */
    public ObjectId getIdTranslado() {
        return idTranslado;
    }

    /**
     * Establece el ID del translado
     *
     * @param _id ID del translado
     */
    public void setIdTranslado(ObjectId _id) {
        this.idTranslado = _id;
    }

    /**
     * Obtiene la fecha en la que se envio el translado
     *
     * @return Fecha en la que se envio el translado
     */
    public Date getFechaEnviado() {
        return fechaEnviado;
    }

    /**
     * Establece la fecha en la que se envio el translado
     *
     * @param fechaEnviado Fecha en la que se envio el translado
     */
    public void setFechaEnviado(Date fechaEnviado) {
        this.fechaEnviado = fechaEnviado;
    }

    /**
     * Obtiene la fecha en la que se recibio el translado
     *
     * @return Fecha en la que se recibio el translado
     */
    public Date getFechaRecibido() {
        return fechaRecibido;
    }

    /**
     * Establece la fecha en la que se recibio el translado
     *
     * @param fechaRecibido Fecha en la que se recibio el translado
     */
    public void setFechaRecibido(Date fechaRecibido) {
        this.fechaRecibido = fechaRecibido;
    }

    /**
     * Obtiene el origen del translado
     *
     * @return Origen del translado
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * Establece el origen del translado
     *
     * @param origen Origen del translado
     */
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    /**
     * Obtiene el destino del translado
     *
     * @return Destino del translado
     */
    public String getDestino() {
        return destino;
    }

    /**
     * Establece el destino del translado
     *
     * @param destino Destino del translado
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * Obtiene la empresa de transporte del translado
     *
     * @return regresa las empresas que realizaron este transporte
     */
    public ArrayList<EmpresaTransporte> getEmpresasTransporte() {    
        return empresasTransporte;
    }

    /**
     * Establece la empresa de transporte del translado
     *
     * @param empresasTransporte empresas que transportaron este material
     */
    public void setEmpresasTransporte(ArrayList<EmpresaTransporte> empresasTransporte) {   
        this.empresasTransporte = empresasTransporte;
    }

    /**
     * Obtiene el residuo del translado
     *
     * @return Residuo del translado
     */
    public Residuo getResiduo() {
        return residuo;
    }

    /**
     * Establece el residuo del translado
     *
     * @param residuo Residuo del translado
     */
    public void setResiduo(Residuo residuo) {
        this.residuo = residuo;
    }

    /**
     * Obtiene la empresa productora del translado
     *
     * @return Empresa productora del translado
     */
    public EmpresaProductora getEp() {
        return empresaProductora;
    }

    /**
     * Establece la empresa productora del translado
     *
     * @param empresaProductora Empresa productora del translado
     */
    public void setEp(EmpresaProductora empresaProductora) {
        this.empresaProductora = empresaProductora;
    }

    public EmpresaProductora getEmpresaProductora() {
        return empresaProductora;
    }

    public void setEmpresaProductora(EmpresaProductora empresaProductora) {
        this.empresaProductora = empresaProductora;
    }

    @Override
    public String toString() {
        return "Origen: " +origen + " ,Destino: " + destino + " ,Enviado: " + fechaEnviado;
//        return "Translado{" + "_id=" + idTranslado + ", fechaEnviado=" + fechaEnviado + ", fechaRecibido=" + fechaRecibido + ", origen=" + origen + ", destino=" + destino + ", empresasTransporte=" + empresasTransporte + ", residuo=" + residuo + ", empresaProductora=" + empresaProductora + '}';
    }

  
 
}
