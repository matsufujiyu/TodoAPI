CREATE TABLE TODOLIST (
id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
userId VARCHAR(256) NOT NULL,
title VARCHAR(256) NOT NULL,
status VARCHAR(256),
details VARCHAR(256)
);