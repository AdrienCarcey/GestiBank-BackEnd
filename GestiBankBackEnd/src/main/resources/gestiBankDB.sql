-- Table "ClientTest"
INSERT INTO `gestibankdb`.`clienttest` (`idClient`, `dateOfBirth`, `email`, `firstName`, `lastName`, `mobile`) VALUES (NULL, '1987-12-17 00:00:00', 'adrien.carcey@hotmail.fr', 'Adrien', 'Carcey', '06-11-22-33-44');
INSERT INTO `gestibankdb`.`clienttest` (`idClient`, `dateOfBirth`, `email`, `firstName`, `lastName`, `mobile`) VALUES (NULL, '1987-12-18 00:00:00', 'gregory.breche@hotmail.fr', 'Grégory', 'Brèche', '06-55-66-77-88');

-- Table "CompteTest"
INSERT INTO `gestibankdb`.`comptetest` (`idCompte`, `dateCreation`, `description`, `solde`) VALUES (NULL, '2018-07-06 00:00:00', 'CCP', '1000');
INSERT INTO `gestibankdb`.`comptetest` (`idCompte`, `dateCreation`, `description`, `solde`) VALUES (NULL, '2018-07-06 00:00:00', 'CCP', '2000');
INSERT INTO `gestibankdb`.`comptetest` (`idCompte`, `dateCreation`, `description`, `solde`) VALUES (NULL, '2018-07-06 00:00:00', 'LA', '500');


-- Table "ClientTest_CompteTest"
INSERT INTO `gestibankdb`.`clienttest_comptetest` (`ClientTest_idClient`, `comptes_idCompte`) VALUES ('1', '1');
INSERT INTO `gestibankdb`.`clienttest_comptetest` (`ClientTest_idClient`, `comptes_idCompte`) VALUES ('2', '2');
INSERT INTO `gestibankdb`.`clienttest_comptetest` (`ClientTest_idClient`, `comptes_idCompte`) VALUES ('2', '3');

-- Table "Identite"
INSERT INTO `gestibankdb`.`Identite` (`idIdentite`, `dateNaissance`, `nom`, `prenom`, `titreCivilite`) VALUES (NULL, '1879-03-14 00:00:00', 'Einstein', 'Albert', 'Monsieur');

-- Table "Adresse"
INSERT INTO `gestibankdb`.`Adresse` (`idAdresse`, `codePostal`, `complementAdresse`, `libelleVoie`, `numeroVoie`, `pays`, `ville`) VALUES (NULL, '75001', NULL, 'Avenue de la relativité', '5', 'France', 'Paris');

-- Table "Contact"
INSERT INTO `gestibankdb`.`Contact` (`idContact`, `email`, `telephone`, `adresse_idAdresse`) VALUES (NULL, 'albert.einstein@gmail.com', '06-01-01-01-01', '1');

-- Table "Utilisateur"
INSERT INTO `Utilisateur` (`heritage`, `idUtilisateur`, `motDePasse`, `nomUtilisateur`, `dateFermetureCompte`, `dateOuvertureCompte`, `dateDebutContrat`, `dateFinContrat`, `contact_idContact`, `identite_idIdentite`, `documents_idDocuments`, `situationFamiliale_idSituationFamiliale`) VALUES ('admin', NULL, 'admin', 'admin', NULL, NULL, '2018-07-01 00:00:00', NULL, '1', '1', NULL, NULL);