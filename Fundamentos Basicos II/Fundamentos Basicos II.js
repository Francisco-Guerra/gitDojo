//1.- Tamaño Grande - Dado un array, escribe una función que cambie todos los números positivos en él, por el string “big”. Ejemplo: grande([-1,3,5,-5]) devuelve [-1, “big”, “big”, -5].
function positString() {
    for (i = 0; i < x.length; i++) {
        if (x[i] > 0) {
            x[i] = "big"
        }
    }
    return x
}
var x = [-1, 3, 5, -5];
positString();

//2.- Imprime (print) el menor, devuelve (return) el mayor - Crea una función que tome un array de números. La función debería imprimir (print) el menor valor del array, y devolver (return) el mayor. 
var x = [-1, 3, 5, -5];

function printReturn() {
    var min = 0;
    var max = 0;
    for (var i = 0; i < x.length; i++) {
        if (x[i] > min) {
            min = x[i];
        } else if (x[i] < max) {
            max = x[i];
        }
    }
    console.log(min);
    return max;
}
printReturn();

//3.- Imprime (print) uno, devuelve (return) otro- Crea una función para un array de números. La función debería imprimir (print) el penúltimo valor y devolver (return) el primer valor impar.
var x = [-1, 3, 5, -5];

function printPenultPrimerimpar() {
    for (var i = 0; i < x.length; i++) {
        console.log(x[x.length - 2]);
        if (x[i] % 2 == 1 || x[i] % 2 == -1) {
            return x[i];
        }
    }
}
printPenultPrimerimpar();

//4.- Doble Visión - Dado un array, crea una función que devuelva un nuevo array donde cada valor se duplique. Entonces, doble([1,2,3]) debiera devolver [2, 4, 6] sin cambiar el array original. 
var x = [1, 2, 3];

function dobleArray() {
    for (var i = 0; i < x.length; i++) {
        x[i] = x[i] * 2
    }
    return x
}
dobleArray();

//5.- Contar Positivos -  Dado un array de números, crea una función para reemplazar el último valor con el número de valores positivos encontrados en el array. Ejemplo, contarPositivos([-1,1,1,1]) cambia el array original y devuelve [-1,1,1,3].
x = [-1, 1, 1, 1];

function contarPositivos() {
    var count = 0;
    for (var i = 0; i < x.length; i++) {
        if (x[i] >= 0) {
            count = count + 1;
        }
        x[x.length - 1] = count
    }
    return x
}
contarPositivos();

//6.- Pares e Impares - Crea una función que acepte un array. Cada vez que ese array tenga 3 valores impares seguidos, imprime (print) “¡Qué imparcial!”, y cada vez que tenga 3 pares seguidos, imprime (print) “¡Es para bien!”.
x = [-1, 1, 1, 3, 3, 1, -2, 2, 4];

function tresImparesPares() {
    impares = 0;
    pares = 0;
    for (var i = 0; i < x.length; i++) {
        if (x[i] % 2 == 1 || x[i] % 2 == -1) {
            impares = impares + 1;
            pares = 0;
        } else {
            pares = pares + 1
            impares = 0;
        }
        if (impares == 3) {
            console.log("Qué imparcial!");
            impares = 0
        } else if (pares == 3) {
            console.log("¡Es para bien!");
            pares = 0
        }
    }
}
tresImparesPares();

//7.- Incrementa los Segundos - Dado un array de números arr, agrega 1 a cualquier otro elemento, específicamente a aquellos cuyo índice es impar (arr[1], arr[3], arr[5], etc). Luego, console.log cada valor del array y devuelve arr.
var arr = [-1, -1, 1, 3, 3, 1, -2, 2, 4]; //dado un array de numeros arr
for (var i = 0; i < arr.length; i++) {
    if (i % 2 == 1) { //índice es impar 
        arr[i] = arr[i] + "1"; //agrega 1 a cualquier otro elemento, específicamente a aquellos cuyo índice es impar (arr[1], arr[3], arr[5], etc)
    }
    console.log(arr[i]); //console.log cada valor del array
}
console.log(arr); //devuelve arr

