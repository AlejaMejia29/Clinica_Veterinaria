# 🐾 API Clínica Veterinaria

API REST para gestionar **dueños, mascotas, veterinarios, citas e historiales médicos** de una clínica veterinaria.  
Construida con **Java 17 + Spring Boot**, persistencia con **JPA** y base de datos **MySQL**.  
Incluye configuración con **Docker Compose** para desarrollo local.

---

## 📚 Tabla de contenidos
- [Características](#-características)
- [Tecnologías](#-tecnologías)
- [Estructura del proyecto](#-estructura-del-proyecto)
- [Instalación y ejecución](#-instalación-y-ejecución)
- [Configuración de base de datos](#-configuración-de-base-de-datos)
- [Endpoints principales](#-endpoints-principales)
- [Modelos / Entidades](#-modelos--entidades)
- [Contribución](#-contribución)
- [Licencia](#-licencia)

---

## ✨ Características
- CRUD de **Dueño**, **Mascota**, **Veterinario**, **Cita** e **Historial Médico**.  
- Capas **controller**, **service** y **repository** bien separadas.  
- Archivo `docker-compose.yml` para levantar **MySQL** y la **API**.  
- Configuración centralizada en `application.properties`.  
- Pruebas unitarias en `src/test`.  

---

## 🧰 Tecnologías
- Java 17  
- Spring Boot 3.x  
- Spring Data JPA (Hibernate)  
- MySQL  
- JUnit  
- Maven  

---

## 🗂️ Estructura del proyecto
Clinica_Veterinaria-main/
├─ docker-compose.yml
├─ MySQL/
│ └─ Dockerfile
└─ Veterinaria/
└─ Veterinaria/
├─ pom.xml
├─ Dockerfile
└─ src/
├─ main/java/com/example/Veterinaria/
│ ├─ VeterinariaApplication.java
│ ├─ controller/
│ ├─ dto/
│ ├─ model/ # Entidades JPA
│ ├─ repository/ # Repositorios JPA
│ └─ service/ # Lógica de negocio
└─ main/resources/
└─ application.properties

yaml
Copiar código

---

🧬 Modelos / Entidades
Duenio → información del propietario.

Mascota → datos de la mascota + relación con dueño.

Veterinario → datos profesionales y especialidad.

Cita → fecha, hora, motivo, estado, vínculos con mascota y veterinario.

Historial Médico → diagnósticos, tratamientos, observaciones.


📝 Licencia
Uso libre para fines personales y educativos.
