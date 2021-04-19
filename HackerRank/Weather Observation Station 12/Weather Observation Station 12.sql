/*
* Project name : HackerRank: Weather Observation Station 12
* Link         : https://www.hackerrank.com/challenges/weather-observation-station-12/problem
* Try it on    : 
* Author       : Wojciech Raszka
* E-mail       : contact@gitpistachio.com
* Date created : 2021-04-19
* Description  :
* Status       : Accepted (209567458)
* Tags         : sql
* Comment      : 
*/

select distinct
    city
from STATION
where lower(substr(city, 1, 1)) not in ('a', 'e', 'i', 'o', 'u')
     and lower(substr(city, length(city), 1)) not in ('a', 'e', 'i', 'o', 'u');