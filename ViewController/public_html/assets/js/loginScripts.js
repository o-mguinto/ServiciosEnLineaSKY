$(function(){
  $('[data-toggle="tooltip"]').tooltip()
});

function showTooltipTerminos(){
    $('input[name="sbc1"]').attr({
        'data-toggle':'tooltip',
        'data-trigger':'click',
        'title':'Debe aceptar los t\u00e9rminos y condiciones.'
    });
    $('input[name="sbc1"]').tooltip('show').css('left:190px !important');
    $('input[name="sbc1"]').on('click',function(){
        $('input[name="sbc1"]').tooltip('hide');
    });
}

function showLoginErrors(user,pass){
    if(user){
        console.log(typeof user);
        $('span#itLoginNameSkyPc input').attr({
            'data-toggle':'tooltip',
            'data-trigger':'click',
            'data-placement':'top',
            'title':'El campo usuario (e-mail) es requerido.'
        });
        $('span#itLoginNameSkyPc input').tooltip('show');
    }
    if(pass){
        $('span#itContraseniaSkyPC input').attr({
            'data-toggle':'tooltip',
            'data-trigger':'click',
            'data-placement':'bottom',
            'title':'El campo contrase\u00f1a es requerido.'
        });
        $('span#itContraseniaSkyPC input').tooltip('show');
    }
}

function showAutenticatorErrors(titulo,msg){
    $('h4#titulo').html(titulo);
    $('p#msg').html(msg);
    $('#loginError').modal({
        backdrop:'static'
       }).modal('show');
}