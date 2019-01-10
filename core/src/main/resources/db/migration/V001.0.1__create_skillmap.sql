CREATE TABLE members (
    id int NOT NULL PRIMARY KEY,
    name varchar(32) NOT NULL
);

CREATE TABLE skills (
    id int NOT NULL PRIMARY KEY,
    name varchar(32) NOT NULL
);

CREATE TABLE tags (
    id int NOT NULL PRIMARY KEY,
    name varchar(32) NOT NULL
);

CREATE TABLE skill_tag_relation (
    tag_id int NOT NULL REFERENCES tags(id),
    skill_id int NOT NULL REFERENCES skills(id),
    CONSTRAINT skill_tag_relation_pkey PRIMARY KEY(tag_id,skill_id)
);

CREATE TABLE levels (
    id int NOT NULL PRIMARY KEY,
    mark varchar(3) NOT NULL,
    description varchar(32) NOT NULL
);

CREATE TABLE skill_maps (
    member_id int NOT NULL REFERENCES members(id),
    skill_id int NOT NULL REFERENCES skills(id),
    level_id int NOT NULL REFERENCES levels(id),
    CONSTRAINT skill_maps_pkey PRIMARY KEY(member_id, skill_id)
);