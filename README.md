# EjerciciosDeLogica1
Ejercicios practicos de logica resueltos en Java por Aaron E Ramirez A.

Descripcion del las problematicas:

1.	A contar lápices 
Historia
Pablo es un gran dibujante a lápiz. Tiene sus lápices de diferentes números ordenados en una caja. Ayer su hermanito pequeño tiró su caja y ahora tiene que ordenarla. Como sabe que acabas de ir al Coding Rush te ha pedido que le ayudes a ordenarlos. Él te dará el número de lápiz que debes contar y tú debes decirle, de todos los lápices que hay en el suelo, cuántos hay que tengan ese número.
Entrada
Leerás un número NN seguido por un dígito KK. Después leerás NN líneas de números. Debes de contar el número de veces que aparece el dígito KK.
Salida
Deberás imprimir el número de lápices que hay de ese tipo.

2.	Lectura y escritura
Descripción
Estás llevando a cabo una receta de cocina. Acabas de llegar a la parte donde dice que lo debes cocinar por 5 minutos, pero solamente cuentas con un cronómetro que se configura en segundos. ¿Cuántos segundos debes poner para que sean 5 minutos?
Para estar preparado para cualquier otra receta vas a escribir un programa que haga la conversión por ti.
Vas a leer una cantidad de minutos y debes escribir a cuántos segundos equivale.
Entrada
Un número entero que representa los minutos.
Salida
Otro número entero, que es la equivalencia en segundos.
Límites
El número leído estará entre 1 y 100.

3.	Bisiesto sencillo
Descripción
Un año es bisiesto si es divisible entre 4, excepto que sea divisible entre 100. Sin embargo, si un año es divisible entre 100 y además es divisible entre 400, también resulta bisiesto.
Entrada
La primera línea tendrá un número N, que es el año que tendrás que decidir si es o no bisiesto. Todos los años serán mayores a 1600 y menores a 3,000.
Salida
Para el año de la entrada escribe una "Si" o una "No", dependiendo de si el año es bisiesto o no respectivamente.

4.	Matriz diagonal
Descripción
Dados los datos enteros de una matriz cuadrada de N filas por N columnas. 1<=N<=100. Determina si se trata de una matriz diagonal. En una matriz diagonal, todas las casillas de la diagonal desde la 0,0 hasta la F-1,C-1 tienen el mismo valor.
Entrada
En la primera línea el enteros N que denotan el número de filas y columnas de la matriz. En cada una de las siguientes N filas, N enteros separados por espacios.
Salida
Imprime SI en caso de que la entrada describa una matriz diagonal, NO en caso contrario.

5.	Cola Bancaria de la suerte
Descripción
Eres cuentahabiente del banco más popular de la región y por lo general la cola del banco es extremadamente larga. Además, cada cuentahabiente tiene una prioridad entera PP y la política es que los clientes con prioridad más alta sean atendidos primero (aunque hayan llegado a la cola después), lo que puede ocasionar que algunos cuentahabientes con prioridad baja no sean atendidos.
Para solucionar esto y volver menos monótona la espera en la cola, el banco ha decidido realizar sorteos para que algunos clientes avancen más rápido. Durante el sorteo se extrae una letra y un entero II de la tómbola: a los clientes que estén formados en ese momento y cuyos nombres inicien con esa letra se les sumarán II puntos a su prioridad. En caso de que dos cuentahabientes tengan la misma prioridad, se atenderá al que haya llegado primero. Los eventos que suceden en la cola se representan de la siguiente forma:
•	C NN PP: llega un cuentahabiente de nombre NN con prioridad inicial PP.
•	S LL II: se realizó un sorteo y se extrajo la letra LL y el entero II.
•	A: se atendió al cuentahabiente de mayor prioridad de la cola.
Escribe un programa que determine el nombre del cliente que fue atendido en cada evento de atención.
Entrada
Un entero EE seguido de EE eventos. Puedes suponer 1≤E≤500001≤E≤50000, que no se atenderá a nadie mientras la cola esté vacía, que la prioridad de los cuentahabientes está en el intervalo de −1000000−1000000 a 10000001000000 y que tanto los nombres como las letras del sorteo consisten de letras mayúsculas.
Salida
Los nombres de los cuentahabientes atendidos en el orden en el que se atendieron.
