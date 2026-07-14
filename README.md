# 🧠 Actividad Sumativa 3 – Desarrollo Orientado a Objetos I

## 👤 Autor del proyecto

**Nombre:** Sandra Mamani  
**Carrera:** Analista Programador Computacional  
**Sede:** Online / Virtual

---

# 📘 Descripción general del sistema

Este proyecto corresponde a la Actividad Sumativa 3 de la asignatura **Desarrollo Orientado a Objetos I**.

El sistema fue desarrollado en Java utilizando Programación Orientada a Objetos para modelar las distintas entidades de la agencia de turismo **Llanquihue Tour**.

La aplicación permite registrar empleados y vehículos mediante una interfaz gráfica desarrollada con Java Swing, almacenando todas las entidades en una colección polimórfica y mostrando posteriormente su información aplicando interfaces, herencia y polimorfismo.

Durante el desarrollo del proyecto se aplicaron los principales conceptos vistos en la asignatura, tales como:

- Encapsulamiento
- Herencia
- Interfaces
- Polimorfismo
- Uso de colecciones
- Manejo de excepciones
- Validación de datos
- Interfaz gráfica (Swing)

---

# 🧱 Estructura del proyecto

```
src
│
├── data
│   └── GestorEntidades.java
│
├── exception
│   └── RutInvalidoException.java
│
├── interfaces
│   └── Registrable.java
│
├── model
│   ├── Persona.java
│   ├── Empleado.java
│   ├── GuiaTuristico.java
│   ├── ColaboradorExterno.java
│   ├── Recepcionista.java
│   ├── Cliente.java
│   ├── Vehiculo.java
│   ├── Direccion.java
│   └── Rut.java
│
└── ui
    └── Main.java
```

---

# 🏛️ Jerarquía de clases

```
                 Persona
                     │
             ┌──────────────┐
             │              │
         Empleado       Cliente
             │
 ┌───────────┼────────────┐
 │           │            │
Guia     Colaborador   Recepcionista
Turístico   Externo
```

El vehículo corresponde a una entidad independiente ya que no representa una persona.

---

# 🖥️ Funcionalidades

La aplicación permite:

- Registrar Guías Turísticos.
- Registrar Colaboradores Externos.
- Registrar Recepcionistas.
- Registrar Vehículos.
- Validar los datos ingresados por el usuario.
- Mostrar automáticamente todas las entidades registradas.
- Diferenciar cada entidad mediante polimorfismo e instanceof.

---

# 💻 Conceptos de Programación Orientada a Objetos aplicados

## Encapsulamiento

Todos los atributos fueron declarados como privados y se accede a ellos mediante métodos getters y setters.

## Herencia

La clase Persona corresponde a la superclase del sistema.

Empleado hereda de Persona.

GuiaTuristico, ColaboradorExterno y Recepcionista heredan de Empleado.

Cliente también hereda de Persona.

## Interfaces

Se implementó la interfaz **Registrable**, la cual define el método:

```java
mostrarResumen();
```

Esta interfaz es implementada por:

- GuiaTuristico
- ColaboradorExterno
- Recepcionista
- Vehiculo

## Polimorfismo

Todas las entidades se almacenan en una colección:

```java
ArrayList<Registrable>
```

Posteriormente son recorridas mediante polimorfismo y diferenciadas utilizando `instanceof`.

## Composición

La clase Persona está compuesta por objetos de tipo:

- Rut
- Direccion

## Manejo de excepciones

Se implementó la excepción personalizada:

- RutInvalidoException

para validar el formato del RUT ingresado por el usuario.

---

# 🖼️ Interfaz gráfica

La aplicación fue desarrollada utilizando **Java Swing**.

Cuenta con tres pestañas principales:

- Registro de empleados.
- Registro de vehículos.
- Visualización de entidades registradas.

Dependiendo del tipo de empleado seleccionado, el sistema habilita únicamente los campos correspondientes.

---

# ⚙️ Requisitos

- Java JDK 17 o superior.
- NetBeans IDE 25 o IntelliJ IDEA.
- Sistema operativo Windows, Linux o macOS.

---

# ▶️ Instrucciones para ejecutar el proyecto

1. Clonar o descargar el repositorio.

```
git clone https://github.com/sandramamani-rep/LlanquihueTourAppSum3.git
```

2. Abrir el proyecto en NetBeans.

3. Esperar la carga de dependencias.

4. Ejecutar la clase:

```
ui/Main.java
```

5. Registrar empleados y vehículos mediante la interfaz gráfica.

6. Seleccionar la pestaña **Mostrar Entidades** para visualizar la información registrada.

---

# 📂 Repositorio GitHub

Repositorio:

https://github.com/sandramamani-rep/LlanquihueTourAppSum3

---

# 👩‍💻 Tecnologías utilizadas

- Java
- Java Swing
- Programación Orientada a Objetos
- NetBeans IDE
- Git
- GitHub

---

# 📅 Actividad

**Asignatura:** Desarrollo Orientado a Objetos I

**Actividad:** Sumativa 3

**Año:** 2026

---

© Duoc UC – Escuela de Informática y Telecomunicaciones