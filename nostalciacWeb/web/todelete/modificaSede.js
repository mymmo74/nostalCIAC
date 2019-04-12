/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var jsonSedi;
var idxJsonCurr = 0;

document.querySelector("#b_insSede").onclick = insertSede;

function caricaSedi() {

    fetch('http://localhost:8080/nostalciac/resources/sedi')
            .then(response => {
                console.log("response...", response);
                return response.json();
            })
            .then(json => {
                document.querySelector("#contenitore").innerHTML = "";
                creaTabellaDaJsonDB(json,
                        "nome,indirizzo,telefono,citta,email,note",
                        "tab1",
                        "pure-table",
                        "#contenitore",
                        "id",
                        "Elenco SEDI");
                jsonSedi = json;
            })
            .catch(x => {
                alert("err" + x);
                console.log("err", x);
            });

}

caricaSedi();


function deleteRec() {
    var r = confirm("Sicuro che vuoi cancellare la sede?");
    if (r == true) {
        let idSede = this.getAttribute("idRec");
        fetch('http://localhost:8080/nostalciac/resources/sedi/' + idSede, {
            method: 'DELETE',
        }).then(function (response) {
            caricaSedi();
            caricaSelect();
            return;
        }).catch(res => console.error("ERRORE:", res));
    }
}
function clickMod() {
    riempiCampi(this.getAttribute("idRec"));
}
function riempiCampi(idRecord) {
//    let indiceOpzione = document.querySelector("#sel_sedi").selectedIndex;
//    let opzioneSelezionata = document.querySelector("#sel_sedi").options[indiceOpzione];
//
//        let value = opzioneSelezionata.value;
    let idSede = "0";
    let nome = "";
    let indirizzo = "";
    let tel = "";
    let citta = "";
    let mail = "";
    let note = "";
    let trovato = false;

    //idxJsonCurr=0
    jsonSedi.forEach(js => {
        if (idRecord == js.id) {
            idSede = js.id;
            nome = js.nome;
            indirizzo = js.indirizzo;
            tel = js.telefono;
            citta = js.citta;
            mail = js.email;
            note = js.note;
            trovato = true;
        }
        //idxJsonCurr+=1;
    });



//    let idSede = jsonSedi[value].id;
//    let nome = jsonSedi[value].nome;
//    let indirizzo = jsonSedi[value].indirizzo;
//    let tel = jsonSedi[value].tel;
//    let citta = jsonSedi[value].citta;
//    let mail = jsonSedi[value].mail;
//    let note = jsonSedi[value].note;

    //alternativa      
    //let idTag = opzioneSelezionata.getAttribute("idTag")
    //let tipo = opzioneSelezionata.getAttribute("tipo")
    //let tag = opzioneSelezionata.getAttribute("tag")
    if (trovato == true) {
        document.querySelector(".corpo").style.display = "block"

        document.querySelector("#nome").value = nome;
        document.querySelector("#indirizzo").value = indirizzo;
        document.querySelector("#tel").value = tel;
        document.querySelector("#citta").value = citta;
        document.querySelector("#mail").value = mail;
        document.querySelector("#note").value = note;
        document.querySelector("#id_rec").value = idSede;
        console.log(idSede, nome, indirizzo, tel, citta, mail, note);
    }
}


document.querySelector("#b_modSede").onclick = function () {

//    let indiceOpzione = document.querySelector("#sel_tags").selectedIndex;
//    let opzioneSelezionata = document.querySelector("#sel_tags").options[indiceOpzione];
//
//    let value = opzioneSelezionata.value;
//
//    let idTag = jsonTags[value].id;

    let obj = {};

    obj.nome = document.querySelector("#nome").value;
    obj.indirizzo = document.querySelector("#indirizzo").value;
    obj.telefono = document.querySelector("#tel").value;
    obj.citta = document.querySelector("#citta").value;
    obj.email = document.querySelector("#mail").value;
    obj.note = document.querySelector("#note").value;
    let idSede = document.querySelector("#id_rec").value;

    fetch('http://localhost:8080/nostalciac/resources/sedi/' + idSede, {
        method: 'put',

        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },

        body: JSON.stringify(obj)

    }).then(function (response) {
        console.log("response:", response);
        console.log("response.text():", response.text());

        caricaSedi();
        caricaSelect();
        return;
    }).catch(res => console.error("ERRORE:", res));


};

function insertSede() {
    let obj = {};

    obj.nome = document.querySelector("#nome").value;
    obj.indirizzo = document.querySelector("#indirizzo").value;
    obj.telefono = document.querySelector("#tel").value;
    obj.citta = document.querySelector("#citta").value;
    obj.email = document.querySelector("#mail").value;
    obj.note = document.querySelector("#note").value;
    let idSede = document.querySelector("#id_rec").value;

    fetch('http://localhost:8080/nostalciac/resources/sedi', {
        method: 'POST',

        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },

        body: JSON.stringify(obj)

    }).then(function (response) {
        console.log("response:", response);
        console.log("response.text():", response.text());

        caricaSedi();
        caricaSelect();
        return;
    }).catch(res => console.error("ERRORE:", res));

}

function navigaRec() {
    switch (this.id) {
        case "primo":
            riempiCampi(jsonSedi[0].id);
            idxJsonCurr = 0;
            break;
        case "prec":
            if (idxJsonCurr > 0) {
                idxJsonCurr -= 1;
            }
            riempiCampi(jsonSedi[idxJsonCurr].id);
            break;
        case "succ":
            if (idxJsonCurr < jsonSedi.length - 1) {
                idxJsonCurr += 1;
            }
            riempiCampi(jsonSedi[idxJsonCurr].id);
            break;
        case "ultimo":
            idxJsonCurr = jsonSedi.length - 1;
            riempiCampi(jsonSedi[idxJsonCurr].id);
            break;
    }
}