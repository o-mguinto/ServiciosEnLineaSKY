//Metodo llamado para bloquear las paginas cuando se realizan acciones
function enforcePreventUserInput(evt) {
    var popup = AdfPage.PAGE.findComponentByAbsoluteId('pt1:waitPopup');

    if (popup != null) {
        AdfPage.PAGE.addBusyStateListener(popup, handleBusyState);
        evt.preventUserInput();
    }
}

//JavaScript call back handler
function handleBusyState(evt) {
    var popup = AdfPage.PAGE.findComponentByAbsoluteId('pt1:waitPopup');
    if (popup != null) {
        if (evt.isBusy()) {
            popup.show();
        }
        else if (popup.isPopupVisible()) {
            popup.hide();
            AdfPage.PAGE.removeBusyStateListener(popup, handleBusyState);
        }
    }
}

// Evento para el login automatico cuando se marca la bandera de Recuerdame
function atmtclgn(evt) {
    evt.cancel();
    var source = evt.getSource();
    if (getCookie('U0tZX1NFTF9US04')) {
        AdfCustomEvent.queue(source, "launchLogin",{},true);
    }
}
function sireinpc(evt) {
    evt.cancel();
    var source = evt.getSource();
    AdfCustomEvent.queue(source, "launchRegistroIndex",{},true);   
}

function getCookie(c_name) {
    var c_value = document.cookie;
    var c_start = c_value.indexOf(" " + c_name + "=");
    
    if (c_start ==  - 1) {
        c_start = c_value.indexOf(c_name + "=");
        c_value = false;
    } else {
        c_start = c_value.indexOf("=", c_start) + 1;
        var c_end = c_value.indexOf(";", c_start);
        if (c_end ==  - 1) {
            c_end = c_value.length;
        }
        c_value = true;
    }
    return c_value;
} 