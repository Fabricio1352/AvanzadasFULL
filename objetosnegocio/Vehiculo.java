/**
 * Vehiculo.java
 * 
 * 
 * 
 */
package objetosNegocio;

import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;


/**
 * Clase que representa un vehiculo
 *
 * @author Equipo 5
 */
public class Vehiculo  {
    
    
    @BsonId
    private ObjectId idVehiculo;
    private int km;
    private String nomVehiculo;
    private EmpresaTransporte empresaTransporte;

    public Vehiculo() {
    }

    public Vehiculo(ObjectId idVehiculo, int km, String nomVehiculo, EmpresaTransporte empresaTransporte) {
        this.idVehiculo = idVehiculo;
        this.km = km;
        this.nomVehiculo = nomVehiculo;
        this.empresaTransporte = empresaTransporte;
    }

    public ObjectId getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(ObjectId idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public EmpresaTransporte getEmpresaTransporte() {
        return empresaTransporte;
    }

    public void setEmpresaTransporte(EmpresaTransporte empresaTransporte) {
        this.empresaTransporte = empresaTransporte;
    }
    
    

    /**
     * Constructor de la clase Vehiculo
     *
     * @param km Kilometraje del vehiculo
     * @param nomVehiculo Nombre del vehiculo
     */
    public Vehiculo(int km, String nomVehiculo) {
        this.km = km;
        this.nomVehiculo = nomVehiculo;
    }

    /**
     * Constructor vacio de la clase Vehiculo
     */
    public int getKm() {
        return km;
    }

    /**
     * Obtiene el kilometraje del vehiculo
     *
     * @param km Kilometraje del vehiculo
     */
    public void setKm(int km) {
        this.km = km;
    }

    /**
     * Obtiene el nombre del vehiculo
     *
     * @return nomVehiculo
     */
    public String getNomVehiculo() {
        return nomVehiculo;
    }

    /**
     * Establece el nombre del vehiculo
     *
     * @param nomVehiculo Nombre del vehiculo
     */
    public void setNomVehiculo(String nomVehiculo) {
        this.nomVehiculo = nomVehiculo;
    }
   /**
     * Muestra los datos del vehiculo
     *
     * @return Datos del vehiculo en formato String
     */
    @Override
    public String toString() {
        return nomVehiculo;
//        return "Vehiculo{" + "idVehiculo=" + idVehiculo + ", km=" + km + ", nomVehiculo=" + nomVehiculo + ", empresaTransporte=" + empresaTransporte + '}';
    }

 

}
