// DECLARATION OF GLOBAL VARIABLES

    // input variables
var city1 = document.querySelector('input#city1')
var city2 = document.querySelector('input#city2')
var city3 = document.querySelector('input#city3')
var city4 = document.querySelector('input#city4')
var city5 = document.querySelector('input#city5')
var city6 = document.querySelector('input#city6')

    // output variables
var output = document.querySelector('div#outputs')



// INTERNAL FUNCTION DECLARATION
    
    // capitulation change function
function titleCase(txt) {
    x = txt.charAt(0).toUpperCase() + txt.slice(1).toLowerCase()
    return x
}
    // fill validation function of inputs variables
function validateCitutats() {
    let ciutat1 = city1.value
    let ciutat2 = city2.value
    let ciutat3 = city3.value
    let ciutat4 = city4.value
    let ciutat5 = city5.value
    let ciutat6 = city6.value
    if (ciutat1.length != 0 && ciutat2.length != 0 && ciutat3.length != 0 && ciutat4.length != 0 && ciutat5.length != 0 && ciutat6.length != 0) {
        return true
    } else {
        return false
    }
}

    // function to fill array with characters from a string, returning array
function omplir(y){
    let x = []
    for (let c=0; c<y.length; c++) {
        x[c] = y.charAt(c)
    }
    return x
}

    // function to reverse array order, returning array
function invertits(x){
    y = []
    z = 0
    for (let c=x.length-1; c>=0; c--) {
        y[z] = x[c]
        z++
    }
    return y

}




// EXERCISE PHASES FUNCTIONS

function fase01() {

    // INPUT: initialization of variables with values treated by capitulation function
    let ciutat1 = titleCase(city1.value)
    let ciutat2 = titleCase(city2.value)
    let ciutat3 = titleCase(city3.value)
    let ciutat4 = titleCase(city4.value)
    let ciutat5 = titleCase(city5.value)
    let ciutat6 = titleCase(city6.value)
    
    // OUTPUTS:
    
    if (validateCitutats()) // IF with conditional fill validation function
    { 
        // outputs of result prints    
        output.innerHTML = "<strong>-------- FASE 01 --------</strong>" + "<br><br>"
        output.innerHTML += ciutat1 + "<br>" + ciutat2 + "<br>" + ciutat3 + "<br>" + ciutat4 + "<br>" + ciutat5 + "<br>" + ciutat6
    } 
    else // output no-fill alert
    { 
        alert("ERRO! falta alguna ciutat!!!")
    }
}

function fase02() {
    
    // INPUT: initialization of variables with values treated by capitulation function
    let ciutat1 = titleCase(city1.value)
    let ciutat2 = titleCase(city2.value)
    let ciutat3 = titleCase(city3.value)
    let ciutat4 = titleCase(city4.value)
    let ciutat5 = titleCase(city5.value)
    let ciutat6 = titleCase(city6.value)

    // Array of variables above
    let arrayCiutats = [ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6]
    
    // alphabetical sorting method
    arrayCiutats.sort()

    //OUTPUTS
    
    if (validateCitutats()) // IF with conditional fill validation function
    {
        // outputs of result prints  
        output.innerHTML = "<strong>-------- FASE 02 --------</strong>" + "<br><br>"
        
            // bucle to print ordered and numbered array
        for (let c=0; c<arrayCiutats.length; c++) {
            output.innerHTML += (c+1) + "ª - " + arrayCiutats[c] + "<br>"
        }
    } 
    else  // output no-fill alert
    {
        alert("ERRO! falta alguna ciutat!!!")
    }
}

function fase03() {

    // INPUT: initialization of variables with values treated by capitulation function
        // AND method used to replace char "a" at char "4"
    let ciutat1 = titleCase(city1.value).replace(/a/gi, '4')
    let ciutat2 = titleCase(city2.value).replace(/a/gi, '4')
    let ciutat3 = titleCase(city3.value).replace(/a/gi, '4')
    let ciutat4 = titleCase(city4.value).replace(/a/gi, '4')
    let ciutat5 = titleCase(city5.value).replace(/a/gi, '4')
    let ciutat6 = titleCase(city6.value).replace(/a/gi, '4')

    // Array of variables above
    let arrayCiutatsModificades = [ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6]
    
    // alphabetical sorting method
    arrayCiutatsModificades.sort()
    
    if (validateCitutats()) // IF with conditional fill validation function
    {
        // outputs of result prints  
        output.innerHTML = "<strong>-------- FASE 03 --------</strong>" + "<br><br>"
        
            // bucle to print ordered and numbered array
        for (let c=0; c<arrayCiutatsModificades.length; c++) {
            output.innerHTML += (c+1) + "ª - " + arrayCiutatsModificades[c] + "<br>"
        }
    } 
    else // output no-fill alert
    {
        alert("ERRO! falta alguna ciutat!!!")
    }
}

function fase04() {

    // INPUT: initialization of variables with values treated by capitulation function
    let ciutat1 = titleCase(city1.value)
    let ciutat2 = titleCase(city2.value)
    let ciutat3 = titleCase(city3.value)
    let ciutat4 = titleCase(city4.value)
    let ciutat5 = titleCase(city5.value)
    let ciutat6 = titleCase(city6.value)

    // array declaration to store each character of variable through function
    let nomCiutat1 = omplir(ciutat1)
    let nomCiutat2 = omplir(ciutat2)
    let nomCiutat3 = omplir(ciutat3)
    let nomCiutat4 = omplir(ciutat4)
    let nomCiutat5 = omplir(ciutat5)
    let nomCiutat6 = omplir(ciutat6)

    

    // OUTPUTS

    if (validateCitutats()) // IF with conditional fill validation function
    {
        // outputs of result prints  
        output.innerHTML = "<strong>-------- FASE 04 --------</strong>" + "<br><br>"
        output.innerHTML += nomCiutat1 + " - " + invertits(nomCiutat1) + "<br>"
        output.innerHTML += nomCiutat2 + " - " + invertits(nomCiutat2) + "<br>"
        output.innerHTML += nomCiutat3 + " - " + invertits(nomCiutat3) + "<br>"
        output.innerHTML += nomCiutat4 + " - " + invertits(nomCiutat4) + "<br>"
        output.innerHTML += nomCiutat5 + " - " + invertits(nomCiutat5) + "<br>"
        output.innerHTML += nomCiutat6 + " - " + invertits(nomCiutat6) + "<br>"

    } 
    else // output no-fill alert
    {
        alert("ERRO! falta alguna ciutat!!!")
    }

}
