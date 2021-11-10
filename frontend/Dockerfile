FROM node:12
WORKDIR /frontend

COPY package* yarn.lock ./
RUN yarn install
COPY public ./public
COPY src ./src
RUN yarn build
EXPOSE 3000
CMD ["yarn", "start"]
