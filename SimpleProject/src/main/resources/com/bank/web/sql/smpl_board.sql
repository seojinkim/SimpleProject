DROP TABLE board;
DROP TABLE member;
DROP SEQUENCE seq_idx;

CREATE TABLE board(
   idx NUMBER,
   id VARCHAR2(30),
   title VARCHAR2(500),
   context VARCHAR2(4000)
);

INSERT INTO board(idx, id, title, context)
VALUES (101, 'lee', '1234', '이우정');
INSERT INTO board(idx, id, title, context)
VALUES (102, 'nam', '바보바보야', '연시기시기싯ㅅㄱ식');

CREATE SEQUENCE seq_idx
START WITH 1
INCREMENT BY 1;

CREATE TABLE board(
	idx NUMBER,
	id VARCHAR2(30),
	title VARCHAR2(500),
	context VARCHAR2(4000)
);

CREATE TABLE member(
	id VARCHAR2(30),
	password VARCHAR2(30),
	name VARCHAR2(30)
);

INSERT INTO member(id, password, name)
VALUES ('lee', '1234', '이우정');
INSERT INTO member(id, password, name)
VALUES ('jang', '1234', '장민호');
INSERT INTO member(id, password, name)
VALUES ('nam', '1234', '남연식');
INSERT INTO member(id, password, name)
VALUES ('kim', '1234', '김서진'); 