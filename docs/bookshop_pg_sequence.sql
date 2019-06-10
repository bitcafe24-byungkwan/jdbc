select * from author;

create sequence seq_author start 1;
create sequence seq_book start 1;
insert into author values (nextval('seq_author'),'plato');

drop sequence seq_author;

-- cf)
CREATE TABLE "author"
(
	"no"   integer      NOT NULL default nextval('seq_author'), -- 번호
	"name" varchar(200) NOT NULL  -- 이름
);