function SimpleHorarioRefformatter()
{
  // for debugging
 // this._class = "SimpleHorarioRefformatter";

}

SimpleHorarioRefformatter.prototype = new TrConverter();

SimpleHorarioRefformatter.prototype.getFormatHint = function()
{
	return null;
}

SimpleHorarioRefformatter.prototype.getAsString = function(
  number,
  label
  )
{
	var numberString = "" + number;
	if(numberString=="1" || numberString == "1.0")
	{
		return "Por la mañana";
	}
	else if(numberString=="2" || numberString == "2.0")
	{
		return "Por la tarde";
	}
	else if(numberString=="3" || numberString == "3.0")
	{
		return "Abierto";
	}
	else
		return numberString;
}

SimpleHorarioRefformatter.prototype.getAsObject = function(
  numberString,
  label
  )
{

	if(numberString=="Por la mañana")
	{
		return 1;
	}
	else if(numberString=="Por la tarde")
	{
		return 2;
	}
	else if(numberString=="Abierto")
	{
		return 3;
	}
      // TODO throw TrConverterException when
      // numberString is not correct...
	//return parseFloat(numberString);
}