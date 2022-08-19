function SliderDateReformatter()
{   
}

SliderDateReformatter.prototype = new TrConverter();

SliderDateReformatter.prototype.getFormatHint = function()
{
	return null;
}

SliderDateReformatter.prototype.getAsString = function(dateMillis,label) {
	var minutoDelDia = dateMillis;
        var hora = Math.floor(minutoDelDia/60);
        var minuto = minutoDelDia %60;
        
        var horas = hora < 10 ? '0'+hora : hora + '';
        var minutos = minuto < 10 ? '0'+minuto : minuto + '';
        
        var hr = horas.concat(":",minutos);
        return hr;
        /*var asDate  = new Date(dateMillis);
        var month = asDate.getMonth()+1; // Again zero based
        var day = asDate.getDate();
	return month + "/" + day;*/
}

SliderDateReformatter.prototype.getAsObject = function(dateString,label){
        var hora = dateString.split(":")[0];
        var minuto = dateString.split(":")[1];
        var minutoDelDia = hora*60 + minuto;
        return minutoDelDia;
        /*var dateNow = new Date();
        var currentYear = dateNow.getFullYear();
        var currentMonth = dateNow.getMonth();
        var dateBits = dateString.split("/");
        var selectedMonth = (dateBits[0]) - 1;
        var selectedDay = dateBits[1];
        var selectedYear = currentYear;
        
        if (selectedMonth > currentMonth){
            selectedYear--;
        }
        var representedDate = new Date(selectedYear,selectedMonth,selectedDay);
	return representedDate.getTime();*/
} 