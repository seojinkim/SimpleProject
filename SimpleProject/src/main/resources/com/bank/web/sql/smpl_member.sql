CREATE TABLE member(
   id VARCHAR2(30),
   password VARCHAR2(30),
   name VARCHAR2(30)
);

drop table member;

INSERT INTO member(id, password, name)
VALUES ('lee', '1234', '이우정');
INSERT INTO member(id, password, name)
VALUES ('jang', '1234', '장민호');
INSERT INTO member(id, password, name)
VALUES ('nam', '1234', '남연식');
INSERT INTO member(id, password, name)
VALUES ('kim', '1234', '김서진');
