/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Altro metodo per il click
document.querySelector("#pButton").onclick = function () {
    return controllaDati();
};

document.querySelector("#pSubmit").onclick = function () {
    return controllaDati();
};

function controllaDati() {


    var nome = document.querySelector("#nome").value;
    if (nome.length < 2) {
        alert("Nome troppo corto!");
        document.querySelector("#nome").focus();
    }

    var privacy = document.querySelector("#privacy").checked;
    if (!privacy) {
        alert("Non hai accettato la Privacy policy!");
    }


    //    controllo se le password digitate coincidono
    var pw = document.querySelector("#password").value;
    var pw2 = document.querySelector("#password2").value;
    if (pw !== pw2) {
        alert("Le password non coincidono");
        document.querySelector("#password").focus();
    } else {
        if (checkPassword(pw)) {
            alert("ok");
        } else {
            alert("la pw non rispetta i criteri");
        }
    }

    if (document.querySelector("#corsi").selectedIndex === 0) {
        alert("Seleziona un corso");
    }

    let sesso = document.getElementById("sesso_F").checked;
    let sesso1 = document.getElementById("sesso_M").checked;

    if (sesso === false) {
        if (sesso1 === false) {
            alert("Seleziona il sesso");
            return false;
        }


    }


}

function checkPassword(str) {
    //^ 
    var re = /^(?=.*\d)(?=.*[!@#$%^&*])(?=.*[a-z])(?=.*[A-Z]).{8,}$/;
    return re.test(str);
}

document.querySelector("#nome").onkeypress = nienteNumeriSulKeypress;
document.querySelector("#cognome").onkeypress = nienteNumeriSulKeypress;


function nienteNumeriSulKeypress(e) {
    let tasto = e.keyCode;

    console.log(tasto, e);
    if (tasto < 58 && tasto >= 48) {
        console.log("numeri non ammessi");
        return false
    }
}

/*
document.querySelector("#usename").onchange= function (e){
    let u=querySelector("#usename").value;
    
}
*/
document.querySelectorAll("[name=sesso]").forEach(function(radio,k){
    radio.onclick=function (){
        let v=this.value;
        console.log("cliccato",v)
        //operatore ternario
        let daScrivere=(v=="Maschio") ? "o": "a";
        document.querySelector("#spanNatoA").innerHTML=daScrivere;
    }
})


function creaOggettoValori(){
    var o={};
    
    o.nome=document.querySelector("#nome").value;
    o.cognome=document.querySelector("#cognome").value;
    o.nome=document.querySelector().value;
    o.nome=document.querySelector().value;
    o.nome=document.querySelector().value;
}