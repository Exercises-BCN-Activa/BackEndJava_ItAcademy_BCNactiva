
// SELECTORS OPTIONS AND VARIABLES
let selDia = document.querySelector('select#seldia')
for (let c = 1; c<=31; c++) {
    let itemOpt = document.createElement('option')
    itemOpt.text = c
    itemOpt.value = c
    selDia.appendChild(itemOpt)
}
let selMes = document.querySelector('select#selmes')
for (let c = 1; c<=12; c++) {
    let itemOpt = document.createElement('option')
    itemOpt.text = c
    itemOpt.value = c
    selMes.appendChild(itemOpt)
}
let selAny = document.querySelector('select#selany')
for (let c = 1948; c<=2020; c++) {
    let itemOpt = document.createElement('option')
    itemOpt.text = c
    itemOpt.value = c
    selAny.appendChild(itemOpt)
}
let txtnom = document.querySelector('input#txtnom')
let txtcogn1 = document.querySelector('input#txtcogn1')
let txtcogn2 = document.querySelector('input#txtcogn2')
let divFase = document.querySelector('div#fase')



// FUNCTIONS
function fase01() {
    let nom = txtnom.value.trim()
    let Nom = nom.charAt(0).toUpperCase() + nom.slice(1).toLowerCase()
    let cognom1 = txtcogn1.value.trim()
    let Cognom1 = cognom1.charAt(0).toUpperCase() + cognom1.slice(1).toLowerCase()
    let cognom2 = txtcogn2.value.trim()
    let Cognom2 = cognom2.charAt(0).toUpperCase() + cognom2.slice(1).toLowerCase()
    let nom_complet = Nom + " " + Cognom1
    if (Cognom2.length != 0) {
        nom_complet += Cognom2
    }
    let dia = Number(selDia.value)
    let mes = Number(selMes.value)
    let any = Number(selAny.value)
    let data_naixement = dia + "/" + mes + "/" + any
    if (nom.length != 0 && cognom1.length != 0 && any != "0" && dia != "0" && mes != "0") {
        divFase.innerHTML = "<strong>-------- FASE 01 --------</strong>" + "<br>"
        divFase.innerHTML += nom_complet  + "<br>"
        divFase.innerHTML += data_naixement   + "<br>"
        divFase.innerHTML += "<strong>-----------------------</strong>"
    } else {
        alert('[ERROR] Faltaran les dades: Nom, almenys un cognom o data')
    }
}

function fase02() {
    let any = Number(selAny.value)
    let ANY_TRASPAS = 1948
    let comptador_anys = Number.parseInt((any - ANY_TRASPAS) / 4)
    if (any != "0") {
        divFase.innerHTML = "<strong>-------- FASE 02 --------</strong>" + "<br>"
        divFase.innerHTML += "Quantitat de anys de traspàs<br>hi ha entre: "
        divFase.innerHTML += ANY_TRASPAS + " i " + any + ": <br>" + comptador_anys + "<br>"
        divFase.innerHTML += "<strong>-----------------------</strong>"
    } else {
        alert('[ERROR] Faltaran les dades: Nom, almenys un cognom o data')
    }
}

function fase03() {
    let any = Number(selAny.value)
    let ANY_TRASPAS = 1948
    let comptador_anys = Number.parseInt((any - ANY_TRASPAS) / 4)
    let verify = new Boolean()
    if (any % 4 == 0 && any % 100 != 0 || any % 400 == 0) {
        verify = true
    } else {
        verify = false
    }
    if (any != "0") {
        divFase.innerHTML = "<strong>-------- FASE 03 --------</strong>" + "<br>"
        divFase.innerHTML += "L’any de naixement és de traspàs???<br>"
        if (verify) {
            divFase.innerHTML += "Sí, segur!"  + "<br>"
        } else {
            divFase.innerHTML += "no, definitivament!"  + "<br>"
        }
        divFase.innerHTML += "<strong>------------</strong><br>"
        divFase.innerHTML += "Els anys de traspàs des de<br>"  + ANY_TRASPAS + " fins arriba el " + any + ":" + "<br>"
        for (let c = 1; c <= comptador_anys; c++) {
            divFase.innerHTML += (ANY_TRASPAS + (c*4))
            if (c < comptador_anys) {
                divFase.innerHTML += " - "
            }
        }
        divFase.innerHTML += "<br><strong>-----------------------</strong>"
    } else {
        alert('[ERROR] Faltaran les dades: Nom, almenys un cognom o data')
    }
}

function fase04() {
    let nom = txtnom.value.trim()
    let Nom = nom.charAt(0).toUpperCase() + nom.slice(1).toLowerCase()
    let cognom1 = txtcogn1.value.trim()
    let Cognom1 = cognom1.charAt(0).toUpperCase() + cognom1.slice(1).toLowerCase()
    let cognom2 = txtcogn2.value.trim()
    let Cognom2 = cognom2.charAt(0).toUpperCase() + cognom2.slice(1).toLowerCase()
    let nom_complet = Nom + " " + Cognom1
    if (Cognom2.length != 0) {
        nom_complet += Cognom2
    }
    let dia = Number(selDia.value)
    let mes = Number(selMes.value)
    let any = Number(selAny.value)
    let data_naixement = dia + "/" + mes + "/" + any
    if (nom.length != 0 && cognom1.length != 0 && any != "0" && dia != "0" && mes != "0") {
        divFase.innerHTML = "<strong>-------- FASE 04 --------</strong>" + "<br>"
        divFase.innerHTML += "El meu nom és " + nom_complet + "<br>"
        divFase.innerHTML += "Vaig néixer el " + data_naixement + "<br>"
        if (any % 4 == 0 && any % 100 != 0 || any % 400 == 0) {
            divFase.innerHTML += "El meu any de naixement és de traspàs"
        } else {
            divFase.innerHTML += "El meu any de naixement és de traspàs"
        }
        divFase.innerHTML += "<br><strong>-----------------------</strong>"
    } else {
        alert('[ERROR] Faltaran les dades: Nom, almenys un cognom o data')
    }
}