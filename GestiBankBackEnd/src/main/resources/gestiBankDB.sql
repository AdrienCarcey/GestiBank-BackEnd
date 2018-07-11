-- Table "ClientTest"
INSERT INTO `gestibankdb`.`clienttest` (`idClient`, `email`, `firstName`, `lastName`, `mobile`) VALUES (NULL, 'adrien.carcey@hotmail.fr', 'Adrien', 'Carcey', '06-11-22-33-44');
INSERT INTO `gestibankdb`.`clienttest` (`idClient`, `email`, `firstName`, `lastName`, `mobile`) VALUES (NULL, 'gregory.breche@hotmail.fr', 'Gregory', 'Breche', '06-55-66-77-88');

-- Table "CompteTest"
INSERT INTO `gestibankdb`.`comptetest` (`idCompte`, `description`, `solde`) VALUES (NULL, 'CCP', '1000');
INSERT INTO `gestibankdb`.`comptetest` (`idCompte`, `description`, `solde`) VALUES (NULL, 'CCP', '2000');
INSERT INTO `gestibankdb`.`comptetest` (`idCompte`, `description`, `solde`) VALUES (NULL, 'LA', '500');


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
INSERT INTO `Utilisateur` (`heritage`, `idUtilisateur`, `statut`, `motDePasse`, `nomUtilisateur`, `dateFermetureCompte`, `dateOuvertureCompte`, `dateDebutContrat`, `dateFinContrat`, `contact_idContact`, `identite_idIdentite`, `documents_idDocuments`, `situationFamiliale_idSituationFamiliale`) VALUES ('admin', NULL, 'ouvert', 'admin', 'admin', NULL, NULL, '2018-07-01 00:00:00', NULL, '1', '1', NULL, NULL);