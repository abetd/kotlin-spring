TRUNCATE TABLE users;
INSERT INTO users(id, name)
VALUES
(1, 'hogehoge'),
(2, 'poyopoyo'),
(3, 'タドコロ'),
(4, 'fugafuga'),
(5, 'fugafuga'),
(6, 'fugafuga'),
(7, 'fugafuga'),
(8, 'fugafuga'),
(9, 'fugafuga'),
(10, 'fugafuga');

INSERT INTO user_profiles(user_id, last_name, first_name, last_name_kana, first_name_kana, gender, telephone_number, birth_date)
VALUES
(1,'今泉','良和','イマイズミ','ヨシカズ','男','0983228916','1978-04-23'),
(2,'中原','仁美','ナカハラ','ヒトミ','女','0987160418','1990-04-22'),
(3,'田所','徳美','タドコロ','トクミ','女','0940686573','1986-10-02'),
(4,'木原','保','キハラ','タモツ','男','0763788361','1988-02-04'),
(5,'梅沢','奈美','ウメザワ','ナミ','女','0782212745','1994-10-07'),
(6,'坂井','丈人','サカイ','タケト','男','0249781641','1980-02-04'),
(7,'梅村','麻子','ウメムラ','マコ','女','0950726284','1977-12-19'),
(8,'木本','研治','キモト','ケンジ','男','0863631589','1968-04-10'),
(9,'入江','孝三','イリエ','コウゾウ','男','0968207141','1973-09-17'),
(10,'市村','学','イチムラ','マナブ','男','0923985395','1980-01-15');

TRUNCATE TABLE skill_maps;
TRUNCATE TABLE levels CASCADE ;
TRUNCATE TABLE skill_tag_relation;
TRUNCATE TABLE tags CASCADE;
TRUNCATE TABLE skills CASCADE;
TRUNCATE TABLE members CASCADE;

INSERT INTO members(id, name)
VALUES
(1, 'hogehoge'),
(2, 'fugafuga');

INSERT INTO skills(id, name)
VALUES
(1, 'JavaScript'),
(2, 'Ruby'),
(3, 'Python'),
(4, 'Java'),
(5, 'PHP');

INSERT INTO tags(id, name)
VALUES
(1, 'Programing');

INSERT INTO skill_tag_relation(tag_id, skill_id)
VALUES
(1, 1),
(1, 2),
(1, 3),
(1, 4),
(1, 5);

INSERT INTO levels(id, mark, description)
VALUES
(1, '★', 'エース級'),
(2, '◎', '得意'),
(3, '○', 'ひとりでできる'),
(4, '△', '助けがあればできる'),
(5, '-', '未経験');

INSERT INTO skill_maps(member_id, skill_id, level_id)
VALUES
(1, 1, 1),
(1, 2, 5),
(1, 3, 4),
(1, 4, 3),
(1, 5, 2),
(2, 1, 1),
(2, 2, 5),
(2, 3, 4),
(2, 4, 3),
(2, 5, 2);