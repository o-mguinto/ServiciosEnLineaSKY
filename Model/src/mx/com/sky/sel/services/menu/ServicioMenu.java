package mx.com.sky.sel.services.menu;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.List;

import mx.com.sky.sel.services.beans.utils.Menu;
import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.services.exception.ServicioException;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultamenu.ConsultaMenu;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultamenu.types.ConsultaMenuProcessRequest;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultamenu.types.ConsultaMenuProcessResponse;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultamenu.ConsultaMenu_Service;

public class ServicioMenu implements Serializable {
    @SuppressWarnings("compatibility:-6181619649294498884")
    private static final long serialVersionUID = -7910757939216972751L;

    public ServicioMenu() {
        super();
    }

    public List<Menu> obtenerMenuCompleto(String tipoCuenta, String pais) {
        List<Menu> menus = new ArrayList<Menu>();
        Menu menu = null;
        ConsultaMenu_Service consultaMenu_Service;
        ConsultaMenu consultaMenu = null;
        ConsultaMenuProcessRequest payload;
        ConsultaMenuProcessResponse resultado = null;
        String paisISO = "";
        String tipoCuentaR = "";
        try {
            paisISO = convertPaisISO(pais);
            tipoCuentaR = convertTipoCuenta(tipoCuenta);

            consultaMenu_Service = new ConsultaMenu_Service();
            consultaMenu = consultaMenu_Service.getConsultaMenu();
            payload = new ConsultaMenuProcessRequest();
            payload.setOPERACION("SELECT_ALL");
            payload.setTIPOCUENTA(tipoCuentaR);
            payload.setPAIS(paisISO);
            resultado = consultaMenu.process(payload);

            if (resultado != null) {
                for (ConsultaMenuProcessResponse.ConfigMenu confMenu : resultado.getConfigMenu()) {
                    menu = convert(confMenu, paisISO);
                    menus.add(menu);
                }
            }
        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
        }


        return menus;
    }

    public List<Menu> obtenerMenus(String uid, String tipoCuenta, String pais) {
        List<Menu> menus = new ArrayList<Menu>();
        Menu menu = null;
        ConsultaMenu_Service consultaMenu_Service;
        ConsultaMenu consultaMenu = null;
        ConsultaMenuProcessRequest payload;
        ConsultaMenuProcessResponse resultado = null;
        String paisISO = "";
        String tipoCuentaR = "";
        try {
            paisISO = convertPaisISO(pais);
            tipoCuentaR = convertTipoCuenta(tipoCuenta);

            consultaMenu_Service = new ConsultaMenu_Service();
            consultaMenu = consultaMenu_Service.getConsultaMenu();
            payload = new ConsultaMenuProcessRequest();
            payload.setOPERACION("SELECT");
            payload.setUSERUID(uid);
            payload.setPAIS(paisISO);
            payload.setTIPOCUENTA(tipoCuentaR);
            resultado = consultaMenu.process(payload);

            if (resultado != null) {
                for (ConsultaMenuProcessResponse.ConfigMenu confMenu : resultado.getConfigMenu()) {
                    menu = convert(confMenu, paisISO);
                    menus.add(menu);
                }
            }
        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
        }


        return menus;
    }


    public String actualizarMenus(List<Menu> menus) {
        String resultado = "";
        for (Menu menu : menus) {
            try {
                updateUserMenu(menu.getPumid(), menu.getPumvisible());
            } catch (Exception e) {
                resultado = e.getMessage();
            }
        }
        return resultado;
    }


