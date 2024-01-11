-- Create the database
CREATE DATABASE IF NOT EXISTS client;

-- Use the client database
USE client;

-- Create the contacts table with auto-incrementing ID
CREATE TABLE IF NOT EXISTS contacts (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(255),
    prenom VARCHAR(255),
    email VARCHAR(255),
    telephone VARCHAR(10)
);

-- Insert sample data into the contacts table
INSERT INTO contacts (nom, prenom, email, telephone) VALUES
('Lefebvre', 'Jean', 'jean.lefebvre@example.com', '0612345678'),
('Dupont', 'Marie', 'marie.dupont@example.com', '0623456789'),
('Martin', 'Sophie', 'sophie.martin@example.com', '0634567890'),
('Dubois', 'Pierre', 'pierre.dubois@example.com', '0645678901'),
('Leroy', 'Isabelle', 'isabelle.leroy@example.com', '0656789012'),
('Moreau', 'Julien', 'julien.moreau@example.com', '0667890123'),
('Girard', 'Emilie', 'emilie.girard@example.com', '0678901234'),
('Bonnet', 'Nicolas', 'nicolas.bonnet@example.com', '0689012345'),
('Roux', 'Camille', 'camille.roux@example.com', '0690123456'),
('Fontaine', 'Laure', 'laure.fontaine@example.com', '0601234567'),
('Chevalier', 'Lucie', 'lucie.chevalier@example.com', '0612345678'),
('Blanc', 'Antoine', 'antoine.blanc@example.com', '0623456789'),
('Marchand', 'Aurélie', 'aurelie.marchand@example.com', '0634567890'),
('Fournier', 'Thomas', 'thomas.fournier@example.com', '0645678901'),
('Robin', 'Laura', 'laura.robin@example.com', '0656789012');