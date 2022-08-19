$(function(){
    $('input[name$="itLoginNameSky"], input[name="itLoginNameSkyiPad"]').on('blur',
        function(){
            var user = $.trim($(this).val())
            $(this).val(user);
        }
    );
})

function bloquea() {
    var theme = "b", msgText = "Consultando Informaci&oacute;n, por favor espere", textVisible = "true", textonly = "false";

    html = "<span class='ui-bar ui-shadow ui-overlay-d ui-corner-all'><img src='../imagenes/aplicacion/loading.gif'><h2>Cargando informaci&oacute;n ...<\/h2><\/span>";
    $.mobile.loading("show", 
    {
        text : msgText, textVisible : textVisible, theme : theme, textonly : textonly, html : html
    });
    
    

}

function desbloquea() {
    $.mobile.loading("hide");
}

function botonChatMobile(evt) {
                  console.log('LOG Mobile');
                  document.getElementById('commandButtonChatMobile').click(); return false;
              }