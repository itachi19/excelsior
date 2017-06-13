CREATE TABLE level_hierarchy(id BIGINT,label TEXT NOT NULL,parent_id BIGINT,PRIMARY KEY(id));
CREATE TABLE level(id BIGINT,label TEXT NOT NULL,parent_id INT,PRIMARY KEY(id));

CREATE TABLE users(id BIGINT, user_name TEXT NOT NULL,job_id BIGINT,PRIMARY KEY(id));


CREATE SEQUENCE level_id_seq

  INCREMENT by 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START with 2
  CACHE 1;


CREATE SEQUENCE user_id_seq

  INCREMENT by 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START with 1
  CACHE 1;


INSERT INTO level_hierarchy VALUES(1,'BLIBLI',0);
INSERT INTO level_hierarchy VALUES(2,'BES',1);
INSERT INTO level_hierarchy VALUES(3,'Ceper',2);
INSERT INTO level_hierarchy VALUES(4,'Tubun',2);
INSERT INTO level_hierarchy VALUES(5,'Pickup',3);
INSERT INTO level_hierarchy VALUES(6,'Delivery',3);
INSERT INTO level_hierarchy VALUES(7,'Linehaul',3);
INSERT INTO level_hierarchy VALUES(8,'Pickup',4);
INSERT INTO level_hierarchy VALUES(9,'Delivery',4);
INSERT INTO level_hierarchy VALUES(10,'Hub1',5);
INSERT INTO level_hierarchy VALUES(11,'Hub2',5);
INSERT INTO level_hierarchy VALUES(12,'Hub1',8);
INSERT INTO level_hierarchy VALUES(13,'Hub2',8);
INSERT INTO level_hierarchy VALUES(14,'Courier',10);
INSERT INTO level_hierarchy VALUES(15,'Hub Coordinator',10);
INSERT INTO level_hierarchy VALUES(16,'Hub Coordinator',13);
INSERT INTO level_hierarchy VALUES(17,'Courier',13);
INSERT INTO level_hierarchy VALUES(18,'Hub3',5);


INSERT INTO users VALUES(1,'Apple',14);
INSERT INTO users VALUES(2,'Ball',14);
INSERT INTO users VALUES(3,'Cat',14);
INSERT INTO users VALUES(4,'Dog',15);
INSERT INTO users VALUES(5,'Egg',15);
INSERT INTO users VALUES(6,'Fan',15);
INSERT INTO users VALUES(7,'Goat',17);
INSERT INTO users VALUES(8,'Horse',17);
INSERT INTO users VALUES(9,'Ice',17);
INSERT INTO users VALUES(10,'Joker',16);
INSERT INTO users VALUES(11,'King',16);
INSERT INTO users VALUES(12,'Lion',16);