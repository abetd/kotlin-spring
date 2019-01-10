CREATE TABLE users (
  id int NOT NULL,
  name varchar(32) NOT NULL
);

CREATE TABLE user_profiles (
  user_id           int NOT NULL,
  last_name         VARCHAR(256) NOT NULL,
  first_name        VARCHAR(256) NOT NULL,
  last_name_kana    VARCHAR(256) NOT NULL,
  first_name_kana   VARCHAR(256) NOT NULL,
  gender            VARCHAR(256) NOT NULL,
  telephone_number  VARCHAR(256) NOT NULL,
  birth_date        DATE         NOT NULL
)