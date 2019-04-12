/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function controlla() {
    var nome = document.querySelector("#nome").value;
    var pw = document.querySelector("#password").value;
    var pw2 = document.querySelector("#password2").value;
    nome = nome.trim();
    if (nome.length = 0) {
        alert("Inserire il nome");
        document.querySelector("#nome").focus();
        return false;
    }
    // var ok= pw.match(/[0-9]/);
    if (pw.search(/[0-9]/) == -1 || pw.search(/[a-z]/) == -1) {
        alert("password non valida inserire sia lettere che numeri");
        document.querySelector("#password").focus();
        return false;
    }
    // var strongRegex = new RegExp("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#\$%\^&\*])(?=.{8,})");
    var strongRegex = new RegExp("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])");
    var ok = strongRegex.exec(pw);

    if (ok == null) {
        alert("password non valida inserire sia lettere che numeri che caratteri speciali");
        document.querySelector("#password").focus();
        return false;
    }
    if (pw != pw2) {
        alert("le password non coincidono");
        document.querySelector("#password").focus();
        return false;
    } else {
        alert("ok");
    }

    var privacy = document.querySelector("#privacy").checked
    if (!privacy) {
        alert("Non hai accettato la Privacy policy!");
        return false;
    }
    var corsoSel = document.querySelector("#corsi").selectedIndex;
    if (corsoSel == 0) {
        alert("Selezionare un corso");
        document.querySelector("#corsi").focus();
        return false;
    }
    //ciclo sul sesso per sapere se c'è qualcosa checked
    sel = getValueRadioButton("sesso");

    if (sel == "") {
        alert("Selezionare il sesso");
        return false;
    }
    return true;
}

document.querySelector("#pSubmit").onclick = function () {
    //se evento onclick ha un return false non viene fatto il submit
    return controlla();
}

document.querySelector("#nome").onkeypress = noNumKeyPress;
document.querySelector("#cognome").onkeypress = noNumKeyPress;

function noNumKeyPress(e) {
    let tasto = e.keyCode;

    if (tasto < 58 && tasto >= 48) {
        return false;
    }
}

function creaOggettoValori() {
    var o = {};

    o.nome = document.querySelector("#nome").value;
    o.cognome = document.querySelector("#nome").value;
    o.email = document.querySelector("#nome").value;
    o.dataNas = document.querySelector("#nome").value;
    o.citta = document.querySelector("#nome").value;
    o.sesso = getValueRadioButton("sesso");
    
            return o;
}

document.querySelector("#username").onchange = function (e) {
    let obj = creaOggettoValori();
    alert(JSON.stringify(obj));

    fetch('http://localhost:8080/nostalciac/resources/checkUserName', {
        method: 'post',

        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },

        body: JSON.stringify(obj)
    }).then(function (response) {
        console.log("response:", response)
        console.log("response.text():", response.text())
        
        return;
    }).catch(res => console.error("ERRORE:", res));
}
