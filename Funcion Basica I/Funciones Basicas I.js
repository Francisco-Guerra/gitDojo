//1.-
function a() {
    return 35;
}
console.log(a())
    // Se llama a la función en "console.log", por lo cual se puede acceder a resolver la funcion a(), existiendo un return=35, resolviendo entonces en la siguiente salida o resultado:
    //OUTPUT: 35
    //-------------------------------------------------------

//2.- 
function a() {
    return 4;
}
console.log(a() + a());
//PROCESO: 
//1) Determina primer llamado función a(), tomando el valor 4
//2) Determina segundo llamado función a(), tomando el valor 4
//3) Procesamos Console.log(4+4=8)
//OUTPUT: 8.

//3.-
function a(b) {
    return b;
}
console.log(a(2) + a(4));
//PROCESO:
//1) Determina primer llamado función a(b), tomando el valor b=2
//2) Determina segundo llamado función a(b), tomando el valor b=4
//3) Procesamos Console.log(2+4=6)
//OUTPUT: 6.

//4.- 
function a(b) {    
    console.log(b);
    return b * 3;
}
console.log(a(3));
//PROCESO:
//1) Determina llamado función a(b), tomando el valor b=3
//2) Determina console.log(b), OUTPUT:3
//3) Operamos return, b=3 => 3*3=9
//4) Resolvemos console.log(a(3)), dado el return anterior, OUTPUT:9
//OUTPUT: 3,9

//5.-
function a(b) {
    return b * 4;
    console.log(b);
}
console.log(a(10));
//1) Determina llamado función a(10), tomando el valor b=10
//2) Operamos return, b=10 => 10*4=40
//3) Obviamos console.log(b), debido a que cuando tenemos un return, sale inmediatamente de la función.
//4) Resolvemos console.log(a(10)), dado el return anterior, OUTPUT:40
//OUTPUT: 40

//6.-
function a(b) {
    if (b < 10) {
        return 2;
    }    
    else {
        return 4;
    }
    console.log(b);
}
console.log(a(15));
//1) Determina llamado función a(15), tomando el valor b=15
//2) Ingresamos dentro de la función, encontrándonos con un condicional "if", el cual nos dice si b es menor a 10, entonces nos retornaría 2, lo cual no se cumple, avanzando a la siguiente línea
//3) Cuando no se cumple inicialmente "if", entramos a la variable "else", lo cual nos arroja un return=4, saliendo inmediatamente de la función

//7.-
function a(b, c) {
    return b * c;
}
console.log(10, 3);
console.log(a(3, 10));
//1) De acuerdo a la secuencia u orden que se procesan los calculos, (de arriba hacia abajo, luego de izquierda a derecha) no accedemos inmediatamente a la función, debido a que existe un "console log" antes de hacer el llamado de la funcion, generando la salida 10,3
//2) En el segundo console.log se realiza el llamado de la funcion, asignando los siguientes valores: b=3 y c=10
//3) Dentro de la funcion, resolvemos el return b*c, dando un valor de 30
//4) Finalmente generamos la salida del console log, con el llamado de la funcion, devolviendo el valor de return
//OUTPUT: 10,3,30

//8.- 
function a(b) {
    for (var i = 0; i < 10; i++) {
        console.log(i);
    }
    return i;
}
console.log(3);
console.log(4);
//1) Dado que no se hace ningun llamado de la función, nos limitamos solo a resolver los "console.log", sin necesidad de ingresar a la función.
//OUTPUT: 3,4

//9.-
function a() {
    for (var i = 0; i < 10; i++) {
        i = i + 2;
        console.log(i);
    }
}
a();
//1) Existe el llamado a la función "a()", por lo cual accedemos a realizar los calculos dentro de la misma
//2) Tenemos un ciclo for, donde el valor de "i" inicia en 0 y nos pregunta la condicion si "i" es menor que 10
//3) Realizando un diagrama T con los valores que va obteniendo la variable i, tenemos lo siguiente:
//   i=0 => i=0+2=2 => console.log(2);
//   i=2 cumple i<10 => i++, i=3;
//   i=3 => i=3+2=5 => console.log(5);
//   i=5 cumple i<10 => i++, i=6;
//   i=6 => i=6+2=8 => console.log(8);
//   i=8 cumple i<10 => i++, i=9;
//   i=9 => i=9+2=11 => console.log(11);
//   i=11 no cumple con i<10, termina el ciclo "for"
//4) Finalmente cuando termina el ciclo en i=11, el llamado de la función no tiene asignado una variable o un "return" para obtener un resultado, por lo cual desaparece el diagrama T y solo conseguimos de salida los "console.log" anteriores.
//OUTPUT: 2,5,8,11

