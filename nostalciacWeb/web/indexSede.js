import SedeService from "./js/SedeService.js";
import Tabella from "./js/Tabella.js"; 

const prop = {};
prop.titolo = "Elenco SEDI";
prop.service= new SedeService();
prop.idTabella = "tblSedi";
prop.classeTabella= "pure-table";
prop.contenitore = "#contenitore";
        
new Tabella(prop);

