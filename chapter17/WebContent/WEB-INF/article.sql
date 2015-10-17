create table article (
 article_id number not null,
 group_id number not null,
 sequence_no varchar2(16) not null,
 posting_date date not null,
 read_count number not null,
 writer_name varchar2(20) not null,
 password varchar2(10),
 title varchar2(100),
 content clob,
 primary key (article_id)
);

create table id_sequence(
sequence_name varchar2(10) not null,
next_value int not null,
primary key(sequence_name)
);

create sequence article_seq
increment by 1
start with 1;