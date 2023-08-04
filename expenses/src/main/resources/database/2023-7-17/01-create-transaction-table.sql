--liquibase formatted sql
--changeset vholovetskyi:3

create table transaction
(
    id            BIGINT        NOT NULL AUTO_INCREMENT PRIMARY KEY,
    uuid          VARCHAR(255)  NOT NULL,
    version       BIGINT        NOT NULL,
    name          VARCHAR(255)  NOT NULL,
    category      VARCHAR(255) DEFAULT NULL,
    split         VARCHAR(255)  NOT NULL,
    amount        DECIMAL(9, 2) NOT NULL,
    currency_code VARCHAR(3)    NOT NULL,
    create_date   TIMESTAMP     NOT NULL,
    update_date   TIMESTAMP     NOT NULL,
    journey_id    BIGINT
--     CONSTRAINT fk_transaction_journey FOREIGN KEY (event_id) REFERENCES journey (id)
);