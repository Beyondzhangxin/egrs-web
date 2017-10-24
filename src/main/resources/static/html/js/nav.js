$(function(){
    $('.nav li a').addClass('nav-out')
    $('.nav li').hover(function(event) {
        // $('.head').css('background', 'none');
        $('.sub-nav',this).show();
        $('a',this).addClass('nav-on');
    },function(){
        $('.head').css('background', '#fff');
        $('.sub-nav',this).hide();
    }
    );
})