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

## 📦 Prérequis

- Java 17 ou plus
- Maven
- Git
- Un IDE Java (IntelliJ IDEA, Eclipse ou VS Code)

## 📁 Cloner le projet

```bash
git clone https://github.com/hajar-elfallaki/digital-banking-spring-backend.git
cd digital-banking-spring-backend
```



## ▶️ Démarrer l’application

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

## 🔄 Endpoints REST (exemples)


| Méthode | URL               | Description                            |
|--------:|-------------------|----------------------------------------|
| `GET`   | `/customers`      | Liste de tous les clients              |
| `GET`   | `/customers/{id}` | Récupérer un client spécifique         |
| `POST`  | `/customers`      | Ajouter un nouveau client              |
| `PUT`   | `/customers/{id}` | Modifier les informations d’un client  |
| `DELETE`| `/customers/{id}` | Supprimer un client                    |


## 🧪 Console H2

Accessible ici :
```bash
🔗 http://localhost:8085/h2-console
```

JDBC URL : jdbc:h2:mem:testdb

Utilisateur : sa

Mot de passe : (laisser vide)

## 👩‍💻 Développé par
Hajar Elfallaki-Idrissi
Étudiante passionnée par le développement web et les architectures backend modernes.

## 📸 Captures d’écran


![Capture d'écran 2025-05-17 215032](https://github.com/user-attachments/assets/52d7dccb-a76e-4ac7-91f8-3bb00695f502)


![Capture d'écran 2025-05-17 215933](https://github.com/user-attachments/assets/0b1ac697-9d30-469c-90e9-fc9c812eab5a)


![Capture d'écran 2025-05-17 202456](https://github.com/user-attachments/assets/4649e5f0-5535-478f-b641-dcbccfe91e33)


![Capture d'écran 2025-05-19 052225](https://github.com/user-attachments/assets/b4903f70-c030-4bae-8d38-6679becb2b59)


![Capture d'écran 2025-05-19 052233](https://github.com/user-attachments/assets/8f6672ec-2680-4afd-8a0d-21b86d8ed47e)


![Capture d'écran 2025-05-19 052242](https://github.com/user-attachments/assets/de2b4116-386b-44d4-8fa1-15e0d489b8b1)


![Capture d'écran 2025-05-19 052259](https://github.com/user-attachments/assets/25e6e439-f4e6-4219-b441-4d06e2f9bf9a)


![image](https://github.com/user-attachments/assets/53908d65-b6f2-41cb-9257-2292c621383e)







