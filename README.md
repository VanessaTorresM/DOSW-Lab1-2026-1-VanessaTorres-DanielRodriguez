# DOSW-Lab1-2026-1-VanessaTorres-DanielRodriguez

## Integrantes 
-- Jeimmy Vanessa Torres Marin
-- Daniel Esteban Rodriguez Suarez

## Retos Completos 

### Reto 1 : Configuracion y cracion de rama 
**Evidencia**
imagen 

**Descripcion**

### Reto 2 : commit colaborativo 
**Evidencia**
imagen

**Descripcion**

### Reto 3 : commit colaborativo
**Evidencia**
imagen

**Descripcion**

### Reto 4 : commit colaborativo
**Evidencia**
imagen

**Descripcion**

### Reto 5 : commit colaborativo
**Evidencia**
imagen

**Descripcion**

### Reto 6 : commit colaborativo
**Evidencia**
imagen

**Descripcion**

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

2. Forma de comunicación

3. Frecuencia de trabajo

4. Manejo de conflictos y desacuerdos

5. Compromisos frente a entregas y calidad
