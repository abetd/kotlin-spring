# Kotlin Spring サンプル

## Docker

- DBコンテナ起動
```
docker-compose up -d db
```

- flyway
```
docker-compose run --rm flyway-clean
docker-compose run --rm flyway-migrate
docker-compose run --rm flyway-info
```

- SchemaSpy
```
docker-compose run --rm schemaspy
```
