--liquibase formatted sql
--changeset vholovetskyi:2

create table transaction
(
    id            BIGINT        NOT NULL AUTO_INCREMENT,
    uuid          VARCHAR(255)  NOT NULL,
    version       BIGINT        NOT NULL,
    name          VARCHAR(255)  NOT NULL,
    category      VARCHAR(255)  NOT NULL,
    split         VARCHAR(255)  NOT NULL,
    amount        DECIMAL(9, 2) NOT NULL,
    currency_code VARCHAR(3)    NOT NULL,
    create_date   TIMESTAMP     NOT NULL,
    update_date   TIMESTAMP     NOT NULL,
    payer_id      BIGINT        NOT NULL,
    event_id      BIGINT        NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT fk_transaction_event FOREIGN KEY (event_id) REFERENCES event (id)
);