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
INSERT INTO `gestibankdb`.`Identite` (`idIdentite`, `dateNaissance`, `nom`, `prenom`, `titreCivilite`) VALUES ('1', '1970-01-01 00:00:00', 'Einstein', 'Albert', 'Monsieur');

INSERT INTO `gestibankdb`.`Identite` (`idIdentite`, `dateNaissance`, `nom`, `prenom`, `titreCivilite`) VALUES ('2', '1970-02-02 00:00:00', 'Curie', 'Marie', 'Madame');
INSERT INTO `gestibankdb`.`Identite` (`idIdentite`, `dateNaissance`, `nom`, `prenom`, `titreCivilite`) VALUES ('3', '1970-03-03 00:00:00', 'Nietzsche', 'Friedrich', 'Monsieur');

INSERT INTO `gestibankdb`.`Identite` (`idIdentite`, `dateNaissance`, `nom`, `prenom`, `titreCivilite`) VALUES ('4', '1970-04-04 00:00:00', 'Camus', 'Albert', 'Monsieur');
INSERT INTO `gestibankdb`.`Identite` (`idIdentite`, `dateNaissance`, `nom`, `prenom`, `titreCivilite`) VALUES ('5', '1970-05-05 00:00:00', 'Dostoievski', 'Fiodor', 'Monsieur');
INSERT INTO `gestibankdb`.`Identite` (`idIdentite`, `dateNaissance`, `nom`, `prenom`, `titreCivilite`) VALUES ('6', '1970-06-06 00:00:00', 'DeBeauvoir', 'Simone', 'Madame');
INSERT INTO `gestibankdb`.`Identite` (`idIdentite`, `dateNaissance`, `nom`, `prenom`, `titreCivilite`) VALUES ('7', '1970-07-07 00:00:00', 'Yourcenar', 'Marguerite', 'Madame');

INSERT INTO `gestibankdb`.`Identite` (`idIdentite`, `dateNaissance`, `nom`, `prenom`, `titreCivilite`) VALUES ('8', '1970-08-08 00:00:00', 'Galois', 'Evariste', 'Monsieur');
INSERT INTO `gestibankdb`.`Identite` (`idIdentite`, `dateNaissance`, `nom`, `prenom`, `titreCivilite`) VALUES ('9', '1970-09-09 00:00:00', 'Spinoza', 'Baruch', 'Monsieur');

-- Table "Adresse"
INSERT INTO `gestibankdb`.`Adresse` (`idAdresse`, `codePostal`, `complementAdresse`, `libelleVoie`, `numeroVoie`, `pays`, `ville`) VALUES ('1', '75001', NULL, 'Avenue de la relativite', '5', 'France', 'Paris');

INSERT INTO `gestibankdb`.`Adresse` (`idAdresse`, `codePostal`, `complementAdresse`, `libelleVoie`, `numeroVoie`, `pays`, `ville`) VALUES ('2', '75002', NULL, 'Rue de la radiactivite', '14', 'France', 'Paris');
INSERT INTO `gestibankdb`.`Adresse` (`idAdresse`, `codePostal`, `complementAdresse`, `libelleVoie`, `numeroVoie`, `pays`, `ville`) VALUES ('3', '75003', NULL, 'Rue du surhomme', '36', 'France', 'Paris');

INSERT INTO `gestibankdb`.`Adresse` (`idAdresse`, `codePostal`, `complementAdresse`, `libelleVoie`, `numeroVoie`, `pays`, `ville`) VALUES ('4', '75004', NULL, 'Boulevard de la peste', '8', 'France', 'Paris');
INSERT INTO `gestibankdb`.`Adresse` (`idAdresse`, `codePostal`, `complementAdresse`, `libelleVoie`, `numeroVoie`, `pays`, `ville`) VALUES ('5', '75005', NULL, 'Avenue des chatiments', '98', 'France', 'Paris');
INSERT INTO `gestibankdb`.`Adresse` (`idAdresse`, `codePostal`, `complementAdresse`, `libelleVoie`, `numeroVoie`, `pays`, `ville`) VALUES ('6', '75006', NULL, 'Faubourg Jean-Paul Sartre', '53', 'France', 'Paris');
INSERT INTO `gestibankdb`.`Adresse` (`idAdresse`, `codePostal`, `complementAdresse`, `libelleVoie`, `numeroVoie`, `pays`, `ville`) VALUES ('7', '75007', NULL, 'Place Hadrien', '22', 'France', 'Paris');

INSERT INTO `gestibankdb`.`Adresse` (`idAdresse`, `codePostal`, `complementAdresse`, `libelleVoie`, `numeroVoie`, `pays`, `ville`) VALUES ('8', '75008', NULL, 'Place Algebre', '48', 'France', 'Paris');
INSERT INTO `gestibankdb`.`Adresse` (`idAdresse`, `codePostal`, `complementAdresse`, `libelleVoie`, `numeroVoie`, `pays`, `ville`) VALUES ('9', '75009', NULL, 'Faubourg du bien et du mal ', '63', 'France', 'Paris');

INSERT INTO `gestibankdb`.`Adresse` (`idAdresse`, `codePostal`, `complementAdresse`, `libelleVoie`, `numeroVoie`, `pays`, `ville`) VALUES ('10', '75010', NULL, 'Place des justes', '35', 'France', 'Paris');
INSERT INTO `gestibankdb`.`Adresse` (`idAdresse`, `codePostal`, `complementAdresse`, `libelleVoie`, `numeroVoie`, `pays`, `ville`) VALUES ('11', '75011', NULL, 'Faubourg Karamazov', '5', 'France', 'Paris');

-- Table "Contact"
INSERT INTO `gestibankdb`.`Contact` (`idContact`, `email`, `telephone`, `adresse_idAdresse`) VALUES ('1', 'albert.einstein@gmail.com', '06-01-01-01-01', '1');

INSERT INTO `gestibankdb`.`Contact` (`idContact`, `email`, `telephone`, `adresse_idAdresse`) VALUES ('2', 'marie.curie@gmail.com', '06-02-02-02-02', '2');
INSERT INTO `gestibankdb`.`Contact` (`idContact`, `email`, `telephone`, `adresse_idAdresse`) VALUES ('3', 'friderich.nietzsche@gmail.com', '06-03-03-03-03', '3');

INSERT INTO `gestibankdb`.`Contact` (`idContact`, `email`, `telephone`, `adresse_idAdresse`) VALUES ('4', 'albert.camus@gmail.com', '06-04-04-04-04', '4');
INSERT INTO `gestibankdb`.`Contact` (`idContact`, `email`, `telephone`, `adresse_idAdresse`) VALUES ('5', 'fiodor.dostoievski@gmail.com', '06-05-05-05-05', '5');
INSERT INTO `gestibankdb`.`Contact` (`idContact`, `email`, `telephone`, `adresse_idAdresse`) VALUES ('6', 'simone.debeauvoir@gmail.com', '06-06-06-06-06', '6');
INSERT INTO `gestibankdb`.`Contact` (`idContact`, `email`, `telephone`, `adresse_idAdresse`) VALUES ('7', 'marguerite.yourcenar@gmail.com', '06-07-07-07-07', '7');

INSERT INTO `gestibankdb`.`Contact` (`idContact`, `email`, `telephone`, `adresse_idAdresse`) VALUES ('8', 'evariste.galois@gmail.com', '06-08-08-08-08', '8');
INSERT INTO `gestibankdb`.`Contact` (`idContact`, `email`, `telephone`, `adresse_idAdresse`) VALUES ('9', 'baruch.spinoza@gmail.com', '06-09-09-09-09', '9');

INSERT INTO `gestibankdb`.`Contact` (`idContact`, `email`, `telephone`, `adresse_idAdresse`) VALUES ('10', 'albert.camus@gmail.com', '06-04-04-04-04', '10');
INSERT INTO `gestibankdb`.`Contact` (`idContact`, `email`, `telephone`, `adresse_idAdresse`) VALUES ('11', 'fiodor.dostoievski@gmail.com', '06-05-05-05-05', '11');

