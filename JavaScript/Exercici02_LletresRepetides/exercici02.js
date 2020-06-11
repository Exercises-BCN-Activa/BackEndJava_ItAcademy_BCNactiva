
// VARIABLES
let txtnom = document.querySelector('input#txtnom')
let txtcognom = document.querySelector('input#txtcogn1')
let divFase = document.querySelector('div#fase')


function allLetter(inputtxt) { 
      var letters = /^[A-Za-z]+$/;
      if (inputtxt.value.match(letters)) {
        return true;
      } else {
        return false;
      }
}


// FUNCTIONS
function fase01() {
    // VARIABLES
    let nom = txtnom.value.trim()
    let cognom = txtcognom.value.trim()
    let nom_complet = nom.charAt(0).toUpperCase() + nom.slice(1).toLowerCase()
    if (cognom.length != 0) {
        nom_complet += " " + cognom.charAt(0).toUpperCase() + cognom.slice(1).toLowerCase()
    }
    var NOMCOMPLET = []
    for (let l=0; l<nom_complet.length; l++) {
        NOMCOMPLET[l] = nom_complet.charAt(l)
    }

    // EXECUTION IN BODY
    if (nom_complet.length != 0) {
        divFase.innerHTML = "<strong>-------- FASE 01 --------</strong>" + "<br><br>"
        divFase.innerHTML += NOMCOMPLET  + "<br>"
        
    } else {
        alert('[ERROR] Faltaran les dades: almenys un nom')
    }
}

function fase02() {
    // VARIABLES
    let nom = txtnom.value.trim()
    let cognom = txtcognom.value.trim()
    let nom_complet = nom.charAt(0).toUpperCase() + nom.slice(1).toLowerCase()
    if (cognom.length != 0) {
        nom_complet += " " + cognom.charAt(0).toUpperCase() + cognom.slice(1).toLowerCase()
    }
    var NOMCOMPLET = []
    for (let l=0; l<nom_complet.length; l++) {
        NOMCOMPLET[l] = nom_complet.charAt(l)
    }
    let vocais = "AEIOU"
    let espaço = "&nbsp;&ensp;&emsp;" //1+2+4 x whitespaces
    // EXECUTION IN BODY
    if (nom_complet.length != 0) {
        divFase.innerHTML = "<strong>-------- FASE 02 --------</strong>" + "<br><br>"
        
        for (let lletra in NOMCOMPLET) {
            
            if (NOMCOMPLET[lletra].match(/^[a-zA-Z]$/)) { //regular expression for letters
                if (vocais.includes(NOMCOMPLET[lletra].toUpperCase())) {
                    divFase.innerHTML += espaço+"'" + NOMCOMPLET[lletra] + "'" + " = VOCAL"  + "<br>"
                } else {
                    divFase.innerHTML += espaço+"'" + NOMCOMPLET[lletra] + "'" + " = CONSONTANT"  + "<br>"
                }
                
            } else if (NOMCOMPLET[lletra].match(/^\d/)) { //regular expression for numbers
                divFase.innerHTML += espaço+"'" + NOMCOMPLET[lletra] + "'" + " = número"  + "<br>"
            } else if (NOMCOMPLET[lletra].match(/^\s+$/)) { //regular expression for whitespaces
                divFase.innerHTML += espaço+"'" + NOMCOMPLET[lletra] + "'" + " = espai"  + "<br>"
            }else {
                divFase.innerHTML += espaço+"'" + NOMCOMPLET[lletra] + "'" + " = caràcter especial"  + "<br>"
            }
        }
        
        
    } else {
        alert('[ERROR] Faltaran les dades: almenys un nom')
    }
}


function fase03() {
    // VARIABLES
    let nom = txtnom.value.trim()
    let cognom = txtcognom.value.trim()
    let nom_complet = nom
    let espaço = "&nbsp;&emsp;&emsp;&emsp;&emsp;"
    if (cognom.length != 0) {
        nom_complet += " " + cognom
    }
    var NOMCOMPLET = new Object()
    for (let l=0; l<nom_complet.length; l++) {
        let lletra = nom_complet.charAt(l).toUpperCase()
        if (NOMCOMPLET.hasOwnProperty("'"+lletra+"'")) {
            NOMCOMPLET["'"+lletra+"'"] += 1
        } else if (lletra == " ") {
            // do nothing
        } else {
            NOMCOMPLET["'"+lletra+"'"] = 1
        }

    }
    
    
    // EXECUTION IN BODY
    
    if (nom_complet.length != 0) {
        divFase.innerHTML = "<strong>-------- FASE 03 --------</strong>" + "<br><br>"
        for (let key in NOMCOMPLET) {
            divFase.innerHTML += `${espaço}${key} = ${NOMCOMPLET[key]}x<br>`
        }
        
    } else {
        alert('[ERROR] Faltaran les dades: almenys un nom')
    }
}

function fase04() {
    // VARIABLES
    let nom = txtnom.value.trim()
    let Nom = nom.charAt(0).toUpperCase() + nom.slice(1).toLowerCase()
    var NAME = []
    for (let l=0; l<Nom.length; l++) {
        NAME[l] = Nom.charAt(l)
    }
    
    let cognom = txtcognom.value.trim()
    let Cognom = cognom.charAt(0).toUpperCase() + cognom.slice(1).toLowerCase()
    var SURNAME = []
    for (let l=0; l<Cognom.length; l++) {
        SURNAME[l] = Cognom.charAt(l)
    }
    
    var FULLNAME = []
    FULLNAME.push(NAME)
    FULLNAME.push(' ')
    FULLNAME.push(SURNAME)

    // EXECUTION IN BODY
    if (nom.length != 0 && cognom.length != 0) {
        divFase.innerHTML = "<strong>-------- FASE 04 --------</strong>" + "<br><br>"
        divFase.innerHTML += "&emsp;&emsp;&emsp;&emsp;&emsp;<strong>Nom:</strong><br>"
        divFase.innerHTML += NAME  + "<br><br>"
        divFase.innerHTML += "&nbsp;&emsp;&emsp;&emsp;&emsp;<strong>Cognom:</strong><br>"
        divFase.innerHTML += SURNAME  + "<br><br>"
        divFase.innerHTML += "&nbsp;&emsp;&emsp;&emsp;<strong>Nom Complet:</strong><br>"
        divFase.innerHTML += FULLNAME + "<br>"
    } else {
        alert('[ERROR] Faltaran les dades: almenys un nom amb un cognom')
    }
}