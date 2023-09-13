# spring-boot-actuator-heapdump-cors-demo

This repository contains a spring-boot application.

- It exposes `/actuator/heapdump`.
  - And it accepts CORS request from `http://localhost:8080/`
    - It's configured by `management.endpoints.web.cors.allowed-origins` and `management.endpoints.web.cors.allowed-methods`.

