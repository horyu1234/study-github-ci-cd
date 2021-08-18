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

redeploy.sh
```sh
#!bin/bash
docker-compose pull
docker-compose up -d
```

hooks.json (apt install webhook)
```json
[
  {
    "id": "redeploy",
    "execute-command": "/bin/bash",
    "command-working-directory": "/home/horyu/study-github-ci-cd",
    "response-message": "Redeploying server.",
    "pass-arguments-to-command":
    [
      {
        "source": "string",
        "name": "/home/horyu/study-github-ci-cd/redeploy.sh"
      }
    ],
    "trigger-rule":
    {
      "match":
      {
        "type": "value",
        "value": "SECRET_TOKEN",
        "parameter":
        {
          "source": "url",
          "name": "token"
        }
      }
    }
  }
]
```
