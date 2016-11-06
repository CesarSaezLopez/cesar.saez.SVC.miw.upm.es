# cesar.saez.SVC.miw.upm.es

###Feature#01
#####-Crear la clase C11 (con los métodos m1() y m2())
#####-Crear la clase C12 (con el método mA())
#####-Crear la clase C11Test
#####-Crear la clase C12Test

###Feature#02
-Crear la clase C21 (con los métodos m1() y m2())
-Crear la clase C22 (con el método mA())
-Crear la clase C21Test
-Crear la clase C22Test

###Feature#03
-Crear la clase C31 (con los métodos m1() y m2())
-Crear la clase C32 (con el método mA())
-Crear la clase C31Test
-Crear la clase C32Test

###Release-1.0
-Añadir los métodos m3() a C21 y mB() a C31
-Generar el jar y crear un Tag

###Feature#04
-Cambiar en el pom, a la versión 1.1.0

###Feature#05
-Crear la clase C51 (con los métodos m1() y m2())
-Crear la clase C52 (con el método mA())
-Crear la clase C51Test
-Crear la clase C52Test

####La secuencia en el tiempo de las clases creadas o modificadas es:
####C11,
####C21, C21Test, C22, C22Test,
####C11Test,
####C31,
####C12,
####C31Test,
####C12Test
####C32, C32Test,
####C21(m3()),
####Cambiar pom: 1.1.0
####C51, C51Test,
####C31(mB()), terminar Release.1.0
####C52,
####C11(error en m1()) en la release liberada),
####C52Test
