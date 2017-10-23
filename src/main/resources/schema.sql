drop table users;
create table if not exists users (
  id int primary key,
  name varchar(255),
  email varchar(255),
  encrypted_password varchar(255),
  age int,
  sex tinyint,
  created_at datetime,
  updated_at datetime
);

delete from users;
insert into users
VALUES( 1 , 'John' ,'john@example.com', 'password', 26 , 1 , NOW() , NOW()),
( 2 , 'Bob' ,'bob@example.com','password', 40 , 1, NOW() , NOW()),
( 3 , 'Michael' ,'michael@example.com','password', 20 , 1, NOW() , NOW()),
( 4 , 'Mary' ,'mary@example.com','password', 30 , 0, NOW() , NOW());