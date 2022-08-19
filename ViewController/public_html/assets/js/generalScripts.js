$(function(){
    var srcId = '';
    
    $(".ver-promo").click(function(){
        srcId ='#video_'+$(this).attr('id');
    });
    $(".ver-promo").each(function(){
        $(this).magnificPopup({
            callbacks: {
                elementParse: function(item) {
                    item.src = srcId;
                    console.log(item);
                }
            }
        });
    });
});