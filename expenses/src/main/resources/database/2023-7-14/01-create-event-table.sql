--liquibase formatted sql
--changeset vholovetskyi:1
create table participant
(
    id          BIGINT       NOT NULL AUTO_INCREMENT,
    uuid        VARCHAR(255) NOT NULL,
    version     BIGINT       NOT NULL,
    name        VARCHAR(255) NOT NULL,
    email       VARCHAR(255) DEFAULT NULL,
    create_date DATE         NOT NULL,
    update_date DATE         NOT NULL,
    PRIMARY KEY (id)
);

-- create table event_participants
-- (
--     event_id BIGINT NOT NULL,
--     participant_id BIGINT NOT NULL
-- )

create table event
(
    id             BIGINT       NOT NULL PRIMARY KEY AUTO_INCREMENT,
    uuid           VARCHAR(255) NOT NULL,
    version        BIGINT       NOT NULL,
    name           VARCHAR(255) NOT NULL,
    description    VARCHAR(255) DEFAULT NULL,
    status         VARCHAR(255) NOT NULL,
    currency_code  VARCHAR(3)   NOT NULL,
    end_date       DATE         NOT NULL,
    create_date    TIMESTAMP    NOT NULL,
    update_date    TIMESTAMP    NOT NULL
);