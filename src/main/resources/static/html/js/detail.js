$(function(){
    $(".detail-left li").click(function(){
		$(".detail-right").load($(this).attr("data-href"));
    })
})