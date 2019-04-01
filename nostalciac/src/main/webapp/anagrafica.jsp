<%-- 
    Document   : anagrafica
    Created on : 1-apr-2019, 8.41.40
    Author     : tss
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="anagrafica.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <form>
            <div class="campo">
                <label for="nome">Nome:</label>
                <input type="text" id="nome" name="nome" value="" placeholder="scrivi il nome.."/>
            </div>
            
            <div class="campo">
                <label for="cognome">Cognome:</label>
                <input type="text" id="cognome" name="cognome" value="" placeholder="scrivi il cognome.."/>
            </div>
            
            <div class="campo">
                <label for="password">Password:</label>
                <input type="password" id="password" name="password" value="" placeholder="scegli la password.."/>
            </div>
            
            <div class="campo">
                <label for="password2">Ripeti pw:</label>
                <input type="password" id="password2" name="password2" value="" placeholder="ridigita la password.."/>
            </div>
            
            <div class="campo">
                <label for="privacy">Accetti policy..</label>
                <input type="checkbox" name="privacy" id="privacy" value="" placeholder="ridigita la password.."/>
            </div>
            
            <div class="campo">
                <label>Sesso</label>
                <label for="sesso_M">M</label>
                <input type="radio" name="sesso" id="sesso_M" value="Maschio" />
                &nbsp;&nbsp;&nbsp;
                <label for="sesso_F">F</label>
                <input type="radio" name="sesso" id="sesso_F" value="Femmina" />
            </div>
            
            <div class="campo">
                <input type="reset" value="Cancella i dati" id="pReset" />
            </div>
            <div class="campo">
                <input type="submit" value="Invia i dati" id="pSubmit"  />
            </div>
            <div class="campo">
                <input type="button" value="Controlla i dati" id="pButton" onclick="controllaDati()"/>
            </div>
                
        </form>
        <script src="anagrafica.js" type="text/javascript"></script>
    </body>
</html>
