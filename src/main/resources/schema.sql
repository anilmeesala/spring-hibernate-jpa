create table expense(
id int primary key,
name varchar(1024) not null,
amount numeric(10,2) not null,
expense_date date not null,
category_id int not null,
location_name varchar(512),
creation_date date not null,
modified_date date not null
);

create table category(
id int primary key,
name varchar(512)
);