//10.- 
function a(b, c) {
    for (var i = b; i < c; i++) {
        console.log(i);
    }
    return b * c;
}
a(0, 10);
console.log(a(0, 10));
//1) Se realiza el llamado de la función en a(0,10), por lo cual realizamos los calculos dentro de la función
//2) Las variables toman los siguientes valores, b=0 y c=10
//3) Observamos un ciclo for, donde la variable "i" comienza en "b", lo cual podemos saber que "i=0"
//4) En la segunda condicion, "i" debe ser menor que "c", algebraicamente tenemos entonces i<10
//5) Luego de las condicionantes anteriores, avanzamos al "console.log", obteniendo los valores de resultado "0 a 10" considerando el incremento en una unidad por la tercera condicion "i++"; esto hasta 10 debido a la condicion "i<10"
//6) Finalizado el ciclo "for", nos devolvemos al return, donde b*c=0*10=0
//7) Generamos la salida de a(0,10) gracias al return, dando como resultado "0"
//8) Luego pasamos al console.log(a(0,10)) para generar nuevamente la salida de la función.
//OUTPUT: 0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0

//11.-
function a() {
    for (var i = 0; i < 10; i++) {
        for (var j = 0; j < 10; j++) {
            console.log(j);
        }
        console.log(i);
    }
}
// Como no se realiza en ningun momento el llamado de la función, el ejercicio en cuestion resulta indefinido
// OUTPUT: Undefined

//12.-
function a() {
    for (var i = 0; i < 10; i++) {
        for (var j = 0; j < 10; j++) {
            console.log(i, j);
        }
        console.log(j, i);
    }
}
// Como no se realiza en ningun momento el llamado de la función, el ejercicio en cuestion resulta indefinido
// OUTPUT: Undefined

//13.-
var z = 10;

function a() {
    var z = 15;
    console.log(z);
}
console.log(z);
// Nuevamente el ejercicio no invoca a la función, sin embargo, se define una variable fuera de la función y se realiza al final la salida con "console.log" de la variable
//OUTPUT: 10

//14.-
var z = 10;

function a() {
    var z = 15;
    console.log(z);
}
a();
console.log(z);
//1) Se asigna una variable z con valor 10
//2) Luego vemos que existe una función, saltando hasta el final de la llave de parentesis, determinando que existe el llamado de la función (a();), por tanto podemos ingresar al interior de la funcion.
//3) Dentro de la función, ahora la varible z toma el valor temporal de 15.
//4) Ejecutamos el console.log(15), el cual va a la salida u output
//5) Luego de invocar a la función, nos encontramos con un nuevo console.log(z), pero aqui determinamos el primer valor de z, que no es una variable temporal, z=10
//OUTPUT: 15,10

//15.-
var z = 10;

function a() {
    var z = 15;
    console.log(z);
    return z;
}
z = a();
console.log(z);
//1) Se asigna una variable z con valor 10
//2) Luego vemos que existe una función, saltando hasta el final de la llave de parentesis, determinando que existe el llamado de la función (a();), por tanto podemos ingresar al interior de la funcion.
//3) Dentro de la función, ahora la varible z toma el valor temporal de 15.
//4) Ejecutamos el console.log(15), el cual va a la salida u output
//5) A diferencia del ejercicio anterior, obtenemos un retorno, la cual va a la salida de la función en cuestión, esperando a ser declarada. Por el momento, permanece como una variable temporal
//6) Saliendo de la función, se reemplaza el z por la variable temporal devuelta de la funcion, en el retunr, por tanto z toma el valor de 15
//7) Ejecutamos el console.log(z) a continuación, ya con el nuevo valor de z=15
//OUTPUT: 15, 15