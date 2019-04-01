/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Altro metodo per il click
//document.querySelector("#pButton").onclick=function(){
function controllaDati() {
    
    
    var nome=document.querySelector("#nome").value;
    if (nome.length<2){
        alert("Nome troppo corto!");
        document.querySelector("#nome").focus();
    }
    
    var privacy=document.querySelector("#privacy").checked;
    if (!privacy){
        alert("Non hai accettato la Privacy policy!");
    }
    
    //    controllo se le password digitate coincidono
    var pw = document.querySelector("#password").value;
    var pw2 = document.querySelector("#password2").value;
    if (pw !== pw2) {
        alert("Le password non coincidono");
        document.querySelector("#password").focus();
    } else {
        if (checkPassword(pw)){
            alert("ok");
        } else {
            alert("la pw non rispetta i criteri");
        }
    }
}

function checkPassword(str)
{
    var re = /^(?=.*\d)(?=.*[!@#$%^&*])(?=.*[a-z])(?=.*[A-Z]).{8,}$/;
    return re.test(str);
}