//8.- Longitudes previas - Pasado un array (similar a decir ‘tomado un array’ o ‘dado un array’) que contiene strings, reemplaza cada string con un número de acuerdo cantidad de letras (longitud) del string anterior. Por ejemplo, longitudesPrevias([“programar”,“dojo”, “genial”]) debería devolver [9, 4, 6]. Pista: ¿For loops solo puede ir hacia adelante?
x = ["programar", "dojo", "genial"]

function longitudesPrevias() {
    for (var i = 0; i < x.length; i++) {
        x[i] = x[i].length
    }
    return x
}
longitudesPrevias();

//9.- Agrega Siete - Construye una función que acepte un array. Devuelve un nuevo array con todos los valores del original, pero sumando 7 a cada uno. No alteres el array original. Por ejemplo, agregaSiete([1,2,3) debería devolver [8,9,10] en un nuevo array.
array = [1, 2, 3, 8, 3, -2];

function agregaSiete() {
    var Arr = [];
    for (var i = 0; i < array.length; i++) {
        Arr.push(array[i] + 7);
    }
    return Arr
}
agregaSiete();

//10,. Array Inverso - Dado un array, escribe una función que invierte sus valores en el lugar. Ejemplo: invertir([3,1,6,4,2)) devuelve el mismo array pero con sus valores al revés, es decir [2,4,6,1,3]. Haz esto sin crear un array temporal vacío. (Pista: necesitarás intercambiar (swap) valores).
a = [3, 1, 6, 4, 2];

function invertirArray() {
    for (var i = 0; i < a.length; i++) {
        a.reverse();
    }
    return a
}
invertirArray();

//11.- Perspectiva: Negativa - Dado un array crear y devuelve uno nuevo que contenga todos los valores del array original, pero negativos (no simplemente multiplicando por -1). Dado [1,-3,5], devuelve [-1,-3,-5].
b = [1, -3, 5];

function returnNegativos() {
    var array = [];
    for (var i = 0; i < b.length; i++) {
        if (b[i] > 0) {
            array.push(-b[i]);
        } else {
            array.push(b[i])
        }
    }
    return array
}
returnNegativos();

//12.- Siempre hambriento - Crea una función que acepte un array e imprima (print) “yummy” cada vez que alguno de los valores sea “comida”. Si ningún valor es “comida”, entonces imprime “tengo hambre” una vez.
c = ["hola", "leer", "programar", "comida"]

function arrHambriento() {
    var exist = false
    for (var i = 0; i < c.length; i++) {
        if (c[i] === "comida") {
            console.log("yummy");
            exist = true;
        }
    }
    if (exist == false) {
        console.log("tengo hambre")
    }
}
arrHambriento();

//13.- Cambiar hacia el centro -  Dado un array, cambia el primer y último valor, el tercero con el ante penútimo, etc. Ejemplo: cambiaHaciaElCentro([true, 42, “Ada”, 2, “pizza”]) cambia el array a [“pizza¨, 42, “Ada”, 2, true]. cambiaHaciaElCentro([1,2,3,4,5,6]) cambia el array a [6,2,4,3,5,1]. No es necesario devolver (return) el array esta vez. 
d = [1, 2, 3, 4, 5, 6];

function cambiaHaciaElCentro() {
    for (var i = 0; i < d.length / 2; i += 2) {
        temp = d[i];
        d[i] = d[(d.length - 1) - i];
        d[(d.length - 1) - i] = temp;
    }
    return d
}
cambiaHaciaElCentro();

//14.- Escala el Array - Dado un array arr y un número num, multiplica todos los valores en el array arr por el número num, y devuelve el array arr modificado. Por ejemplo, escalaArray([1,2,3], 3] debería devolver [3,6,9].

function escalaArray(arr, w) {
    for (var i = 0; i < arr.length; i++) {
        arr[i] = arr[i] * w
    }
    return arr
}
escalaArray([1, 2, 3], 3);