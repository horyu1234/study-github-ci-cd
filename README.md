# study-github-ci-cd

docker-compose.yml
```yaml
version: "3"
services:
  web:
    image: 'ghcr.io/horyu1234/study-github-ci-cd:main'
    restart: always
    ports:
      # Public HTTP Port:
      - '10005:80'
    volumes:
      - ./application.yml:/application.yml
```
