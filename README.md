# DOSW-Lab1-2026-1-VanessaTorres-DanielRodriguez

## Integrantes 
-- Jeimmy Vanessa Torres Marin
-- Daniel Esteban Rodriguez Suarez

## Hojas de vida

<img width="574" height="709" alt="Captura de pantalla 2026-01-25 132359" src="https://github.com/user-attachments/assets/6875424a-1c09-48b9-b0ab-c94f2378d850" />


## Retos Completos 

### Reto 1 : Configuracion y cracion de rama 

**Evidencia**

<img width="1840" height="64" alt="image" src="https://github.com/user-attachments/assets/8e36477f-9c63-4fe5-9d67-c46ef84b5e9a" />

**Descripcion**

Se implemento la solucion propuesta por el laboratorio para generar la salida esperada mediante el uso de stream, map y collect. Para estereto la clase que contiene el main es la de Reto1.

### Reto 2 : commit colaborativo 

**Evidencia**

<img width="1795" height="695" alt="Captura de pantalla 2026-02-01 162115" src="https://github.com/user-attachments/assets/051ccf16-b827-44d3-841d-64899727d91c" />

**Descripcion**

Para este reto se crearon las ramas mncionadas en el lab (una por cada colaborador), cada colaborador realizo las especificaciones paso a paso mencionadas en el laboratoerio, para al final juntar las actualizaciones en la rama principal del reto.
Esto genero errores los cuales fueron corregidos posteriormente para un desarrollo del reto completo. El main de este reto se encuentra en CarreraParalela.

### Reto 3 : commit colaborativo

**Evidencia**

<img width="885" height="46" alt="image" src="https://github.com/user-attachments/assets/98ba123e-1ea1-4c8b-b481-4ad14b3e88b3" />

**Descripcion**

Aligual que en el reto 2 se crearon las 2 subramas para poder crear las funciones solicitadas para cada colaborador, para este caso uno debia repetir un mensaje 3 veces y el otro debia invertir el mensaje. Al momento de hacer merge se generaron errores, los cuales fueron corregidos paraque el resultado final sea una misma entrada pero aplicandole las funciones hechas por cada colaborador por separado. El main de este reto se encuentra en Reto3.

### Reto 4 : commit colaborativo

**Evidencia**

<img width="880" height="122" alt="image" src="https://github.com/user-attachments/assets/3e6a3b7e-5da3-4fe6-a7a9-b789a15a6647" />

**Descripcion**

Este reto no fue muy diferente a los anteriores, lo unico diferente era la funcion por crear. Pero una vez hechas las funciones por separado de cadsa colaborador, se realizo el merge y se hicieron los arreglos necesarios para que el resultado del reto fuese el esperado. El main de este reto se encuentra en Tesoro.

### Reto 5 : commit colaborativo

**Evidencia**

<img width="905" height="159" alt="image" src="https://github.com/user-attachments/assets/b059ef3d-c14a-403c-9dcc-582391ce06f8" />

**Descripcion**

Para este reto cada colaborador debia realizar una misma funcion, pero lo unico que cambiaba era el uso de estructuras de datos, ya que uno usaba HashSet y otro TreeSet. Al finalizar la reaizacion de estas funcones por separado se juntan con un merge para posteriormente arreglar los errores generados y lograr cumplir con la salida propuesta por el reto. El main de este reto se encuentra en Reto5.

### Reto 6 : commit colaborativo

**Evidencia**

<img width="933" height="172" alt="image" src="https://github.com/user-attachments/assets/ea2de74c-62b9-4092-93ad-7cbda31597f5" />

**Descripcion**

Para este reto se realizaron los comandos mencionados en el mismo por separado segun el colaborador que lo tenia que hacer, ya se a A o B. Al finalizar esto, se juntan los comandos hechos con un merge para que todos los comandos esten en un mismo metodo y no por separado. El main de este reto se encuentra en Reto6.

