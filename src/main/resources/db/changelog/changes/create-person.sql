--liquibase formatted sql

--changeset value:1

CREATE TABLE person
(
    Id            BIGINT       NOT NULL AUTO_INCREMENT,
    first_name    VARCHAR(255) NOT NULL,
    last_name     VARCHAR(255) NOT NULL,
    personal_id   VARCHAR(255) NOT NULL,
    gender        VARCHAR(255) NOT NULL,
    date_of_birth DATE         NOT NULL,

    PRIMARY KEY (Id),
    CONSTRAINT persons_should_be_unique UNIQUE (personal_id)
);
