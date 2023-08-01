create table empire(name varchar(20));

create table mess(
e_no int not null,
e_name varchar(15) not null,
primary key(e_no, e_name));

create table taj(empiremahal
c_no int not null,
c_name varchar(20) not null,
c_prize varchar(10) not null,
primary key(c_no, c_name, c_prize));

create table mahal(
m_no int not null,
m_name varchar(20) not null,
m_prize varchar(10) not null,
primary key(m_no, m_name, m_prize));

insert into mess values('e_no','25', 'e_name','puni');
insert into mess values('e_no','13', 'e_name','arun');
select *from mess;