-- Table "Documents"
INSERT INTO `gestibankdb`.`documents` (`idDocuments`, `justificatifDomicile`, `pieceIdentite`) VALUES ('1', 'justificatifDomicile1', 'pieceIdentite1');
INSERT INTO `gestibankdb`.`documents` (`idDocuments`, `justificatifDomicile`, `pieceIdentite`) VALUES ('2', 'justificatifDomicile2', 'pieceIdentite2');
INSERT INTO `gestibankdb`.`documents` (`idDocuments`, `justificatifDomicile`, `pieceIdentite`) VALUES ('3', 'justificatifDomicile3', 'pieceIdentite3');
INSERT INTO `gestibankdb`.`documents` (`idDocuments`, `justificatifDomicile`, `pieceIdentite`) VALUES ('4', 'justificatifDomicile4', 'pieceIdentite4');

INSERT INTO `gestibankdb`.`documents` (`idDocuments`, `justificatifDomicile`, `pieceIdentite`) VALUES ('5', 'justificatifDomicile5', 'pieceIdentite5');
INSERT INTO `gestibankdb`.`documents` (`idDocuments`, `justificatifDomicile`, `pieceIdentite`) VALUES ('6', 'justificatifDomicile6', 'pieceIdentite6');

-- Table "SituationFamiliale"
INSERT INTO `gestibankdb`.`situationfamiliale` (`idSituationFamiliale`, `nombreEnfants`, `situationMatrimoniale`) VALUES ('1', '2', 'Marie');
INSERT INTO `gestibankdb`.`situationfamiliale` (`idSituationFamiliale`, `nombreEnfants`, `situationMatrimoniale`) VALUES ('2', '1', 'Celibataire');
INSERT INTO `gestibankdb`.`situationfamiliale` (`idSituationFamiliale`, `nombreEnfants`, `situationMatrimoniale`) VALUES ('3', '0', 'Celibataire');
INSERT INTO `gestibankdb`.`situationfamiliale` (`idSituationFamiliale`, `nombreEnfants`, `situationMatrimoniale`) VALUES ('4', '3', 'Mariee');

INSERT INTO `gestibankdb`.`situationfamiliale` (`idSituationFamiliale`, `nombreEnfants`, `situationMatrimoniale`) VALUES ('5', '2', 'Celibataire');
INSERT INTO `gestibankdb`.`situationfamiliale` (`idSituationFamiliale`, `nombreEnfants`, `situationMatrimoniale`) VALUES ('6', '0', 'Mariee');

-- Table "Utilisateur"
INSERT INTO `Utilisateur` (`heritage`, `idUtilisateur`, `statut`, `motDePasse`, `nomUtilisateur`, `dateFermetureCompte`, `dateOuvertureCompte`, `dateDebutContrat`, `dateFinContrat`, `contact_idContact`, `identite_idIdentite`, `documents_idDocuments`, `situationFamiliale_idSituationFamiliale`) VALUES ('admin', '1', 'ouvert', 'admin', 'admin', NULL, NULL, '2018-07-01 00:00:00', NULL, '1', '1', NULL, NULL);

INSERT INTO `Utilisateur` (`heritage`, `idUtilisateur`, `statut`, `motDePasse`, `nomUtilisateur`, `dateFermetureCompte`, `dateOuvertureCompte`, `dateDebutContrat`, `dateFinContrat`, `contact_idContact`, `identite_idIdentite`, `documents_idDocuments`, `situationFamiliale_idSituationFamiliale`) VALUES ('conseiller', '2', 'ouvert', 'conseiller1', 'conseiller1', NULL, NULL, '2018-07-03 00:00:00', NULL, '2', '2', NULL, NULL);
INSERT INTO `Utilisateur` (`heritage`, `idUtilisateur`, `statut`, `motDePasse`, `nomUtilisateur`, `dateFermetureCompte`, `dateOuvertureCompte`, `dateDebutContrat`, `dateFinContrat`, `contact_idContact`, `identite_idIdentite`, `documents_idDocuments`, `situationFamiliale_idSituationFamiliale`) VALUES ('conseiller', '3', 'ouvert', 'conseiller2', 'conseiller2', NULL, NULL, '2018-07-04 00:00:00', NULL, '3', '3', NULL, NULL);

INSERT INTO `Utilisateur` (`heritage`, `idUtilisateur`, `statut`, `motDePasse`, `nomUtilisateur`, `dateFermetureCompte`, `dateOuvertureCompte`, `dateDebutContrat`, `dateFinContrat`, `contact_idContact`, `identite_idIdentite`, `documents_idDocuments`, `situationFamiliale_idSituationFamiliale`) VALUES ('client', '4', 'ouvert', 'client1', 'client1', NULL, '2018-07-05 00:00:00', NULL, NULL, '4', '4', '1', '1');
INSERT INTO `Utilisateur` (`heritage`, `idUtilisateur`, `statut`, `motDePasse`, `nomUtilisateur`, `dateFermetureCompte`, `dateOuvertureCompte`, `dateDebutContrat`, `dateFinContrat`, `contact_idContact`, `identite_idIdentite`, `documents_idDocuments`, `situationFamiliale_idSituationFamiliale`) VALUES ('client', '5', 'ouvert', 'client2', 'client2', NULL, '2018-07-06 00:00:00', NULL, NULL, '5', '5', '2', '2');
INSERT INTO `Utilisateur` (`heritage`, `idUtilisateur`, `statut`, `motDePasse`, `nomUtilisateur`, `dateFermetureCompte`, `dateOuvertureCompte`, `dateDebutContrat`, `dateFinContrat`, `contact_idContact`, `identite_idIdentite`, `documents_idDocuments`, `situationFamiliale_idSituationFamiliale`) VALUES ('client', '6', 'ouvert', 'client3', 'client3', NULL, '2018-07-07 00:00:00', NULL, NULL, '6', '6', '3', '3');
INSERT INTO `Utilisateur` (`heritage`, `idUtilisateur`, `statut`, `motDePasse`, `nomUtilisateur`, `dateFermetureCompte`, `dateOuvertureCompte`, `dateDebutContrat`, `dateFinContrat`, `contact_idContact`, `identite_idIdentite`, `documents_idDocuments`, `situationFamiliale_idSituationFamiliale`) VALUES ('client', '7', 'ouvert', 'client4', 'client4', NULL, '2018-07-08 00:00:00', NULL, NULL, '7', '7', '4', '4');

INSERT INTO `Utilisateur` (`heritage`, `idUtilisateur`, `statut`, `motDePasse`, `nomUtilisateur`, `dateFermetureCompte`, `dateOuvertureCompte`, `dateDebutContrat`, `dateFinContrat`, `contact_idContact`, `identite_idIdentite`, `documents_idDocuments`, `situationFamiliale_idSituationFamiliale`) VALUES ('client', '8', 'inscription', 'client5', 'client5', NULL, NULL, NULL, NULL, '8', '8', '5', '5');
INSERT INTO `Utilisateur` (`heritage`, `idUtilisateur`, `statut`, `motDePasse`, `nomUtilisateur`, `dateFermetureCompte`, `dateOuvertureCompte`, `dateDebutContrat`, `dateFinContrat`, `contact_idContact`, `identite_idIdentite`, `documents_idDocuments`, `situationFamiliale_idSituationFamiliale`) VALUES ('client', '9', 'inscription', 'client6', 'client6', NULL, NULL, NULL, NULL, '9', '9', '6', '6');

INSERT INTO `Utilisateur` (`heritage`, `idUtilisateur`, `statut`, `motDePasse`, `nomUtilisateur`, `dateFermetureCompte`, `dateOuvertureCompte`, `dateDebutContrat`, `dateFinContrat`, `contact_idContact`, `identite_idIdentite`, `documents_idDocuments`, `situationFamiliale_idSituationFamiliale`) VALUES ('client', '10', 'modification', 'client1', 'client1', NULL, '2018-07-05 00:00:00', NULL, NULL, '10', '4', '1', '1');
INSERT INTO `Utilisateur` (`heritage`, `idUtilisateur`, `statut`, `motDePasse`, `nomUtilisateur`, `dateFermetureCompte`, `dateOuvertureCompte`, `dateDebutContrat`, `dateFinContrat`, `contact_idContact`, `identite_idIdentite`, `documents_idDocuments`, `situationFamiliale_idSituationFamiliale`) VALUES ('client', '11', 'modification', 'client2', 'client2', NULL, '2018-07-06 00:00:00', NULL, NULL, '11', '5', '2', '2');

