--liquibase formatted sql
--changeset vholovetskyi:1

create table event
(
    id             BIGINT       NOT NULL AUTO_INCREMENT PRIMARY KEY,
    uuid           VARCHAR(255) NOT NULL,
    version        BIGINT       NOT NULL,
    description    VARCHAR(255) DEFAULT NULL,
    status         VARCHAR(255) NOT NULL,
    currency_code  VARCHAR(3)   NOT NULL,
    participant_id BIGINT      NOT NULL,
    end_date       DATE         NOT NULL,
    create_date    TIMESTAMP    NOT NULL,
    update_date    TIMESTAMP    NOT NULL
);