--Inserts Characters

insert into characther (id, birth_date, intellect, name, skill, speed, strength_level, weapon) values (1, '1918-07-04', 70, 'Capitão América', 'Força', 80, 'SUPER', 'Escudo');
insert into characther (id, birth_date, intellect, name, skill, speed, strength_level, weapon) values (2, '1970-05-29', 100, 'Homem de Ferro', 'Inteligência', 60, 'NORMAL', 'Armadura');
insert into characther (id, birth_date, intellect, name, skill, speed, strength_level, weapon) values (3, '1969-12-18', 2, 'Hulk', 'Força', 40, 'MEGA', 'Não tem');
insert into characther (id, birth_date, intellect, name, skill, speed, strength_level, weapon) values (4, null, 65, 'Thor', 'Força', 90, 'MEGA', 'Martelo');
insert into characther (id, birth_date, intellect, name, skill, speed, strength_level, weapon) values (5, '1984-05-20', 70, 'Viúva Negra', 'Luta', 50, 'NORMAL', 'Armas de choques');
insert into characther (id, birth_date, intellect, name, skill, speed, strength_level, weapon) values (6, '1981-03-18', 75, 'Gavião Arqueiro', 'Acerteiro', 55, 'NORMAL', 'Arco e Flecha');

-- Insert Comics

insert into Comic (id, description, number, characther_id) values (1, 'Capitão América: Soldado Invernal', 1, 1);
insert into Comic (id, description, number, characther_id) values (2, 'Capitão América: A Ameaça Vermelha', 2, 1);
insert into Comic (id, description, number, characther_id) values (3, 'Capitão América: A Morte do Sonho', 5, 1);

insert into Comic (id, description, number, characther_id) values (4, 'Homem de Ferro: Extremis', 1, 2);
insert into Comic (id, description, number, characther_id) values (5, 'Homem de Ferro: O Mais Procurado do Mundo', 3, 2);
insert into Comic (id, description, number, characther_id) values (6, 'Homem de Ferro: Stark – a Queda', 2, 2);

insert into Comic (id, description, number, characther_id) values (7, 'Immortal Hulk: The Threshing Place', 1, 3);
insert into Comic (id, description, number, characther_id) values (8, 'O Incrível Hulk', 1, 3);
insert into Comic (id, description, number, characther_id) values (9, 'Hulk Contra o Mundo', 2, 3);

insert into Comic (id, description, number, characther_id) values (10, 'Thor - O renascer dos Deuses', 4, 4);
insert into Comic (id, description, number, characther_id) values (11, 'Thor - Em Nome do Pai', 1, 4);
insert into Comic (id, description, number, characther_id) values (12, 'Thor: O Cerco', 2, 4);

-- Insert Events

insert into event (id, description, characther_id) values (1,'Participou da Primeira Guerra Infinita', 1);
insert into event (id, description, characther_id) values (2,'Lutou contra o Thor', 2);
insert into event (id, description, characther_id) values (3,'Lutou na Guerra Infinita', 6);

-- Insert Series

insert into serie (id, description, characther_id) values (1,'Guerra Civil', 1);
insert into serie (id, description, characther_id) values (2,'Guerras Secretas', 1);
insert into serie (id, description, characther_id) values (3,'Homem de Ferro & Thor', 2);
insert into serie (id, description, characther_id) values (4,'Guerra Infinita', 4);

-- Insert Stories

insert into story (id, description, characther_id) values (1,'O Primeiro Vingador', 1);
insert into story (id, description, characther_id) values (2,'Nunca desiste', 1);
insert into story (id, description, characther_id) values (3,'Bilionário, filantropo e playboy', 2);
insert into story (id, description, characther_id) values (4,'Deus do trovão', 4);