// 1.- Configura un array para que los valores negativos se transformen en 0. Por ejemplo, resetNegativos([1,2,-1,-3]) debiera dar como resultado [1,2,0,0].

function resetNegativos(array) {
    for (var i = 0; i < array.length; i++) {
        if (array[i] < 0) {
            array[i] = 0;
        }
    }
    return array;
}
resetNegativos([1, 2, -1, -3]);

// 2.- Dado un array, mueve todos los valores un espacio de derecha a izquierda eliminando el primer valor y dejando un 0 para el último valor. Por ejemplo, moverAdelante([1,2,3]) debiera dar como resultado [2,3,0].

function moverAdelante(x) {
    for (var i = 0; i < x.length; i++) {
        x[i] = x[i + 1];
    }
    x.pop();
    x.push(0);
    return x;
}
moverAdelante([1, 2, 3]);

// 3.- Configura un array para que el resultado sean los valores en el orden contrario. Por ejemplo, returnReverso([1,2,3,4]) debe dar [4,3,2,1].

function returnReverso(z) {
    for (var i = 0; i < z.length / 2; i++) {
        temp = z[(z.length - 1) - i];
        z[(z.length - 1) - i] = z[i];
        z[i] = temp;
    }
    return z
}
returnReverso([1, 2, 3, 4]);

// 4.- Crea una función que cambie un array repitiendo sus valores originales (manteniendo el mismo orden). Por ejemplo, repetirValores([4,”Ulysses”, 42, false]) debiera dar [4,4, “Ulysses”, “Ulysses”, 42, 42, false, false].

function repetirValores(arr) {
    var arreglo = []
    for (var i = 0; i < arr.length; i++) {
        arreglo[2 * i] = arr[i];
        arreglo[2 * i + 1] = arr[i];
    }
    return arreglo
}
repetirValores([4, "Ulysses", 42, false]);