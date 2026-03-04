-- V2:Migrations para adicionar a relevancia de rank na tabela de cadastros.
ALTER TABLE TB_CADASTRO ADD COLUMN relevancia VARCHAR(255);