-- 2-2-Comptes

-- Table "Comptes"
INSERT INTO `gestibankdb`.`compte` (`heritage`, `idCompte`, `solde`, `statut`, `tauxRenumeration`, `rib`, `entreeMensuelle`, `montantDecouvert`) VALUES ('compteCourantSansDecouvert', '1', '1480', true, '0', 'rib1', '0', '0');
INSERT INTO `gestibankdb`.`compte` (`heritage`, `idCompte`, `solde`, `statut`, `tauxRenumeration`, `rib`, `entreeMensuelle`, `montantDecouvert`) VALUES ('compteCourantAvecDecouvert', '2', '320', true, '0', NULL, '500', '200');
INSERT INTO `gestibankdb`.`compte` (`heritage`, `idCompte`, `solde`, `statut`, `tauxRenumeration`, `rib`, `entreeMensuelle`, `montantDecouvert`) VALUES ('compteRemunerateur', '3', '500', true, '2', NULL, '0', '0');

INSERT INTO `gestibankdb`.`compte` (`heritage`, `idCompte`, `solde`, `statut`, `tauxRenumeration`, `rib`, `entreeMensuelle`, `montantDecouvert`) VALUES ('compteCourantSansDecouvert', '4', '1980', true, '0', 'rib2', '0', '0');
INSERT INTO `gestibankdb`.`compte` (`heritage`, `idCompte`, `solde`, `statut`, `tauxRenumeration`, `rib`, `entreeMensuelle`, `montantDecouvert`) VALUES ('compteCourantAvecDecouvert', '5', '320', true, '0', NULL, '1000', '400');
INSERT INTO `gestibankdb`.`compte` (`heritage`, `idCompte`, `solde`, `statut`, `tauxRenumeration`, `rib`, `entreeMensuelle`, `montantDecouvert`) VALUES ('compteRemunerateur', '6', '0', false, '2', NULL, '0', '0');

INSERT INTO `gestibankdb`.`compte` (`heritage`, `idCompte`, `solde`, `statut`, `tauxRenumeration`, `rib`, `entreeMensuelle`, `montantDecouvert`) VALUES ('compteCourantSansDecouvert', '7', '1980', true, '0', 'rib3', '0', '0');
INSERT INTO `gestibankdb`.`compte` (`heritage`, `idCompte`, `solde`, `statut`, `tauxRenumeration`, `rib`, `entreeMensuelle`, `montantDecouvert`) VALUES ('compteCourantAvecDecouvert', '8', '0', false, '0', NULL, '0', '0');
INSERT INTO `gestibankdb`.`compte` (`heritage`, `idCompte`, `solde`, `statut`, `tauxRenumeration`, `rib`, `entreeMensuelle`, `montantDecouvert`) VALUES ('compteRemunerateur', '9', '500', true, '2', NULL, '0', '0');

INSERT INTO `gestibankdb`.`compte` (`heritage`, `idCompte`, `solde`, `statut`, `tauxRenumeration`, `rib`, `entreeMensuelle`, `montantDecouvert`) VALUES ('compteCourantSansDecouvert', '10', '2480', true, '0', 'rib4', '0', '0');
INSERT INTO `gestibankdb`.`compte` (`heritage`, `idCompte`, `solde`, `statut`, `tauxRenumeration`, `rib`, `entreeMensuelle`, `montantDecouvert`) VALUES ('compteCourantAvecDecouvert', '11', '0', false, '0', NULL, '0', '0');
INSERT INTO `gestibankdb`.`compte` (`heritage`, `idCompte`, `solde`, `statut`, `tauxRenumeration`, `rib`, `entreeMensuelle`, `montantDecouvert`) VALUES ('compteRemunerateur', '12', '0', false, '2', NULL, '0', '0');

INSERT INTO `gestibankdb`.`compte` (`heritage`, `idCompte`, `solde`, `statut`, `tauxRenumeration`, `rib`, `entreeMensuelle`, `montantDecouvert`) VALUES ('compteCourantSansDecouvert', '13', '0', true, '0', 'rib5', '0', '0');
INSERT INTO `gestibankdb`.`compte` (`heritage`, `idCompte`, `solde`, `statut`, `tauxRenumeration`, `rib`, `entreeMensuelle`, `montantDecouvert`) VALUES ('compteCourantAvecDecouvert', '14', '0', false, '0', NULL, '0', '0');
INSERT INTO `gestibankdb`.`compte` (`heritage`, `idCompte`, `solde`, `statut`, `tauxRenumeration`, `rib`, `entreeMensuelle`, `montantDecouvert`) VALUES ('compteRemunerateur', '15', '0', false, '2', NULL, '0', '0');

INSERT INTO `gestibankdb`.`compte` (`heritage`, `idCompte`, `solde`, `statut`, `tauxRenumeration`, `rib`, `entreeMensuelle`, `montantDecouvert`) VALUES ('compteCourantSansDecouvert', '16', '0', true, '0', 'rib5', '0', '0');
INSERT INTO `gestibankdb`.`compte` (`heritage`, `idCompte`, `solde`, `statut`, `tauxRenumeration`, `rib`, `entreeMensuelle`, `montantDecouvert`) VALUES ('compteCourantAvecDecouvert', '17', '0', false, '0', NULL, '0', '0');
INSERT INTO `gestibankdb`.`compte` (`heritage`, `idCompte`, `solde`, `statut`, `tauxRenumeration`, `rib`, `entreeMensuelle`, `montantDecouvert`) VALUES ('compteRemunerateur', '18', '0', false, '2', NULL, '0', '0');

-- Table "OperationBancaire"
INSERT INTO `gestibankdb`.`operationbancaire` (`heritage`, `idOperation`, `dateOperation`, `libelleOperation`, `montantOperation`) VALUES ('operationCredit', '1', '2018-07-09 00:00:00', 'salaire', '3000');
INSERT INTO `gestibankdb`.`operationbancaire` (`heritage`, `idOperation`, `dateOperation`, `libelleOperation`, `montantOperation`) VALUES ('operationDebit', '2', '2018-07-10 00:00:00', 'ordinateur', '500');
INSERT INTO `gestibankdb`.`operationbancaire` (`heritage`, `idOperation`, `dateOperation`, `libelleOperation`, `montantOperation`) VALUES ('operationDebit', '3', '2018-07-11 00:00:00', 'jeans', '100');
INSERT INTO `gestibankdb`.`operationbancaire` (`heritage`, `idOperation`, `dateOperation`, `libelleOperation`, `montantOperation`) VALUES ('operationDebit', '4', '2018-07-12 00:00:00', 'restaurant', '50');
INSERT INTO `gestibankdb`.`operationbancaire` (`heritage`, `idOperation`, `dateOperation`, `libelleOperation`, `montantOperation`) VALUES ('operationDebit', '5', '2018-07-13 00:00:00', 'epargne CR', '300');
INSERT INTO `gestibankdb`.`operationbancaire` (`heritage`, `idOperation`, `dateOperation`, `libelleOperation`, `montantOperation`) VALUES ('operationCredit', '6', '2018-07-14 00:00:00', 'prime vacances', '500');
INSERT INTO `gestibankdb`.`operationbancaire` (`heritage`, `idOperation`, `dateOperation`, `libelleOperation`, `montantOperation`) VALUES ('operationDebit', '7', '2018-07-15 00:00:00', 'virement CCAD', '500');
INSERT INTO `gestibankdb`.`operationbancaire` (`heritage`, `idOperation`, `dateOperation`, `libelleOperation`, `montantOperation`) VALUES ('operationDebit', '8', '2018-07-16 00:00:00', 'reparation voiture', '300');
INSERT INTO `gestibankdb`.`operationbancaire` (`heritage`, `idOperation`, `dateOperation`, `libelleOperation`, `montantOperation`) VALUES ('operationDebit', '9', '2018-07-17 00:00:00', 'chaussures', '70');
INSERT INTO `gestibankdb`.`operationbancaire` (`heritage`, `idOperation`, `dateOperation`, `libelleOperation`, `montantOperation`) VALUES ('operationDebit', '10', '2018-07-18 00:00:00', 'epargne CR', '200');

