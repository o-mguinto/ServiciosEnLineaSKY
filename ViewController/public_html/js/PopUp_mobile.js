                        function toggle2(div_id) {
                            var el = document.getElementById(div_id);
                            //var el2 = document.getElementById("f2");
                            if ( el.style.display == 'none') {	
                            el.style.display = 'block';
                            //el2.style.display = 'none';
                            //if(el2.style.display == 'none'){
                            //el2.style.display = 'block';
                            //}
                            //else{
                            //el2.style.display = 'none';
                            //}
                                                        }
		else {
                el.style.display = 'none';
                //el2.style.display = 'block';
                    //if(el2.etyle.display == 'block'){
                      //      el2.style.display = 'none';
                        //    }
                          //  else{
                            //el2.style.display = 'block';
                            //}
                    }
	}
        function toggle(div_id) {
                            var el = document.getElementById(div_id);
                            //var el2 = document.getElementById('f2');
                            if ( el.style.display == 'none') {	
                            el.style.display = 'block';
                            //el2.style.display = 'none';
                            //if(el2.style.display == 'none'){
                            //el2.style.display = 'block';
                            //}
                            //else{
                            //el2.style.display = 'none';
                            //}
                                                        }
		else {el.style.display = 'none';
                //el2.style.display = 'block';
                    //if(el2.etyle.display == 'block'){
                      //      el2.style.display = 'none';
                        //    }
                          //  else{
                            //el2.style.display = 'block';
                            //}
                    }
	}
	function blanket_size(popUpDivVar) {
		if (typeof window.innerWidth != 'undefined') {
			viewportheight = window.innerHeight;
		} else {
			viewportheight = document.documentElement.clientHeight;
		}
		if ((viewportheight > document.body.parentNode.scrollHeight) && (viewportheight > document.body.parentNode.clientHeight)) {
			blanket_height = viewportheight;
		} else {
			if (document.body.parentNode.clientHeight > document.body.parentNode.scrollHeight) {
				blanket_height = document.body.parentNode.clientHeight;
			} else {
				blanket_height = document.body.parentNode.scrollHeight;
			}
		}
		var blanket = document.getElementById('blanket2');
		blanket.style.height = blanket_height + 'px';
		var popUpDiv = document.getElementById(popUpDivVar);
		popUpDiv_height=blanket_height/2-200;
		popUpDiv.style.top = popUpDiv_height + 'px';
	}
        
        function blanket_size2(popUpDivVar) {
		if (typeof window.innerWidth != 'undefined') {
			viewportheight = window.innerHeight;
		} else {
			viewportheight = document.documentElement.clientHeight;
		}
		if ((viewportheight > document.body.parentNode.scrollHeight) && (viewportheight > document.body.parentNode.clientHeight)) {
			blanket_height = viewportheight;
		} else {
			if (document.body.parentNode.clientHeight > document.body.parentNode.scrollHeight) {
				blanket_height = document.body.parentNode.clientHeight;
			} else {
				blanket_height = document.body.parentNode.scrollHeight;
			}
		}
		var blanket = document.getElementById('blanket3');
		blanket.style.height = blanket_height + 'px';
		var popUpDiv = document.getElementById(popUpDivVar);
		popUpDiv_height=blanket_height/2-200;
		popUpDiv.style.top = popUpDiv_height + 'px';
	}
        
function window_pos(popUpDivVar) {
	if (typeof window.innerWidth != 'undefined') {
		viewportwidth = window.innerHeight;
	} else {
		viewportwidth = document.documentElement.clientHeight;
	}
	if ((viewportwidth > document.body.parentNode.scrollWidth) && (viewportwidth > document.body.parentNode.clientWidth)) {
		window_width = viewportwidth;
	} else {
		if (document.body.parentNode.clientWidth > document.body.parentNode.scrollWidth) {
			window_width = document.body.parentNode.clientWidth;
		} else {
			window_width = document.body.parentNode.scrollWidth;
		}
	}
	var popUpDiv = document.getElementById(popUpDivVar);
	window_width=window_width/2-200;//200 is half popup's width
	popUpDiv.style.left = window_width + 'px';
}
function popup(windowname) {
	blanket_size(windowname);
	window_pos(windowname);
	toggle2('blanket2');
	toggle2(windowname);		
}

function popup2(windowname) {
	blanket_size2(windowname);
	window_pos(windowname);
	toggle('blanket3');
	toggle(windowname);		
}
