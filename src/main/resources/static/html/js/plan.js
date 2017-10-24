$(function(){
    $('.btn02').click(function(event) {
        $('.bomb-box').show();
        $('.shadow').show();       
    });
    $('.confirm').click(function(){
    	$('.bomb-box').hide();
    	$('.shadow').hide();
    })
    $('.cancel').click(function(){
    	$('.bomb-box').hide();
    	$('.shadow').hide();
    })
    $('.close').click(function(){
    	$('.bomb-box').hide();
    	$('.shadow').hide();
    })    
})