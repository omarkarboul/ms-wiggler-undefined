#stage 1
FROM node:latest as node
WORKDIR /app
COPY . .
RUN yarn
RUN yarn run build
#stage 2
FROM nginx:alpine
COPY --from=node /app/dist/angular-front /usr/share/nginx/html
