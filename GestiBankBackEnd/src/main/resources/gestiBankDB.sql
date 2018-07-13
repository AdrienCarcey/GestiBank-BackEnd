-- 1-Base de données "Test"

-- Table "ClientTest"
INSERT INTO `gestibankdb`.`clienttest` (`idClient`, `email`, `firstName`, `lastName`, `mobile`) VALUES (1, 'adrien.carcey@hotmail.fr', 'Adrien', 'Carcey', '06-11-22-33-44');
INSERT INTO `gestibankdb`.`clienttest` (`idClient`, `email`, `firstName`, `lastName`, `mobile`) VALUES (2, 'gregory.breche@hotmail.fr', 'Gregory', 'Breche', '06-55-66-77-88');

-- Table "CompteTest"
INSERT INTO `gestibankdb`.`comptetest` (`idCompte`, `description`, `solde`) VALUES (1, 'CCP', '1000');
INSERT INTO `gestibankdb`.`comptetest` (`idCompte`, `description`, `solde`) VALUES (2, 'CCP', '2000');
INSERT INTO `gestibankdb`.`comptetest` (`idCompte`, `description`, `solde`) VALUES (3, 'LA', '500');

-- Table "ClientTest_CompteTest"
INSERT INTO `gestibankdb`.`clienttest_comptetest` (`ClientTest_idClient`, `comptes_idCompte`) VALUES ('1', '1');
INSERT INTO `gestibankdb`.`clienttest_comptetest` (`ClientTest_idClient`, `comptes_idCompte`) VALUES ('2', '2');
INSERT INTO `gestibankdb`.`clienttest_comptetest` (`ClientTest_idClient`, `comptes_idCompte`) VALUES ('2', '3');

-- 2-Base de données "GestiBank"

-- 2-1-Utilisateurs

-- Table "Identite"
INSERT INTO `gestibankdb`.`Identite` (`idIdentite`, `dateNaissance`, `nom`, `prenom`, `titreCivilite`) VALUES ('1', '1879-03-14 00:00:00', 'Einstein', 'Albert', 'Monsieur');
INSERT INTO `gestibankdb`.`Identite` (`idIdentite`, `dateNaissance`, `nom`, `prenom`, `titreCivilite`) VALUES ('2', '1879-11-07 00:00:00', 'Curie', 'Marie', 'Madame');
INSERT INTO `gestibankdb`.`Identite` (`idIdentite`, `dateNaissance`, `nom`, `prenom`, `titreCivilite`) VALUES ('3', '1844-10-15 00:00:00', 'Nietzsche', 'Friedrich', 'Monsieur');
INSERT INTO `gestibankdb`.`Identite` (`idIdentite`, `dateNaissance`, `nom`, `prenom`, `titreCivilite`) VALUES ('4', '1913-11-07 00:00:00', 'Camus', 'Albert', 'Monsieur');
INSERT INTO `gestibankdb`.`Identite` (`idIdentite`, `dateNaissance`, `nom`, `prenom`, `titreCivilite`) VALUES ('5', '1881-10-30 00:00:00', 'Dostoievski', 'Fiodor', 'Monsieur');
INSERT INTO `gestibankdb`.`Identite` (`idIdentite`, `dateNaissance`, `nom`, `prenom`, `titreCivilite`) VALUES ('6', '1908-01-09 00:00:00', 'DeBeauvoir', 'Simone', 'Madame');
INSERT INTO `gestibankdb`.`Identite` (`idIdentite`, `dateNaissance`, `nom`, `prenom`, `titreCivilite`) VALUES ('7', '1903-06-08 00:00:00', 'Yourcenar', 'Marguerite', 'Madame');

