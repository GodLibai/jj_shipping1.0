//checkbox input
jQuery.fn.customInput = function(){
	return $(this).each(function(){	
		if($(this).is('[type=checkbox]')){
			var input = $(this);
			// 使用输入的ID得到相关的标签
			var label = $(this).parent();
			
			//绑定自定义事件，触发它，绑定点击，焦点，模糊事件				
			input.bind('updateState', function(){	
				input.is(':checked') ? label.addClass('checked') : label.removeClass('checked'); 
			})
			.trigger('updateState')
			.click(function(){ 
				$(this).trigger('updateState'); 
			});
			
			if(input.is(':disabled')){ label.addClass('iedisabled'); }
		};
		if($(this).is('[type=radio]')){
			var input = $(this);
			// 使用输入的ID得到相关的标签
			var label = $(this).parent();
			
			//绑定自定义事件，触发它，绑定点击，焦点，模糊事件				
			input.bind('updateState', function(){	
				input.is(':checked') ? label.addClass('checked') : label.removeClass('checked'); 
			})
			.trigger('updateState')
			.click(function(){ 
				$('input[name='+ $(this).attr('name') +']').trigger('updateState'); 
			});
			
			if(input.is(':disabled')){ label.addClass('iedisabled'); }
		}
		
	});
};

//全选 
function checkAll(){
	$("#checkAll input:checkbox").click(function(){
		var that = this;
		$("#cart-table-body table").find('tr > td:first-child input:checkbox')
			.each(function(){
				this.checked = that.checked;
					var label = $(this).parent();				
					$(this).is(':checked') ? label.addClass('checked') : label.removeClass('checked'); 
	
			});
	})
}
function loadingmsg(msg){

	var d = dialog({
		title: '信息',
		cancel:false,
		width:400,
		content: msg
	});

	//d.showModal();
}
function msg(msg){

	var d = dialog({
		title: '信息',
		
		width:400,
		content: msg
	});

	d.showModal();
}
function warnMsg(msg,id) {
	var d = dialog({
		content: msg,
		quickClose: true// 点击空白处快速关闭
	});
	d.show(document.getElementById(id));

}


// 导航优惠信息
$('.discount-nav').hover(function() {
	$(this).children('.dis-nav').stop().fadeIn();
	$(this).css('border-bottom', 'none');
}, function() {
	$(this).children('.dis-nav').stop().fadeOut();
});





