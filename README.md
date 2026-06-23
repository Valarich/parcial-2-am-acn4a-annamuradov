# Mis hábitos

## Descripción general de la aplicación

La aplicación “Mis hábitos” permite organizar hábitos diarios de forma simple. El usuario puede ver una lista inicial de hábitos, ingresar a una segunda pantalla para crear un nuevo hábito y volver a la pantalla principal con el hábito agregado a la lista.

## Pantallas implementadas

### Pantalla principal: Mis hábitos

Esta pantalla funciona como inicio de la aplicación.

El objetivo de esta pantalla es mostrar una presentación simple de la app y permitir que el usuario acceda a la creación de nuevos hábitos.

#### Elementos implementados

- Título principal: “Mis hábitos”.
- Imagen representativa relacionada con listas y organización de hábitos.
- Descripción breve de la funcionalidad.
- Botón “Agregar hábito”.
- Lista dinámica de hábitos.

#### Funcionalidad

Al presionar el botón “Agregar hábito”, la aplicación navega hacia una segunda pantalla llamada `AddHabitActivity`.

La pantalla principal también recibe el hábito creado desde la segunda pantalla y lo agrega dinámicamente a la lista.

Ejemplo:

“Hábito 5: hacer ejercicio”

---

### Pantalla secundaria: Agregar hábito

Esta pantalla permite que el usuario escriba el nombre de un nuevo hábito.

El objetivo de esta pantalla es recibir un texto ingresado por el usuario y enviarlo nuevamente a la pantalla principal.

#### Elementos implementados

- Título: “Agregar hábito”.
- Descripción breve de la acción.
- Campo de texto para escribir el hábito.
- Botón “Guardar hábito”.

#### Funcionalidad

Al presionar el botón “Guardar hábito”, la aplicación valida que el usuario haya escrito un texto.

Si el campo está vacío, se muestra un mensaje indicando que primero debe escribir un hábito.

Si el campo tiene contenido, la aplicación vuelve a la pantalla principal y envía el nuevo hábito utilizando un `Intent` con `putExtra`.

## Flujo de uso

1. El usuario abre la aplicación.
2. Visualiza la pantalla principal “Mis hábitos”.
3. Presiona el botón “Agregar hábito”.
4. La aplicación abre la pantalla “Agregar hábito”.
5. El usuario escribe un hábito.
6. Presiona el botón “Guardar hábito”.
7. La aplicación vuelve a la pantalla principal.
8. El nuevo hábito aparece agregado en la lista.

## Recursos utilizados

La aplicación utiliza:

- ConstraintLayout.
- LinearLayout vertical.
- Button.
- TextView.
- ImageView.
- EditText.
- Variables de String en `strings.xml`.
- Variables de dimensiones en `dimens.xml`.
- Variables de colores en `colors.xml`.
- Pasaje de datos entre activities.
- Uso de extras mediante `putExtra`.
- Comportamiento dinámico al agregar hábitos a la lista.

## Repositorio

Los cambios fueron realizados directamente sobre el repositorio de GitHub, utilizando commits separados para organizar el trabajo.

Repositorio:

https://github.com/Valarich/parcial-2-am-acn4a-annamuradov