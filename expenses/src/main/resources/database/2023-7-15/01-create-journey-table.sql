--liquibase formatted sql
--changeset vholovetskyi:2

create table journey
(
    id            BIGINT       NOT NULL PRIMARY KEY AUTO_INCREMENT,
    uuid          VARCHAR(255) NOT NULL,
    version       BIGINT       NOT NULL,
    name          VARCHAR(255) NOT NULL,
    description   VARCHAR(255) DEFAULT NULL,
    status        VARCHAR(255) NOT NULL,
    currency_code VARCHAR(3)   NOT NULL,
    end_date      DATE         NOT NULL,
    create_date   TIMESTAMP    NOT NULL,
    update_date   TIMESTAMP    NOT NULL
);