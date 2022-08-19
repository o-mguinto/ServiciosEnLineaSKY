/*pie-data-protection.js
Use this module as a template for protecting from data using
PIE JavaScript functions ProtectPANandCVV as well as ProtectString.
These functions are documented in the HPE SecureData Web Supplement
PDF file included with your student handouts.

To get you started, complete the function protect_form below using
document.getElementById("<control ID>") to access from controls via
Javascript.

Remember to call protect_form using the onClick event for the SUBMIT
button in the proper sequence with the existing functions.
*/

function protect_form ()
{
 //alert("IN protect_form");
 /* Lab IV Phase III-A
  Protect the Payment Account Number (PAN)
  Use the PIE function for protecting the PAN
  Note for this lab we are ignoring the CVV */
  var creditCardNumber = document.getElementById("pt1:pt_s1:r1:0:numeroTarjeta::content");
  if (creditCardNumber==null)
    creditCardNumber = document.getElementById("pt1:pt_s1:r1:1:numeroTarjeta::content");
 if (creditCardNumber==null)
    creditCardNumber = document.getElementById("pt1:pt_s1:r1:2:numeroTarjeta::content");
 if (creditCardNumber==null)
    creditCardNumber = document.getElementById("pt1:pt_s1:r1:3:numeroTarjeta::content");
  var ccProtectedArray = ProtectPANandCVV(creditCardNumber.value, "", true);
    
    var creditCardNumberProtect = document.getElementById("pt1:pt_s1:r1:creditCardNumberProtect");
  
  creditCardNumberProtect.value=ccProtectedArray[0];
  /* Lab IV Phase III-B
  Follow the same pattern for the a) card holder name and b) card expiration date
  Use the PIE function for protecting strings 
  var cardHolderName = document.getElementById("member");
  var nameProtectedArray = ProtectString(cardHolderName.value);
  alert(cardHolderName.value + "-->" + nameProtectedArray[0]);
  cardHolderName.value = nameProtectedArray[0];


  var cardExpirationDate = document.getElementById("expires");
  var expirationProtectedArray = ProtectString(cardExpirationDate.value);
  alert(cardExpirationDate.value + "-->" + expirationProtectedArray[0]);
  cardExpirationDate.value = expirationProtectedArray[0];
*/
  /* Before going on, upload and test your changes to finish Lab IV Phase III */

  
    /* Lab IV Phase IV-A
  Next, populate the hidden values in the web form */
  var keyId = document.getElementById("pt1:pt_s1:r1:key_id");
  keyId.value = PIE.key_id;
  var phase=document.getElementById("pt1:pt_s1:r1:phase");
  phase.value = PIE.phase;
  /* Lab IV Phase IV-B
  Finally, call the JavaScript form submit function
  This is documented in the lecture notes */

}

function protect_form_tarjeta ()
{
 //alert("IN protect_form_tarjeta");
 /* Lab IV Phase III-A
  Protect the Payment Account Number (PAN)
  Use the PIE function for protecting the PAN
  Note for this lab we are ignoring the CVV */
  /*var reg = document.getElementById("pt1:pt_s1");
  var creditCardNumber = reg.findComponent("numeroTarjeta");*/
  var creditCardNumber = document.getElementById("pt1:pt_s1:r1:0:f1:numeroTarjeta::content");
  if (creditCardNumber==null)
    creditCardNumber = document.getElementById("pt1:pt_s1:r1:1:f1:numeroTarjeta::content");
if (creditCardNumber==null)
    creditCardNumber = document.getElementById("pt1:pt_s1:r1:2:f1:numeroTarjeta::content");
    
  var ccProtectedArray = ProtectPANandCVV(creditCardNumber.value, "", true);
    
    var creditCardNumberProtect = document.getElementById("pt1:pt_s1:r1:0:f1:creditCardNumberProtect");
    if (creditCardNumberProtect==null)
        creditCardNumberProtect = document.getElementById("pt1:pt_s1:r1:1:f1:creditCardNumberProtect");
    if (creditCardNumberProtect==null)
        creditCardNumberProtect = document.getElementById("pt1:pt_s1:r1:2:f1:creditCardNumberProtect");

  creditCardNumberProtect.value=ccProtectedArray[0];
  /* Lab IV Phase III-B
  Follow the same pattern for the a) card holder name and b) card expiration date
  Use the PIE function for protecting strings 
  var cardHolderName = document.getElementById("member");
  var nameProtectedArray = ProtectString(cardHolderName.value);
  alert(cardHolderName.value + "-->" + nameProtectedArray[0]);
  cardHolderName.value = nameProtectedArray[0];


  var cardExpirationDate = document.getElementById("expires");
  var expirationProtectedArray = ProtectString(cardExpirationDate.value);
  alert(cardExpirationDate.value + "-->" + expirationProtectedArray[0]);
  cardExpirationDate.value = expirationProtectedArray[0];
*/
  /* Before going on, upload and test your changes to finish Lab IV Phase III */

  
    /* Lab IV Phase IV-A
  Next, populate the hidden values in the web form */
  var keyId = document.getElementById("pt1:pt_s1:r1:0:f1:key_id");
    if (keyId==null)
        keyId = document.getElementById("pt1:pt_s1:r1:1:f1:key_id");
    if (keyId==null)
        keyId = document.getElementById("pt1:pt_s1:r1:2:f1:key_id");
  
  keyId.value = PIE.key_id;
  
  var phase=document.getElementById("pt1:pt_s1:r1:0:f1:phase");
    if (phase==null)
        phase = document.getElementById("pt1:pt_s1:r1:1:f1:phase");
    if (phase==null)
        phase = document.getElementById("pt1:pt_s1:r1:2:f1:phase");
  
  phase.value = PIE.phase;
  /* Lab IV Phase IV-B
  Finally, call the JavaScript form submit function
  This is documented in the lecture notes */

}
  
