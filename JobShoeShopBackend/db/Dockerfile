FROM postgres:10
ENV POSTGRES_USER jobshoeshop
ENV POSTGRES_PASSWORD jobshoeshop
ADD schema.sql /docker-entrypoint-initdb.d
EXPOSE 5432