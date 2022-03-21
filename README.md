# RestAssuredSofka Jorge Andres Escorcia
### **Introducción:**

El plan de pruebas está diseñado como una línea base para identificar lo que se considera dentro y fuera del alcance de las pruebas y cuáles son los riesgos.

### **Recursos:**
|Tester | Participación | 
|--- | --- | 
|Jorge Escorcia | 100% | 

### **Alcance:**

Para las diferentes historias de usuario se realizarán las validaciones utilizando el sistema operativo Windows con el servicio de api:https://reqres.in/


**Se Verificara:**
Modulos
- Usuario Unico
- Crear Usuario


HU1: yo como usuario necestio validar el servicio de Usuario Unico

se verificará la funcionalidad  de usuario unico mediante una peticio get, y se validara que devuelva
el id del usuario correspondiente

HU2: Yo como usuario necesito validar la funcionalidad crear nuevo usuario

Se verificara la funcionalidad de creacion de nuevo usuario mediante un peticion post, y se
validara que devuelva el nombre del usuario creado





### **Fuera de Alcance:**

- No se validarán otras funcionalidades que no se encuentren descritas en el alcance.
- 


### Objetivos

- Comprobar que el sitio web haga lo que se planteo en los requerimientos
- Descubrir errores que aun no se haya descubierto
- Mostrar hasta que punto las funciones del Sitio web operan de acuerdo a lo requerido por el cliente

### **Estrategia:**

Se iniciará realizando un Smoke Test para validar que la pagina donde se va a consumir la api este disponible


Por otro lado las pruebas se realizara de forma automatizada utilizando las siguientes herramientas
- RestAssured
- Cucumber
- Java



### **Escenarios**

- Consulta de Usuario Unico
- Creacion de usuario


### **Supuestos**

- La página funcionará correctamente en el navegador.

### **Requisitos:**

- Documentación para conocer el funcionamiento de la Api
