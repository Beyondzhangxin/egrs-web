$(function(){
    $('.list tr').click(function(event) {
        $(this).attr('id', 'bggreen').siblings().removeAttr('id','bggreen');
    });
})