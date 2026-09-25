# VocaWorld - Tarea 02 de Dispositivos Moviles

Aplicación desarrollada en **Android Studio utilizando Kotlin y XML**.

El objetivo del proyecto es crear una aplicación Android que utilice diferentes componentes gráficos y que cuente con más de una pantalla o máximo 2 pantallas.


## Autor

**Elliot Kenneth Villafaña Pasten**


## Descripción del proyecto

**VocaWorld** es una aplicación sencilla relacionada con personajes de Vocaloid y sintetizadores de voz.

La aplicación permite al usuario ingresar su nombre, seleccionar un personaje favorito, indicar algunos de sus intereses y escribir el nombre de una canción favorita.

Los personajes disponibles son:

- Hatsune Miku
- Kasane Teto
- Akita Neru
- Defoko
- GUMI
- Adachi Rei

Después de seleccionar un personaje, la aplicación abre una segunda pantalla donde se muestra una ficha con información relacionada con el personaje elegido.


## Funcionamiento de la aplicación

### Pantalla principal

En la primera pantalla el usuario puede:

1. Escribir su nombre.
2. Seleccionar uno de los seis personajes disponibles mediante `RadioButton`.
3. Seleccionar diferentes intereses mediante `CheckBox`.
4. Escribir el nombre de su canción favorita.
5. Presionar el botón **CONTINUAR**.

Si el usuario no escribe su nombre o no selecciona un personaje, la aplicación muestra un mensaje indicando que debe completar dicha información.


### Pantalla de personaje

Después de presionar **CONTINUAR**, se abre una segunda pantalla.

Esta pantalla muestra:

- Nombre del usuario.
- Nombre del personaje seleccionado.
- Imagen del personaje.
- Tipo de personaje.
- Información general del personaje.
- Canción favorita escrita en la primera pantalla.
- Botón **ELEGIR OTRO PERSONAJE**.

Al presionar **ELEGIR OTRO PERSONAJE**, la aplicación regresa a la pantalla principal.


## Componentes de Android utilizados

Durante el desarrollo se utilizaron los siguientes componentes gráficos:

- `TextView`
- `EditText`
- `ImageView`
- `RadioGroup`
- `RadioButton`
- `CheckBox`
- `Button`
- `ScrollView`
- `LinearLayout`

También se utilizaron:

- `Intent` para cambiar de una pantalla a otra.
- `putExtra()` para enviar información entre actividades.
- `Toast` para mostrar mensajes al usuario.

---

## Estructura principal del proyecto

```text
Tarea02
│
├── app
│   └── src
│       └── main
│           │
│           ├── java/com/example/tarea02
│           │   ├── MainActivity.kt
│           │   └── CharacterActivity.kt
│           │
│           ├── res
│           │   ├── layout
│           │   │   ├── activity_main.xml
│           │   │   └── activity_character.xml
│           │   │
│           │   └── drawable
│           │       ├── miku.png
│           │       ├── teto.png
│           │       ├── neru.png
│           │       ├── defoko.png
│           │       ├── gumi.png
│           │       └── adachi_rei.png
│           │
│           └── AndroidManifest.xml
│
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
