package mx.com.sky.sel.dc.menu;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import mx.com.sky.sel.services.beans.utils.Menu;
import mx.com.sky.sel.services.menu.ServicioMenu;

import oracle.adf.model.binding.DCIteratorBinding;

import oracle.jbo.Row;

public class DCMenu implements Serializable {
    @SuppressWarnings("compatibility:7368798034894133694")
    private static final long serialVersionUID = -671058851861246679L;

    public DCMenu() {
        super();
    }

    public List<Menu> obtenerMenus(String uid, String tipoCuenta, String pais) {
        List<Menu> menus;
        ServicioMenu sm = new ServicioMenu();
        menus = sm.obtenerMenus(uid, tipoCuenta, pais);
        return menus;
    }

    public void updateMenus(DCIteratorBinding iterator) {
        List<Menu> menus = new ArrayList<Menu>();
        Menu menu = null;
        for (Row row : iterator.getAllRowsInRange()) {
            menu = new Menu();
            menu.setPumid((Integer)row.getAttribute("pumid"));
            menu.setPumvisible((String)row.getAttribute("pumvisible"));
            menus.add(menu);
        }
        ServicioMenu sm = new ServicioMenu();
        sm.actualizarMenus(menus);
    }
}
