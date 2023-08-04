--liquibase formatted sql
--changeset vholovetskyi:1
create table participant
(
    id          BIGINT       NOT NULL AUTO_INCREMENT PRIMARY KEY,
    uuid        VARCHAR(255) NOT NULL,
    version     BIGINT       NOT NULL,
    name        VARCHAR(255) NOT NULL,
    email       VARCHAR(255) DEFAULT NULL,
    create_date DATE         NOT NULL,
    update_date DATE         NOT NULL
);