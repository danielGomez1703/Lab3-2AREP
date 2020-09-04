# Arep - Punto 2 AVANZADO
este laboratorio es la muestra de un framewok desde un punto de vista general tipo springboot, el cual nos permite manejar recursos etaticos y dinamicos
en este proyecto manejamos unicamente recursos estaticos, usamos Hservidores HTTP implementados en java durante el desarrollo de la clase, una vez atiende 
la solicitud, se hace el proceso para atender el recurso solicitado con la URI. posteriormente se busca con el path y se retorna al browser

## Installation
 ```sh
$ git pull https://github.com/danielGomez1703/Lab3-2AREP
$ cd /Lab3-2AREP
$ mvn package
```

# MANUAL

una vez instalado el programa debe ejecutar el programa con la ruta del archivo que contengan los datos 
 
    java -cp target/classes co.edu.escuelaing.sparkd.SparkD.MicroSpringBoot
	
para obtener los datos debemos dirigirnos a la siguiente direccion:

	localhost:36000/Apps/datos
	
y obtendra informacion de este tipo 

![evidencia](https://github.com/danielGomez1703/Lab3-2AREP/blob/master/resources/datos.JPG)


# Modelo
![Modelo](https://github.com/danielGomez1703/Lab3-2AREP/blob/master/resources/model.JPG)
    
este modelo nos muestra como funciona un framework de spring de forma general, los cual nos permite hacer llamados al servidor con determinados paths los cuales
retornaran recursos staticos.


## Author
    LUIS DANIEL BENAVIDES NAVARRO - Profesor
    Daniel Felipe Gomez Suarez [danielgomez1703](https://github.com/danielGomez1703)
    
    
## BUILT IN
   Proyecto construido en [Maven](https://maven.apache.org/)
## License
----
para consultar su licencia vaya al link 
[leer aqui](https://github.com/danielGomez1703//Lab3-2AREP/blob/master/LICENSE.txt)
