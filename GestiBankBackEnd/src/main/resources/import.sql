-- Table ClientTest
INSERT INTO `gestibankdb`.`clienttest` (`id`, `dateOfBirth`, `email`, `firstName`, `lastName`, `mobil`) VALUES ('1', '1987-12-17 00:00:00', 'adrien.carcey@hotmail.fr', 'Adrien', 'Carcey', '06-11-22-33-44-55');

-- Table CompteTest
INSERT INTO `gestibankdb`.`comptetest` (`rib`, `dateCreation`, `description`, `solde`) VALUES ('111', '2018-07-06 00:00:00', 'CCP', '1000');

-- Table ClientTest_CompteTest
INSERT INTO `gestibankdb`.`clienttest_comptetest` (`ClientTest_id`, `comptes_rib`) VALUES ('1', '111');