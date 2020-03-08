drop table if exists ShoeModel;
drop table if exists ShoeStock;
create table ShoeModel(
	modelID varchar primary key,
	modelName varchar not null,
	brandName varchar not null
);

create table ShoeStock(
	modelID varchar primary key,
	size13 integer ,
	size12_5 integer ,
	size12 integer ,
	size11_5 integer ,
	size11 integer ,
	size10_5 integer ,
	size10 integer ,
	size9_5 integer ,
	size9 integer ,
	size8_5 integer ,
	size8 integer ,
	size7_5 integer,
	size7 integer
);

CREATE SEQUENCE customer_customerid_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 99999
  START 10001 ---> here you can mention startup nummber as you need
  CACHE 1;

create table Customer(
	customerId integer NOT NULL primary key DEFAULT nextval('customer_customerid_seq'),
	firstName varchar not null,
	lastName varchar not null,
	emailAddress varchar not null,
	phoneNumber varchar not null
);


create table Address(
	customerId integer primary key,
	streetAddress varchar not null,
	aptNo varchar not null,
	state varchar not null,
	zipCode varchar not null,
	city varchar not null,
	isDefault boolean not null
);





