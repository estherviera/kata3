# Kata 3 – Transformación de datos a JSON en Java

**Asignatura:** Ingeniería de Software 2  
**Universidad:** Universidad de Las Palmas de Gran Canaria (ULPGC)  
**Repositorio:** https://github.com/estherviera/kata3  
**Rama principal de entrega:** `master`

## 1. Objetivo

El objetivo de esta kata es practicar la lectura de datos externos, su transformación en objetos de dominio y su posterior serialización a JSON válido.

La práctica permite reforzar la separación de responsabilidades mediante una arquitectura organizada en componentes, diferenciando la lectura, el procesamiento, la validación y la generación de datos JSON.

## 2. Tecnologías utilizadas

- Java (versión del JDK configurada en el proyecto).
- IntelliJ IDEA como entorno de desarrollo.
- Maven para la gestión del proyecto, si se utiliza `pom.xml`.
- Git y GitHub para el control de versiones.
- API HTTP de Java para obtener datos externos.
- Biblioteca JSON utilizada en el proyecto (pendiente de confirmar).

## 3. Estructura del proyecto

El código está organizado dentro del paquete `software.ulpgc.katas`, siguiendo una separación de responsabilidades basada en el modelo hexagonal.

### `software.ulpgc.katas.domain.model`

- **User:** clase que representa a un usuario mediante los atributos necesarios para almacenar su información, independientemente del origen de los datos.

### `software.ulpgc.katas.ports`

- **UserReader:** interfaz que define el contrato para obtener los usuarios, permitiendo separar la lógica del dominio de la forma en la que se leen los datos.

### `software.ulpgc.katas.adapters`

- **UserDto:** clase utilizada para representar los datos recibidos en formato JSON, incluyendo información como el nombre, la ubicación, el correo electrónico y la fecha de nacimiento.
- **JsonRandomUserReader:** clase encargada de realizar una petición HTTP a la API Random User para obtener los datos de los usuarios.

### Transformación y serialización

La aplicación debe transformar los datos externos en objetos de dominio y generar una salida JSON válida que incluya una colección de registros y un bloque de metadatos o resumen.

## 4. Compilación y ejecución

### Requisitos

Tener instalado un JDK compatible con la versión configurada en el proyecto, Maven y conexión a Internet para obtener los datos de la API.

### Pasos

1. Clonar el repositorio:

   ```bash
   git clone https://github.com/estherviera/kata3.git
   ```

2. Abrir el proyecto en IntelliJ IDEA.
3. Cargar el proyecto Maven mediante el archivo `pom.xml`, si corresponde.
4. Compilar el proyecto:

   ```bash
   mvn compile
   ```

5. Ejecutar desde IntelliJ IDEA la clase principal del proyecto.

La aplicación utiliza la siguiente API para obtener los datos de **5 usuarios aleatorios**:

https://randomuser.me/api/?results=5

Los datos obtenidos deben procesarse y transformarse para generar una representación JSON estructurada.

## 5. Repetición de la kata

El enunciado establece que la kata debe repetirse al menos tres veces, manteniendo el mismo objetivo y una estructura general equivalente.

**Pendiente de documentar:** las repeticiones realizadas, los commits correspondientes y las pequeñas variaciones introducidas.

## 6. Verificación

Para comprobar el correcto funcionamiento de la aplicación, se deben verificar los siguientes casos:

- Lectura y transformación de datos correctos.
- Tratamiento de registros incompletos o mal formados.
- Procesamiento de un conjunto de datos vacío.
- Generación de JSON válido.
- Comprobación de que el JSON generado puede volver a interpretarse correctamente.

**Pendiente:** incorporar un ejemplo de entrada, la salida JSON esperada y los resultados reales de las pruebas.

## 7. Vídeo explicativo

**Vídeo de la kata:** FALTA EL ENLACE

El vídeo tendrá una duración máxima de 7 minutos y mostrará el funcionamiento de la aplicación, la estructura del proyecto, el proceso de transformación de los datos y las comprobaciones realizadas.
