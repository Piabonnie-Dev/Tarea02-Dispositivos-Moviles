
# VocaWorld - Tarea 03

## Programación de Dispositivos Móviles

## Autor
**Elliot Kenneth Villafaña Pasten**

### Descripción

La Tarea 03 es una continuación del proyecto VocaWorld, desarrollado en Android Studio utilizando Kotlin y XML.

En esta versión se implementa una interfaz gráfica mediante el componente `ListView`, que permite visualizar y seleccionar personajes de VocaWorld.

La lista utiliza un adaptador personalizado para mostrar imágenes, nombres y clasificaciones de los personajes.

## Funcionalidades

- Visualización de seis personajes mediante `ListView`.
- Imágenes individuales para cada personaje.
- Tarjetas personalizadas con nombres, clasificaciones e iconos musicales.
- Diseño con colores, bordes redondeados y efectos de selección.
- Desplazamiento vertical de la lista.
- Detección de pulsaciones mediante `setOnItemClickListener`.
- Mensajes `Toast` que indican el personaje seleccionado.

## Personajes disponibles

1. Hatsune Miku
2. Kasane Teto
3. Akita Neru
4. Defoko
5. GUMI
6. Adachi Rei

## Funcionamiento

Al iniciar la aplicación se muestra el catálogo de personajes de VocaWorld.

Cada elemento de la lista contiene:

- Imagen del personaje.
- Nombre.
- Clasificación.
- Icono musical.

Al seleccionar un personaje, el evento `setOnItemClickListener` identifica su posición dentro del arreglo y muestra un mensaje `Toast`.

Por ejemplo:

"Seleccionaste a Hatsune Miku"

La selección funciona de manera independiente. Por el momento, la lista no se comunica con las demás pantallas de la aplicación, de acuerdo con los requisitos de la tarea.

## Archivos principales

### MainActivity.kt
Contiene la configuración del `ListView`, el arreglo de personajes y el evento `setOnItemClickListener`.

### PersonajeAdapter.kt
Adaptador personalizado encargado de asignar las imágenes, nombres y clasificaciones a cada elemento de la lista.

### activity_lista.xml
Define la interfaz principal del catálogo, incluyendo el logo, títulos y componente `ListView`.

### item_personaje.xml
Define el diseño individual de cada fila de la lista.

### fondo_fila.xml
Recurso gráfico que establece el fondo, los bordes y las esquinas redondeadas de las tarjetas.

## Tecnologías utilizadas

- Kotlin
- XML
- Android Studio
- ListView
- ArrayAdapter
- ImageView
- TextView
- Toast
- setOnItemClickListener

## Ejecución

1. Clonar o descargar el repositorio.
2. Abrir el proyecto en Android Studio.
3. Esperar la sincronización de Gradle.
4. Seleccionar un emulador Android.
5. Ejecutar la aplicación mediante Run.

La interfaz de la Tarea 03 se muestra cuando la variable `mostrarLista` de `MainActivity.kt` tiene el valor `true`.

## Versiones del proyecto

Este repositorio conserva las diferentes etapas del desarrollo de VocaWorld mediante commits y etiquetas de Git.

### Tarea 02
Implementación inicial de la aplicación con selección de personajes y visualización de información.

### Tarea 03
Implementación de un catálogo visual mediante `ListView`, adaptador personalizado y detección de selección de elementos.

**Tag de entrega: `tarea03`**

Para consultar específicamente el código correspondiente a la Tarea 03:

1. Ingresar al repositorio en GitHub.
2. Abrir la sección **Tags**.
3. Seleccionar la etiqueta `tarea03`.
4. Consultar o descargar el código correspondiente a esta versión.

La etiqueta `tarea03` permite identificar la entrega de forma independiente de modificaciones posteriores del repositorio.

## Estado del proyecto

Tarea 03 finalizada.

Se implementó el componente `ListView` y su evento `setOnItemClickListener`, conservando la independencia entre las interfaces de las tareas anteriores.
