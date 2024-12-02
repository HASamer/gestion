
CREATE DATABASE IF NOT EXISTS gestion_clinique ;
USE gestion_clinique;

CREATE TABLE admin (
                       id INT AUTO_INCREMENT PRIMARY KEY,
                       nom VARCHAR(100) NOT NULL,
                       prenom VARCHAR(100) NOT NULL,
                       adresse TEXT,
                       telephone VARCHAR(20),
                       email VARCHAR(255) UNIQUE NOT NULL,
                       username VARCHAR(50) UNIQUE NOT NULL,
                       password VARCHAR(255) NOT NULL,
                       cin VARCHAR(20) UNIQUE NOT NULL
);

INSERT INTO admin (nom, prenom, adresse, telephone, email, username, password, cin)
VALUES
    ('Hadj Ali', 'Samer', '123 Main Street, Tunis, Tunisia', '98765432', 'samer.hadjali@example.com', 'samer_ha', 'securepassword1', '12345678'),
    ('Doe', 'Jane', '45 Avenue Habib Bourguiba, Sousse, Tunisia', '12345678', 'jane.doe@example.com', 'jane_doe', 'securepassword2', '87654321'),
    ('Smith', 'John', '78 Rue de France, Bizerte, Tunisia', '23456789', 'john.smith@example.com', 'john_smith', 'securepassword3', '11223344');
