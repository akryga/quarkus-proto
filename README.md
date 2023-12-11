# quarkus-proto

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:

```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_** Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:

```shell script
./mvnw package
```

It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:

```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using:

```shell script
./mvnw package -Dnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using:

```shell script
./mvnw package -Dnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/quarkus-proto-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.

## Related Guides

- RESTEasy Reactive ([guide](https://quarkus.io/guides/resteasy-reactive)): A Jakarta REST implementation utilizing build time processing and Vert.x. This extension is not compatible with the quarkus-resteasy extension, or any of the extensions that depend on it.
- JDBC Driver - MySQL ([guide](https://quarkus.io/guides/datasource)): Connect to the MySQL database via JDBC

## Provided Code

### RESTEasy Reactive

Easily start your Reactive RESTful Web Services

[Related guide section...](https://quarkus.io/guides/getting-started-reactive#reactive-jax-rs-resources)

## Example JSON

POST application/json to http://localhost:8080/user

```
{   "email": "a@b.com",
    "ptpl": [
        {"name": "pr1",
            "pdtpl": [
                {"name": "p1d1"},{"name": "p1d2"}
            ],
            "optpl":[
                {"name":"op11"}, {"name":"op21", "description":"descr op 2"}
            ]},
        {"name":"pr2", "optpl": [
                {"name":"op21", "opdtpl": [
                    {"name": "pr2op21opd1" },
                    {"name": "pr2op21opd2" }
                ]},
                {"name":"op22", "description":"descr op 2"}
            ]}
    ]
}
```

**Cascade save child transient objects.
Put with IDs updates object with ALL children**

```

{
  "id": 2,
  "email": "a@b.com",
  "firstName": null,  "secondName": null,  "lastName": null,
  "ptpl": [
    { "id": 3, "name": "pr1 updated", "model": "model updated",
      "optpl": [
        { "id": 5, "name": "op11 updated", "description": null, "opdtpl": [] }
      ],
      "pdtpl": [ { "id": 3, "name": "p1d1 updated" },
        { "id": 4, "name": "p1d2 updated" } ]
    },
    {
      "id": 4, "name": "pr2", "model": null,
      "optpl": [
        { "id": 7, "name": "op21", "description": null,
          "opdtpl": [ { "id": 1, "name": "pr2op21opd1" },
            { "id": 2, "name": "pr2op21opd2" } ]
        },
        { "id": 8, "name": "op22", "description": "descr op 2",  "opdtpl": [] }
      ],
      "pdtpl": []
    }
  ]
}
```