    public void deleteUserMenu(String uid) throws ServicioException {
        ConsultaMenu_Service consultaMenu_Service;
        ConsultaMenu consultaMenu = null;
        ConsultaMenuProcessRequest payload;
        ConsultaMenuProcessResponse resultado = null;

        try {
            consultaMenu_Service = new ConsultaMenu_Service();
            consultaMenu = consultaMenu_Service.getConsultaMenu();
            payload = new ConsultaMenuProcessRequest();
            payload.setOPERACION("DELETE");
            payload.setUSERUID(uid);
            resultado = consultaMenu.process(payload);
            if (resultado == null) {
                throw new ServicioException("Error al borrar Menu");
            }
        } catch (ServicioException e) {
            LogServicios.printlnError(this, e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
            throw new ServicioException("Ocurri\u00F3 algo inesperado por favor intenta m\u00E1s tarde");
        }
    }


    private void updateUserMenu(Integer pumId, String visible) throws ServicioException {
        ConsultaMenu_Service consultaMenu_Service;
        ConsultaMenu consultaMenu = null;
        ConsultaMenuProcessRequest payload;
        ConsultaMenuProcessResponse resultado = null;

        try {
            consultaMenu_Service = new ConsultaMenu_Service();
            consultaMenu = consultaMenu_Service.getConsultaMenu();
            payload = new ConsultaMenuProcessRequest();
            payload.setOPERACION("UPDATE");
            payload.setUSERUID(pumId.intValue() + "");
            payload.setVISIBLE(visible);
            resultado = consultaMenu.process(payload);
            if (resultado == null) {
                throw new ServicioException("Error al UPDATE Menu");
            }
        } catch (ServicioException e) {
            LogServicios.printlnError(this, e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
            throw new ServicioException("Ocurri\u00F3 algo inesperado por favor intenta m\u00E1s tarde");
        }
    }


    public void prepararMenuHijo(String uid) throws ServicioException {
        ConsultaMenu_Service consultaMenu_Service;
        ConsultaMenu consultaMenu = null;
        ConsultaMenuProcessRequest payload;
        ConsultaMenuProcessResponse resultado = null;

        try {
            consultaMenu_Service = new ConsultaMenu_Service();
            consultaMenu = consultaMenu_Service.getConsultaMenu();
            payload = new ConsultaMenuProcessRequest();
            payload.setOPERACION("INSERT");
            payload.setUSERUID(uid);
            resultado = consultaMenu.process(payload);
            if (resultado == null) {
                throw new ServicioException("Error al insertar Menu");
            }
        } catch (ServicioException e) {
            LogServicios.printlnError(this, e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
            throw new ServicioException("Ocurri\u00F3 algo inesperado por favor intenta m\u00E1s tarde");
        }
    }


    private Menu convert(ConsultaMenuProcessResponse.ConfigMenu confMenu, String paisISO) {
        Menu menu = new Menu();
        String descripcionMenu = "";
        if (confMenu.getPARENTMENU() != null) {
            menu.setParentmenu(confMenu.getPARENTMENU().intValue());
            descripcionMenu = "---" + confMenu.getPMDESCRIPTION();
        } else {
            descripcionMenu = "+" + confMenu.getPMDESCRIPTION();
        }
        menu.setPmcode(confMenu.getPMCODE());
        if (confMenu.getPMCODE().equalsIgnoreCase("PAGO_LINEA") && paisISO.equalsIgnoreCase("DO")) {
            menu.setPmdescription("+ Saldo Actual y Estado de Cuenta");
        } else {
            menu.setPmdescription(descripcionMenu);
        }
        menu.setPmid(confMenu.getPMID().intValue());
        menu.setPmparentmenu(confMenu.getPMPARENTMENU());
        menu.setPumid(confMenu.getPUMID().intValue());
        menu.setPumvisible(confMenu.getPUMVISIBLE());
        return menu;
    }


    private ConsultaMenuProcessResponse.ConfigMenu convert(Menu confMenu) {
        ConsultaMenuProcessResponse.ConfigMenu menu = new ConsultaMenuProcessResponse.ConfigMenu();

        menu.setPARENTMENU(new BigDecimal(confMenu.getParentmenu()));
        menu.setPMCODE(confMenu.getPmcode());
        menu.setPMDESCRIPTION(confMenu.getPmdescription());
        menu.setPMID(new BigDecimal(confMenu.getPmid()));
        menu.setPMPARENTMENU(confMenu.getPmparentmenu());
        menu.setPUMID(new BigDecimal(confMenu.getPumid()));
        menu.setPUMVISIBLE(confMenu.getPumvisible());
        return menu;
    }

    private String convertPaisISO(String pais) {
        String paisISO = "";
        if (pais.equalsIgnoreCase("MEX")) {
            paisISO = "%MX%";
        } else if (pais.equalsIgnoreCase("CRICA")) {
            paisISO = "%CR%";
        } else if (pais.equalsIgnoreCase("GT")) {
            paisISO = "%GT%";
        } else if (pais.equalsIgnoreCase("HON")) {
            paisISO = "%HN%";
        } else if (pais.equalsIgnoreCase("NIC")) {
            paisISO = "%NI%";
        } else if (pais.equalsIgnoreCase("PAN")) {
            paisISO = "%PA%";
        } else if (pais.equalsIgnoreCase("DOM")) {
            paisISO = "%DO%";
        } else if (pais.equalsIgnoreCase("SAL")) {
            paisISO = "%SV%";
        } else {
            LogServicios.printlnWarn(this, "PAIS NO ENCONTRADO:" + pais);
        }
        return paisISO;
    }

    private String convertTipoCuenta(String tipoCuenta) {
        /*SKY = SKY Normal Tradicional
        VET = VeTV Mexico
        MOD = Modular
        BAR = Bar Restaurante.
        */
        String tipoCuentaR = "";

        if (tipoCuenta.equalsIgnoreCase("SKY")) {
            tipoCuentaR = "%S%";
        } else if (tipoCuenta.equalsIgnoreCase("VeTV")) {
            tipoCuentaR = "%V%";
        }else if (tipoCuenta.equalsIgnoreCase("MINI")) {
            tipoCuentaR = "%I%";
        } else if (tipoCuenta.equalsIgnoreCase("Modular")) {
            tipoCuentaR = "%M%";
        } else if (tipoCuenta.equalsIgnoreCase("Bar_Restaurant")) {
            tipoCuentaR = "%B%";
        }else if (tipoCuenta.equalsIgnoreCase("Hotel")) {
            tipoCuentaR = "%H%";
        }else if (tipoCuenta.equalsIgnoreCase("Punto_Venta")) {
            tipoCuentaR = "%P%";
        }else if (tipoCuenta.equalsIgnoreCase("%%")) {
            tipoCuentaR = "%%";
        } else {
            LogServicios.printlnWarn(this, "TIPO CUENTA NO ENCONTRADO:" + tipoCuenta);
        }
        return tipoCuentaR;
    }
}
