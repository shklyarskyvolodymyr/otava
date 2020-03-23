Footbal manager app Otava

### Development Prerequisites
- Java 11
- Docker

### deployment guide
- ```mvn clean install``` - install dependencies
- ```docker volume create mysql-manager``` - create volume for storing mysql data
- ```docker run --name mysql-database-manager -v mysql-manager:/var/lib/mysql --rm -e MYSQL_ROOT_PASSWORD=123456 -e MYSQL_DATABASE=manager -e MYSQL_USER=root -p 3306:3306 -d mysql:8.0``` - create and run mysql docker container