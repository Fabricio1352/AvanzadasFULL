/**
 * Residuo.java
 *
 *
 *
 */
package objetosNegocio;

import java.io.Serializable;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;

/**
 * Clase que representa un residuo peligroso
 *
 * @author Equipo 5
 */
public class Residuo implements Serializable {

    @BsonId
    private ObjectId idResiduo;
    private String compuestos;

    public Residuo() {
    }

    public Residuo(ObjectId idResiduo, String compuestos) {
        this.idResiduo = idResiduo;
        this.compuestos = compuestos;
    }

    public ObjectId getIdResiduo() {
        return idResiduo;
    }

    public void setIdResiduo(ObjectId idResiduo) {
        this.idResiduo = idResiduo;
    }

    public String getCompuestos() {
        return compuestos;
    }

    public void setCompuestos(String compuestos) {
        this.compuestos = compuestos;
    }
    
    @Override
    public String toString(){
        return "Compuestos: "+compuestos;
    }
}
