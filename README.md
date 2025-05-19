# 💻 Digital Banking - Backend

Ce projet représente la **partie backend** d'une application de banque digitale, développée par **Hajar Elfallaki-Idrissi** avec **Spring Boot**.  
Il permet de gérer les clients, comptes bancaires, opérations, et expose une API REST qui peut être consommée par un frontend (comme Angular).



## 🛠️ Technologies utilisées

- Java 17
- Spring Boot 3.x
- Spring Web
- Spring Data JPA
- H2 Database (base de données en mémoire pour le développement)
- Lombok
- Swagger / Springdoc OpenAPI



## 🚀 Lancer le projet

### 📦 Prérequis

- Java 17 ou plus
- Maven
- Git
- Un IDE Java (IntelliJ IDEA, Eclipse ou VS Code)

### 📁 Cloner le projet

```bash
git clone https://github.com/hajar-elfallaki/digital-banking-spring-backend.git
cd digital-banking-spring-backend
```



### ▶️ Démarrer l’application

```bash
Copier
Modifier
./mvnw spring-boot:run
```
Ou alors lance la classe principale DigitalBankingApplication.java depuis ton IDE.


### 📚 Documentation de l’API
Swagger UI :
```bash
🔗 http://localhost:8085/swagger-ui.html
(ou http://localhost:8085/swagger-ui/index.html selon ta configuration)

```

### 🔄 Endpoints REST (exemples)
Méthode	URL	Description
GET	/customers	Liste de tous les clients
GET	/customers/{id}	Récupérer un client spécifique
POST	/customers	Ajouter un nouveau client
PUT	/customers/{id}	Modifier les informations d’un client
DELETE	/customers/{id}	Supprimer un client

### 🧪 Console H2

Accessible ici :
```bash
🔗 http://localhost:8085/h2-console
```

JDBC URL : jdbc:h2:mem:testdb

Utilisateur : sa

Mot de passe : (laisser vide)

### 👩‍💻 Développé par
Hajar Elfallaki-Idrissi
Étudiante passionnée par le développement web et les architectures backend modernes.