## Preguntas teoricas
1. ¿Cuál es la diferencia entre git merge y git rebase?

R/ El git merge fusiona las ramas y el git rebase sobre escribe una sobre la otra.

2. Si dos ramas modifican la misma línea de un archivo, ¿qué sucede al hacer merge?

R/ Se produce un conflicto de fusion, y esto requiere que el desarrollador decida que cambios dejar y cuales no.

3. ¿Cómo puedes ver gráficamente el historial de merges y ramas en consola?

R/ Lo podemos ver facilmente con el siguiente comando git log --graph --oneline --all --decorate

4. Explica la diferencia entre un commit y un push.

R/ git commit guarda los cambios de manera local, mientras que git push guarda los cambios de manera remota.

5. ¿Para qué sirven git stash y git pop?

R/git Stash perimite guardar los cmabios que hiciste en una pila interna, con eso te puedes
mover a otra rama sin necesidad de hacer commit.El git pop te devuelve el cambio mas reciente de la pila

6. ¿Qué diferencia hay entre HashMap y HashTable?

R/HashMap permite valores nulos y no esta sincronizado, en cambio HashTable esta sincronizado 
pero no permite valores nulos 


7. ¿Qué ventajas tiene  Collectors.toMap() frente a un bucle tradicional para llenar un mapa?

R/ Tiene una mayor legibilidad, ademas de que se usa menos codigo y tambien tiene una mejor integracion con los streams.

8. Si usas List con objetos y luego aplicas stream().map(), ¿qué tipo de operación estás haciendo?

R/ Una operacion intermedia de transformacion, ya que se convierten los elementos del steam en otros sin producir un resultado final hasta que se aplica una operacion terminal.

9. ¿Qué hace el método stream().filter() y qué retorna?

R/Aplica un filtro a los elementos de un steam y retorna un nuevo steam con los elementos que cumplen la condicion del filtro.

10. Describe el paso a paso de cómo crear una rama desde develop si es una funcionalidad nueva.

R/ 
    1.Nos asguramos de estar en la rama develop con el comando : git checkout develop
    2.Se crea la nueva rama estando desde develop con el comando: git checkout -b feature/nuva_rama


11. ¿Cuál es la diferencia entre crear una rama con git branch y con git checkout -b?

R/ Con git branch creas la rama pero no te mueve automaticamente a esa rama, en cambio con git checkout -b ademas de crearte la rama tambien te mueve a esa nueva rama.

12. ¿Por qué es recomendable crear ramas feature/ para nuevas funcionalidades en lugar de trabajar en main directamente?

R/ Por que es una buena practica permitiendo crear nuevas funcionalidades de forma aislada, protegiendo la estabilidad del main y ademas facilita el trabajo en equio permitiendo hacer pruebas de codigo antes de integrarlo en el principal.

## Acuerdos

1. Distribución de responsabilidades

El trabajo dividido era indispensable, ya que en algunas ocasiones uno no podia avanzar si el otro no terminaba su parte. Pero en algunos casos tocaba arreglar codigo y hacer el README entonces mientras que uno hacia uno el otro hacia el otro y se revisaba todo al final.

3. Forma de comunicación

Nos comunicabamos mediante mensaje y mayormente para la realizacion de los retos mrdiante llamada en Teams

5. Frecuencia de trabajo

Ambos procurabamos treabajar al tiempo para resolver el laboratorio, pero en algunas ocasiones uno adelantaba mientras el otro terminaba otras obligaciones, pero el trabajo realizado fue frecuente para ambos.

7. Manejo de conflictos y desacuerdos

Cuando teniamos algun desacuerdo era por la interpretacion de alguna parte del enunciado, entonces para solucionarlo le preguntabamos a el profesor para salir de dudas.

8. Compromisos frente a entregas y calidad

Nos comprometemos a revisar mas a detalle la guia y entenderla de la mejor manera posible para no cometer errores al momento de relizar los ejercicios y que sean con las especificaciones que piden (si es que las hay).
