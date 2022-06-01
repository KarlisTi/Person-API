--liquibase formatted sql

--changeset value:2

CREATE TABLE audit_log
(
    id            INT NOT NULL,
    created_date  TIMESTAMP NOT NULL,
    modified_date TIMESTAMP NOT NULL

)