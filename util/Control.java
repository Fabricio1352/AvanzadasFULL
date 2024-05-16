/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import dao.*;
import gui.DlgEmpresaFabricante;
import gui.DlgEmpresaTransporte;
import gui.DlgRegistro;
import gui.DlgResiduo;
import gui.DlgTranslado;
import gui.DlgVehiculo;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import objetosNegocio.EmpresaProductora;
import objetosNegocio.EmpresaTransporte;
import objetosNegocio.Residuo;
import objetosNegocio.Translado;
import objetosNegocio.Vehiculo;
import util.ModeloLista;

/**
 *
 * @author Equipo 5
 */
public class Control {

    private static Control instance;

    /**
     * Metodo para obtener una instancia de la clase
     *
     * @return regresa una instancia de la clase
     *
     */
    public static Control getInstance() {
        if (instance == null) {
            instance = new Control();
        }
        return instance;
    }

    private Control() {
        residuos = residuoDao.obtenerResiduos();
        empresasproductoras = productoraDao.obtenerEmpresas();

    }
    private EmpresaProductoraDAO productoraDao = new EmpresaProductoraDAO();
    private EmpresaTransporteDAO transportistasDao = new EmpresaTransporteDAO();
    private TransladoDAO transladoDao = new TransladoDAO();
    private ResiduoDAO residuoDao = new ResiduoDAO();
    private VehiculoDAO vehiculoDao = new VehiculoDAO();
    
    private final ModeloLista modelo = new ModeloLista();
    private ModeloLista<Residuo> mod2 = new ModeloLista<>();
    private ModeloLista<Vehiculo> modeloVehiculos = new ModeloLista<>();
    
    private List<Residuo> residuos;
    private List<Vehiculo> vehiculos;
    private List<EmpresaTransporte> empresastransportes;
    private List<EmpresaProductora> empresasproductoras;
    
    private DefaultComboBoxModel translados, residuo, empresaproductora, empresatransporte;
    
    Residuo r = new Residuo();
    Translado t = new Translado();
    Vehiculo v = new Vehiculo();
    EmpresaProductora e;

    public void registro() {
        new DlgRegistro( productoraDao).setVisible(true);

    }

    public boolean registrarEmpresaProductora(JFrame frame) {
        e = new EmpresaProductora();
        for (int i = 0; i < residuos.size();) {

            if (mod2.contains(residuos.get(i))) {
                i++;
            } else {
                mod2.agregar(residuos.get(i));
            }
        }

        try {
            productoraDao.agregar(e);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(frame, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }

//                new DlgEmpresaFabricante(frame, true, mod2).setVisible(true);  
        return true;

    }

    public boolean actualizarEmpresaProductora(EmpresaProductora ep) {
        try {

            productoraDao.editar(ep);
            return true;
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
            return false;
        }
    }

    public boolean actualizarEmpresaTransporte(EmpresaTransporte ep) {
        try {

            transportistasDao.editar(ep);
            return true;
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
            return false;
        }
    }

    public boolean actualizarTranslado(Translado r) {
        try {

            transladoDao.editar(r);
            return true;
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
            return false;
        }
    }

    public boolean registrarEmpresaTransportadora(JFrame frame) {

        translados = conversion(transladoDao.obtenerTodos());
        vehiculos = vehiculoDao.obtenerTodos();
        EmpresaTransporte e = new EmpresaTransporte();
        for (int i = 0; i < vehiculos.size();) {
            if (modeloVehiculos.contains(vehiculos.get(i))) {
                i++;
            } else {
                modeloVehiculos.agregar(vehiculos.get(i));
            }
        }
        try {
            transportistasDao.agregar(e);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(frame, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }

        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                DlgEmpresaTransporte d = new DlgEmpresaTransporte(frame, true, e, modeloVehiculos, translados, getInstance());
                d.setVisible(true);

                return null;
            }
        };

        worker.execute();

        return true;

    }

    public boolean registrarVehiculos(JFrame frame) {
        empresatransporte = conversion(vehiculoDao.obtenerTodos());

        try {
            vehiculoDao.agregar(v);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(frame, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }

        new DlgVehiculo(frame, true, v, vehiculoDao).setVisible(true);

        return true;
    }

    public boolean registrarTranslado(JFrame frame) {
        empresastransportes = transportistasDao.obtenerTodos();
        residuo = conversion(residuoDao.obtenerResiduos());
        empresaproductora = conversion(productoraDao.obtenerEmpresas());
        for (int i = 0; i < empresastransportes.size();) {
            if (modelo.contains(empresastransportes.get(i))) {
                i++;
            } else {
                modelo.agregar(empresastransportes.get(i));
            }
        }
        try {
            transladoDao.agregar(t);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(frame, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }
        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                new DlgTranslado(frame, true, t, modelo, residuo, empresaproductora, transladoDao).setVisible(true);

                return null;
            }
        };

        worker.execute();

        return true;

    }

    /**
     * Metodo estatico de la clase para convertir una lista en un combo box
     *
     * @param <T> tipo de dato
     * @param lista lista a convertir
     * @return regresa un combo box model
     */
    public static <T> DefaultComboBoxModel<T> conversion(List<T> lista) {
        DefaultComboBoxModel<T> caja = new DefaultComboBoxModel<>();

        if (lista != null) {
            for (T dato : lista) {
                caja.addElement(dato);

            }
        }

        return caja;

    }

    /**
     * Metodo para hacer validaciones
     *
     * @param regex expresion regular
     * @param input texto ingresado a verificar
     * @param dialog dialogo parent
     * @return
     */
    public static boolean validar(String regex, String input, JDialog dialog) {

        Pattern pa = Pattern.compile(regex);
        Matcher m = pa.matcher(input);

        return m.matches();

    }

    public boolean registrarResiduo(JFrame frame) {
        empresaproductora = conversion(productoraDao.obtenerEmpresas());
        translados = conversion(transladoDao.obtenerTodos());
        try {
            residuoDao.agregar(r);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(frame, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }

        new DlgResiduo(frame, true, r, residuoDao).setVisible(true);

        return true;

    }
}