function protect_form_2 ()
{
 //alert("IN protect_form_2");
 /* Lab IV Phase III-A
  Protect the Payment Account Number (PAN)
  Use the PIE function for protecting the PAN
  Note for this lab we are ignoring the CVV */
  /*var reg = document.getElementById("pt1:pt_s1");
  var creditCardNumber = reg.findComponent("numeroTarjeta");*/
  var creditCardNumber = document.getElementById("numeroTarjeta::content");
  if (creditCardNumber==null)
    creditCardNumber = document.getElementById("pt1:pt_s1:r1:3:numeroTarjeta::content");



  if (creditCardNumber==null)
    creditCardNumber = document.getElementById("pt1:pt_s1:r1:6:numeroTarjeta::content");
  if (creditCardNumber==null)
    creditCardNumber = document.getElementById("pt1:pt_s1:r1:7:numeroTarjeta::content");


  
  var ccProtectedArray = ProtectPANandCVV(creditCardNumber.value, "", true);
    
    var creditCardNumberProtect = document.getElementById("creditCardNumberProtect");
    if (creditCardNumberProtect==null)
        creditCardNumberProtect = document.getElementById("pt1:pt_s1:r1:creditCardNumberProtect");
    
  creditCardNumberProtect.value=ccProtectedArray[0];
  
  /* Lab IV Phase III-B
  Follow the same pattern for the a) card holder name and b) card expiration date
  Use the PIE function for protecting strings 
  var cardHolderName = document.getElementById("member");
  var nameProtectedArray = ProtectString(cardHolderName.value);
  alert(cardHolderName.value + "-->" + nameProtectedArray[0]);
  cardHolderName.value = nameProtectedArray[0];


  var cardExpirationDate = document.getElementById("expires");
  var expirationProtectedArray = ProtectString(cardExpirationDate.value);
  alert(cardExpirationDate.value + "-->" + expirationProtectedArray[0]);
  cardExpirationDate.value = expirationProtectedArray[0];
*/
  /* Before going on, upload and test your changes to finish Lab IV Phase III */

  
    /* Lab IV Phase IV-A
  Next, populate the hidden values in the web form */
  var keyId = document.getElementById("key_id");
  if (keyId==null)
    keyId = document.getElementById("pt1:pt_s1:r1:key_id");
  
  keyId.value = PIE.key_id;
  
  
  var phase=document.getElementById("phase");
  if (phase==null)
    phase = document.getElementById("pt1:pt_s1:r1:phase");
  
  phase.value = PIE.phase;
  /*alert("keyId: " + keyId.value);
  alert("phase: " + phase.value);
  alert("creditCardNumber: " + creditCardNumber.value);
  alert("creditCardNumberProtect: " + creditCardNumberProtect.value);*/
  /* Lab IV Phase IV-B
  Finally, call the JavaScript form submit function
  This is documented in the lecture notes */

}

function protect_numero_tarjeta_byid(id)
{
  /*alert("IN protect_numero_tarjeta_byid");
  alert("Id numeroTarjetaElement: " + id);*/
    
    /* Lab IV Phase III-A
  Protect the Payment Account Number (PAN)
  Use the PIE function for protecting the PAN
  Note for this lab we are ignoring the CVV */
  /*var reg = document.getElementById("pt1:pt_s1");
  var creditCardNumber = reg.findComponent("numeroTarjeta");*/
  var creditCardNumber = document.getElementById(id + "::content");
  //alert("creditCardNumber.value: " + creditCardNumber.value);
  var ccProtectedArray = ProtectPANandCVV(creditCardNumber.value, "", true);
    
    var creditCardNumberProtect = document.getElementById("creditCardNumberProtect");
    if (creditCardNumberProtect==null)
        creditCardNumberProtect = document.getElementById("pt1:pt_s1:r1:creditCardNumberProtect");
    
  creditCardNumberProtect.value=ccProtectedArray[0];
  
  /* Lab IV Phase III-B
  Follow the same pattern for the a) card holder name and b) card expiration date
  Use the PIE function for protecting strings 
  var cardHolderName = document.getElementById("member");
  var nameProtectedArray = ProtectString(cardHolderName.value);
  alert(cardHolderName.value + "-->" + nameProtectedArray[0]);
  cardHolderName.value = nameProtectedArray[0];


  var cardExpirationDate = document.getElementById("expires");
  var expirationProtectedArray = ProtectString(cardExpirationDate.value);
  alert(cardExpirationDate.value + "-->" + expirationProtectedArray[0]);
  cardExpirationDate.value = expirationProtectedArray[0];
*/
  /* Before going on, upload and test your changes to finish Lab IV Phase III */

  
    /* Lab IV Phase IV-A
  Next, populate the hidden values in the web form */
  var keyId = document.getElementById("key_id");
  if (keyId==null)
    keyId = document.getElementById("pt1:pt_s1:r1:key_id");
  
  keyId.value = PIE.key_id;
  
  
  var phase=document.getElementById("phase");
  if (phase==null)
    phase = document.getElementById("pt1:pt_s1:r1:phase");
  
  phase.value = PIE.phase;
  /*alert("keyId: " + keyId.value);
  alert("phase: " + phase.value);
  alert("creditCardNumber: " + creditCardNumber.value);
  alert("creditCardNumberProtect: " + creditCardNumberProtect.value);*/
  /* Lab IV Phase IV-B
  Finally, call the JavaScript form submit function
  This is documented in the lecture notes */
}