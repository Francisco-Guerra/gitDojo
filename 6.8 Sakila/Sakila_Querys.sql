/* 1. ¿Qué consulta ejecutarías para obtener todos los clientes dentro de city_id = 312? 
Su consulta debe devolver el nombre, apellido, correo electrónico y dirección del cliente. */
SELECT
	address.city_id,
	city.city,
    customer.first_name,
    customer.last_name,
    customer.email,
    address.address
FROM ((customer INNER JOIN address 
ON address.address_id = customer.address_id)
INNER JOIN city
ON city.city_id = address.city_id AND address.city_id = 312);

/* 2. ¿Qué consulta harías para obtener todas las películas de comedia? 
Su consulta debe devolver el título de la película, la descripción, el año de estreno, la calificación, 
las características especiales y el género (categoría). */
SELECT
	film.film_id,
	film.title,
    film.description,
    film.release_year,
    film.rating,
    film.special_features,
    category.name AS genre
FROM ((sakila.film INNER JOIN sakila.film_category
ON film.film_id = film_category.film_id)
INNER JOIN category
ON category.category_id = film_category.category_id AND category.name = "Comedy");

/* 3. ¿Qué consulta harías para obtener todas las películas unidas por actor_id = 5? 
Su consulta debe devolver la identificación del actor, el nombre del actor, el título de la película, 
la descripción y el año de lanzamiento. */
SELECT
	actor.actor_id,
    concat_ws(" ", actor.first_name, actor.last_name) AS actor_name,
    film.film_id,
    film.title,
    film.description,
    film.release_year
FROM( (sakila.film INNER JOIN sakila.film_actor
ON film.film_id = film_actor.film_id)
INNER JOIN actor
ON actor.actor_id = film_actor.actor_id 
AND actor.actor_id = 5);

/* 4. ¿Qué consulta ejecutaría para obtener todos los clientes en store_id = 1 y dentro de estas ciudades (1, 42, 312 y 459)? 
Su consulta debe devolver el nombre, apellido, correo electrónico y dirección del cliente. */
SELECT
	customer.store_id,
    address.city_id,
    customer.first_name,
    customer.last_name,
    customer.email,
    address.address
FROM customer INNER JOIN address 
ON customer.address_id = address.address_id
    AND address.city_id IN (1, 42, 312,459)
    AND customer.store_id = 1;
    
/* 5. ¿Qué consulta realizarías para obtener todas las películas con una "calificación = G" y 
"característica especial = detrás de escena", unidas por actor_id = 15? 
Su consulta debe devolver el título de la película, la descripción, el año de lanzamiento, la calificación y la función especial. 
Sugerencia: puede usar la función LIKE para obtener la parte 'detrás de escena'. */
SELECT
	film.title,
    film.description,
    film.release_year,
    film.rating,
    film.special_features
FROM( (sakila.film INNER JOIN sakila.film_actor
ON film.film_id = film_actor.film_id)
INNER JOIN sakila.actor
ON actor.actor_id = film_actor.actor_id
AND rating = "G"
AND actor.actor_id = 15
AND film.special_features LIKE "%behind%");

/* 6. ¿Qué consulta harías para obtener todos los actores que se unieron en el film_id = 369? 
Su consulta debe devolver film_id, title, actor_id y actor_name. */
SELECT
	film.film_id,
    film.title,
    actor.actor_id,
    concat_ws(" ", actor.first_name, actor.last_name) AS actor_name
FROM( (sakila.film INNER JOIN sakila.film_actor
ON film.film_id = film_actor.film_id)
INNER JOIN sakila.actor
ON actor.actor_id = film_actor.actor_id
AND film.film_id = 369);

/* 7. ¿Qué consulta harías para obtener todas las películas dramáticas con una tarifa de alquiler de 2.99? 
Su consulta debe devolver el título de la película, la descripción, el año de estreno, la calificación, 
las características especiales y el género (categoría). */
SELECT
	film.film_id,
	film.title,
    film.description,
    film.release_year,
    film.rating,
    film.special_features,
    category.name AS genre,
    film.rental_rate
FROM( (sakila.film INNER JOIN sakila.film_category
ON film.film_id = film_category.film_id)
INNER JOIN sakila.category
ON category.category_id = film_category.category_id
AND film.rental_rate = 2.99
AND category.name = "Drama");

/* 8. ¿Qué consulta harías para obtener todas las películas de acción a las que se une SANDRA KILMER? 
Su consulta debe devolver el título de la película, la descripción, el año de estreno, la calificación, 
las características especiales, el género (categoría) y el nombre y apellido del actor. */
SELECT
	actor.actor_id,
    concat_ws(" ", actor.first_name, actor.last_name) AS actor_name,
    film.film_id,
	film.title,
    film.description,
    film.release_year,
    film.rating,
    film.special_features,
    category.name AS genre
FROM sakila.film 
INNER JOIN sakila.film_actor
ON film.film_id = film_actor.film_id
INNER JOIN sakila.actor
ON actor.actor_id = film_actor.actor_id
INNER JOIN sakila.film_category
ON film.film_id = film_category.film_id
INNER JOIN sakila.category
ON category.category_id = film_category.category_id
AND category.name = "Action"
AND actor.actor_id = 23;
    