-- Table "Adresse"
INSERT INTO `gestibankdb`.`Adresse` (`idAdresse`, `codePostal`, `complementAdresse`, `libelleVoie`, `numeroVoie`, `pays`, `ville`) VALUES ('1', '75001', NULL, 'Avenue de la relativite', '5', 'France', 'Paris');
INSERT INTO `gestibankdb`.`Adresse` (`idAdresse`, `codePostal`, `complementAdresse`, `libelleVoie`, `numeroVoie`, `pays`, `ville`) VALUES ('2', '75002', NULL, 'Rue de la radiactivite', '14', 'France', 'Paris');
INSERT INTO `gestibankdb`.`Adresse` (`idAdresse`, `codePostal`, `complementAdresse`, `libelleVoie`, `numeroVoie`, `pays`, `ville`) VALUES ('3', '75003', NULL, 'Rue du surhomme', '36', 'France', 'Paris');
INSERT INTO `gestibankdb`.`Adresse` (`idAdresse`, `codePostal`, `complementAdresse`, `libelleVoie`, `numeroVoie`, `pays`, `ville`) VALUES ('4', '75004', NULL, 'Boulevard de la peste', '8', 'France', 'Paris');
INSERT INTO `gestibankdb`.`Adresse` (`idAdresse`, `codePostal`, `complementAdresse`, `libelleVoie`, `numeroVoie`, `pays`, `ville`) VALUES ('5', '75005', NULL, 'Avenue des chatiments', '98', 'France', 'Paris');
INSERT INTO `gestibankdb`.`Adresse` (`idAdresse`, `codePostal`, `complementAdresse`, `libelleVoie`, `numeroVoie`, `pays`, `ville`) VALUES ('6', '75006', NULL, 'Faubourg Jean-Paul Sartre', '53', 'France', 'Paris');
INSERT INTO `gestibankdb`.`Adresse` (`idAdresse`, `codePostal`, `complementAdresse`, `libelleVoie`, `numeroVoie`, `pays`, `ville`) VALUES ('7', '75007', NULL, 'Place Hadrien', '22', 'France', 'Paris');

-- Table "Contact"
INSERT INTO `gestibankdb`.`Contact` (`idContact`, `email`, `telephone`, `adresse_idAdresse`) VALUES ('1', 'albert.einstein@gmail.com', '06-01-01-01-01', '1');
INSERT INTO `gestibankdb`.`Contact` (`idContact`, `email`, `telephone`, `adresse_idAdresse`) VALUES ('2', 'marie.curie@gmail.com', '06-02-02-02-02', '2');
INSERT INTO `gestibankdb`.`Contact` (`idContact`, `email`, `telephone`, `adresse_idAdresse`) VALUES ('3', 'friderich.nietzsche@gmail.com', '06-03-03-03-03', '3');
INSERT INTO `gestibankdb`.`Contact` (`idContact`, `email`, `telephone`, `adresse_idAdresse`) VALUES ('4', 'albert.camus@gmail.com', '06-04-04-04-04', '4');
INSERT INTO `gestibankdb`.`Contact` (`idContact`, `email`, `telephone`, `adresse_idAdresse`) VALUES ('5', 'fiodor.dostoievski@gmail.com', '06-05-05-05-05', '5');
INSERT INTO `gestibankdb`.`Contact` (`idContact`, `email`, `telephone`, `adresse_idAdresse`) VALUES ('6', 'simone.debeauvoir@gmail.com', '06-06-06-06-06', '6');
INSERT INTO `gestibankdb`.`Contact` (`idContact`, `email`, `telephone`, `adresse_idAdresse`) VALUES ('7', 'marguerite.yourcenar@gmail.com', '06-07-07-07-07', '7');

-- Table "Documents"
INSERT INTO `gestibankdb`.`documents` (`idDocuments`, `justificatifDomicile`, `pieceIdentite`) VALUES ('1', 'justificatifDomicile1', 'pieceIdentite1');
INSERT INTO `gestibankdb`.`documents` (`idDocuments`, `justificatifDomicile`, `pieceIdentite`) VALUES ('2', 'justificatifDomicile2', 'pieceIdentite2');
INSERT INTO `gestibankdb`.`documents` (`idDocuments`, `justificatifDomicile`, `pieceIdentite`) VALUES ('3', 'justificatifDomicile3', 'pieceIdentite3');
INSERT INTO `gestibankdb`.`documents` (`idDocuments`, `justificatifDomicile`, `pieceIdentite`) VALUES ('4', 'justificatifDomicile4', 'pieceIdentite4');

-- Table "SituationFamiliale"
INSERT INTO `gestibankdb`.`situationfamiliale` (`idSituationFamiliale`, `nombreEnfants`, `situationMatrimoniale`) VALUES ('1', '2', 'Marie');
INSERT INTO `gestibankdb`.`situationfamiliale` (`idSituationFamiliale`, `nombreEnfants`, `situationMatrimoniale`) VALUES ('2', '1', 'Celibataire');
INSERT INTO `gestibankdb`.`situationfamiliale` (`idSituationFamiliale`, `nombreEnfants`, `situationMatrimoniale`) VALUES ('3', '0', 'Celibataire');
INSERT INTO `gestibankdb`.`situationfamiliale` (`idSituationFamiliale`, `nombreEnfants`, `situationMatrimoniale`) VALUES ('4', '3', 'Mariee');

