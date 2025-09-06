# BFF Web - Backend for Frontend

Este es un proyecto Backend for Frontend (BFF) desarrollado con Spring Boot que actúa como intermediario entre el frontend y los microservicios.

## 🚀 Características

- **Framework**: Spring Boot 3.5.5
- **Java**: 21+
- **Cliente HTTP**: OpenFeign
- **Seguridad**: Spring Security 6
- **Arquitectura**: BFF (Backend for Frontend)

## 📋 Funcionalidades

- Consumo de microservicios de transacciones
- Configuración de seguridad moderna
- Cliente REST con Feign
- Gestión de CORS

## 🛠️ Tecnologías Utilizadas

- Spring Boot 3.5.5
- Spring Security 6
- Spring Cloud OpenFeign
- Maven
- Java 21

## 📁 Estructura del Proyecto

```
src/
├── main/
│   ├── java/
│   │   └── com/duoc/bffweb/BffWeb/
│   │       ├── BffWebApplication.java
│   │       ├── config/
│   │       │   └── SecurityConfig.java
│   │       ├── controllers/
│   │       │   └── BffController.java
│   │       ├── dto/
│   │       │   └── TransactionResponse.java
│   │       ├── restclients/
│   │       │   └── ClienteRest.java
│   │       └── services/
│   │           ├── BffService.java
│   │           └── impl/
│   │               └── BffServiceImpl.java
│   └── resources/
│       └── application.properties
└── test/
    └── java/
        └── com/duoc/bffweb/BffWeb/
            └── BffWebApplicationTests.java
```

## 🔧 Instalación y Ejecución

### Prerrequisitos

- Java 21 o superior
- Maven 3.6+
- Git

### Pasos para ejecutar

1. **Clonar el repositorio**
   ```bash
   git clone <url-del-repositorio>
   cd BffWeb
   ```

2. **Compilar el proyecto**
   ```bash
   mvn clean compile
   ```

3. **Ejecutar la aplicación**
   ```bash
   mvn spring-boot:run
   ```

4. **La aplicación estará disponible en:**
   ```
   http://localhost:8080
   ```

## 📡 Endpoints

### Transacciones

- **GET** `/bff` - Obtener todas las transacciones

## ⚙️ Configuración

### Microservicio de Transacciones

El BFF está configurado para consumir un microservicio en:
```
http://localhost:8090/api/transactions
```

Asegúrate de que el microservicio esté ejecutándose antes de probar el BFF.

### Variables de Entorno

Puedes configurar las siguientes variables en `application.properties`:

```properties
# Puerto de la aplicación (por defecto: 8080)
server.port=8080

# URL del microservicio de transacciones
microservice.transactions.url=http://localhost:8090
```

## 🔐 Seguridad

El proyecto incluye configuración de Spring Security que:

- Permite acceso a todos los endpoints (configurado para desarrollo)
- Habilita CORS
- Deshabilita CSRF para APIs REST

## 🧪 Testing

Para ejecutar las pruebas:

```bash
mvn test
```

## 🤝 Contribución

1. Fork el proyecto
2. Crea una rama para tu feature (`git checkout -b feature/AmazingFeature`)
3. Commit tus cambios (`git commit -m 'Add some AmazingFeature'`)
4. Push a la rama (`git push origin feature/AmazingFeature`)
5. Abre un Pull Request

## 📝 Licencia

Este proyecto es parte de un ejercicio académico de Desarrollo Backend III.

## 👥 Autor

Desarrollado como parte del curso de Desarrollo Backend III - Semana 4

---

**Nota**: Este es un proyecto de desarrollo. Para producción, revisa la configuración de seguridad y las URLs de los microservicios.
