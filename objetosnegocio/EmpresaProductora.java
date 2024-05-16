/**
 * EmpresaProductora.java
 * 
 * 
 */
package objetosNegocio;

import java.util.List;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;


/**
 * Clase que representa una empresa productora
 *
 * @author Equipo 5
 */
public class EmpresaProductora {

       
    private ObjectId idEmpresa;
    private String nomEmpresa;

    private List<Residuo> residuos;

    public EmpresaProductora() {
    }

    public EmpresaProductora(ObjectId idEmpresa, @BsonProperty("nomEmpresa") String nomEmpresa) {
        this.idEmpresa = idEmpresa;
        this.nomEmpresa = nomEmpresa;
    }

    /**
     * Constructor de la clase EmpresaProductora
     *
     * @param nomEmpresa Nombre de la empresa productora
     * @param idEmpresa Id de la empresa productora
     * @param residuo Residuo de la empresa productora
     */
    public EmpresaProductora(String nomEmpresa, ObjectId idEmpresa, List<Residuo> residuo) {
        this.residuos = residuo;
        this.nomEmpresa = nomEmpresa;
        this.idEmpresa = idEmpresa;
    }

    public EmpresaProductora(String nomEmpresa, List<Residuo> residuos) {
        this.nomEmpresa = nomEmpresa;
        this.residuos = residuos;
    }
    
    
    /**
     * Obtiene los residuo de la empresa productora
     *
     * @return Residuo de la empresa productora
     */
    public List<Residuo> getResiduos() {
        return residuos;
    }


    /**
     * Establece los residuos que la empresa maneja
     * @param residuos  residuos de la empresa
     */
    public void setResiduos(List<Residuo> residuos) {
        this.residuos = residuos;
    }


    /**
     * Obtiene el nombre de la empresa productora
     *
     * @return nomEmpresa
     */
    public String getNomEmpresa() {
        return nomEmpresa;
    }

    /**
     * Establece el nombre de la empresa productora
     *
     * @param nomEmpresa Nombre de la empresa productora
     */
    public void setNomEmpresa(String nomEmpresa) {
        this.nomEmpresa = nomEmpresa;
    }

    /**
     * Obtiene el id de la empresa productora
     *
     * @return idEmpresa
     */
    public ObjectId getIdEmpresa() {
        return idEmpresa;
    }

    /**
     * Establece el id de la empresa productora
     *
     * @param idEmpresa Id de la empresa productora
     */
    public void setIdEmpresa(ObjectId idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    @Override
    public String toString() {
        return nomEmpresa;
    }

    
    
    /**
     * Muestra la informacion de la empresa productora
     */
   

}
