# POLLERIA D ANTHONY

Este proyecto Java representa un sistema simple de pedidos para una pollería llamada "Polleria D'Anthony". El sistema
permite **ingresar**, **mostrar**, **buscar**, **modificar** y **eliminar** pedidos de clientes.

## Tabla de Contenidos

1. [Requisitos Previos](#requisitos-previos)
2. [Instalación](#instalación)
3. [Interacción con la Aplicación](#interacción-con-la-aplicación)
4. [Estructura del Proyecto](#estructura-del-proyecto)
5. [Organización del Código Fuente](#organización-del-código-fuente)
6. [Contribuciones y Mejoras](#contribuciones-y-mejoras)

## Requisitos Previos

Antes de ejecutar la aplicación, asegúrese de tener instalados los siguientes requisitos previos:

1. [x] Java 8 o posterior
2. [x] Maven

## Instalación

Para instalar la aplicación, siga los siguientes pasos:

1. Clone el repositorio en su máquina local:

```bash 
git clone https://github.com/OmerJuve2023/PolleriaDAnthony.git
```

2. Navegue a la carpeta del proyecto:

```bash
cd PolleriaDAnthony
```

3. Compile el proyecto:

```bash
mvn clean install
```

4. Ejecute el proyecto:

```bash
java -jar target/polleria-d-anthony-1.0.1.jar
```

## Interacción con la Aplicación

La interfaz gráfica se abrirá, permitiéndote interactuar con el sistema.
Funcionalidades del Menú

* **Ingresar Datos:** _Permite ingresar un nuevo pedido con el nombre del cliente y la selección de platos._
* **Mostrar:** _Muestra una lista de todos los pedidos realizados, incluyendo el ID, nombre del cliente y monto total._
* **Buscar Pedido:** _Permite buscar un pedido por su ID._
* **Modificar Pedido:** _Permite modificar un pedido existente, incluyendo la posibilidad de agregar o quitar platos._
* **Eliminar Pedido:** _Permite eliminar un pedido existente._
* **Salir:** _Cierra la aplicación._

## Estructura del Proyecto

### Clases:

* **guiPolleria:** Interfaz gráfica principal que permite interactuar con el sistema.
* **viewPolleria:** Clase que gestiona la lógica del negocio, como ingresar, mostrar, buscar, modificar y eliminar
  pedidos.
* **controller:** Clase base que proporciona funciones útiles.

## Organización del Código Fuente:

El código fuente se organiza en paquetes: `org.example.view`, `org.example.controler` y `org.example.model`.
Cada paquete contiene clases específicas relacionadas con la interfaz gráfica, la lógica del negocio y el modelo de
datos.

## Contribuciones y Mejoras

Si deseas contribuir o realizar mejoras, realiza un fork del repositorio y envía pull requests. Además, puedes abrir
issues para informar sobre errores o sugerir nuevas funcionalidades.

¡Explora y disfruta de la experiencia de la Pollería D'Anthony!
=======

>>>>>>> master
