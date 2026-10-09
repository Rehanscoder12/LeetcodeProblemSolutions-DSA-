# Write your MySQL query statement below
-- select world.name,world.population, world.area
-- from World
-- where population>=25000000 or area>=3000000;
select 
name,
 population,
 area
 from World
 where population>=25000000 
 or 
 area>=3000000;
