drop table if exists user_role;
drop table if exists app_role;
drop table if exists app_user;
drop table if exists products;

create table app_role (
    id serial,
    description varchar(255) default '',
    role_name varchar(255) default ''
);
alter table app_role add primary key (id);

create table app_user (
    id serial,
    first_name varchar(255) not null,
    last_name varchar(255) not null,
    password varchar(255) not null,
    username varchar(255) not null
);
alter table app_user add primary key (id);

create table user_role (
    user_id bigint not null,
    role_id bigint not null
);
alter table user_role add foreign key (user_id) references app_user (id);
alter table user_role add foreign key (role_id) references app_role (id);

create table products (
    id_pk serial,
    product_name varchar(255) not null,
    description varchar(255) not null,
    inventory bigint not null,
    cost decimal(10,2) not null
);
alter table products add primary key (id_pk);

--create table customers (
--    id_pk serial,
--    name varchar(255) not null,
--    street varchar(255) not null,
--    zip varchar(255) not null,
--    ccNumber varchar(255) not null,
--    ccExpiration varchar(255) not null,
--    ccCVV varchar(255) not null,
--    orders bigint not null,
--    satisfaction varchar(255) not null
--);
--alter table customers add primary key (id_pk);
--
--create table orders (
--    id_pk serial,
--    product bigint not null,
--    customer bigint not null,
--    quantity bigint not null,
--    delivered boolean not null
--);
--alter table customers add primary key (id_pk);
--alter table orders add foreign key (product) references products (id_pk);
--alter table orders add foreign key (customer) references customers (id_pk);