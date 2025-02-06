# 📌 Proyecto Servlets - Inicio de Sesión

Este es un módulo de autenticación web desarrollado con **Java Servlets, JSP y MySQL**, que permite a los usuarios iniciar sesión de forma segura. Implementa sesiones HTTP para gestionar la autenticación y mantener la información del usuario durante la navegación.

## 🚀 Características
✅ **Autenticación segura** con Java Servlets y JSP.  
✅ **Gestión de sesiones** para mantener el estado del usuario.  
✅ **Validación de usuarios** con métodos `GET` y `POST`.  
✅ **Interfaz responsiva** con HTML, CSS y Bootstrap.  
✅ **Conexión con base de datos** MySQL mediante JDBC.  
✅ **Código modular** siguiendo el patrón MVC.  

## 🏗️ **Estructura del Proyecto**
📁 **proyecto-servlets**  
│── 📂 `src/main/java/com/login`  
│   ├── `LoginServlet.java` → Controla la autenticación.  
│   ├── `LogoutServlet.java` → Maneja el cierre de sesión.  
│   ├── `DBConnection.java` → Gestiona la conexión con MySQL.  
│── 📂 `web`  
│   ├── `login.jsp` → Página de inicio de sesión.  
│   ├── `indexhome.jsp` → Página principal tras iniciar sesión.  
│   ├── `styles.css` → Estilos personalizados.  
│── 📂 `WEB-INF`  
│   ├── `web.xml` → Configuración de servlets.  
│── 📂 `sql`  
│   ├── `database.sql` → Script para crear la base de datos y usuarios.  
│── `README.md`  
│── `pom.xml` → Configuración del proyecto con Maven.  

## 🖥️ **Instalación y Uso**
### 🔹 **1. Clonar el repositorio**  
```bash
git clone https://github.com/tuusuario/proyecto-servlets.git


🔹 2. Configurar la base de datos MySQL
Crea una base de datos de llamada login_db.
Ejecuta el script database.sqlen MySQL.
Configure las credenciales en DBConnection.java.
🔹 3. Importar el proyecto en Eclipse o NetBeans
Abre Eclipse o NetBeans.
Importa el proyecto como Maven Project .
Configure Tomcat como servidor.
🔹 4. Ejecutar la aplicación
Iniciar el servidor Tomcat desde Eclipse.
Acceder al navegador a:
Arduino

Copiar

Editar
http://localhost:8080/proyecto-servlets/login.jsp
Iniciar sesión con un usuario registrado.
📝 Autor
👤 Desarrollado por: Germán García
📄 Evidencia: GA7-220501096-AA2-EV