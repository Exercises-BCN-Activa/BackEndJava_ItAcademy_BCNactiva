const OUTPUTMENU = document.getElementById("outputMENU");
const OUTPUTCLIENT = document.getElementById("outputCLIENT");
const OUTPUTORDRE = document.getElementById("outputORDRE");
const CLIENTSACTIUS = new Array();
const PARAULAS = /^[A-Za-záàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ·'\s]+$/;
const NUMEROS = /^[0-9]/;
const menuPlats = new Array(), menuPreus = new Array();


function consultar() {
    if (menuPlats.length == 0) {
        const quest = confirm("No hi ha plats disponibles.\nVols inserir plats al menú?");
        if (quest == true) {
            inserir();
            printMenu(OUTPUTMENU);
        } else {
            OUTPUTMENU.innerHTML = "<h4>no hi ha plats disponibles</h4>";
        }
    } else {
        printMenu(OUTPUTMENU);
    }
} // END: consultar()

function inserir() {
    const quest = confirm("Voleu establir una posició de menú específica?")
    let PLAT, PREU, POSICIO;

    do {
        PLAT = prompt("Nom del plat").trim();
        PLAT = PLAT.charAt(0).toUpperCase() + PLAT.slice(1).toLowerCase();
    } while (!PARAULAS.test(PLAT));
    do {
        PREU = prompt(`Preu del plat ${PLAT}`).trim();
    } while (!NUMEROS.test(PREU));

    if (quest == true) {
        do {
            POSICIO = prompt("Posició del plat al menú: 1 a 5").trim();
        } while (!NUMEROS.test(POSICIO));
        setMenuEspecificPosition(PLAT, PREU, POSICIO);
    } else {
        setMenuUndefinedPosition(PLAT, PREU);
    }
    consultar()
} // END: inserir() 

function patro() {
    setMenuLastPosition("Escudella", 55);
    setMenuLastPosition("Escalivada", 95);
    setMenuLastPosition("Butifarra", 50);
    setMenuLastPosition("Fideua", 160);
    setMenuLastPosition("Calçotada", 320);
    alert(`Menú Estàndard:
    ${menuPlats[0]} - €${menuPreus[0]}
    ${menuPlats[1]} - €${menuPreus[1]}
    ${menuPlats[2]} - €${menuPreus[2]}
    ${menuPlats[3]} - €${menuPreus[3]}
    ${menuPlats[4]} - €${menuPreus[4]}`);
} // END: patro()

function buidar() {
    menuPlats.splice(0, menuPlats.length);
    menuPreus.splice(0, menuPreus.length);
    OUTPUTMENU.innerHTML = "";
    alert("ja no hi ha plats al menú")
} // END: buidar()

function registrar() {
    const quest = confirm("vols registrar un nou client?")
    if (quest == true) {
        let NOM, TAULA, CLIENT;
        do {
            NOM = prompt("Nom del client").trim();
            NOM = NOM.charAt(0).toUpperCase() + NOM.slice(1).toLowerCase();
        } while (!PARAULAS.test(NOM) || NomsTaulasActius().includes(NOM));
        do {
            TAULA = prompt(`Taula del client ${NOM}`).trim();
        } while (!NUMEROS.test(TAULA) || NomsTaulasActius().includes(TAULA));
        CLIENT = new client();
        CLIENT.setNom(NOM);
        CLIENT.setTaula(TAULA);
        CLIENTSACTIUS.push(CLIENT);
        clientsActius();
    } else {
        clientsActius();
    }
} // END: registrar()

function demanar() {
    if (NomsTaulasActius().length == 0) {
        clientsActius();
    } else {
        let CLIENT = quinClient();
        let PLAT, NOM, TAULA;
        NOM = CLIENT.getNom();
        TAULA = CLIENT.getTaula();
        do {
            PLAT = prompt(`Plat per al client ${NOM}:
            ${menuPlats[0]} - €${menuPreus[0]}
            ${menuPlats[1]} - €${menuPreus[1]}
            ${menuPlats[2]} - €${menuPreus[2]}
            ${menuPlats[3]} - €${menuPreus[3]}
            ${menuPlats[4]} - €${menuPreus[4]}`).trim();
            PLAT = PLAT.charAt(0).toUpperCase() + PLAT.slice(1).toLowerCase();
        } while (!menuPlats.includes(PLAT));
        CLIENT.getSollicituds().setOrdres(PLAT);
        alert(`${NOM} de la Taula ${TAULA} va ordenar: ` +
             CLIENT.getSollicituds().getOrdres().slice(-1)[0]);
    }
} // END: demanar()

function comandes() {
    if (NomsTaulasActius().length == 0) {
        clientsActius();
    } else {
        let CLIENT = quinClient();      
        OUTPUTORDRE.innerHTML = "--------------------"
        OUTPUTORDRE.innerHTML += `<p><strong>Comandes de ${CLIENT.getNom()} -
                                Taula: ${CLIENT.getTaula()}<strong></p><ol>`;
        for (let x=0;x<CLIENT.getSollicituds().getOrdres().length;x++){
            OUTPUTORDRE.innerHTML += `<li>${CLIENT.getSollicituds().getOrdres()[x]}</li>`;
        }
        if (CLIENT.getSollicituds().getOrdres().length == 0) {
            OUTPUTORDRE.innerHTML += "<li>cap comandes noves</li>";
            if (CLIENT.getDebit() > 0) {
                alert(`${CLIENT.getNom()} té part pagada del seu compte i encara té una deute de ${CLIENT.getDebit()} euros`)
            }
        }
        OUTPUTORDRE.innerHTML += "</ol>"+"--------------------";
    }
} // END: comandes()

function NomsTaulasActius() {
    let arrayNomsTaulasActius = new Array();
    for (let x=0;x<CLIENTSACTIUS.length;x++) {
        if (CLIENTSACTIUS[x].getStatus()) {
        arrayNomsTaulasActius.push(CLIENTSACTIUS[x].getNom());
        arrayNomsTaulasActius.push(CLIENTSACTIUS[x].getTaula());
        }
    }
    return arrayNomsTaulasActius;
} // END: NomsTaulasActius()

function clientsActius(){
    if (NomsTaulasActius().length == 0) {
        OUTPUTCLIENT.innerHTML = "--------------------"
                                + "<h4>Cap Clients Actius</h4>"
                                + "--------------------";
    } else {
        OUTPUTCLIENT.innerHTML = "--------------------"
                                + "<p><strong>Clients Actius</strong></p><ol>";
        for (let x=0;x<CLIENTSACTIUS.length;x++) {
            if (CLIENTSACTIUS[x].getStatus()) {
            OUTPUTCLIENT.innerHTML += `<li>Client: <strong>${CLIENTSACTIUS[x].getNom()}</strong> 
            - Taula: <strong>${CLIENTSACTIUS[x].getTaula()}</strong></li>`;
            }
        }
        OUTPUTCLIENT.innerHTML += "</ol>"+"--------------------";
    }
} // END: clientsActius()

function quinClient() {
    const quest = confirm("Voleu seleccionar el client pel seu nom?");
    let CLIENT;
    if (quest == true) {
        let NOM;
        do {
            NOM = prompt("nom del client").trim();
            NOM = NOM.charAt(0).toUpperCase() + NOM.slice(1).toLowerCase();
        } while (!NomsTaulasActius().includes(NOM));
        for (let x=0;x<CLIENTSACTIUS.length;x++) {
            if (CLIENTSACTIUS[x].getNom() == NOM) {
                CLIENT = CLIENTSACTIUS[x];
            }
        }
    } else {
        let TAULA;
        do {
            TAULA = prompt("taula del client").trim();
        } while (!NomsTaulasActius().includes(TAULA));
        for (let x=0;x<CLIENTSACTIUS.length;x++) {
            if (CLIENTSACTIUS[x].getTaula() == TAULA) {
                CLIENT = CLIENTSACTIUS[x];
            }
        }
    }
    return CLIENT;
}// END: quinClient()

function tancar(){
    if (NomsTaulasActius().length == 0) {
        clientsActius();
    } else {
        let CLIENT = quinClient();
        CLIENT.getFactura().setTotal(CLIENT.getSollicituds().getOrdres());

        OUTPUTCLIENT.innerHTML = "--------------------"
        OUTPUTCLIENT.innerHTML += `<p><strong>Comandes de ${CLIENT.getNom()} -
                                Taula: ${CLIENT.getTaula()}<strong></p>`;
        OUTPUTCLIENT.innerHTML += `<p>TOTAL: €${CLIENT.getFactura().getTotal()}</p>`;
        OUTPUTCLIENT.innerHTML += "--------------------"
        const quest = confirm("Vols suggeriment de bitllets?")
        if (quest == true) {
            CLIENT.getFactura().quinsBitllets();
        }
    }
} // END: tancar()

function pagar() {
    if (NomsTaulasActius().length == 0) {
        clientsActius();
    } else {
        let CLIENT = quinClient();
        const quest = confirm(`${CLIENT.getNom()}, vols pagar ara?`);
        if (quest == true) {
            let VALOR;
            do {
                VALOR = prompt(`el vostre compte ha donat el total de €${CLIENT.getFactura().getTotal()}`).trim();
            } while (!NUMEROS.test(VALOR) && VALOR <= CLIENT.getFactura().getTotal());
            CLIENT.setStatus(VALOR);
            if (CLIENT.getStatus()) {
                alert(`${CLIENT.getNom()}, encara teniu deutes: ${CLIENT.getDebit()}`)
            } else {
                alert(`${CLIENT.getNom()}, tot està bé! Torni sovint!`)
            }
            OUTPUTORDRE.innerHTML = "";
        }
    }
} // END: pagar()

setMenuLastPosition = function(plat, preu) {
    let position;
    if (menuPlats.length >= 5) {
        menuPlats.length = 5;
        position = 4;
        menuPlats.splice(0,1);
        menuPreus.splice(0,1);
    }
    else {
        position = menuPlats.length
    };
    menuPlats[position] = plat;
    menuPreus[position] = preu;
}; // END: setMenuLastPosition()
setMenuEspecificPosition = function (plat, preu, position) {
    let pos = parseInt(position)-1;
    if (pos > 4 || position == undefined) {
        setMenuLastPosition(plat, preu);
    }
    else {
        menuPlats[pos] = plat;
        menuPreus[pos] = preu;
    }
}; // END: setMenuEspecificPosition
setMenuUndefinedPosition = function(plat, preu) {
    if (menuPlats[0] == undefined) {
        menuPlats[0] = plat;
        menuPreus[0] = preu;
    } else if (menuPlats[1] == undefined) {
        menuPlats[1] = plat;
        menuPreus[1] = preu;
    } else if (menuPlats[2] == undefined) {
        menuPlats[2] = plat;
        menuPreus[2] = preu;
    } else if (menuPlats[3] == undefined) {
        menuPlats[3] = plat;
        menuPreus[3] = preu;
    } else if (menuPlats[4] == undefined) {
        menuPlats[4] = plat;
        menuPreus[4] = preu;
    } else {
        setMenuLastPosition(plat, preu);
    }
}; // END: setMenuUndefinedPosition()
printMenu = function(output) {
    console.log("------- MENU -------");
    console.log("--------------------");

    output.innerHTML = "------- MENU -------" + "<br>";
    output.innerHTML += "--------------------" + "<br>";

    for (let p=0; p<menuPlats.length; p++) {     
        console.log(`${p+1} | ${menuPlats[p]} - €${menuPreus[p]} |`);
        
        output.innerHTML += `${p+1} | ${menuPlats[p]} - €${menuPreus[p]} |` + "<br>";
    }
    
    console.log("--------------------");

    output.innerHTML += "--------------------" + "<br>";
}; // END: printMenu

function caixer() {
    let total = new Number;
    let bitllet5, bitllet10, bitllet20, bitllet50, bitllet100, bitllet500;
    
    this.getTotal = function () {
        return total;
    };

    this.setTotal = function (ordres) {
        for (let p=0; p<ordres.length; p++) {
            for (let m=0; m<menuPlats.length; m++) {
                if (ordres[p] === menuPlats[m]) {
                    total += Number(menuPreus[m]);
                }
            }
        }
    };

    this.setPagament = function (valor) {
        total -= valor;
    }

    this.quinsBitllets = function() {
        let resta = total;
        let bitllet = 500;
        let quantitatBitllet = 0
        while (bitllet > 0) {
            if (resta >= bitllet) {
                resta -= bitllet;
                quantitatBitllet++;
            } else {
                if (quantitatBitllet > 0) {
                    // quantitatBitllets(bitllet, quantitatBitllet);
                    console.log(`${quantitatBitllet} bitllets de €${bitllet}`);
                    OUTPUTCLIENT.innerHTML += `<p>${quantitatBitllet} bitllets de €${bitllet}</p>`
                }
                if (bitllet == 500) {bitllet = 100; bitllet500 = quantitatBitllet}
				else if (bitllet == 100) {bitllet = 50; bitllet100 = quantitatBitllet} 
				else if (bitllet == 50) {bitllet = 20; bitllet50 = quantitatBitllet}
				else if (bitllet == 20) {bitllet = 10; bitllet20 = quantitatBitllet}
                else if (bitllet == 10) {bitllet = 5; bitllet10 = quantitatBitllet}
                else if (bitllet == 5) {bitllet = 0; bitllet5 = quantitatBitllet}
                quantitatBitllet = 0;
            } 
        } 
    }
    
} // caixer final

function ordre() {
    let ordres = new Array, ordresPassat = new Array;
    let verify = false;
    let plat = new String;
    this.getOrdres = function () {
        return ordres;
    }
    this.setOrdres = function(sollicitud) {
        plat = setPlat(sollicitud);
        verifyPlat();
        if (verify == true) {
            position = ordres.length;
            ordres[position] = plat;
            verify = false;
        } else {
            console.log(`erro! aquest menjar (${plat}) no exiteix al menú!`);   
        }  
    }
    function setPlat(menjar){
        let menjarF = menjar.trim().charAt(0).toUpperCase() + menjar.trim().slice(1).toLowerCase();
        return menjarF;
    }
    function verifyPlat() {
        for (let p=0; p<menuPlats.length; p++) {
            if (menuPlats[p] === plat) {
                verify = true;
            }
        }
    }

    this.setPagament = function() {
        ordresPassat.push(ordres);
        ordres.splice(0, ordres.length);
    }    

    this.getOrdresPassat = function () {
        return ordresPassat;
    }
} // ordre final

function client() {
    let nom, taula, pagat, debit, facturaActiu = true;
    let sollicituds = new ordre(), factura = new caixer();
    const data = new Date();

    this.getNom = function () {
        return nom;
    }
    this.setNom = function(name) {
        nom = name;
    }
    this.getTaula = function () {
        return taula;
    }
    this.setTaula = function(numero) {
        taula = numero;
    }
    this.getSollicituds = function() {
        return sollicituds;
    }
    this.getFactura = function() {
        return factura;
    }
    this.getData = function() {
        return data;
    }
    this.getStatus = function() {
        return facturaActiu;
    }
    this.setStatus = function(valor) {
        pagat = valor
        factura.setPagament(pagat);
        debit = factura.getTotal();
        sollicituds.setPagament();
        if (debit == 0) {
            facturaActiu = false;
        }
    }
    this.getDebit = function() {
        return debit;
    }
} // client final