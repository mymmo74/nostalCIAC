<%-- 
    Document   : modificaTag
    Created on : 25-mar-2019, 11.11.31
    Author     : tss
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <c:import url="./includes/imports.jsp"/>
        <title>modifica SEDI</title>
    </head>
    <body>
        <main>
            <header>
                <nav>
                    <c:import url="./includes/menu.jsp"/>
                </nav>
            </header>
            <article>
                <div id="contenitore"></div>
                
                <br>

                <form class="pure-form pure-form-stacked">
                    <fieldset>
                        <legend>Inserisci/Modifica SEDE</legend>

                        <label for="nome">Nome sede: </label>
                        <input type="text" id="nome"><br/>

                        <label for="indirizzo">Indirizzo: </label>
                        <input type="text" id="indirizzo" ><br/>

                        <label for="tel">Tel: </label>
                        <input type="text" id="tel" ><br/>

                        <label for="citta">Città: </label>
                        <input type="text" id="citta" size="100"><br/>

                        <label for="mail">Mail: </label>
                        <input type="text" id="mail" size="100"><br/>

                        <label for="note">Note: </label>
                        <input type="text" id="note" size="100"><br/>

                        <input type="button" class="pure-button pure-button-primary" id="b_insSede" value="Inserisci una nuova sede">
                        <input type="button" class="pure-button pure-button-primary" id="b_modSede" value="Conferma modifica">
                        
                        <br>
                    </fieldset>
                </form>
            </article>
            <footer>
                <c:import url="./includes/footer.jsp"/>
            </footer>
        </main>
        <script src="./indexSede.js" type="module"></script>
    </body>
</html>