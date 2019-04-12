<%-- 
    Document   : form
    Created on : 1-apr-2019, 8.40.34
    Author     : tss
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="form.css" rel="stylesheet" type="text/css"/>
        <link href="forms.css" rel="stylesheet" type="text/css"/>
        <title>FORM</title>
    </head>
    <body>
        <form class="pure-form">
            <div class="campo">
                <label for="nome">Nome:</label>
                <input type="text" id="nome" name="nome" value="" placeholder="scrivi il nome">
            </div>

            <div class="campo">
                <label for="cognome">Cognome:</label>
                <input type="text" id="cognome" name="cognome" value="" placeholder="scrivi il cognome">
            </div>

            <div class="campo">
                <label for="username">User Name:</label>
                <input type="text" id="username" name="username" value="" placeholder="scegli uno user name">
            </div>            
            <div class="campo">
                <label for="password">Scegli una password: </label>
                <input title="inserire almeno un numero e una lettera"
                    type="password" id="password" name="password" value="" placeholder="scegli una password">
            </div>
            <div class="campo">
                <label for="password2">Conferma la password: </label>
                <input type="password" id="password2" name="password2" value="" placeholder="conferma la password">
            </div>
            <div class="campo">
                <label for="mail">E-Mail:</label>
                <input type="text" id="mail" name="mail" value="" placeholder="scrivi la mail">
            </div>            
            <div class="campo">
                <label for="privacy">Accetti policy: </label>
                <input type="checkbox" id="privacy" name="privacy" >
            </div>
            <div class="campo">
                <label for="dataNas">Data di nascita:</label>
                <input type="date" id="dataNas" name="dataNas" value="" placeholder="scrivi la tua data di nascita">
            </div> 
            <div class="campo">
                <label for="citta">Città:</label>
                <input type="text" id="citta" 
                       name="citta" value="" placeholder="scrivi la città"
                       list="elencoCitta">
            </div>             
            <datalist id="elencoCitta">
                <option value="Torino"/>
                <option value="Milano"/>
                <option value="Roma"/>
            </datalist>
            <div class="campo">
                <label>Sesso: </label>
                <label for="sesso_M">M:</label>
                <input type="radio" name="sesso" id="sesso_M" value="Maschio">
                &nbsp;&nbsp;&nbsp;
                <label for="sesso_F">F:</label>
                <input type="radio" name="sesso" id="sesso_F" value="Femmina">
            </div>
            <br>
            <br>
            <div class="campo">
                <label for="note">Note:</label>
                <textarea name="note" id="note" placeholder="scrivi un commento.."></textarea>
            </div>
            <br>
            <div class="campo">
                <label for="corsi">Corso:</label>
                <select id="corsi" name="corsi">
                    <option value="">Scegli il corso..</option>
                    <option value="C1">Corso di word</option>
                    <option value="C2">Corso di excel</option>
                    <option value="C3">Corso di access</option>
                    <option value="C4">Corso di powerpoint</option>
                    <option value="C5">Corso di onenote</option>
                    
                </select>
            </div>
            <br>
            <br>
            <br>
            <div class="campo">
                <input type="reset" value="Cancella i dati" id="pReset">
            </div>
            <br>
            <div class="campo">
                <input type="submit" value="Invia i dati" id="pSubmit">
            </div>
            <br>
            <div class="campo">
                <input type="button" value="Controlla i dati" id="pButton">
            </div>
                
        </form>
        <script src="form.js" type="text/javascript"></script>
    </body>
</html>
