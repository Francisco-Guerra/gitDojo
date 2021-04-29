//1.- Obtén del 1 al 255: Escribe una función que devuelve un array con todos los números del 1 al 255.
function array() {
    arreglo = []
    for (i = 1; i < 256; i++) {
        arreglo.push(i);
    }
    return arreglo
}
var z = array();
console.log(z);

//2.- Consigue pares hasta 1000: Escribe una función que entregue la suma de todos los números pares del 1 al 1000 - Puedes usar un operador de módulo para este ejercicio. 
function sumaPares() {
    var sum = 0
    for (i = 1; i < 1001; i++) {
        if (i % 2 == 0) {
            sum = sum + i;
        }
    }
    return sum
}
sumaPares();

//3.- Suma impares hasta 5000: Escribe una función que devuelva la suma de todos los números impares entre 1 y 5000 (ej: 1+3+5+...+4997+4999).
function sumaImpares() {
    var sum = 0;
    for (var i = 1; i < 5001; i++) {
        if (i % 2 == 1) {
            sum = sum + i
        }
    }
    return sum
}
sumaImpares();

//4.- Itera un array: Escribe una función que devuelva la suma de todos los valores dentro de un array (ej:  [1,2,5] retorna 8. [-5,2,5,12] retorna 14). 
var x = [1, 2, 5];

function iterArray() {
    var sum = 0;
    for (var i = 0; i < x.length; i++) {
        sum = sum + x[i]
    }
    return sum
}
iterArray();

//5.- Encuentra el mayor (max): Dado un array con múltiples valores, escribe una función que devuelva el número mayor (ej: para [-3,3,5,7] el número mayor (max) es 7). 
x = [-3, 3, 5, 7];

function arrayMax() {
    max = 0
    for (var i = 0; i < x.length; i++)
        if (max < x[i]) {
            max = x[i]
        }
    return max
}
arrayMax();

//6.- Encuentra el promedio (avg): Dado un array con múltiples valores, escribe una función que devuelva el promedio de los valores (ej: para [1,3,5,7,20] el promedio es 7.2).
x = [1, 3, 5, 7, 20];

function arrayAvg() {
    var sum = 0
    for (var i = 0; i < x.length; i++) {
        sum = sum + x[i];
    }
    return sum / x.length
}
arrayAvg();

//7.- Array de impares: Escribe una función que devuelva un array de todos los números impares entre 1 y 50 (ej: [1,3,5, …, 47,49]). Pista: Usa el método ‘push’.
function arrayImpares() {
    x = []
    for (var i = 1; i < 51; i++)
        if (i % 2 == 1) {
            x.push(i)
        }
    return x
}
arrayImpares();

//8.- Mayor que Y: Dado un valor Y, escribe una función que toma un array y devuelve los valores mayores que Y. Por ejemplo, si arr = [1,3,5,7] y Y = 3, tu función devolverá 2 (hay 2 números en el array mayores que 3, esto son 5 y 7). 
var arr = [1, 3, 5, 7]
var Y = 3
var count = 0

function mayorQueY() {
    for (var i = 0; i < arr.length; i++) {
        if (arr[i] > Y) {
            count = count + 1
        }
    }
    return count
}
mayorQueY();

//9.- Cuadrados: Dado un array con múltiples valores, escribe una función que reemplace cada valor por el cuadrado del mismo valor (ej: [1,5,10,-2] será [1,25,100,4]).
var x = [1, 5, 10, -2]

function cuadrados() {
    for (var i = 0; i < x.length; i++) {
        x[i] = x[i] * x[i];
    }
    return x
}
cuadrados();

//10.- Negativos: Dado un array con múltiples valores, escribe una función que reemplace cualquier número negativo dentro del array por 0. Cuando el programa esté listo, el array no debiera contener números negativos (ej: [1,5,10,-2] se convertirá en [1,5,10,0]).
var x = [1, 5, 10, -2];

function reempNegativos() {
    for (var i = 0; i < x.length; i++) {
        if (x[i] < 0) {
            x[i] = 0;
        }
    }
    return x;
}
reempNegativos();

//11.- Max/Min/Avg: Dado un array con múltiples valores, escribe una función que devuelva un nuevo array que solo contenga el valor mayor (max), menor (min) y promedio (avg) del array original (ej: [1,5,10,-2] devolverá [10,-2,3.5]).
function maxMinAvg(arreglo) {
    var resultado = [];
    var suma = 0;
    arreglo.forEach(valor => suma += valor);
    resultado.push(Math.max(...arreglo));
    resultado.push(Math.min(...arreglo));
    resultado.push(suma / arreglo.length);
    return resultado;
}
arreglo = [1, 5, 10, -2]
console.log(maxMinAvg(arreglo));

//12.- Intercambia Valores: Escribe una función que intercambie el primer y el último valor de cualquier array. La extensión mínima predeterminada del array es 2 (ej: [1,5,10,-2] será [-2,5,10,1]).
var x = [1, 5, 10, -2];

function intercambioIniFin() {
    var temp = x[0];
    x[0] = x[x.length - 1];
    x[x.length - 1] = temp;
    return x;
}
intercambioIniFin();

//13.- De Número a String: Escribe una función que tome un array de números y reemplace cualquier valor negativo por el string ‘Dojo’. Por ejemplo, dado el array = [-1,-3,2], tu función devolverá [‘Dojo’,‘Dojo’,2].
var x = [-1, -3, 2];

function numeroString() {
    for (var i = 0; i < x.length; i++) {
        if (x[i] < 0) {
            x[i] = "Dojo";
        }
    }
    return x;
}
numeroString();