INSERT INTO `gestibankdb`.`operationbancaire` (`heritage`, `idOperation`, `dateOperation`, `libelleOperation`, `montantOperation`) VALUES ('operationCredit', '11', '2018-07-16 00:00:00', 'virement CCSD', '500');
INSERT INTO `gestibankdb`.`operationbancaire` (`heritage`, `idOperation`, `dateOperation`, `libelleOperation`, `montantOperation`) VALUES ('operationDebit', '12', '2018-07-17 00:00:00', 'autoroute', '30');
INSERT INTO `gestibankdb`.`operationbancaire` (`heritage`, `idOperation`, `dateOperation`, `libelleOperation`, `montantOperation`) VALUES ('operationDebit', '13', '2018-07-18 00:00:00', 'essence', '60');
INSERT INTO `gestibankdb`.`operationbancaire` (`heritage`, `idOperation`, `dateOperation`, `libelleOperation`, `montantOperation`) VALUES ('operationDebit', '14', '2018-07-19 00:00:00', 'glaces', '20');
INSERT INTO `gestibankdb`.`operationbancaire` (`heritage`, `idOperation`, `dateOperation`, `libelleOperation`, `montantOperation`) VALUES ('operationDebit', '15', '2018-07-20 00:00:00', 'bar', '70');

INSERT INTO `gestibankdb`.`operationbancaire` (`heritage`, `idOperation`, `dateOperation`, `libelleOperation`, `montantOperation`) VALUES ('operationCredit', '16', '2018-07-14 00:00:00', 'epargne CCSD', '300');
INSERT INTO `gestibankdb`.`operationbancaire` (`heritage`, `idOperation`, `dateOperation`, `libelleOperation`, `montantOperation`) VALUES ('operationCredit', '17', '2018-07-19 00:00:00', 'epargne CCSD', '200');

INSERT INTO `gestibankdb`.`operationbancaire` (`heritage`, `idOperation`, `dateOperation`, `libelleOperation`, `montantOperation`) VALUES ('operationCredit', '18', '2018-07-09 00:00:00', 'salaire', '3000');
INSERT INTO `gestibankdb`.`operationbancaire` (`heritage`, `idOperation`, `dateOperation`, `libelleOperation`, `montantOperation`) VALUES ('operationDebit', '19', '2018-07-10 00:00:00', 'ordinateur', '500');
INSERT INTO `gestibankdb`.`operationbancaire` (`heritage`, `idOperation`, `dateOperation`, `libelleOperation`, `montantOperation`) VALUES ('operationDebit', '20', '2018-07-11 00:00:00', 'jeans', '100');
INSERT INTO `gestibankdb`.`operationbancaire` (`heritage`, `idOperation`, `dateOperation`, `libelleOperation`, `montantOperation`) VALUES ('operationDebit', '21', '2018-07-12 00:00:00', 'restaurant', '50');
INSERT INTO `gestibankdb`.`operationbancaire` (`heritage`, `idOperation`, `dateOperation`, `libelleOperation`, `montantOperation`) VALUES ('operationCredit', '22', '2018-07-14 00:00:00', 'prime vacances', '500');
INSERT INTO `gestibankdb`.`operationbancaire` (`heritage`, `idOperation`, `dateOperation`, `libelleOperation`, `montantOperation`) VALUES ('operationDebit', '23', '2018-07-15 00:00:00', 'virement CCAD', '500');
INSERT INTO `gestibankdb`.`operationbancaire` (`heritage`, `idOperation`, `dateOperation`, `libelleOperation`, `montantOperation`) VALUES ('operationDebit', '24', '2018-07-16 00:00:00', 'reparation voiture', '300');
INSERT INTO `gestibankdb`.`operationbancaire` (`heritage`, `idOperation`, `dateOperation`, `libelleOperation`, `montantOperation`) VALUES ('operationDebit', '25', '2018-07-17 00:00:00', 'chaussures', '70');

INSERT INTO `gestibankdb`.`operationbancaire` (`heritage`, `idOperation`, `dateOperation`, `libelleOperation`, `montantOperation`) VALUES ('operationCredit', '26', '2018-07-16 00:00:00', 'virement CCSD', '500');
INSERT INTO `gestibankdb`.`operationbancaire` (`heritage`, `idOperation`, `dateOperation`, `libelleOperation`, `montantOperation`) VALUES ('operationDebit', '27', '2018-07-17 00:00:00', 'autoroute', '30');
INSERT INTO `gestibankdb`.`operationbancaire` (`heritage`, `idOperation`, `dateOperation`, `libelleOperation`, `montantOperation`) VALUES ('operationDebit', '28', '2018-07-18 00:00:00', 'essence', '60');
INSERT INTO `gestibankdb`.`operationbancaire` (`heritage`, `idOperation`, `dateOperation`, `libelleOperation`, `montantOperation`) VALUES ('operationDebit', '29', '2018-07-19 00:00:00', 'glaces', '20');
INSERT INTO `gestibankdb`.`operationbancaire` (`heritage`, `idOperation`, `dateOperation`, `libelleOperation`, `montantOperation`) VALUES ('operationDebit', '30', '2018-07-20 00:00:00', 'bar', '70');

INSERT INTO `gestibankdb`.`operationbancaire` (`heritage`, `idOperation`, `dateOperation`, `libelleOperation`, `montantOperation`) VALUES ('operationCredit', '31', '2018-07-09 00:00:00', 'salaire', '3000');
INSERT INTO `gestibankdb`.`operationbancaire` (`heritage`, `idOperation`, `dateOperation`, `libelleOperation`, `montantOperation`) VALUES ('operationDebit', '32', '2018-07-10 00:00:00', 'ordinateur', '500');
INSERT INTO `gestibankdb`.`operationbancaire` (`heritage`, `idOperation`, `dateOperation`, `libelleOperation`, `montantOperation`) VALUES ('operationDebit', '33', '2018-07-11 00:00:00', 'jeans', '100');
INSERT INTO `gestibankdb`.`operationbancaire` (`heritage`, `idOperation`, `dateOperation`, `libelleOperation`, `montantOperation`) VALUES ('operationDebit', '34', '2018-07-12 00:00:00', 'restaurant', '50');
INSERT INTO `gestibankdb`.`operationbancaire` (`heritage`, `idOperation`, `dateOperation`, `libelleOperation`, `montantOperation`) VALUES ('operationDebit', '35', '2018-07-13 00:00:00', 'epargne CR', '300');
INSERT INTO `gestibankdb`.`operationbancaire` (`heritage`, `idOperation`, `dateOperation`, `libelleOperation`, `montantOperation`) VALUES ('operationCredit', '36', '2018-07-14 00:00:00', 'prime vacances', '500');
INSERT INTO `gestibankdb`.`operationbancaire` (`heritage`, `idOperation`, `dateOperation`, `libelleOperation`, `montantOperation`) VALUES ('operationDebit', '37', '2018-07-16 00:00:00', 'reparation voiture', '300');
INSERT INTO `gestibankdb`.`operationbancaire` (`heritage`, `idOperation`, `dateOperation`, `libelleOperation`, `montantOperation`) VALUES ('operationDebit', '38', '2018-07-17 00:00:00', 'chaussures', '70');
INSERT INTO `gestibankdb`.`operationbancaire` (`heritage`, `idOperation`, `dateOperation`, `libelleOperation`, `montantOperation`) VALUES ('operationDebit', '39', '2018-07-18 00:00:00', 'epargne CR', '200');

