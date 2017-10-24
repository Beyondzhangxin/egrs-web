$(function(){
    $(".detail-left li").click(function(){
    	$(".detail-right").empty();
    	if($(this).data("redirect")){
    		window.location.href=$(this).data("redirect");
    	}else if(typeof(window[$(this).attr("data-callback")])=="function"){
    		$(".detail-right").load($(this).attr('data-href'),window[$(this).attr("data-callback")]);
    	}else{
    		$(".detail-right").load($(this).attr('data-href'),function(){
    			if($("input[name='_redirect_url']").length>0){
    				window.location.href=$("input[name='_redirect_url']").val();
    			}
    			$(".fine-uploader").each(function(){
    				env.file_init($(this));
    			});
    			width=$(this).width();
    			height=$(this).height();
    			$(this).css("width",0);
    	    	$(this).css("height",0);
    	    	$(this).children().hide();
    			$(this).animate({width:width,height:height},"slow",function(){
    				$(this).css("width", 'auto');
        	    	$(this).css("height", 'auto');
        	    	$(this).children().fadeIn();
    			});
    		});
    	}
    	$(this).addClass('leftbar-on').siblings().removeClass('leftbar-on');
    });
    if(typeof(m)!="undefined"){
    	 $(".detail-left li[data-href]").eq(m).click();
    }else{
    	$(".detail-left li[data-href]").eq(0).click();
    }
    var lb = $("input[name='lb']").val();
	if(lb == "qqc"){
		$("#li2").removeAttr("style");
		$("#li3").removeAttr("style");
		$("#li4").removeAttr("style");
		$("#li5").removeAttr("style");
		$("#li6").removeAttr("style");
	}
})