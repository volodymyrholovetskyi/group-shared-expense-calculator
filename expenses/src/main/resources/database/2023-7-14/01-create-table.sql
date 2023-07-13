--liquibase formatted sql
--changeset vholovetskyi:1

create table event
(
    id          BIGINT       NOT NULL PRIMARY KEY AUTO_INCREMENT,
    uuid        VARCHAR(255) NOT NULL,
    version     INTEGER      NOT NULL,
    description VARCHAR(255) NOT NULL,
    status      VARCHAR(255) NOT NULL,
    deadline    DATE         NOT NULL,
    create_date TIMESTAMP    NOT NULL,
    update_date TIMESTAMP    NOT NULL
);

create table expense
(
    id            BIGINT        NOT NULL PRIMARY KEY AUTO_INCREMENT,
    uuid          VARCHAR(255)  NOT NULL,
    version       INTEGER       NOT NULL,
    description   VARCHAR(255)  NOT NULL,
    split         VARCHAR(255)  NOT NULL,
    amount        DECIMAL(9, 2) NOT NULL,
    currency_code VARCHAR(255)  NOT NULL,
    create_date   TIMESTAMP     NOT NULL,
    update_date   TIMESTAMP     NOT NULL
);

create table currency
(
    id            BIGINT       NOT NULL PRIMARY KEY AUTO_INCREMENT,
    uuid          VARCHAR(255) NOT NULL,
    version       INTEGER      NOT NULL,
    currency_code VARCHAR(255) NOT NULL,
    full_name     VARCHAR(255) NOT NULL,
    symbol        VARCHAR(255) NOT NULL,
    create_date   TIMESTAMP    NOT NULL,
    update_date   TIMESTAMP    NOT NULL
);