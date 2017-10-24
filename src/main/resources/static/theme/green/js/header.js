;$(function () {             
    //绑定滚动条事件 
  $(window).scroll(function () { 
      if ( parseInt($(window).scrollTop()) > 0) { 
          $(".header").addClass("scroller");
      } else{
    	  if($("div.header-icon").length>0){
    		  $(".header").removeClass("scroller");
    	  }else{
    		  if($("div.header-index").length>0){
        		  $(".header").removeClass("scroller");
    		  }
    	  }
      }
  });
  $(".header").addClass("scroller");
  $(window).scroll();
  $(".nav").load("/header.do ul.navul");
  $.ajaxSetup({ 
	  cache: false ,
	  complete:function(XMLHttpRequest,textStatus){ 
              var sessionstatus=XMLHttpRequest.getResponseHeader("sessionstatus"); //通过XMLHttpRequest取得响应头，sessionstatus，
              if(sessionstatus=="timeout"){  //如果超时就处理 ，指定要跳转的页面
                 window.location.replace("/login"); 
              } 
              if(textStatus==="success"){
            	  try{
            		  data=$.parseJSON(XMLHttpRequest.responseText);
            		  if(data&&data.flag==false){
                		  $.Notify({
            			    content: data.message||"操作失败",
            			    type: 'alert'
            			});
                	  }
            	  }catch (e){
            		  //json转换失败，不应影响主业务
            	  }
              }
      },
      error:function (XMLHttpRequest, textStatus, errorThrown) {
    	  $.Notify({
			    content: "操作失败",
			    type: 'alert'
		  });
      }
  });
  
}) ;