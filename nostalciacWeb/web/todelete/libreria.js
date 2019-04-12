/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function creaTabellaDaJson(oggJson, listaCampi, idTabella, classeTabella, contenitore = "body", titolo) {
    let tabella = document.createElement("table")
    tabella.id = idTabella
    tabella.className = classeTabella  //da verif

    let caption = document.createElement("caption")
    caption.innerText = titolo
    tabella.appendChild(caption);

    let vCampi = listaCampi.split(",")

    //riga intestazione
    let tHead = document.createElement("thead")
    let riga = document.createElement("tr")
    vCampi.forEach(function (campo, i) {
        let th = document.createElement("th")
        th.innerHTML = campo
        riga.append(th)
    })
    tabella.append(tHead)
    tHead.append(riga)

    let tBody = document.createElement("tBody")
    oggJson.forEach(function (record, i) {
        let rigaRecord = document.createElement("tr")
        vCampi.forEach(function (campo, j) {
            let cella = document.createElement("td")
            cella.innerHTML = oggJson[i][campo]  //record[campo]
            rigaRecord.append(cella)
        })
        tBody.append(rigaRecord)
    })

    tabella.append(tBody)

    //append della tabella al contenitore
    document.querySelector(contenitore).append(tabella)
}

function creaTabellaDaJsonDB(oggJson,
        listaCampi,
        idTabella,
        classeTabella,
        contenitore = "body",
        nomeCampoId,
        titolo) {
    let tabella = document.createElement("table")
    tabella.id = idTabella
    tabella.className = classeTabella  //da verif

    let caption = document.createElement("caption")
    caption.innerText = titolo
    tabella.appendChild(caption);

    let vCampi = listaCampi.split(",")

    //riga intestazione
    let tHead = document.createElement("thead")
    let riga = document.createElement("tr")
    vCampi.forEach(function (campo, i) {
        let th = document.createElement("th")
        th.innerHTML = campo
        riga.append(th)
    })
    th = document.createElement("th")
    th.innerHTML = "MOD"
    riga.append(th)

    th = document.createElement("th")
    th.innerHTML = "DEL"
    riga.append(th)


    tabella.append(tHead);
    tHead.append(riga);

    let tBody = document.createElement("tBody");
    oggJson.forEach(function (record, i) {
        let rigaRecord = document.createElement("tr");
        vCampi.forEach(function (campo, j) {
            let cella = document.createElement("td");
            cella.innerHTML = oggJson[i][campo];  //record[campo]
            rigaRecord.append(cella);
        })
        cella = document.createElement("td");
        let span = document.createElement("span");
        span.classList.add("modificaDB");
        span.innerHTML = "M";
        span.setAttribute("idRec", oggJson[i][nomeCampoId]);
        cella.appendChild(span);
        rigaRecord.append(cella);

        cella = document.createElement("td");
        span = document.createElement("span");
        span.classList.add("deleteDB");
        span.innerHTML = "D";
        span.setAttribute("idRec", oggJson[i][nomeCampoId]);
        cella.appendChild(span);
        rigaRecord.append(cella);

        tBody.append(rigaRecord);
    });

    tabella.append(tBody);

    //append della tabella al contenitore
    document.querySelector(contenitore).append(tabella);
}
/***
 * 
 * @param {type} name = del radio button
 * @returns la proprieta value del radio button che gli passo
 */
       
function getValueRadioButton(name) {
    var valore = "";
    document.querySelectorAll("[name=" + name + "]").forEach(function (el) {
        if (el.checked) {
            sel = el.value;
        }
    });
    return valore;
}