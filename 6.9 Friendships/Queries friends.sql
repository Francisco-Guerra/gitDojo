/* Escribe una consulta SQL que devuelva una lista de usuarios junto con los nombres de sus amigos. */
SELECT 
	users.first_name, 
	users.last_name,
	user2.first_name AS friend_first_name, 
	user2.last_name AS friend_last_name
FROM users LEFT JOIN friendships 
ON users.id = friendships.user_id
LEFT JOIN users AS user2
ON friendships.friend_id = user2.id;

/* 1. Devuelva a todos los usuarios que son amigos de Kermit, asegúrese de que sus nombres se muestren en los resultados */ 
SELECT 
	users.first_name,
    user2.first_name AS friend_first_name
FROM users
INNER JOIN friendships
ON users.id = friendships.user_id
INNER JOIN users 
AS user2 
ON friendships.friend_id = user2.id
WHERE user2.first_name = 'Kermit';

/* 2. Devuelve el recuento de todas las amistades. */
SELECT 
	users.first_name,
	user2.first_name AS friend_first_name
FROM users 
LEFT JOIN friendships 
ON users.id = friendships.user_id
LEFT JOIN users AS user2 
ON friendships.friend_id = user2.id;

/* 3. Descubre quién tiene más amigos y devuelve el recuento de sus amigos. */
SELECT 
	users.first_name,
	user2.first_name AS friend_first_name
FROM users 
LEFT JOIN friendships 
ON users.id = friendships.user_id
LEFT JOIN users AS user2 
ON friendships.friend_id = user2.id
AND users.id = 'Amy';

/* 4. Crea un nuevo usuario y hazlos amigos de Eli Byers, Kermit The Frog y Marky Mark. */
INSERT INTO users
VALUES (6,'Rosamel','Fierro',now(),now());
INSERT INTO friendships
VALUES (7,6,(2 AND 4 AND 5),now(),now());

/* 5. Devuelve a los amigos de Eli en orden alfabético. */
SELECT 
	users.first_name,
	user2.first_name AS friend_first_name
FROM users 
LEFT JOIN friendships 
ON users.id = friendships.user_id
LEFT JOIN users AS user2 
ON friendships.friend_id = user2.id
AND users.id = 2
ORDER BY user2.first_name DESC;

/* 6. Eliminar a Marky Mark de los amigos de Eli. */
DELETE FROM 
	friendships
WHERE friendships.id = 5;

/* 7. Devuelve todas las amistades, mostrando solo el nombre y apellido de ambos amigos */
SELECT 
	CONCAT(users.first_name," ",users.last_name) AS Users,
	CONCAT(user2.first_name," ",user2.last_name) AS friendships
FROM users LEFT JOIN friendships 
ON users.id = friendships.user_id
LEFT JOIN users AS user2
ON friendships.friend_id = user2.id;

	