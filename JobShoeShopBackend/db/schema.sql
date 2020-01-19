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



