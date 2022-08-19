function atmtclgn(evt) {
    evt.cancel();
    var source = evt.getSource();
    if (getCookie('U0tZX1NFTF9US04')) {
        AdfCustomEvent.queue(source, "LaunchLogin",{},true);
    }
}
function sireinpc(evt) {
    evt.cancel();
    var source = evt.getSource();
    AdfCustomEvent.queue(source, "LaunchRegistroIndex",{},true);   
}
function getCookie(c_name) {
    var c_value = document.cookie;
    var c_start = c_value.indexOf(" " + c_name + "=");
    if (c_start ==  - 1) {
        c_start = c_value.indexOf(c_name + "=");
    }
    if (c_start ==  - 1) {
        c_value = false;
    }
    else {
        c_start = c_value.indexOf("=", c_start) + 1;
        var c_end = c_value.indexOf(";", c_start);
        if (c_end ==  - 1) {
            c_end = c_value.length;
        }
        c_value = true;
    }
    return c_value;
}