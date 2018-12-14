INSERT INTO users(id, name)
VALUES
(1, 'hogehoge'),
(2, 'fugafuga');

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