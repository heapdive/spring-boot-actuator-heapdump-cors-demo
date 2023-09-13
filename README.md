# spring-boot-actuator-heapdump-cors-demo

This repository contains a spring-boot application.
This application demonstrates Spring-Boot's Actuator integration feature in [Heapdive](https://github.com/heapdive/heapdive).
Heapdive access `/actuator/heapdive` via CORS and upload it to heapdive server and analyze it.

- This app exposes `/actuator/heapdump`.
  - And it accepts CORS request from `http://localhost:8080/`
    - It's configured by `management.endpoints.web.cors.allowed-origins` and `management.endpoints.web.cors.allowed-methods`.
  
