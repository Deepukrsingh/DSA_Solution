-- select actor_id,count(director_id) as director_id from actordirector where actor_id=director_id  group by actor_id,director_id having count(director_id,actor_id) >=3;


SELECT actor_id, director_id
FROM ActorDirector
GROUP BY actor_id, director_id
HAVING COUNT(*) >= 3;