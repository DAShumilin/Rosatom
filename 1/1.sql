--Написано с использованием БД PostgreSQL

CREATE TABLE employees (
    id INTEGER PRIMARY KEY,
    surname VARCHAR(255),
    experience INTEGER
);

INSERT INTO employees (id, surname, experience) VALUES (1, 'Свистунов', 7), (2, 'Шумилин', 2), (3, 'Халабуда', 4), (4, 'Полетаев', 1), (5, 'Гордеев', 6);

SELECT surname
FROM employees
WHERE experience = (
    SELECT MAX(experience)
    FROM employees
    WHERE experience < (
        SELECT MAX(experience)
        FROM employees
    )
);