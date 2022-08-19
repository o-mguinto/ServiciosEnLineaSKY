function is_pie_key_downloaded()
{
  // If these PIE variables are not defined, then the required
  // getkey.js include failed.
  if ((typeof(PIE) == 'undefined')
    || (typeof(PIE.K) == 'undefined')
    || (typeof(PIE.L) == 'undefined')
    || (typeof(PIE.E) == 'undefined')
    || (typeof(PIE.key_id) == 'undefined')
    || (typeof(PIE.phase) == 'undefined'))
  {
    return false;
  }
  return true;
}

function are_pie_encryption_functions_downloaded()
{
  // If these functions are not defined, then the
  // required encryption.js include failed.
  if ((typeof ValidatePANChecksum != 'function')
    || (typeof ProtectPANandCVV != 'function')
    || (typeof ProtectString != 'function'))
  {
    return false;
  }
  return true;
}

function check_pie_loading()
{
  var message = '';
  
  if (is_pie_key_downloaded())
  {
    message += 'Congratulations! Got PIE key!\n';
    message += 'Key ID is: ' + PIE.key_id + '\n';
    message += 'Phase is: ' + PIE.phase + '\n';
  }
  else
  {
    message += 'PIE key not downloaded.\n';
  }

  if(are_pie_encryption_functions_downloaded())
  {
    message += 'Hurrah! PIE functions downloaded!';
  }
  else
  {
    message += 'PIE functions not downloaded.';
  }

  if (message != '')
  {
    alert(message);
  }
}