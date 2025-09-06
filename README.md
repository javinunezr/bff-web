# BFF Web - Backend for Frontend

Este es un proyecto Backend for Frontend (BFF) desarrollado con Spring Boot que actúa como intermediario entre el frontend y los microservicios.

## 📋 Funcionalidades

- Consumo de microservicios de transacciones
- Configuración de seguridad moderna
- Cliente REST con Feign
- Gestión de CORS

 **La aplicación estará disponible en:**
   ```
   http://localhost:8091/bff
   ```

## 📡 Endpoints

### Transacciones

- **GET** `/bff` - Obtener todas las transacciones


### AnnualAccounts


### Interest


### Microservicio de Transacciones

El BFF está configurado para consumir un microservicio en:
```
http://localhost:8090/api/transactions
```