# Mis hábitos

## Descripción general de la aplicación

La aplicación “Mis hábitos” permite organizar hábitos diarios de forma simple.

El usuario puede ver una lista inicial de hábitos, agregar un nuevo hábito desde una segunda pantalla, volver a la pantalla principal y visualizar el hábito agregado en la lista.

La aplicación también permite limpiar la lista completa y muestra un mensaje cuando no hay hábitos cargados.

## Pantallas implementadas

### Pantalla principal: Mis hábitos

Esta pantalla funciona como inicio de la aplicación.

Elementos implementados:

- Título principal: “Mis hábitos”.
- Imagen representativa relacionada con listas y organización de hábitos.
- Descripción breve de la funcionalidad.
- Botón “Agregar hábito”.
- Botón “Limpiar lista”.
- Contador dinámico de hábitos.
- Mensaje para indicar cuando la lista está vacía.
- Lista dinámica de hábitos.

Funcionalidad:

- Al presionar “Agregar hábito”, la aplicación navega a una segunda pantalla para cargar un nuevo hábito.
- Al presionar “Limpiar lista”, la aplicación elimina todos los hábitos cargados.
- El contador se actualiza según la cantidad de hábitos en la lista.
- Si la lista queda vacía, se muestra el mensaje “No hay hábitos cargados.”.

### Pantalla secundaria: Agregar hábito

Esta pantalla permite ingresar un nuevo hábito.

Elementos implementados:

- Título: “Agregar hábito”.
- Descripción breve.
- Campo de texto para escribir el hábito.
- Botón “Guardar hábito”.
- Validación para evitar guardar un texto vacío.

Funcionalidad:

- El usuario escribe un hábito en el campo de texto.
- Al presionar “Guardar hábito”, la aplicación envía el texto a la pantalla principal.
- El hábito agregado aparece en la lista principal.
- Si el campo está vacío, se muestra un mensaje indicando que primero se debe escribir un hábito.

## Recursos utilizados

La aplicación utiliza:

- `ConstraintLayout`.
- `LinearLayout` vertical.
- `LinearLayout` horizontal.
- `ScrollView`.
- `TextView`.
- `ImageView`.
- `Button`.
- `EditText`.
- `Toast`.
- `Intent`.
- `putExtra`.
- `strings.xml`.
- `dimens.xml`.
- `colors.xml`.
- `string-array`.

## Organización de recursos

Los textos principales fueron definidos en `strings.xml`.

Las dimensiones fueron definidas en `dimens.xml`.

Los colores fueron definidos en `colors.xml`.

Los hábitos iniciales fueron definidos en un `string-array` dentro de `strings.xml`.

## Funcionalidades principales

- Visualización de hábitos iniciales.
- Navegación entre dos pantallas.
- Carga de hábitos desde un `EditText`.
- Envío de datos entre Activities usando `Intent` y `putExtra`.
- Agregado dinámico de elementos `TextView` a una lista.
- Contador dinámico de hábitos.
- Estado visual para lista vacía.
- Limpieza completa de la lista.
- Uso de recursos externos para textos, colores y dimensiones.

## Ejemplo de uso

Al iniciar la aplicación se muestran hábitos iniciales como:

- Hábito 1: tomar agua
- Hábito 2: leer 10 minutos
- Hábito 3: caminar
- Hábito 4: dormir 8 horas

Si el usuario agrega el hábito “meditar”, la aplicación muestra:

- Hábito 5: meditar

Si el usuario presiona “Limpiar lista”, la pantalla muestra:

- Total de hábitos: 0
- No hay hábitos cargados.

## Repositorio

Los cambios fueron realizados directamente sobre el repositorio de GitHub, utilizando commits separados para organizar el trabajo.