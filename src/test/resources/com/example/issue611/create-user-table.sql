CREATE TABLE IF NOT EXISTS user (
  user_code varchar(5) NOT NULL,
  user_type enum('ADMIN','MANAGER') NOT NULL,
  user_name varchar(50) NOT NULL,
  PRIMARY KEY (user_code,user_type)
);

INSERT INTO user (user_code, user_type, user_name) VALUES
	('123', 'ADMIN', 'Doug'),
	('124', 'MANAGER', 'Foo'),
	('125', 'MANAGER', 'Bar');