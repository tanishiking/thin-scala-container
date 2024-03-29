FROM sbtscala/scala-sbt:eclipse-temurin-alpine-21.0.2_13_1.9.9_3.4.1 AS builder

WORKDIR /app

COPY build.sbt .
COPY src ./src
COPY project ./project

RUN sbt "stage"

FROM alpine:latest AS runner

RUN apk add bash
COPY --from=builder /app/target/universal/stage /app/stage
WORKDIR /app/stage

CMD /app/stage/bin/thin-scala-container
