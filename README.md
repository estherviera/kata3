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

El proyecto está organizado dentro del paquete `software.ulpgc.katas`, siguiendo una arquitectura hexagonal que permite separar el modelo de dominio, las interfaces y los adaptadores externos.

### Organización de paquetes

```text
software.ulpgc.katas
│
├── domain
│   └── model
│       └── User.java
│
├── ports
│   └── UserReader.java
│
└── adapters
    ├── UserDto.java
    └── JsonRandomUserReader.java
```

### Descripción de los componentes

| Paquete | Clase | Responsabilidad |
|---|---|---|
| `domain.model` | `User` | Representa al usuario mediante sus atributos, independientemente del origen de los datos. |
| `ports` | `UserReader` | Define la interfaz para obtener usuarios sin depender de una implementación concreta. |
| `adapters` | `UserDto` | Representa los datos recibidos en JSON desde la API. |
| `adapters` | `JsonRandomUserReader` | Realiza la petición HTTP a Random User para obtener los datos de los usuarios. |

### Funcionamiento general

```text
       API Random User
              │
              ▼
    JsonRandomUserReader
       (Obtiene datos)
              │
              ▼
           UserDto
     (Representa el JSON)
              │
              ▼
            User
     (Objeto de dominio)
```

La interfaz `UserReader` establece el contrato que utiliza `JsonRandomUserReader` para obtener los usuarios, manteniendo separadas las responsabilidades del proyecto.
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
