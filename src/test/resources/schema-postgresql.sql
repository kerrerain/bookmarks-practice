DROP TABLE IF EXISTS bookmark;

CREATE TABLE bookmark (
  id serial PRIMARY KEY,
  name varchar(100) NOT NULL,
  url varchar NOT NULL
);