INSERT INTO `gestibankdb`.`operationbancaire` (`heritage`, `idOperation`, `dateOperation`, `libelleOperation`, `montantOperation`) VALUES ('operationCredit', '40', '2018-07-14 00:00:00', 'epargne CCSD', '300');
INSERT INTO `gestibankdb`.`operationbancaire` (`heritage`, `idOperation`, `dateOperation`, `libelleOperation`, `montantOperation`) VALUES ('operationCredit', '41', '2018-07-19 00:00:00', 'epargne CCSD', '200');

INSERT INTO `gestibankdb`.`operationbancaire` (`heritage`, `idOperation`, `dateOperation`, `libelleOperation`, `montantOperation`) VALUES ('operationCredit', '42', '2018-07-09 00:00:00', 'salaire', '3000');
INSERT INTO `gestibankdb`.`operationbancaire` (`heritage`, `idOperation`, `dateOperation`, `libelleOperation`, `montantOperation`) VALUES ('operationDebit', '43', '2018-07-10 00:00:00', 'ordinateur', '500');
INSERT INTO `gestibankdb`.`operationbancaire` (`heritage`, `idOperation`, `dateOperation`, `libelleOperation`, `montantOperation`) VALUES ('operationDebit', '44', '2018-07-11 00:00:00', 'jeans', '100');
INSERT INTO `gestibankdb`.`operationbancaire` (`heritage`, `idOperation`, `dateOperation`, `libelleOperation`, `montantOperation`) VALUES ('operationDebit', '45', '2018-07-12 00:00:00', 'restaurant', '50');
INSERT INTO `gestibankdb`.`operationbancaire` (`heritage`, `idOperation`, `dateOperation`, `libelleOperation`, `montantOperation`) VALUES ('operationCredit', '46', '2018-07-14 00:00:00', 'prime vacances', '500');
INSERT INTO `gestibankdb`.`operationbancaire` (`heritage`, `idOperation`, `dateOperation`, `libelleOperation`, `montantOperation`) VALUES ('operationDebit', '47', '2018-07-16 00:00:00', 'reparation voiture', '300');
INSERT INTO `gestibankdb`.`operationbancaire` (`heritage`, `idOperation`, `dateOperation`, `libelleOperation`, `montantOperation`) VALUES ('operationDebit', '48', '2018-07-17 00:00:00', 'chaussures', '70');

-- 2-3-Demandes

-- Table "Demande"

INSERT INTO `gestibankdb`.`demande` (`heritage`, `idDemande`, `dateDemande`, `dateTraitement`, `statut`, `message`, `sujet`, `email`, `nom`, `prenom`, `titreCivilite`, `idCompte`, `idClient`, `client_idUtilisateur`) VALUES ('messageClient', '1', '2018-07-09 00:00:00', '2018-07-11 00:00:00', 'message repondu', 'messageClient1', 'messageClient1', NULL, NULL, NULL, NULL, NULL,'4', NULL);
INSERT INTO `gestibankdb`.`demande` (`heritage`, `idDemande`, `dateDemande`, `dateTraitement`, `statut`, `message`, `sujet`, `email`, `nom`, `prenom`, `titreCivilite`, `idCompte`, `idClient`, `client_idUtilisateur`) VALUES ('messageClient', '2', '2018-07-10 00:00:00', '2018-07-12 00:00:00', 'message repondu', 'messageClient2', 'messageClient2', NULL, NULL, NULL, NULL, NULL, '6', NULL);
INSERT INTO `gestibankdb`.`demande` (`heritage`, `idDemande`, `dateDemande`, `dateTraitement`, `statut`, `message`, `sujet`, `email`, `nom`, `prenom`, `titreCivilite`, `idCompte`, `idClient`, `client_idUtilisateur`) VALUES ('messageClient', '3', '2018-07-11 00:00:00', NULL, 'message non repondu', 'messageClient3', 'messageClient3', NULL, NULL, NULL, NULL, NULL, '5', NULL);
INSERT INTO `gestibankdb`.`demande` (`heritage`, `idDemande`, `dateDemande`, `dateTraitement`, `statut`, `message`, `sujet`, `email`, `nom`, `prenom`, `titreCivilite`, `idCompte`, `idClient`, `client_idUtilisateur`) VALUES ('messageClient', '4', '2018-07-12 00:00:00', NULL, 'message non repondu', 'messageClient4', 'messageClient4', NULL, NULL, NULL, NULL, NULL, '7', NULL);

INSERT INTO `gestibankdb`.`demande` (`heritage`, `idDemande`, `dateDemande`, `dateTraitement`, `statut`, `message`, `sujet`, `email`, `nom`, `prenom`, `titreCivilite`, `idCompte`, `idClient`, `client_idUtilisateur`) VALUES ('messagePublic', '5', '2018-07-13 00:00:00', '2018-07-15 00:00:00', 'message repondu', 'messagePublic1', 'messagePublic1', 'michael.jordan@gmail.com', 'Jordan', 'Michael', 'Monsieur', NULL, NULL, NULL);
INSERT INTO `gestibankdb`.`demande` (`heritage`, `idDemande`, `dateDemande`, `dateTraitement`, `statut`, `message`, `sujet`, `email`, `nom`, `prenom`, `titreCivilite`, `idCompte`, `idClient`, `client_idUtilisateur`) VALUES ('messagePublic', '6', '2018-07-14 00:00:00', '2018-07-16 00:00:00', 'message repondu', 'messagePublic2', 'messagePublic2', 'kobe.bryant@gmail.com', 'Bryant', 'Kobe', 'Monsieur', NULL, NULL, NULL);
INSERT INTO `gestibankdb`.`demande` (`heritage`, `idDemande`, `dateDemande`, `dateTraitement`, `statut`, `message`, `sujet`, `email`, `nom`, `prenom`, `titreCivilite`, `idCompte`, `idClient`, `client_idUtilisateur`) VALUES ('messagePublic', '7', '2018-07-15 00:00:00', NULL, 'message non repondu', 'messagePublic3', 'messagePublic3', 'lebron.james@gmail.com', 'James', 'Lebron', 'Monsieur', NULL, NULL, NULL);
INSERT INTO `gestibankdb`.`demande` (`heritage`, `idDemande`, `dateDemande`, `dateTraitement`, `statut`, `message`, `sujet`, `email`, `nom`, `prenom`, `titreCivilite`, `idCompte`, `idClient`, `client_idUtilisateur`) VALUES ('messagePublic', '8', '2018-07-16 00:00:00', NULL, 'message non repondu', 'messagePublic4', 'messagePublic4', 'lary.bird@gmail.com', 'Bird', 'Larry', 'Monsieur', NULL, NULL, NULL);

