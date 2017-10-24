;
var env={
	page_url:function (url,pageNum,pageSize){
		if(typeof(pageSize) != "undefined"){
			url = url + "&" + "pageSize=" + pageSize ;
		}else if(typeof($(".datagrid>.pagination").attr("data-size")) != "undefined"){
			url = url + "&" + "pageSize=" + $(".datagrid>.pagination").attr("data-size");
		}
		if(typeof(pageNum) != "undefined"){
			url = url + "&" + "pageNum=" + pageNum ;
		}else if(typeof($(".datagrid>.pagination").attr("data-number")) != "undefined"){
			url = url + "&" + "pageNum=" + $(".datagrid>.pagination").attr("data-number");
		}
 		return url + " .datagrid";
	},
	del:function(id){
		$.post("delete",{id:id},function(data){
			if(data.flag){
				$.Notify({
					content: data.message||"删除成功",
				    type: 'success'
				});
				if(typeof(page)=="function"){
					page();
				}
			}
		});
	},
	file_init:function(element,option){
		 setting={};
		 $.extend(true,setting,{
			 debug:true,        	
	         template: 'qq-template-manual-trigger',
	         request: {
	             endpoint: '/file/upload'
	         },
	         text: {
	         	formatProgress: "{percent}% of {total_size}",
	             failUpload: "上传失败",
	             waitingForResponse: "上传中...",
	             paused: "暂停"
	         },
	         messages: {
	         	typeError: "{file} 文件格式错误， 允许上传的格式为: {extensions}.",
	             sizeError: "{file} 太大，最大文件大小为 {sizeLimit}。",
	             minSizeError: "{file} 太小, 最小文件大小为 {minSizeLimit}。",
	             emptyError: "{file} 为空，请重新选择",
	             noFilesError: "没有文件需要被上传",
	             tooManyItemsError: "等待上传文件数超过上限 ({netItems})。一次仅能上传 {itemLimit}个",
	             maxHeightImageError: "图片过高",
	             maxWidthImageError: "图片过宽",
	             minHeightImageError: "图片高度不足",
	             minWidthImageError: "图片宽度不足",
	             retryFailTooManyItems: "重试次数已达上线",
	             onLeave: "文件上传中，如果您离开，文件上传将会终止",
	             unsupportedBrowserIos8Safari: "您的浏览器尚不支持上传文件，请升级浏览器",
	             unsupportedBrowser: "您的浏览器尚不支持上传文件，请升级浏览器"
	         },
	         retry: {
	             autoRetryNote: "重试 {retryNum}/{maxAuto}..."
	         },
	         paste: {
	             promptForName: false,
	             namePromptMessage: "请命名此图片"
	         },
	         deleteFile: {
	             enabled: true, 
	             endpoint: '/file/delete',
	             forceConfirm: true,
	             confirmMessage: "确认删除 {filename}?",
	             deletingStatusText: "删除中...",
	             deletingFailedText: "删除失败"
	         },
	         autoUpload: false,
	         session :{
	         	endpoint: '/file/session',
	         	params: {ids:''}//初始化文件id
	         }
		 },option);
		 element.append("<div class='fine-uploader-manual-trigger'></div>");
		 if($("input.filename").length>0){//如果存在文件字段
			 fileoption = {
				session : {
					params : {
						ids : $("input.filename",element).val()
					}
				},
				callbacks:{
					onStatusChange: function(id,oldStatus,newStatus){
						trigger=$(this._options.el).children(".fine-uploader-manual-trigger");
						uploads=$(trigger).fineUploader("getUploads",{status:'upload successful'});
						fileIds=new Array();
						for(var i=0;i<uploads.length;i++){
							fileIds.push(uploads[i].uuid);
						}
						$("input.filename",$(this._options.el)).val(fileIds.join(","));
					}
				},
				el:element
			};
			 $.extend(true,setting,fileoption);
		 }
		 if(element.data("option")){
			 $.extend(true,setting,eval('(' + element.data("option") + ')'));
		 }
		 
		 $('.fine-uploader-manual-trigger',element).fineUploader(setting);
	     $('.trigger-upload',element).click(function() {
	         $(this).closest(".fine-uploader-manual-trigger").fineUploader('uploadStoredFiles');
	     });
	}
};