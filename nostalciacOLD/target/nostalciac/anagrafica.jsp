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
                <label for="username">Username:</label>
                <input type="text" id="username" name="username" value="" placeholder="scegli il tuo username.."/>
            </div>
            
            
            <div class="campo">
                <label for="password">Password:</label>
                <input type="password" id="password" name="password" value="" placeholder="scegli la password.."
                       title="Inserire password che rispetti i seguenti criteri:
                                            - Almeno 8 caratteri;
                                            - Almeno un carattere Maiuscolo;
                                            - Almeno un carattere Minuscolo;
                                            - Almeno un numero;
                                            - Almeno un carattere speciale;
                                            "/>
            </div>
            
            <div class="campo">
                <label for="password2">Ripeti pw:</label>
                <input type="password" id="password2" name="password2" value="" placeholder="ridigita la password.."/>
            </div>
            
            <div class="campo">
                <label for="email">email:</label>
                <input type="text" id="email" name="email" value="" placeholder="inserisci la tua email.."/>
            </div>
            
            <div class="campo">
                <label for="data_nascita">nat<span id="spanNatoA">o</span> il:</label>
                <input type="date" id="data_nascita" name="data_nascita" value="" placeholder="data di nascita.."/>
            </div>
            
            <div class="campo">
                <label for="citta">citt&agrave;</label>
                <input type="text" id="citta" name="citta" value="" placeholder="città.." list="elencoCitta"/>
            </div>
            
            <div class="campo">
                <label for="privacy">Accetti policy..</label>
                <input type="checkbox" name="privacy" id="privacy" value="" placeholder="ridigita la password.."/>
            </div>
            
            <datalist id="elencoCitta">
                <option value="Torino"/>
                <option value="Ivrea"/>
                <option value="Milano"/>
                <option value="Maglione"/>
                <option value="Zurigo"/>
                <option value="Chivasso"/>
            </datalist>
            
            <div class="campo">
                <label>Sesso</label>
                <label for="sesso_M">M</label>
                <input type="radio" name="sesso" id="sesso_M" value="Maschio" />
                &nbsp;&nbsp;&nbsp;
                <label for="sesso_F">F</label>
                <input type="radio" name="sesso" id="sesso_F" value="Femmina" />
            </div>
            <div class="campo">
                <label for="note"></label>
                <!--non ha attributo value-->
                <textarea id="note" name="note" placeholder="scrivi un commento.."></textarea>
                
            </div>
            
            <div class="campo">
                <label for="note">Corso: </label>
                <select id="corsi" name="corsi">
                    <option value="">Scegli il corso</option>
                    <option value="c1">Corso di word</option>
                    <!--inserendo l'attributo selected="selected" indico che la option sia checkatta-->
                    <!--<option value="c2" selected="selected">Corso di excel</option>-->
                    <option value="c2">Corso di excel</option>
                    <option value="c3">Corso di access</option>
                    <option value="c4">Corso di powerpoint</option>
                    <option value="c5">Corso di onenote</option>
                </select>
            </div>
            
            <div class="campo">
                <label></label>
                <input type="reset" value="Cancella i dati" id="pReset" />
            </div>
            
            <div class="campo">
                <label></label>
                <input type="submit" value="Invia i dati" id="pSubmit"  />
            </div>
            <div class="campo">
                <label></label>
                <input type="button" value="Controlla i dati" id="pButton" />
            </div>
            
            
                
        </form>
        <script src="anagrafica.js" type="text/javascript"></script>
    </body>
</html>
