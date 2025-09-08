# BFF Web - Backend for Frontend

Este es un proyecto Backend for Frontend (BFF) desarrollado con Spring Boot que actúa como intermediario entre el frontend y los microservicios.

## 📋 Funcionalidades

- Consumo de microservicios de transacciones
- Configuración de seguridad moderna
- Cliente REST con Feign
- Gestión de CORS

 **La aplicación estará disponible en:**
   ```
   http://localhost:8091/bff-web
   ```

## 📡 Endpoints

### Transacciones

- **GET** `/bff-web` - Obtener todas las transacciones

http://localhost:8091/bff-web/transaction

### AnnualAccounts

- **GET** `/bff-web` - Obtener todas las cuentas anuales

http://localhost:8091/bff-web/annual-account

### Interest

- **GET** `/bff-web` - Obtener todos los intereses

http://localhost:8091/bff-web/interest

### Microservicio de Transacciones

El BFF está configurado para consumir un microservicio en:
```
http://localhost:8090/backend/api
```