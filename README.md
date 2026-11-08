# Kata 3: transformación de datos a JSON

Práctica individual de Ingeniería de Software 2 de la Universidad de Las Palmas de Gran Canaria.

## Objetivo

Trabajar con datos de usuarios procedentes de una fuente externa y representar su información mediante clases Java.

## Funcionamiento

La aplicación realiza una petición GET a `https://randomuser.me/api/?results=10` y muestra el cuerpo de la respuesta JSON en la consola.

El lector gestiona los errores de entrada/salida y las interrupciones de la petición. Ante una interrupción, restaura el estado de interrupción del hilo.

## Requisitos y dependencias

- JDK 22, según la configuración de `pom.xml`.
- Maven o el soporte Maven integrado en IntelliJ IDEA.
- Conexión a Internet para consultar la API y descargar las dependencias.
- Google Gson 2.13.2, declarada como dependencia en `pom.xml`.

La dependencia está disponible en [Maven Central](https://central.sonatype.com/artifact/com.google.code.gson/gson/2.13.2):

```xml
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.13.2</version>
</dependency>
```

La petición HTTP utiliza `HttpClient`, incluido en Java.

## Compilación y ejecución

Desde la raíz del proyecto, con Maven disponible y JDK 22 configurado:

```sh
mvn clean compile
mvn org.codehaus.mojo:exec-maven-plugin:3.5.0:java "-Dexec.mainClass=software.ulpgc.katas.Main"
```

En IntelliJ IDEA:

1. Abrir `pom.xml` como proyecto Maven.
2. Seleccionar JDK 22 como SDK del proyecto y como JDK de Maven.
3. Recargar las dependencias Maven.
4. Ejecutar el método `main` de `software.ulpgc.katas.Main`.

## Estructura del código

Las clases se encuentran en `src/main/java/software/ulpgc/katas`.

| Clase | Descripción |
| --- | --- |
| `Main` | Crea el lector y llama a su método `read()`. |
| `ports.UserReader` | Define un contrato de lectura cuyo resultado es una lista de usuarios. |
| `adapters.JsonRandomUserReader` | Consulta la API, imprime su respuesta y devuelve una lista vacía. |
| `adapters.UserDto` | Declara campos para representar la estructura externa de un usuario: género, nombre, ubicación, correo y fecha de nacimiento. |
| `domain.model.User` | Record que representa nombre, apellidos, género y correo electrónico. |
| `domain.model.Gender` | Enum con los valores `female` y `male`. |

## Entrada y salida actuales

La entrada es la respuesta de Random User a la petición de diez usuarios. La salida de consola es el cuerpo JSON recibido, sin modificaciones. Los usuarios varían entre peticiones.

Si se produce un error de entrada/salida, la aplicación lanza una excepción con el mensaje `Error al conectar con la API` y conserva la causa original. Si la petición se interrumpe, el mensaje es `Peticion interrumpida`.

## Repositorio

[Repositorio kata3](https://github.com/estherviera/kata3)

El proyecto incluye `pom.xml`, el código fuente y un `.gitignore` que excluye la carpeta de compilación `target/`.
