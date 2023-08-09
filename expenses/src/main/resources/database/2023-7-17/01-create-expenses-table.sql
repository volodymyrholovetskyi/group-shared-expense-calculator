--liquibase formatted sql
--changeset vholovetskyi:3

create table expenses
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
    event_id    BIGINT        NOT NULL,
    CONSTRAINT `fk_expenses_event`
        FOREIGN KEY (`event_id`)
            REFERENCES `event` (`id`)
            ON DELETE CASCADE
            ON UPDATE CASCADE
);