INSERT INTO `gestibankdb`.`demande` (`heritage`, `idDemande`, `dateDemande`, `dateTraitement`, `statut`, `message`, `sujet`, `email`, `nom`, `prenom`, `titreCivilite`, `idCompte`, `idClient`, `client_idUtilisateur`) VALUES ('demandeRIB', '9', '2018-07-09 00:00:00', '2018-07-11 00:00:00', 'demande acceptee', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `gestibankdb`.`demande` (`heritage`, `idDemande`, `dateDemande`, `dateTraitement`, `statut`, `message`, `sujet`, `email`, `nom`, `prenom`, `titreCivilite`, `idCompte`, `idClient`, `client_idUtilisateur`) VALUES ('demandeRIB', '10', '2018-07-10 00:00:00', '2018-07-12 00:00:00', 'demande refusee', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `gestibankdb`.`demande` (`heritage`, `idDemande`, `dateDemande`, `dateTraitement`, `statut`, `message`, `sujet`, `email`, `nom`, `prenom`, `titreCivilite`, `idCompte`, `idClient`, `client_idUtilisateur`) VALUES ('demandeRIB', '11', '2018-07-11 00:00:00', NULL, 'demande non traitee', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `gestibankdb`.`demande` (`heritage`, `idDemande`, `dateDemande`, `dateTraitement`, `statut`, `message`, `sujet`, `email`, `nom`, `prenom`, `titreCivilite`, `idCompte`, `idClient`, `client_idUtilisateur`) VALUES ('demandeRIB', '12', '2018-07-12 00:00:00', NULL, 'demande non traitee', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

INSERT INTO `gestibankdb`.`demande` (`heritage`, `idDemande`, `dateDemande`, `dateTraitement`, `statut`, `message`, `sujet`, `email`, `nom`, `prenom`, `titreCivilite`, `idCompte`, `idClient`, `client_idUtilisateur`) VALUES ('demandeChequier', '13', '2018-07-13 00:00:00', '2018-07-15 00:00:00', 'demande acceptee', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `gestibankdb`.`demande` (`heritage`, `idDemande`, `dateDemande`, `dateTraitement`, `statut`, `message`, `sujet`, `email`, `nom`, `prenom`, `titreCivilite`, `idCompte`, `idClient`, `client_idUtilisateur`) VALUES ('demandeChequier', '14', '2018-07-14 00:00:00', '2018-07-16 00:00:00', 'demande refusee', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `gestibankdb`.`demande` (`heritage`, `idDemande`, `dateDemande`, `dateTraitement`, `statut`, `message`, `sujet`, `email`, `nom`, `prenom`, `titreCivilite`, `idCompte`, `idClient`, `client_idUtilisateur`) VALUES ('demandeChequier', '15', '2018-07-15 00:00:00', NULL, 'demande non traitee', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `gestibankdb`.`demande` (`heritage`, `idDemande`, `dateDemande`, `dateTraitement`, `statut`, `message`, `sujet`, `email`, `nom`, `prenom`, `titreCivilite`, `idCompte`, `idClient`, `client_idUtilisateur`) VALUES ('demandeChequier', '16', '2018-07-16 00:00:00', NULL, 'demande non traitee', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

INSERT INTO `gestibankdb`.`demande` (`heritage`, `idDemande`, `dateDemande`, `dateTraitement`, `statut`, `message`, `sujet`, `email`, `nom`, `prenom`, `titreCivilite`, `idCompte`, `idClient`, `client_idUtilisateur`) VALUES ('demandeOuvertureCompte', '17', '2018-07-09 00:00:00', '2018-07-11 00:00:00', 'demande acceptee', NULL, NULL, NULL, NULL, NULL, NULL, '3', NULL, NULL);
INSERT INTO `gestibankdb`.`demande` (`heritage`, `idDemande`, `dateDemande`, `dateTraitement`, `statut`, `message`, `sujet`, `email`, `nom`, `prenom`, `titreCivilite`, `idCompte`, `idClient`, `client_idUtilisateur`) VALUES ('demandeOuvertureCompte', '18', '2018-07-10 00:00:00', '2018-07-12 00:00:00', 'demande refusee', NULL, NULL, NULL, NULL, NULL, NULL, '6', NULL, NULL);
INSERT INTO `gestibankdb`.`demande` (`heritage`, `idDemande`, `dateDemande`, `dateTraitement`, `statut`, `message`, `sujet`, `email`, `nom`, `prenom`, `titreCivilite`, `idCompte`, `idClient`, `client_idUtilisateur`) VALUES ('demandeOuvertureCompte', '19', '2018-07-11 00:00:00', NULL, 'demande non traitee', NULL, NULL, NULL, NULL, NULL, NULL, '8', NULL, NULL);
INSERT INTO `gestibankdb`.`demande` (`heritage`, `idDemande`, `dateDemande`, `dateTraitement`, `statut`, `message`, `sujet`, `email`, `nom`, `prenom`, `titreCivilite`, `idCompte`, `idClient`, `client_idUtilisateur`) VALUES ('demandeOuvertureCompte', '20', '2018-07-12 00:00:00', NULL, 'demande non traitee', NULL, NULL, NULL, NULL, NULL, NULL, '11', NULL, NULL);

INSERT INTO `gestibankdb`.`demande` (`heritage`, `idDemande`, `dateDemande`, `dateTraitement`, `statut`, `message`, `sujet`, `email`, `nom`, `prenom`, `titreCivilite`, `idCompte`, `idClient`, `client_idUtilisateur`) VALUES ('demandeFermetureCompte', '21', '2018-07-13 00:00:00', '2018-07-15 00:00:00', 'demande acceptee', NULL, NULL, NULL, NULL, NULL, NULL, '12', NULL, NULL);
INSERT INTO `gestibankdb`.`demande` (`heritage`, `idDemande`, `dateDemande`, `dateTraitement`, `statut`, `message`, `sujet`, `email`, `nom`, `prenom`, `titreCivilite`, `idCompte`, `idClient`, `client_idUtilisateur`) VALUES ('demandeFermetureCompte', '22', '2018-07-14 00:00:00', '2018-07-16 00:00:00', 'demande refusee', NULL, NULL, NULL, NULL, NULL, NULL, '9', NULL, NULL);
INSERT INTO `gestibankdb`.`demande` (`heritage`, `idDemande`, `dateDemande`, `dateTraitement`, `statut`, `message`, `sujet`, `email`, `nom`, `prenom`, `titreCivilite`, `idCompte`, `idClient`, `client_idUtilisateur`) VALUES ('demandeFermetureCompte', '23', '2018-07-15 00:00:00', NULL, 'demande non traitee', NULL, NULL, NULL, NULL, NULL, NULL, '5', NULL, NULL);
INSERT INTO `gestibankdb`.`demande` (`heritage`, `idDemande`, `dateDemande`, `dateTraitement`, `statut`, `message`, `sujet`, `email`, `nom`, `prenom`, `titreCivilite`, `idCompte`, `idClient`, `client_idUtilisateur`) VALUES ('demandeFermetureCompte', '24', '2018-07-16 00:00:00', NULL, 'demande non traitee', NULL, NULL, NULL, NULL, NULL, NULL, '2', NULL, NULL);

INSERT INTO `gestibankdb`.`demande` (`heritage`, `idDemande`, `dateDemande`, `dateTraitement`, `statut`, `message`, `sujet`, `email`, `nom`, `prenom`, `titreCivilite`, `idCompte`, `idClient`, `client_idUtilisateur`) VALUES ('demandeInscription', '25', '2018-07-09 00:00:00', NULL, 'demande non affectee', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '8');
INSERT INTO `gestibankdb`.`demande` (`heritage`, `idDemande`, `dateDemande`, `dateTraitement`, `statut`, `message`, `sujet`, `email`, `nom`, `prenom`, `titreCivilite`, `idCompte`, `idClient`, `client_idUtilisateur`) VALUES ('demandeInscription', '26', '2018-07-10 00:00:00', NULL, 'demande non traitee', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '9');

INSERT INTO `gestibankdb`.`demande` (`heritage`, `idDemande`, `dateDemande`, `dateTraitement`, `statut`, `message`, `sujet`, `email`, `nom`, `prenom`, `titreCivilite`, `idCompte`, `idClient`, `client_idUtilisateur`) VALUES ('demandeModificationDonnees', '27', '2018-07-11 00:00:00', NULL, 'demande non traitee', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '10');
INSERT INTO `gestibankdb`.`demande` (`heritage`, `idDemande`, `dateDemande`, `dateTraitement`, `statut`, `message`, `sujet`, `email`, `nom`, `prenom`, `titreCivilite`, `idCompte`, `idClient`, `client_idUtilisateur`) VALUES ('demandeModificationDonnees', '28', '2018-07-12 00:00:00', NULL, 'demande non traitee', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '11');

-- 2-4-Correspondances

-- Table "Admin_Conseiller"
INSERT INTO `gestibankdb`.`admin_conseiller` (`Utilisateur_idUtilisateur`, `conseillers_idUtilisateur`) VALUES ('1', '2');
INSERT INTO `gestibankdb`.`admin_conseiller` (`Utilisateur_idUtilisateur`, `conseillers_idUtilisateur`) VALUES ('1', '3');

-- Table "Conseiller_Client"
INSERT INTO `gestibankdb`.`conseiller_client` (`Utilisateur_idUtilisateur`, `clients_idUtilisateur`) VALUES ('2', '4');
INSERT INTO `gestibankdb`.`conseiller_client` (`Utilisateur_idUtilisateur`, `clients_idUtilisateur`) VALUES ('2', '5');

INSERT INTO `gestibankdb`.`conseiller_client` (`Utilisateur_idUtilisateur`, `clients_idUtilisateur`) VALUES ('3', '6');
INSERT INTO `gestibankdb`.`conseiller_client` (`Utilisateur_idUtilisateur`, `clients_idUtilisateur`) VALUES ('3', '7');

-- Table "Utilisateur_Demande"
INSERT INTO `gestibankdb`.`utilisateur_demande` (`Utilisateur_idUtilisateur`, `demandes_idDemande`) VALUES ('1', '25');

INSERT INTO `gestibankdb`.`utilisateur_demande` (`Utilisateur_idUtilisateur`, `demandes_idDemande`) VALUES ('2', '5');
INSERT INTO `gestibankdb`.`utilisateur_demande` (`Utilisateur_idUtilisateur`, `demandes_idDemande`) VALUES ('2', '7');
INSERT INTO `gestibankdb`.`utilisateur_demande` (`Utilisateur_idUtilisateur`, `demandes_idDemande`) VALUES ('2', '26');

INSERT INTO `gestibankdb`.`utilisateur_demande` (`Utilisateur_idUtilisateur`, `demandes_idDemande`) VALUES ('3', '6');
INSERT INTO `gestibankdb`.`utilisateur_demande` (`Utilisateur_idUtilisateur`, `demandes_idDemande`) VALUES ('3', '8');

INSERT INTO `gestibankdb`.`utilisateur_demande` (`Utilisateur_idUtilisateur`, `demandes_idDemande`) VALUES ('4', '1');
INSERT INTO `gestibankdb`.`utilisateur_demande` (`Utilisateur_idUtilisateur`, `demandes_idDemande`) VALUES ('4', '9');
INSERT INTO `gestibankdb`.`utilisateur_demande` (`Utilisateur_idUtilisateur`, `demandes_idDemande`) VALUES ('4', '13');
INSERT INTO `gestibankdb`.`utilisateur_demande` (`Utilisateur_idUtilisateur`, `demandes_idDemande`) VALUES ('4', '17');
INSERT INTO `gestibankdb`.`utilisateur_demande` (`Utilisateur_idUtilisateur`, `demandes_idDemande`) VALUES ('4', '24');
INSERT INTO `gestibankdb`.`utilisateur_demande` (`Utilisateur_idUtilisateur`, `demandes_idDemande`) VALUES ('4', '27');

INSERT INTO `gestibankdb`.`utilisateur_demande` (`Utilisateur_idUtilisateur`, `demandes_idDemande`) VALUES ('5', '3');
INSERT INTO `gestibankdb`.`utilisateur_demande` (`Utilisateur_idUtilisateur`, `demandes_idDemande`) VALUES ('5', '10');
INSERT INTO `gestibankdb`.`utilisateur_demande` (`Utilisateur_idUtilisateur`, `demandes_idDemande`) VALUES ('5', '14');
INSERT INTO `gestibankdb`.`utilisateur_demande` (`Utilisateur_idUtilisateur`, `demandes_idDemande`) VALUES ('5', '18');
INSERT INTO `gestibankdb`.`utilisateur_demande` (`Utilisateur_idUtilisateur`, `demandes_idDemande`) VALUES ('5', '23');
INSERT INTO `gestibankdb`.`utilisateur_demande` (`Utilisateur_idUtilisateur`, `demandes_idDemande`) VALUES ('5', '28');

INSERT INTO `gestibankdb`.`utilisateur_demande` (`Utilisateur_idUtilisateur`, `demandes_idDemande`) VALUES ('6', '2');
INSERT INTO `gestibankdb`.`utilisateur_demande` (`Utilisateur_idUtilisateur`, `demandes_idDemande`) VALUES ('6', '11');
INSERT INTO `gestibankdb`.`utilisateur_demande` (`Utilisateur_idUtilisateur`, `demandes_idDemande`) VALUES ('6', '15');
INSERT INTO `gestibankdb`.`utilisateur_demande` (`Utilisateur_idUtilisateur`, `demandes_idDemande`) VALUES ('6', '19');
INSERT INTO `gestibankdb`.`utilisateur_demande` (`Utilisateur_idUtilisateur`, `demandes_idDemande`) VALUES ('6', '22');

INSERT INTO `gestibankdb`.`utilisateur_demande` (`Utilisateur_idUtilisateur`, `demandes_idDemande`) VALUES ('7', '4');
INSERT INTO `gestibankdb`.`utilisateur_demande` (`Utilisateur_idUtilisateur`, `demandes_idDemande`) VALUES ('7', '12');
INSERT INTO `gestibankdb`.`utilisateur_demande` (`Utilisateur_idUtilisateur`, `demandes_idDemande`) VALUES ('7', '16');
INSERT INTO `gestibankdb`.`utilisateur_demande` (`Utilisateur_idUtilisateur`, `demandes_idDemande`) VALUES ('7', '20');
INSERT INTO `gestibankdb`.`utilisateur_demande` (`Utilisateur_idUtilisateur`, `demandes_idDemande`) VALUES ('7', '21');

-- Table "Utilisateur_Compte"
INSERT INTO `gestibankdb`.`utilisateur_compte` (`Utilisateur_idUtilisateur`, `comptes_idCompte`) VALUES ('4', '1');
INSERT INTO `gestibankdb`.`utilisateur_compte` (`Utilisateur_idUtilisateur`, `comptes_idCompte`) VALUES ('4', '2');
INSERT INTO `gestibankdb`.`utilisateur_compte` (`Utilisateur_idUtilisateur`, `comptes_idCompte`) VALUES ('4', '3');

INSERT INTO `gestibankdb`.`utilisateur_compte` (`Utilisateur_idUtilisateur`, `comptes_idCompte`) VALUES ('5', '4');
INSERT INTO `gestibankdb`.`utilisateur_compte` (`Utilisateur_idUtilisateur`, `comptes_idCompte`) VALUES ('5', '5');
INSERT INTO `gestibankdb`.`utilisateur_compte` (`Utilisateur_idUtilisateur`, `comptes_idCompte`) VALUES ('5', '6');

INSERT INTO `gestibankdb`.`utilisateur_compte` (`Utilisateur_idUtilisateur`, `comptes_idCompte`) VALUES ('6', '7');
INSERT INTO `gestibankdb`.`utilisateur_compte` (`Utilisateur_idUtilisateur`, `comptes_idCompte`) VALUES ('6', '8');
INSERT INTO `gestibankdb`.`utilisateur_compte` (`Utilisateur_idUtilisateur`, `comptes_idCompte`) VALUES ('6', '9');

INSERT INTO `gestibankdb`.`utilisateur_compte` (`Utilisateur_idUtilisateur`, `comptes_idCompte`) VALUES ('7', '10');
INSERT INTO `gestibankdb`.`utilisateur_compte` (`Utilisateur_idUtilisateur`, `comptes_idCompte`) VALUES ('7', '11');
INSERT INTO `gestibankdb`.`utilisateur_compte` (`Utilisateur_idUtilisateur`, `comptes_idCompte`) VALUES ('7', '12');

INSERT INTO `gestibankdb`.`utilisateur_compte` (`Utilisateur_idUtilisateur`, `comptes_idCompte`) VALUES ('8', '13');
INSERT INTO `gestibankdb`.`utilisateur_compte` (`Utilisateur_idUtilisateur`, `comptes_idCompte`) VALUES ('8', '14');
INSERT INTO `gestibankdb`.`utilisateur_compte` (`Utilisateur_idUtilisateur`, `comptes_idCompte`) VALUES ('8', '15');

INSERT INTO `gestibankdb`.`utilisateur_compte` (`Utilisateur_idUtilisateur`, `comptes_idCompte`) VALUES ('9', '16');
INSERT INTO `gestibankdb`.`utilisateur_compte` (`Utilisateur_idUtilisateur`, `comptes_idCompte`) VALUES ('9', '17');
INSERT INTO `gestibankdb`.`utilisateur_compte` (`Utilisateur_idUtilisateur`, `comptes_idCompte`) VALUES ('9', '18');

-- Table "Compte_OperationBancaire"
INSERT INTO `gestibankdb`.`compte_operationbancaire` (`Compte_idCompte`, `operationsbancaires_idOperation`) VALUES ('1', '1');
INSERT INTO `gestibankdb`.`compte_operationbancaire` (`Compte_idCompte`, `operationsbancaires_idOperation`) VALUES ('1', '2');
INSERT INTO `gestibankdb`.`compte_operationbancaire` (`Compte_idCompte`, `operationsbancaires_idOperation`) VALUES ('1', '3');
INSERT INTO `gestibankdb`.`compte_operationbancaire` (`Compte_idCompte`, `operationsbancaires_idOperation`) VALUES ('1', '4');
INSERT INTO `gestibankdb`.`compte_operationbancaire` (`Compte_idCompte`, `operationsbancaires_idOperation`) VALUES ('1', '5');
INSERT INTO `gestibankdb`.`compte_operationbancaire` (`Compte_idCompte`, `operationsbancaires_idOperation`) VALUES ('1', '6');
INSERT INTO `gestibankdb`.`compte_operationbancaire` (`Compte_idCompte`, `operationsbancaires_idOperation`) VALUES ('1', '7');
INSERT INTO `gestibankdb`.`compte_operationbancaire` (`Compte_idCompte`, `operationsbancaires_idOperation`) VALUES ('1', '8');
INSERT INTO `gestibankdb`.`compte_operationbancaire` (`Compte_idCompte`, `operationsbancaires_idOperation`) VALUES ('1', '9');
INSERT INTO `gestibankdb`.`compte_operationbancaire` (`Compte_idCompte`, `operationsbancaires_idOperation`) VALUES ('1', '10');

INSERT INTO `gestibankdb`.`compte_operationbancaire` (`Compte_idCompte`, `operationsbancaires_idOperation`) VALUES ('2', '11');
INSERT INTO `gestibankdb`.`compte_operationbancaire` (`Compte_idCompte`, `operationsbancaires_idOperation`) VALUES ('2', '12');
INSERT INTO `gestibankdb`.`compte_operationbancaire` (`Compte_idCompte`, `operationsbancaires_idOperation`) VALUES ('2', '13');
INSERT INTO `gestibankdb`.`compte_operationbancaire` (`Compte_idCompte`, `operationsbancaires_idOperation`) VALUES ('2', '14');
INSERT INTO `gestibankdb`.`compte_operationbancaire` (`Compte_idCompte`, `operationsbancaires_idOperation`) VALUES ('2', '15');

INSERT INTO `gestibankdb`.`compte_operationbancaire` (`Compte_idCompte`, `operationsbancaires_idOperation`) VALUES ('3', '16');
INSERT INTO `gestibankdb`.`compte_operationbancaire` (`Compte_idCompte`, `operationsbancaires_idOperation`) VALUES ('3', '17');

INSERT INTO `gestibankdb`.`compte_operationbancaire` (`Compte_idCompte`, `operationsbancaires_idOperation`) VALUES ('4', '18');
INSERT INTO `gestibankdb`.`compte_operationbancaire` (`Compte_idCompte`, `operationsbancaires_idOperation`) VALUES ('4', '19');
INSERT INTO `gestibankdb`.`compte_operationbancaire` (`Compte_idCompte`, `operationsbancaires_idOperation`) VALUES ('4', '20');
INSERT INTO `gestibankdb`.`compte_operationbancaire` (`Compte_idCompte`, `operationsbancaires_idOperation`) VALUES ('4', '21');
INSERT INTO `gestibankdb`.`compte_operationbancaire` (`Compte_idCompte`, `operationsbancaires_idOperation`) VALUES ('4', '22');
INSERT INTO `gestibankdb`.`compte_operationbancaire` (`Compte_idCompte`, `operationsbancaires_idOperation`) VALUES ('4', '23');
INSERT INTO `gestibankdb`.`compte_operationbancaire` (`Compte_idCompte`, `operationsbancaires_idOperation`) VALUES ('4', '24');
INSERT INTO `gestibankdb`.`compte_operationbancaire` (`Compte_idCompte`, `operationsbancaires_idOperation`) VALUES ('4', '25');

INSERT INTO `gestibankdb`.`compte_operationbancaire` (`Compte_idCompte`, `operationsbancaires_idOperation`) VALUES ('5', '26');
INSERT INTO `gestibankdb`.`compte_operationbancaire` (`Compte_idCompte`, `operationsbancaires_idOperation`) VALUES ('5', '27');
INSERT INTO `gestibankdb`.`compte_operationbancaire` (`Compte_idCompte`, `operationsbancaires_idOperation`) VALUES ('5', '28');
INSERT INTO `gestibankdb`.`compte_operationbancaire` (`Compte_idCompte`, `operationsbancaires_idOperation`) VALUES ('5', '29');
INSERT INTO `gestibankdb`.`compte_operationbancaire` (`Compte_idCompte`, `operationsbancaires_idOperation`) VALUES ('5', '30');

INSERT INTO `gestibankdb`.`compte_operationbancaire` (`Compte_idCompte`, `operationsbancaires_idOperation`) VALUES ('7', '31');
INSERT INTO `gestibankdb`.`compte_operationbancaire` (`Compte_idCompte`, `operationsbancaires_idOperation`) VALUES ('7', '32');
INSERT INTO `gestibankdb`.`compte_operationbancaire` (`Compte_idCompte`, `operationsbancaires_idOperation`) VALUES ('7', '33');
INSERT INTO `gestibankdb`.`compte_operationbancaire` (`Compte_idCompte`, `operationsbancaires_idOperation`) VALUES ('7', '34');
INSERT INTO `gestibankdb`.`compte_operationbancaire` (`Compte_idCompte`, `operationsbancaires_idOperation`) VALUES ('7', '35');
INSERT INTO `gestibankdb`.`compte_operationbancaire` (`Compte_idCompte`, `operationsbancaires_idOperation`) VALUES ('7', '36');
INSERT INTO `gestibankdb`.`compte_operationbancaire` (`Compte_idCompte`, `operationsbancaires_idOperation`) VALUES ('7', '37');
INSERT INTO `gestibankdb`.`compte_operationbancaire` (`Compte_idCompte`, `operationsbancaires_idOperation`) VALUES ('7', '38');
INSERT INTO `gestibankdb`.`compte_operationbancaire` (`Compte_idCompte`, `operationsbancaires_idOperation`) VALUES ('7', '39');

INSERT INTO `gestibankdb`.`compte_operationbancaire` (`Compte_idCompte`, `operationsbancaires_idOperation`) VALUES ('9', '40');
INSERT INTO `gestibankdb`.`compte_operationbancaire` (`Compte_idCompte`, `operationsbancaires_idOperation`) VALUES ('9', '41');

INSERT INTO `gestibankdb`.`compte_operationbancaire` (`Compte_idCompte`, `operationsbancaires_idOperation`) VALUES ('10', '42');
INSERT INTO `gestibankdb`.`compte_operationbancaire` (`Compte_idCompte`, `operationsbancaires_idOperation`) VALUES ('10', '43');
INSERT INTO `gestibankdb`.`compte_operationbancaire` (`Compte_idCompte`, `operationsbancaires_idOperation`) VALUES ('10', '44');
INSERT INTO `gestibankdb`.`compte_operationbancaire` (`Compte_idCompte`, `operationsbancaires_idOperation`) VALUES ('10', '45');
INSERT INTO `gestibankdb`.`compte_operationbancaire` (`Compte_idCompte`, `operationsbancaires_idOperation`) VALUES ('10', '46');
INSERT INTO `gestibankdb`.`compte_operationbancaire` (`Compte_idCompte`, `operationsbancaires_idOperation`) VALUES ('10', '47');
INSERT INTO `gestibankdb`.`compte_operationbancaire` (`Compte_idCompte`, `operationsbancaires_idOperation`) VALUES ('10', '48');