-- Table "Utilisateur"
INSERT INTO `Utilisateur` (`heritage`, `idUtilisateur`, `statut`, `motDePasse`, `nomUtilisateur`, `dateFermetureCompte`, `dateOuvertureCompte`, `dateDebutContrat`, `dateFinContrat`, `contact_idContact`, `identite_idIdentite`, `documents_idDocuments`, `situationFamiliale_idSituationFamiliale`) VALUES ('admin', '1', 'ouvert', 'admin', 'admin', NULL, NULL, '2018-07-01 00:00:00', NULL, '1', '1', NULL, NULL);
INSERT INTO `Utilisateur` (`heritage`, `idUtilisateur`, `statut`, `motDePasse`, `nomUtilisateur`, `dateFermetureCompte`, `dateOuvertureCompte`, `dateDebutContrat`, `dateFinContrat`, `contact_idContact`, `identite_idIdentite`, `documents_idDocuments`, `situationFamiliale_idSituationFamiliale`) VALUES ('conseiller', '2', 'ouvert', 'conseiller1', 'conseiller3', NULL, NULL, '2018-07-03 00:00:00', NULL, '2', '2', NULL, NULL);
INSERT INTO `Utilisateur` (`heritage`, `idUtilisateur`, `statut`, `motDePasse`, `nomUtilisateur`, `dateFermetureCompte`, `dateOuvertureCompte`, `dateDebutContrat`, `dateFinContrat`, `contact_idContact`, `identite_idIdentite`, `documents_idDocuments`, `situationFamiliale_idSituationFamiliale`) VALUES ('conseiller', '3', 'ouvert', 'conseiller2', 'conseiller4', NULL, NULL, '2018-07-04 00:00:00', NULL, '3', '3', NULL, NULL);
INSERT INTO `Utilisateur` (`heritage`, `idUtilisateur`, `statut`, `motDePasse`, `nomUtilisateur`, `dateFermetureCompte`, `dateOuvertureCompte`, `dateDebutContrat`, `dateFinContrat`, `contact_idContact`, `identite_idIdentite`, `documents_idDocuments`, `situationFamiliale_idSituationFamiliale`) VALUES ('client', '4', 'ouvert', 'client1', 'client1', NULL, '2018-07-05 00:00:00', NULL, NULL, '4', '4', '1', '1');
INSERT INTO `Utilisateur` (`heritage`, `idUtilisateur`, `statut`, `motDePasse`, `nomUtilisateur`, `dateFermetureCompte`, `dateOuvertureCompte`, `dateDebutContrat`, `dateFinContrat`, `contact_idContact`, `identite_idIdentite`, `documents_idDocuments`, `situationFamiliale_idSituationFamiliale`) VALUES ('client', '5', 'ouvert', 'client2', 'client2', NULL, '2018-07-06 00:00:00', NULL, NULL, '5', '5', '2', '2');
INSERT INTO `Utilisateur` (`heritage`, `idUtilisateur`, `statut`, `motDePasse`, `nomUtilisateur`, `dateFermetureCompte`, `dateOuvertureCompte`, `dateDebutContrat`, `dateFinContrat`, `contact_idContact`, `identite_idIdentite`, `documents_idDocuments`, `situationFamiliale_idSituationFamiliale`) VALUES ('client', '6', 'ouvert', 'client3', 'client3', NULL, '2018-07-07 00:00:00', NULL, NULL, '6', '6', '3', '3');
INSERT INTO `Utilisateur` (`heritage`, `idUtilisateur`, `statut`, `motDePasse`, `nomUtilisateur`, `dateFermetureCompte`, `dateOuvertureCompte`, `dateDebutContrat`, `dateFinContrat`, `contact_idContact`, `identite_idIdentite`, `documents_idDocuments`, `situationFamiliale_idSituationFamiliale`) VALUES ('client', '7', 'ouvert', 'client4', 'client4', NULL, '2018-07-08 00:00:00', NULL, NULL, '7', '7', '4', '4');

-- 2-2-Comptes

-- Table "Operation"
INSERT INTO `gestibankdb`.`operationbancaire` (`heritage`, `idOperation`, `dateOperation`, `libelleOperation`, `montantOperation`) VALUES ('operationCredit', '1', '2018-07-09 00:00:00', 'salaire', '2000');

-- Table "Comptes"
INSERT INTO `gestibankdb`.`operationbancaire` (`heritage`, `idOperation`, `dateOperation`, `libelleOperation`, `montantOperation`) VALUES ('', NULL, NULL, NULL, '');








